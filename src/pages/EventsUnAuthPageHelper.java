package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class EventsUnAuthPageHelper extends PageBase {



    public EventsUnAuthPageHelper (WebDriver driver){

        super(driver);

    }

    public void waitUntilPageIsLoaded() {

        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Filters')]"),20 );

    }


    public String goToHeader() {

        WebElement titlePage = driver.findElement(By.xpath("//h1[@class='gorisontal-center']"));
        return titlePage.getText();
    }
}
