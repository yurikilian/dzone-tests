package solutions.kilian.test;

import org.junit.Test;
import org.openqa.selenium.By;

import solutions.kilian.core.FunctionalTest;

public class EditProfileTest extends FunctionalTest {

  @Test
  public void test() {
    driver.get("http://www.dzone.com/");
    driver.findElement(By.cssSelector("div.user-avatar.ng-isolate-scope > img")).click();
    driver.findElement(By.linkText("Edit Profile")).click();
    driver
        .findElement(
            By.xpath("//html[@id='ng-app']/body/div[2]/div/div[2]/div/div/form/div[3]/div"))
        .click();
    driver.findElement(By.id("lastName")).clear();
    driver.findElement(By.id("lastName")).sendKeys("Kili");


    // tem que dectar se a edição do perfil deixou o campo ativo
  }

}
