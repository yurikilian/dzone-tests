package solutions.kilian.core;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

public class WebDriverPool {
  private static Map<Driver, WebDriver> pool = new HashMap<Driver, WebDriver>(0);
  public WebDriver driver;
  public String baseUrl;


  public static WebDriver getDriver(Driver driver) {
    if (!pool.containsKey(driver)) {
      pool.put(driver, driver.get());
    }

    return WebDriverPool.pool.get(driver);
  }


}
