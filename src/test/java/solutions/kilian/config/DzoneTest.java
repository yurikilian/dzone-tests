package solutions.kilian.config;


import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;

import solutions.kilian.config.AbstractDzoneTest;

public class DzoneTest extends AbstractDzoneTest {

  @Test
  public void shoudAccessLoginPage() throws Exception {
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://dzone.com");
    driver.findElement(By.linkText("Sign In / Join")).click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("teste@teste.com.br");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("teste123");
  }

}
