
package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EventsAuthPageHelper;
import pages.EventsUnAuthPageHelper;
import pages.HomePageHelper;
import pages.LoginPageHelper;

import javax.xml.stream.events.Attribute;

public class LoginPageTest extends TestBase

{
    HomePageHelper homePage;
    LoginPageHelper loginPage;


    @BeforeMethod
    public void initPage (){
        homePage = PageFactory.initElements(driver,HomePageHelper.class);
        loginPage = PageFactory.initElements(driver,LoginPageHelper.class);
        eventsAuthPage = PageFactory.initElements(driver, EventsAuthPageHelper.class);
    }
    EventsAuthPageHelper eventsAuthPage;

    @Test
    public void LoginPositive () {

           homePage.waitUntilPageLoad();
          homePage.pressLoginButton();

           loginPage.waitUntilPageCancelLoaded();
           loginPage.emailFieldPressAndSendKeys("jmenka@gmail.com");
           loginPage.passwordFieldPressAndSendKeys("221263");
           loginPage.waitUntilPageLog_InLoaded();
           loginPage.log_InPressButton();
           eventsAuthPage.waitUntilPageMenuIconLoaded();

        Assert.assertEquals("Menu",eventsAuthPage.getTooltipIconMenu());

        Assert.assertEquals("Find event",eventsAuthPage.getHeader());


        //waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Login')]"),45);
        // WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        // login.click();
        //waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Cancel')]"),20);
          // WebElement email_field = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
           // WebElement password_field = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
           // email_field.click();
            //email_field.sendKeys("jmenka@gmail.com");
           // password_field.click();
           // password_field.sendKeys("221263");
           // waitUntilElementIsLoaded (driver, By.xpath("//span[contains(text(),'Log in')]"),20);
        // WebElement login_button=driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        //login_button.click();
        //waitUntilElementIsLoaded (driver, By.xpath("//mat-icon[@class='but mat-icon material-icons']"),20);
        //WebElement iconMenu = driver.findElement(By.xpath("//mat-icon[@class='but mat-icon material-icons']"));
        //Assert.assertTrue(iconMenu.getAttribute("mattooltip").equals("Menu"));

        }

    @Test
    public void LoginNegative (){

        homePage.waitUntilPageLoad();
        homePage.pressLoginButton();


        loginPage.waitUntilPageCancelLoaded();
        loginPage.emailFieldPressAndSendKeys("jmenkaa@gmail.com");
        loginPage.passwordFieldPressAndSendKeys("221263");
        loginPage.waitUntilPageLog_InLoaded();
        loginPage.log_InPressButton();
        loginPage.wrongAuthorization();
        Assert.assertEquals("Wrong authorization, login or password",loginPage.wrongAuthorization());


       // waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Login')]"),45);
    //WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
    //login.click();

    //waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Cancel')]"),20);

    /*WebElement email_field = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
    WebElement password_field = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
    email_field.click();
    email_field.sendKeys("jmenkaa@gmail.com");
    password_field.click();
    password_field.sendKeys("221263");*/

    //waitUntilElementIsLoaded (driver, By.xpath("//span[contains(text(),'Log in')]"),20);

    //WebElement login_button=driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
    //login_button.click();

       // waitUntilElementIsLoaded (driver, By.xpath("//div[@class='alert alert-danger ng-star-inserted']"),20);
        //WebElement alertText = driver.findElement(By.xpath("//div[@class='alert alert-danger ng-star-inserted']"));
        //Assert.assertTrue(alertText.getText().equals("Wrong authorization, login or password"));

    }

    }




