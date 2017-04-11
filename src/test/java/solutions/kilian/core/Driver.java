package solutions.kilian.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public enum Driver {
  FIREFOX, CHROME;

  public WebDriver get() {
    switch (this) {
      case CHROME:
        return configuredChromeWebDriver();
      case FIREFOX:
        return configuredFirefoxWebDriver();
      default:
        return null;
    }
  }

  private WebDriver configuredFirefoxWebDriver() {
    System.setProperty("webdriver.gecko.driver", System.getenv("WEBDRIVER_BINARY"));
    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
    FirefoxOptions options = new FirefoxOptions();
    options.addArguments("--log", "fatal");
    capabilities.setCapability("moz:firefoxOptions", options);
    return new FirefoxDriver(capabilities);
  }

  private WebDriver configuredChromeWebDriver() {
    System.setProperty("webdriver.chrome.driver", System.getenv("WEBDRIVER_BINARY"));
    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
    return new ChromeDriver(capabilities);
  }

}
