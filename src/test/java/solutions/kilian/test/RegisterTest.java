package solutions.kilian.test;

import java.util.UUID;

import org.junit.Test;
import org.openqa.selenium.By;

import solutions.kilian.core.FunctionalTest;
import solutions.kilian.core.tempmail.TempMail;
import solutions.kilian.page.DzoneHomePage;
import solutions.kilian.page.DzoneRegisterPage;

public class RegisterTest extends FunctionalTest {
  private DzoneHomePage homePage;


  @Test
  public void testDzoneRegister() throws Exception {

    String userName = UUID.randomUUID().toString();
    String emailAddress = TempMail.getEmail(userName);


    homePage.getRegisterButton().click();
    DzoneRegisterPage registerPage = homePage.gotoRegister();
    registerPage.fill(registerPage.getRegisterEmailField(), emailAddress);

    registerPage.getProceedButton().click();
    registerPage.gotoDetail();
    registerPage.fill(registerPage.getNameField(), "Name");
    registerPage.fill(registerPage.getLastNameField(), "Last Name");
    registerPage.fill(registerPage.getUsernameField(), userName);
    registerPage.fill(registerPage.getPasswordField(), "1020304050");
    registerPage.fill(registerPage.getConfirmPasswordField(), "1020304050");

    registerPage.getContinueButton().click();
    registerPage.gotoSecondDetail();
    registerPage.fill(registerPage.getCompanyNameField(), "Organization");
    registerPage.fill(registerPage.getJobField(), "Developer");
    registerPage.getJobRoleButton().click();
    registerPage.getJobRoleDropdown().click();
    registerPage.getJobRoleOption().click();

    registerPage.getSecondDetailContinueButton().click();

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
