package solutions.kilian.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import solutions.kilian.core.Page;

public class DzoneHomePage extends Page {
  private WebElement loginButton;
  private WebElement loginUsernameField;
  private WebElement loginPasswordField;
  private WebElement signInButton;
  private WebElement newsLetterEmailField;
  private WebElement newsletterSubscribeButton;
  private WebElement searchDropdown;
  private WebElement searchField;
  private WebElement searchButton;
  private WebElement articleTitle;


  public DzoneHomePage(WebDriver webDriver) {
    super(webDriver, "https://dzone.com");
    driver.get(baseUrl);
    registerPageElements();
  }

  private void registerPageElements() {
    this.loginButton = driver.findElement(By.linkText("Sign In / Join"));
    this.newsLetterEmailField = driver.findElement(By.xpath("(//input[@id='email'])[2]"));
    this.newsletterSubscribeButton = driver.findElement(By.xpath(
        "//html[@id='ng-app']/body/div[3]/div/div/div/div/div/div/div[2]/email-subscriptions-footer-widget/div/div[3]/form/div/span/button"));
    this.searchDropdown = driver.findElement(By.id("dropdownMenu2"));
  }

  public void gotoLogin() {
    this.loginUsernameField = driver.findElement(By.name("username"));
    this.loginPasswordField = driver.findElement(By.name("password"));
    this.signInButton = driver.findElement(By.cssSelector("input.btn.btn-success"));
  }


  public WebElement getLoginButton() {
    return loginButton;
  }

  public WebElement getLoginUsernameField() {
    return loginUsernameField;
  }

  public WebElement getLoginPasswordField() {
    return loginPasswordField;
  }

  public WebElement getSignInButton() {
    return signInButton;
  }

  public boolean isLoginErrorDisplayed() {
    return driver.findElement(By.className("has-error")).isDisplayed();
  }

  public WebElement getNewsletterEmailField() {
    return this.newsLetterEmailField;
  }

  public WebElement getNewsletterSubscribeButton() {
    return this.newsletterSubscribeButton;
  }

  public boolean isNewsletterSubscribeSucceded() {
    return driver
        .findElement(By.xpath(
            "//*[@id='ng-app']/body/div[3]/div/div/div/div/div/div/div[2]/email-subscriptions-footer-widget/div/div[1]/label/span"))
        .isDisplayed();
  }

  public WebElement getSearchDropdown() {
    return this.searchDropdown;
  }

  public void gotoSearch() {
    this.searchDropdown.click();
    this.searchField = driver.findElement(By.id("search"));
    this.searchButton = driver.findElement(By.cssSelector("input.btn.btn-action"));
  }

  public WebElement getSearchField() {
    return this.searchField;
  }

  public WebElement getSearchButton() {
    return this.searchButton;
  }

  public WebElement getArticleTitle() {
    return articleTitle;
  }

  public void gotoArticle() {
    WebElement headerTitleElement = driver.findElement(By.className("header-title"));
    this.articleTitle = headerTitleElement.findElement(By.className("title"));
  }

  public By getFirstSearchLocalization() {
    return By
        .xpath("//*[@id='ng-app']/body/div[2]/div/div[2]/div[2]/div[2]/ul[1]/li[1]/div/div[2]/a");
  }

  public WebElement getFirstSearchResult() {
    return driver.findElement(getFirstSearchLocalization());
  }

  public void gotoFirstSearchResult() {
    new WebDriverWait(driver, 30)
        .until(ExpectedConditions.visibilityOfElementLocated(this.getFirstSearchLocalization()));
    getFirstSearchResult().click();
  }

}
