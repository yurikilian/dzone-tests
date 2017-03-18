package solutions.kilian.test;


import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import solutions.kilian.core.FunctionalTest;
import solutions.kilian.page.DzoneHomePage;

public class LoginTest extends FunctionalTest {
  private DzoneHomePage homePage;

  @Override
  public void setUp() throws Exception {
    super.setUp();
    homePage = new DzoneHomePage(driver);
    implicitWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void shouldHighlightInputOnLoginError() throws Exception {
    homePage.getLoginButton().click();
    implicitWait(20, TimeUnit.SECONDS);

    homePage.gotoLogin();
    homePage.fill(homePage.getLoginUsernameField(), "teste@teste.com.br");
    homePage.fill(homePage.getLoginPasswordField(), "teste123");
    homePage.getSignInButton().click();

    assertTrue(homePage.isLoginErrorDisplayed());
  }

  // @Test
  // public void shouldDisplayAvatarOnLoginSuccess() {
  //
  // }


}
