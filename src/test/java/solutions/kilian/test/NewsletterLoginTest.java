package solutions.kilian.test;

import org.junit.Test;
import org.openqa.selenium.By;

import solutions.kilian.core.FunctionalTest;

public class NewsletterLoginTest extends FunctionalTest {

  @Test
  public void test() {
    driver.get("http://www.dzone.com/");
    driver.findElement(By.xpath("(//input[@id='email'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@id='email'])[2]")).sendKeys("kilian.inf@gmail.com");
    driver
        .findElement(By.xpath(
            "//html[@id='ng-app']/body/div[3]/div/div/div/div/div/div/div[2]/email-subscriptions-footer-widget/div/div[3]/form/div/span/button"))
        .click();
  }

}
