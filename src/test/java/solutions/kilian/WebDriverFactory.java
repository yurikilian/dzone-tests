package solutions.kilian;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverFactory {
  public WebDriver driver;
  public String baseUrl;



  public static WebDriver getDriver() {

    // em comum
    System.setProperty("webdriver.gecko.driver", System.getenv("WEBDRIVER_BINARY"));

    // exclusivo do firefox
    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
    FirefoxOptions options = new FirefoxOptions();
    options.addArguments("--log", "fatal");
    capabilities.setCapability("moz:firefoxOptions", options);


    // em comum
    return new FirefoxDriver(capabilities);
  }


}
