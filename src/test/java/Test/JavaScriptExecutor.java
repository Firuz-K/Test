package Test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecutor extends Base {




    @Test
    public void javaScriptExecutor() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor)driver;

        WebElement bottom = driver.findElement(By.linkText("Cybertek School"));

        Thread.sleep(1000);
        js.executeScript("arguments[0].scrollIntoView(true);" +
                            "arguments[0].click()",bottom);



        driver.close();



    }

}
