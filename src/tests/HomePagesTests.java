package tests;

import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.testng.Assert;
        import org.testng.annotations.Test;
import tests.TestBase;

import java.util.List;

/**
 * Created by Inka on 16-Dec-18.
 */
public class HomePagesTests extends TestBase {
    @Test
    public void openHomePage()  {
        //Thread.sleep(20000);
        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Login')]"),45);
        List<WebElement> topLinksList = driver.findElements(By.cssSelector(".mat-button-wrapper .mat-button-wrapper"));

        WebElement goToEventsButton = driver.findElement(By.className("mat-stroked-button"));
        //System.out.println("Text of button: "
        // + goToEventsButton.getText());
        //Thread.sleep(5000);
        Assert.assertTrue(goToEventsButton.getText().equals("Go to Event list"));// сравнение ожидаемого результата с актуальным
    }
    @Test
    public void goToEventsTest()  {
        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Login')]"),45);


        WebElement goToEventsButton = driver.findElement(By.className("mat-stroked-button"));
        goToEventsButton.click();

        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Filters')]"),20 );
        //Thread.sleep(5000);
        WebElement titlePage = driver.findElement(By.xpath("//h1[@class='gorisontal-center']"));
        Assert.assertTrue(titlePage.getText().equals("Find event"));
    }



}
