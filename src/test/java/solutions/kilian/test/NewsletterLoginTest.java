package solutions.kilian.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import solutions.kilian.core.FunctionalTest;
import solutions.kilian.page.DzoneHomePage;

public class NewsletterLoginTest extends FunctionalTest {
  private DzoneHomePage homePage;

  @Test
  public void shouldDisplaySuccessMessageOnSubscribe() {
    homePage = new DzoneHomePage(driver);
    homePage.fill(homePage.getNewsletterEmailField(), "kilian.inf@gmail.com");
    homePage.getNewsletterSubscribeButton().click();
    assertTrue(homePage.isNewsletterSubscribeSucceded());
  }

}
