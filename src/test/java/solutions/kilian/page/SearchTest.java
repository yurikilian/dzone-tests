package solutions.kilian.page;

import org.junit.Test;
import org.openqa.selenium.By;

import solutions.kilian.config.AbstractFunctionalTest;

public class SearchTest extends AbstractFunctionalTest {

  @Test
  public void test() {
    driver.get("http://www.dzone.com");
    driver.findElement(By.id("dropdownMenu2")).click();
    driver.findElement(By.id("search")).clear();
    driver.findElement(By.id("search")).sendKeys("Reactive Clean Architecture With Vert.x");
    driver.findElement(By.cssSelector("input.btn.btn-action")).click();
    driver.findElement(By.linkText("Reactive Clean Architecture With Vert.x")).click();


    // o resultado correto é poder ver esse elemento
    // "Reactive Clean Architecture With Vert.x"
  }

}
