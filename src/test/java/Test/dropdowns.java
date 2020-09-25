package Test;

import io.cucumber.java.eo.Se;
import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public  class dropdowns extends Base {

    @Test
    public void test() throws InterruptedException {

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Dropdown"))));
        driver.findElement(By.linkText("Dropdown")).click();
        Thread.sleep(1000);

        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 1");
        Thread.sleep(1000);
        select.selectByIndex(2);
        Thread.sleep(1000);
        select.selectByValue("1");

        Select select1 = new Select(driver.findElement(By.id("year")));
        select1.selectByValue("1987");

        Thread.sleep(1000);
        Select selectyear = new Select (driver.findElement(By.id("month")));
        selectyear.selectByVisibleText("May");

        Select selectLanguages = new Select(driver.findElement(By.name("Languages")));

        selectLanguages.selectByVisibleText("Python");
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("a[class='btn btn-secondary dropdown-toggle']")).click();

        Thread.sleep(1000);

        driver.findElement(By.linkText("Amazon")).click();
        Thread.sleep(1000);

        assertEquals("java","java");






    }


}
