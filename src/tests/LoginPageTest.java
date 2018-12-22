
package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase
{

    @Test
    public void LoginPositive () {

           waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Login')]"),45);
            WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
            login.click();

            waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Cancel')]"),20);

            WebElement email_field = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
            WebElement password_field = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
            email_field.click();
            email_field.sendKeys("jmenka@gmail.com");
            password_field.click();
            password_field.sendKeys("221263");

            waitUntilElementIsLoaded (driver, By.xpath("//span[contains(text(),'Log in')]"),20);

            WebElement login_button=driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
            login_button.click();

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




