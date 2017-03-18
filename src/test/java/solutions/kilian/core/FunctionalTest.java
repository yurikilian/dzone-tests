package solutions.kilian.core;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class FunctionalTest {
  protected WebDriver driver;

  @Before
  public void setUp() throws Exception {
    String webdriver = System.getenv("WEBDRIVER");
    driver = WebDriverPool.getDriver(Driver.valueOf(webdriver));
    this.waitFor(30, TimeUnit.SECONDS);
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
  }

  protected void waitFor(int units, TimeUnit timeUnit) {
    driver.manage().timeouts().implicitlyWait(units, timeUnit);
  }
}
