package Test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;

public class HoverOver extends Base {

    @Test
    public void hover() throws InterruptedException {


        Actions actions = new Actions(driver);

        WebElement hovers = driver.findElement(By.linkText("Hovers"));

        wait.until(ExpectedConditions.visibilityOf(hovers)).click();


        WebElement img1 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(img1));

        actions.moveToElement(img1).perform();

        Thread.sleep(1000);

        WebElement img2 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));

        actions.moveToElement(img2).perform();

        WebElement user2Text = driver.findElement(By.xpath("//h5[text()='name: user2']"));

        Assert.assertTrue(user2Text.isDisplayed());

        Thread.sleep(1000);

    }


}
