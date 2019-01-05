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
import pages.CreateAccountAndLoginHelper;
import pages.EventsAuthPageHelper;
import pages.HomePageHelper;
import tests.TestBase;

public class CreateAccountAndLogInPageTests extends TestBase {

    HomePageHelper homePage;
    CreateAccountAndLoginHelper createAccount;
    EventsAuthPageHelper eventsAuthPage;

    @BeforeMethod
    public void initPage() {
        homePage = PageFactory.initElements(driver,HomePageHelper.class);
        createAccount = PageFactory.initElements(driver,CreateAccountAndLoginHelper.class);
        eventsAuthPage = PageFactory.initElements(driver, EventsAuthPageHelper.class);
    }



    @Test
    public void CreateNewAccount () {
        homePage.waitUntilPageLoad();
        createAccount.createAccountPushButton();
        String email1 = latinDigitString(8) + "@gmail.com";
        createAccount.emailFieldPressAndSendKeys(email1);
        createAccount.passportFieldPressAndSendKeys("555555");
        createAccount.repPassportFieldPressAndSendKeys("555555");
        createAccount.registrationButtonWaitAndClick();
        homePage.waitUntilPageLoad();
        Assert.assertEquals("Menu",eventsAuthPage.getTooltipIconMenu());
        homePage.pressButtonMenu();
        homePage.pressLogOut();
        homePage.waitUntilPageLoad();
        Assert.assertEquals("Go to Event list",homePage.getGoToEventButtonName());

        //waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Create Account')]"),45);
        //WebElement createAccount = driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
        //createAccount.click();
       // WebElement mailField = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        //mailField.click();
        //mailField.sendKeys(email1);
        //WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        //passwordField.click();
        //passwordField.sendKeys("555555");
        //WebElement repPasswordField = driver.findElement(By.xpath("//input[@formcontrolname='passwordRep']"));
        //repPasswordField.click();
        //repPasswordField.sendKeys("555555");
        //waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Registration')]"),20);
        //WebElement registrationButton = driver.findElement(By.xpath("//span[contains(text(),'Registration')]"));
        //registrationButton.click();
        //waitUntilElementIsLoaded (driver, By.xpath("//mat-icon[@class='but mat-icon material-icons']"),20);
        //WebElement iconMenu = driver.findElement(By.xpath("//mat-icon[@class='but mat-icon material-icons']"));
        //Assert.assertTrue(iconMenu.getAttribute("mattooltip").equals("Menu"));
        // iconMenu.click();
        //WebElement logOutMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
        //logOutMenu.click();
        //waitUntilElementIsLoaded (driver, By.xpath("//span[contains(text(),'Go to Event list')]"),20);
        //WebElement goToEventsButton = driver.findElement(By.xpath("//span[contains(text(),'Go to Event list')]"));
        //Assert.assertTrue(goToEventsButton.getText().equals("Go to Event list"));

    }
    @Test

    public void CreateNewAccountAndLogin (){

        String email2 = latinDigitString(8) + "@gmail.com";
        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Create Account')]"),45);
        WebElement createAccount = driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
        createAccount.click();
        WebElement mailField = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        mailField.click();
        mailField.sendKeys(email2);
        WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passwordField.click();
        passwordField.sendKeys("example");
        WebElement repPasswordField = driver.findElement(By.xpath("//input[@formcontrolname='passwordRep']"));
        repPasswordField.click();
        repPasswordField.sendKeys("example");
        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Registration')]"),20);
        WebElement registrationButton = driver.findElement(By.xpath("//span[contains(text(),'Registration')]"));
        registrationButton.click();
        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Cancel')]"),20);
        WebElement cancelButton = driver.findElement(By.xpath("//button[@type='button']//span[contains(text(),'Cancel')]/.."));
        cancelButton.click();
        waitUntilElementIsLoaded (driver, By.xpath("//mat-icon[@class='but mat-icon material-icons']"),20);
        WebElement iconMenu = driver.findElement(By.xpath("//mat-icon[@class='but mat-icon material-icons']"));
        iconMenu.click();
        WebElement logOutMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
        logOutMenu.click();
        waitUntilElementIsLoaded(driver, By.xpath("//span[@class='marginLeft']"),20);

        //----------Login created user----------

        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Login')]"),35);
        WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        login.click();

        WebElement emailReg = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        emailReg.click();
        emailReg.sendKeys(email2);
        waitUntilElementIsLoaded(driver, By.xpath("//input[@formcontrolname='email']"),20);

        WebElement passReg =  driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passReg.click();
        passReg.sendKeys("example");

        WebElement log_In = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        log_In.click();
        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Log in')]"),20);

        waitUntilElementIsLoaded (driver, By.xpath("//mat-icon[@class='but mat-icon material-icons']"),20);

        WebElement buttonMenu = driver.findElement(By.xpath("//mat-icon[@class='but mat-icon material-icons']"));
        Assert.assertTrue(buttonMenu.getAttribute("mattooltip").equals("Menu"));

    }




}
