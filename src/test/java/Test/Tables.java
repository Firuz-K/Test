package Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Tables extends Base {

    @Test
    public void tables() {

        WebElement table = driver.findElement(By.linkText("Sortable Data Tables"));
        wait.until(ExpectedConditions.visibilityOf(table)).click();

        WebElement tData = driver.findElement(By.xpath("//table[@id='table1']//tr[3]//td[3]"));

        String text = wait.until(ExpectedConditions.visibilityOf(tData)).getText();

        System.out.println("text = " + text);

    }


}
