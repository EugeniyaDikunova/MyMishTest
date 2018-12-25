package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.xml.stream.events.Attribute;

public class LoginPageHelper extends PageBase {

    public LoginPageHelper (WebDriver driver){

        super(driver);
    }




    public void PressLoginButton (){

        WebElement loginButton = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        loginButton.click();
    }

    public void waitUntilPgeCancelLoaded() {

        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Cancel')]"),20);

    }


    public void emailFieldPressAndSendKeys(){
        WebElement email_field = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        email_field.click();
        email_field.sendKeys("jmenka@gmail.com");
    }

    public void passwordFieldPressAndSendKeys(){

        WebElement password_field = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        password_field.click();
        password_field.sendKeys("221263");
    }

    public void waitUntilPageLog_InLoaded() {
        waitUntilElementIsLoaded (driver, By.xpath("//span[contains(text(),'Log in')]"),20);
        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Cancel')]"),20);

    }

    public void Log_InPressButton (){

        WebElement login_button=driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        login_button.click();
    }

    public void waitUntilPageMenuIconLoaded(){
        waitUntilElementIsLoaded (driver, By.xpath("//mat-icon[@class='but mat-icon material-icons']"),20);
    }



    public String GoToIconMenu() {
        WebElement iconMenu = driver.findElement(By.xpath("//mat-icon[@class='but mat-icon material-icons']"));
        return iconMenu.getText();
    }

    public void emailNegativeFieldPressAndSendKeys(){
        WebElement email_field = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        email_field.click();
        email_field.sendKeys("jmenkaa@gmail.com");
    }

    public void  waitUntilAlertElementIsLoaded (){
        waitUntilElementIsLoaded (driver, By.xpath("//div[@class='alert alert-danger ng-star-inserted']"),20);
    }


    public String wrongAuthorization() {

        WebElement alertText = driver.findElement(By.xpath("//div[@class='alert alert-danger ng-star-inserted']"));
        return  alertText.getText();
    }
}
