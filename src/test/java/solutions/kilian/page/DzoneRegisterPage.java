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
  private WebElement jobRoleDropdown;
  private WebElement jobRoleOption;
  private WebElement dropdownField;
  private WebElement address1Field;
  private WebElement countrySelectionField;
  private WebElement countrySelectionFieldButton;
  private WebElement citySelectionFieldButton;
  private WebElement citySelectionField;
  private WebElement zipCodeField;
  private WebElement finishRegisterButton;
  private By continueButtonLocation;
  private WebElement phoneNumberField;
  private By jobRoleOptionLocation;

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

  public void gotoDetail() throws InterruptedException {
    Thread.sleep(2000);
    this.nameField = driver.findElement(By.id("name"));
    this.lastNameField = driver.findElement(By.id("lastName"));
    this.usernameField = driver.findElement(By.id("username"));
    this.passwordField = driver.findElement(By.id("password"));
    this.confirmPasswordField = driver.findElement(By.id("confPass"));
    this.continueButtonLocation =
        By.xpath("//html[@id='ng-app']/body/div[2]/div/div[2]/div/div[2]/div/div/div/div/button");
    this.continueButton = driver.findElement(continueButtonLocation);
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

  public void gotoSecondDetail() throws InterruptedException {
    Thread.sleep(3000);
    this.companyNameField = driver.findElement(By.id("companyName"));
    this.jobField = driver.findElement(By.id("job"));
    this.secondDetailContinueButton = driver.findElement(
        By.xpath("//html[@id='ng-app']/body/div[2]/div/div[2]/div/div[2]/div/div/div/div/button"));

  }

  public WebElement getSecondDetailContinueButton() {
    return secondDetailContinueButton;
  }

  public WebElement getJobRoleButton() {
    return driver.findElement(By.id("jobRole"));
  }

  public WebElement getJobRoleDropdown() {
    return jobRoleDropdown;
  }

  public WebElement getJobRoleOption() {
    return this.jobRoleOption;
  }

  public WebElement getDropdownField() {
    return dropdownField;
  }



  public void gotoThirdDetail() throws InterruptedException {

    Thread.sleep(2000);
    this.address1Field = driver.findElement(By.id("address1"));
    this.countrySelectionFieldButton = driver.findElement(By.xpath(
        "//html[@id='ng-app']/body/div[2]/div/div[2]/div/div[2]/div/div/div/form/div[3]/div/div/span"));
    this.countrySelectionField = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
    this.citySelectionFieldButton = driver.findElement(By.xpath("//label[@for='city']"));
    this.citySelectionField = driver.findElement(By.id("city"));
    this.zipCodeField = driver.findElement(By.id("zipCode"));
    this.phoneNumberField = driver.findElement(By.id("pNumber"));
    this.finishRegisterButton = driver.findElement(
        By.xpath("//html[@id='ng-app']/body/div[2]/div/div[2]/div/div[2]/div/div/div/div/button"));
  }

  public WebElement getAddress1Field() {
    return address1Field;
  }

  public WebElement getCountrySelectionField() {
    return countrySelectionField;
  }

  public WebElement getCountrySelectionFieldButton() {
    return countrySelectionFieldButton;
  }

  public WebElement getCitySelectionFieldButton() {
    return citySelectionFieldButton;
  }

  public WebElement getCitySelectionField() {
    return citySelectionField;
  }

  public WebElement getZipCodeField() {
    return zipCodeField;
  }

  public WebElement getFinishRegisterButton() {
    return finishRegisterButton;
  }

  public boolean isRegisterSuccessDisplayed() {
    return driver.findElement(By.className("toppancake")).isDisplayed();
  }

  public By getContinueButtonLocation() {
    return continueButtonLocation;
  }

  public void waitUntilContinueButtonEnabled() {
    new WebDriverWait(driver, 10)
        .until(ExpectedConditions.elementToBeClickable(getContinueButtonLocation()));
  }

  public WebElement getPhoneNumberField() {
    return phoneNumberField;
  }

  public By getJobRoleOptionLocation() {
    return jobRoleOptionLocation;
  }

  public WebElement getJobFieldButton() {
    return driver.findElement(By.xpath("//button[@type='button']"));
  }

  public WebElement getCompanySizeDropdown() {
    return driver.findElement(By.id("dropdownMenu1"));
  }

  public WebElement getCompanySizeArrowButton() {
    return driver.findElement(By.id("companySize"));
  }

}
