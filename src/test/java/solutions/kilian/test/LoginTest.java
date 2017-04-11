package solutions.kilian.test;


import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import solutions.kilian.core.FunctionalTest;
import solutions.kilian.page.DzoneHomePage;

public class LoginTest extends FunctionalTest {

  private DzoneHomePage homePage;
  private static final String WRONG_EMAIL_PASSWORD = "teste123";
  private static final String WRONG_EMAIL = "teste@teste.com.br";
  private static final String EMAIL_PASSWORD = "1020304050";
  private static final String EMAIL = "999db175-9808-4e30-bc00-2148f2361713@binka.me";

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
    homePage.fill(homePage.getLoginUsernameField(), WRONG_EMAIL);
    homePage.fill(homePage.getLoginPasswordField(), WRONG_EMAIL_PASSWORD);
    homePage.getSignInButton().click();

    assertTrue(homePage.isLoginErrorDisplayed());
  }

  @Test
  public void shouldDisplayAvatarOnLoginSuccess() throws Exception {
    homePage.getLoginButton().click();

    homePage.gotoLogin();
    homePage.fill(homePage.getLoginUsernameField(), EMAIL);
    homePage.fill(homePage.getLoginPasswordField(), EMAIL_PASSWORD);
    homePage.getSignInButton().click();
    assertTrue(homePage.welcomeBackIsDisplayed());
    homePage.logout();
  }


}
