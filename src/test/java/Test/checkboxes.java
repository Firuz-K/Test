package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
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

public  class checkboxes {

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

   @Test
   public void checkboxes() throws InterruptedException {


      WebElement checkboxes= driver.findElement(By.linkText("Checkboxes"));

       wait.until(ExpectedConditions.visibilityOf(checkboxes)).click();

       wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"))));
       driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
       Thread.sleep(2000);
      // wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText(" checkbox 2")))).click();

       driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();

   }

   @After
   public void destroy() throws InterruptedException {
        Thread.sleep(2000);
       driver.quit();
   }



}
