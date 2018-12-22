package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestBase;

public class HWTestCreateAccountAndLogIn extends TestBase {

    @Test
    public void CreateNewAccountAndLogOut () {
        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Create Account')]"),45);
        WebElement createAccount = driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
        createAccount.click();
        WebElement mailField = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        mailField.click();
        mailField.sendKeys("jenya89@gmail.com");

        WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passwordField.click();
        passwordField.sendKeys("555555");

        WebElement repPasswordField = driver.findElement(By.xpath("//input[@formcontrolname='passwordRep']"));
        repPasswordField.click();
        repPasswordField.sendKeys("555555");

        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Registration')]"),20);

        WebElement registrationButton = driver.findElement(By.xpath("//span[contains(text(),'Registration')]"));
        registrationButton.click();

        waitUntilElementIsLoaded (driver, By.xpath("//mat-icon[@class='but mat-icon material-icons']"),20);
        WebElement iconMenu = driver.findElement(By.xpath("//mat-icon[@class='but mat-icon material-icons']"));
        Assert.assertTrue(iconMenu.getAttribute("mattooltip").equals("Menu"));
        iconMenu.click();

        WebElement logOutMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
        logOutMenu.click();

        waitUntilElementIsLoaded (driver, By.xpath("//span[contains(text(),'Go to Event list')]"),20);

        WebElement goToEventsButton = driver.findElement(By.xpath("//span[contains(text(),'Go to Event list')]"));
        Assert.assertTrue(goToEventsButton.getText().equals("Go to Event list"));

    }


@Test
    public void LoginPositive (){

    waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Login')]"),45);
    WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
    login.click();

    waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Cancel')]"),20);

    WebElement emailReg = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
    emailReg.click();
    emailReg.sendKeys("jmenka@gmail.com");

    WebElement passReg =  driver.findElement(By.xpath("//input[@formcontrolname='password']"));
    passReg.click();
    passReg.sendKeys("221263");

    waitUntilElementIsLoaded (driver, By.xpath("//span[contains(text(),'Log in')]"),20);

    WebElement log_In = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
    log_In.click();

    waitUntilElementIsLoaded (driver, By.xpath("//mat-icon[@class='but mat-icon material-icons']"),20);

    WebElement iconMenu = driver.findElement(By.xpath("//mat-icon[@class='but mat-icon material-icons']"));
    Assert.assertTrue(iconMenu.getAttribute("mattooltip").equals("Menu"));

}

    @Test
    public void LoginNegative (){

        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Login')]"),45);
        WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        login.click();

        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Cancel')]"),20);

        WebElement email_field = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        WebElement password_field = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        email_field.click();
        email_field.sendKeys("jmenkaa@gmail.com");
        password_field.click();
        password_field.sendKeys("221263");

        waitUntilElementIsLoaded (driver, By.xpath("//span[contains(text(),'Log in')]"),20);

        WebElement login_button=driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        login_button.click();

        waitUntilElementIsLoaded (driver, By.xpath("//div[@class='alert alert-danger ng-star-inserted']"),20);
        WebElement alertText = driver.findElement(By.xpath("//div[@class='alert alert-danger ng-star-inserted']"));
        Assert.assertTrue(alertText.getText().equals("Wrong authorization, login or password"));

    }



}
