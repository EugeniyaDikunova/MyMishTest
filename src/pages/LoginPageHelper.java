package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.stream.events.Attribute;

public class LoginPageHelper extends PageBase {

    @FindBy (xpath="//span[contains(text(),'Log in')]")
    WebElement log_InButton;


    @FindBy (xpath="//span[contains(text(),'Cancel')]")
    WebElement cancelButton;

    @FindBy (xpath="//input[@formcontrolname='email']")
    WebElement email_field;


    public LoginPageHelper (WebDriver driver){

        super(driver);
    }
    public void waitUntilPageLog_InLoaded() {
        waitUntilElementIsLoaded (driver,log_InButton,20);
        waitUntilElementIsLoaded(driver,cancelButton,20);
        waitUntilElementIsLoaded(driver,email_field,20);

    }


public void cancelPushButton (){
        cancelButton.click();
}

    public void emailFieldPressAndSendKeys(String value){
        WebElement email_field = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        email_field.click();
        email_field.sendKeys(value );
    }

    public void passwordFieldPressAndSendKeys(String value){

        WebElement password_field = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        password_field.click();
        password_field.sendKeys(value);
    }



    public void log_InPressButton (){

        WebElement login_button=driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        login_button.click();
    }


    public String wrongAuthorization(){
        waitUntilElementIsLoaded (driver, By.xpath("//div[@class='alert alert-danger ng-star-inserted']"),20);
        WebElement alertText = driver.findElement(By.xpath("//div[@class='alert alert-danger ng-star-inserted']"));
        return  alertText.getText();
    }
}
