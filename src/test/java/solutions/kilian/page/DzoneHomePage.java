package solutions.kilian.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import solutions.kilian.core.Page;

public class DzoneHomePage extends Page {
  private WebElement loginButton;
  private WebElement loginUsernameField;
  private WebElement loginPasswordField;
  private WebElement signInButton;
  private WebElement loginErrorField;


  public DzoneHomePage(WebDriver webDriver) {
    super(webDriver, "https://dzone.com");
    registerPageElements();
  }

  private void registerPageElements() {
    this.loginButton = driver.findElement(By.linkText("Sign In / Join"));
    this.loginUsernameField = driver.findElement(By.name("username"));
    this.loginPasswordField = driver.findElement(By.name("password"));
    this.signInButton = driver.findElement(By.cssSelector("input.btn.btn-success"));
    this.loginErrorField = driver.findElement(By.className("has-error"));
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

  public WebElement getLoginErrorField() {
    return loginErrorField;
  }

}
