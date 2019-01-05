package tests;

import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EventsUnAuthPageHelper;
import pages.HomePageHelper;
import tests.TestBase;

import java.util.List;


public class HomePagesTests extends TestBase {

    HomePageHelper homePage;
    EventsUnAuthPageHelper eventsUnAuthPage;

    @BeforeMethod
    public void initPage (){

        //  инициализируем страницы
        homePage = PageFactory.initElements(driver,HomePageHelper.class);

        eventsUnAuthPage = PageFactory.initElements(driver,EventsUnAuthPageHelper.class);

    }

    @Test
    public void openHomePage()  {


        homePage.waitUntilPageLoad();
        String goToButtonName =
                homePage.getGoToEventButtonName();

        Assert.assertEquals("Go to Event list",goToButtonName);

        //Thread.sleep(20000);

       // List<WebElement> topLinksList = driver.findElements(By.cssSelector(".mat-button-wrapper .mat-button-wrapper"));

       // WebElement goToEventsButton = driver.findElement(By.className("mat-stroked-button"));
        //System.out.println("Text of button: "
        // + goToEventsButton.getText());
        //Thread.sleep(5000);

    }

    @Test
    public void goToEventsTest()  {
        homePage.waitUntilPageLoad();


        //WebElement goToEventsButton = driver.findElement(By.className("mat-stroked-button"));
        //goToEventsButton.click();

        homePage.pressGoToEventButton ();

        eventsUnAuthPage.waitUntilPageIsLoaded();

        String header = eventsUnAuthPage.goToHeader();

       //  waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Filters')]"),20 );
        //Thread.sleep(5000);
        //WebElement titlePage = driver.findElement(By.xpath("//h1[@class='gorisontal-center']"));
        Assert.assertEquals("Find event",header);
    }


}
