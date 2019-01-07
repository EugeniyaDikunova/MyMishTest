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

    @FindBy (xpath="//input[@formcontrolname='password']")
    WebElement password_field;

    @FindBy (xpath = "//div[@class='alert alert-danger ng-star-inserted']")
    WebElement alertText;

    public LoginPageHelper (WebDriver driver){

        super(driver);
    }
    public void waitUntilPageLog_InLoaded() {
       // waitUntilElementIsLoaded (driver,log_InButton,20);
        waitUntilElementIsLoaded(driver,cancelButton,20);
        //waitUntilElementIsLoaded(driver,email_field,20);

    }


public void cancelPushButton (){
        cancelButton.click();
}

    public void emailFieldPressAndSendKeys(String value){
        setValueToField(email_field,value);
        //email_field.click();    создали один метод для всех полей ввода в page base
        //email_field.clear();
        //email_field.sendKeys(value);

    }



    public void passwordFieldPressAndSendKeys(String value){
        setValueToField(password_field,value);
        //password_field.click();
        //password_field.clear();
        //password_field.sendKeys(value);
    }



    public void log_InPressButton (){
       waitUntilElementIsLoaded(driver,log_InButton,20);
        log_InButton.click();
    }


    public String wrongAuthorization(){
        waitUntilElementIsLoaded (driver, alertText,20);
        //WebElement alertText = driver.findElement(By.xpath("//div[@class='alert alert-danger ng-star-inserted']"));
        return  alertText.getText();
    }
}
