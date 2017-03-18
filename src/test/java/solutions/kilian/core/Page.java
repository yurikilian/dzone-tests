package solutions.kilian.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class Page {
  protected WebDriver driver;
  protected String baseUrl;

  public Page(WebDriver webDriver, String baseUrl) {
    this.driver = webDriver;
  }

  public void fill(WebElement webElement, String text) {
    webElement.clear();
    webElement.sendKeys(text);
  }
}
