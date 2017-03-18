package solutions.kilian.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import solutions.kilian.core.FunctionalTest;
import solutions.kilian.page.DzoneHomePage;

public class SearchTest extends FunctionalTest {

  private DzoneHomePage homePage;

  @Test
  public void shouldDisplaySearchArticle() {
    homePage = new DzoneHomePage(driver);

    homePage.gotoSearch();
    String title = "Reactive Clean Architecture With Vert.x";
    homePage.fill(homePage.getSearchField(), title);

    homePage.getSearchButton().click();
    homePage.gotoFirstSearchResult();

    homePage.gotoArticle();
    assertTrue(homePage.getArticleTitle().getText().equals(title));
  }

}
