package solutions.kilian.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import solutions.kilian.core.Email;
import solutions.kilian.core.FunctionalTest;
import solutions.kilian.core.tempmail.TempMail;
import solutions.kilian.page.DzoneHomePage;
import solutions.kilian.page.DzoneRegisterPage;

public class RegisterTest extends FunctionalTest {
  private DzoneHomePage homePage;


  @Test
  public void testDzoneRegister() throws Exception {
    homePage = new DzoneHomePage(driver);
    homePage.getRegisterButton().click();

    DzoneRegisterPage registerPage = homePage.gotoRegister();

    Email email = TempMail.getEmail();
    registerPage.fill(registerPage.getRegisterEmailField(), email.get());
    registerPage.getProceedButton().click();


    registerPage.gotoDetail();
    registerPage.fill(registerPage.getNameField(), "Name");
    registerPage.fill(registerPage.getLastNameField(), "Last Name");
    registerPage.fill(registerPage.getUsernameField(), email.getName());
    registerPage.fill(registerPage.getPasswordField(), "1020304050");
    registerPage.fill(registerPage.getConfirmPasswordField(), "1020304050");

    registerPage.waitUntilContinueButtonEnabled();
    registerPage.getContinueButton().click();

    registerPage.gotoSecondDetail();
    registerPage.fill(registerPage.getCompanyNameField(), "Organization");
    registerPage.fill(registerPage.getJobField(), "Developer");
    registerPage.getJobFieldButton().click();
    registerPage.getJobRoleButton().click();
    registerPage.getCompanySizeDropdown().click();
    registerPage.getCompanySizeArrowButton().click();
    registerPage.getSecondDetailContinueButton().click();

    registerPage.gotoThirdDetail();
    registerPage.fill(registerPage.getAddress1Field(), "Av Wenceslau Escobar");
    registerPage.getCountrySelectionFieldButton().click();
    registerPage.fill(registerPage.getCountrySelectionField(), "Brazil");
    registerPage.getCountryExitSpace().click();
    registerPage.fill(registerPage.getCitySelectionField(), "Porto Alegre");
    registerPage.fill(registerPage.getZipCodeField(), "91530070");
    registerPage.fill(registerPage.getPhoneNumberField(), "5199988735");
    registerPage.getFinishRegisterButton().click();

    assertTrue(registerPage.isRegisterSuccessDisplayed());

    homePage.logout();
  }


}
