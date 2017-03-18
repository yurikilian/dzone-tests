package solutions.kilian.test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;

import solutions.kilian.core.FunctionalTest;

public class RegisterTest extends FunctionalTest {

  @Test
  public void testDzoneRegister() throws Exception {
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://dzone.com");
    driver.findElement(By.linkText("Sign In / Join")).click();
    driver.findElement(By.cssSelector("div.form-group.input-container > input[name=\"email\"]"))
        .clear();
    driver.findElement(By.cssSelector("div.form-group.input-container > input[name=\"email\"]"))
        .sendKeys("kilian.inf@gmail.com");
    driver.findElement(By.cssSelector("div.form-group > div.button-right > input.btn.btn-success"))
        .click();
    driver.findElement(By.id("name")).click();
    driver.findElement(By.id("name")).clear();
    driver.findElement(By.id("name")).sendKeys("Yuri");
    driver.findElement(By.id("lastName")).clear();
    driver.findElement(By.id("lastName")).sendKeys("Kilian");
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("ykilian");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("1020304050");
    driver.findElement(By.id("confPass")).clear();
    driver.findElement(By.id("confPass")).sendKeys("1020304050");
    driver
        .findElement(By
            .xpath("//html[@id='ng-app']/body/div[2]/div/div[2]/div/div[2]/div/div/div/div/button"))
        .click();
    driver.findElement(By.id("companyName")).clear();
    driver.findElement(By.id("companyName")).sendKeys("Tivea");
    driver.findElement(By.id("job")).clear();
    driver.findElement(By.id("job")).sendKeys("Programador");
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.id("jobRole")).click();
    driver.findElement(By.id("dropdownMenu1")).click();
    driver.findElement(By.linkText("50 to 99")).click();
    driver
        .findElement(By
            .xpath("//html[@id='ng-app']/body/div[2]/div/div[2]/div/div[2]/div/div/div/div/button"))
        .click();
    driver.findElement(By.id("address1")).clear();
    driver.findElement(By.id("address1")).sendKeys("Rua Ivo Janson 240");
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("brazil");
    driver.findElement(By.cssSelector("span.ui-select-highlight")).click();
    driver.findElement(By.id("city")).clear();
    driver.findElement(By.id("city")).sendKeys("Porto Alegre");
    driver.findElement(By.id("zipCode")).clear();
    driver.findElement(By.id("zipCode")).sendKeys("91530070");
    driver.findElement(By.id("pNumber")).clear();
    driver.findElement(By.id("pNumber")).sendKeys("5551995988131");
    driver
        .findElement(By
            .xpath("//html[@id='ng-app']/body/div[2]/div/div[2]/div/div[2]/div/div/div/div/button"))
        .click();


    // validar resultado do teste por:

    // <h2 class="toppancake">Thank you for joining DZone.com! </h2>
  }


}
