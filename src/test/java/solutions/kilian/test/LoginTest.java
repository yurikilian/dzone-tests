package solutions.kilian.test;


import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import solutions.kilian.core.FunctionalTest;
import solutions.kilian.page.DzoneHomePage;

public class LoginTest extends FunctionalTest {
  private DzoneHomePage homePage;

  @Test
  public void shouldHighlightInputOnLoginError() throws Exception {
    homePage = new DzoneHomePage(driver);
    homePage.getLoginButton().click();

    waitFor(20, TimeUnit.SECONDS);

    homePage.fill(homePage.getLoginUsernameField(), "teste@teste.com.br");
    homePage.fill(homePage.getLoginPasswordField(), "teste123");

    homePage.getSignInButton().click();

    assertTrue(homePage.getLoginErrorField().isDisplayed());
  }

}
