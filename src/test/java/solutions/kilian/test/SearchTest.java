package solutions.kilian.test;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import solutions.kilian.config.EnvironmentTest;
import solutions.kilian.core.FunctionalTest;

public class SearchTest extends FunctionalTest {
  private Logger LOGGER = LoggerFactory.getLogger(EnvironmentTest.class);


  @Test
  public void shouldDisplaySearchArticle() {
    driver.get("http://www.dzone.com");
    driver.findElement(By.id("dropdownMenu2")).click();
    driver.findElement(By.id("search")).clear();
    driver.findElement(By.id("search")).sendKeys("Reactive Clean Architecture With Vert.x");
    driver.findElement(By.cssSelector("input.btn.btn-action")).click();
    driver.findElement(By.linkText("Reactive Clean Architecture With Vert.x")).click();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    WebElement headerTitleElement = driver.findElement(By.className("header-title"));
    WebElement titleElement = headerTitleElement.findElement(By.className("title"));
    String articleTitle = titleElement.getText();
    LOGGER.info(articleTitle);
    assertTrue(articleTitle.equals("Reactive Clean Architecture With Vert.x"));
  }

}
