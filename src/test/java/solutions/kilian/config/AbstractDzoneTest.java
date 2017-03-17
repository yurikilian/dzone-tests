package solutions.kilian.config;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import solutions.kilian.WebDriverFactory;

public class AbstractDzoneTest {

  protected WebDriver driver;

  @Before
  public void setUp() throws Exception {
    driver = WebDriverFactory.getDriver();

  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
  }

}
