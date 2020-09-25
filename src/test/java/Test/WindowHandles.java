package Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WindowHandles extends Base {


    @Test
    public void test1() throws InterruptedException {

        WebElement windowsLink = driver.findElement(By.linkText("Multiple Windows"));

        wait.until(ExpectedConditions.visibilityOf(windowsLink)).click();

        WebElement newWindowButton = driver.findElement(By.linkText("Click Here"));
        wait.until(ExpectedConditions.visibilityOf(newWindowButton));
        String window1 = driver.getWindowHandle();

        newWindowButton.click();

        System.out.println("We opened a new window");

        String window2 = driver.getWindowHandle();

        Thread.sleep(3000);

        driver.switchTo().window(window1);

        System.out.println("We switched to window1");

        Thread.sleep(2000);

        driver.switchTo().window(window2);

        System.out.println("window1 = " + window1);
        System.out.println("window2 = " + window2);


    }
}
