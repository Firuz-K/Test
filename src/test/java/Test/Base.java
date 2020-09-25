package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public abstract class Base {

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver,5);

    @Before
    public void setUp() throws InterruptedException {

        // System.setProperty("webdriver.chrome.driver","chromedriver");
        // WebDriverManager.chromedriver().setup();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");


    }



    @After
    public void destroy() throws InterruptedException {
        Thread.sleep(2000);
       // driver.quit();
    }


}
