package solutions.kilian.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import solutions.kilian.core.Page;

public class DzoneRegisterPage extends Page {

  private WebElement registerEmailField;
  private WebElement proceedButton;
  private WebElement nameField;
  private WebElement lastNameField;
  private WebElement usernameField;
  private WebElement passwordField;
  private WebElement confirmPasswordField;
  private WebElement continueButton;
  private WebElement companyNameField;
  private WebElement jobField;
  private WebElement secondDetailContinueButton;
  private WebElement jobRoleButton;
  private WebElement jobRoleDropdown;
  private WebElement jobRoleOption;

  public DzoneRegisterPage(WebDriver webDriver, String baseUrl) {
    super(webDriver, baseUrl);

    this.registerElements();
  }

  private void registerElements() {
    new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(
        By.cssSelector("div.form-group.input-container > input[name=\"email\"]")));
    this.registerEmailField = driver
        .findElement(By.cssSelector("div.form-group.input-container > input[name=\"email\"]"));
    this.proceedButton = driver
        .findElement(By.cssSelector("div.form-group > div.button-right > input.btn.btn-success"));
  }

  public WebElement getRegisterEmailField() {
    return registerEmailField;
  }

  public WebElement getProceedButton() {
    return this.proceedButton;
  }

  private By getNameFieldLocalization() {
    return By.id("name");
  }

  public void gotoDetail() {
    new WebDriverWait(driver, 30)
        .until(ExpectedConditions.visibilityOfElementLocated(this.getNameFieldLocalization()));
    this.nameField = driver.findElement(By.id("name"));
    this.lastNameField = driver.findElement(By.id("lastName"));
    this.usernameField = driver.findElement(By.id("username"));
    this.passwordField = driver.findElement(By.id("password"));
    this.confirmPasswordField = driver.findElement(By.id("confPass"));
    this.continueButton = driver.findElement(
        By.xpath("//html[@id='ng-app']/body/div[2]/div/div[2]/div/div[2]/div/div/div/div/button"));
  }

  public WebElement getNameField() {
    return nameField;
  }

  public WebElement getLastNameField() {
    return lastNameField;
  }

  public WebElement getUsernameField() {
    return usernameField;
  }

  public WebElement getPasswordField() {
    return passwordField;
  }

  public WebElement getConfirmPasswordField() {
    return confirmPasswordField;
  }

  public WebElement getContinueButton() {
    return continueButton;
  }

  public WebElement getCompanyNameField() {
    return companyNameField;
  }

  public WebElement getJobField() {
    return jobField;
  }

  public void gotoSecondDetail() {
    this.companyNameField = driver.findElement(By.id("companyName"));
    this.jobField = driver.findElement(By.id("job"));
    this.secondDetailContinueButton = driver.findElement(
        By.xpath("//html[@id='ng-app']/body/div[2]/div/div[2]/div/div[2]/div/div/div/div/button"));
    this.jobRoleButton = driver.findElement(By.id("jobRole"));
    this.jobRoleDropdown = driver.findElement(By.id("dropdownMenu1"));
    this.jobRoleOption = driver.findElement(By.linkText("50 to 99"));
  }

  public WebElement getSecondDetailContinueButton() {
    return secondDetailContinueButton;
  }

  public WebElement getJobRoleButton() {
    return jobRoleButton;
  }

  public WebElement getJobRoleDropdown() {
    return jobRoleDropdown;
  }

  public WebElement getJobRoleOption() {
    return this.jobRoleOption;
  }



}
