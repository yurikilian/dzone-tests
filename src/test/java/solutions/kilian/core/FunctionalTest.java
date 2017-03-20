package solutions.kilian.core;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class FunctionalTest {
  protected WebDriver driver;

  @Before
  public void setUp() throws Exception {
    driver = WebDriverPool.getDriver(Driver.valueOf(System.getenv("WEBDRIVER")));
    this.implicitWait(30, TimeUnit.SECONDS);
  }

  protected void implicitWait(int units, TimeUnit timeUnit) {
    driver.manage().timeouts().implicitlyWait(units, timeUnit);
  }

}
