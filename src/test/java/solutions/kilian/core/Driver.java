package solutions.kilian.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public enum Driver {
  FIREFOX, CHROME;

  public WebDriver get() {
    switch (this) {
      case CHROME:
        return null;
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

}
