package solutions.kilian.page;


import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import solutions.kilian.config.AbstractFunctionalTest;
import solutions.kilian.config.EnvironmentTest;

public class LoginTest extends AbstractFunctionalTest {

  private Logger LOGGER = LoggerFactory.getLogger(EnvironmentTest.class);


  @Test
  public void shouldHighlightInputOnLoginError() throws Exception {
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://dzone.com");
    driver.findElement(By.linkText("Sign In / Join")).click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebElement usernameField = driver.findElement(By.name("username"));
    usernameField.clear();
    usernameField.sendKeys("teste@teste.com.br");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("teste123");
    driver.findElement(By.cssSelector("input.btn.btn-success")).click();
    WebElement cssClass = driver.findElement(By.className("has-error"));

    LOGGER.info(cssClass.getTagName());
    assertTrue(cssClass.isDisplayed());
  }



}
