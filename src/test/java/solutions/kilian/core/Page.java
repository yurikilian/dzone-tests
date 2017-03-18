package solutions.kilian.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Page {

  protected static Logger LOGGER = LoggerFactory.getLogger(Page.class);

  protected WebDriver driver;
  protected String baseUrl;

  public Page(WebDriver webDriver, String baseUrl) {
    this.driver = webDriver;
    this.baseUrl = baseUrl;
  }

  public void fill(WebElement webElement, String text) {
    webElement.clear();
    webElement.sendKeys(text);
  }

}
