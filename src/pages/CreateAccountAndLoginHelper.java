package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountAndLoginHelper  extends PageBase {


    @FindBy (xpath = "//span[contains(text(),'Cancel')]")
    WebElement cancelButton;

    @FindBy (xpath="//input[@formcontrolname='email']")
    WebElement email_field;

    @FindBy (xpath="//input[@formcontrolname='password']")
    WebElement password_field;

    @FindBy (xpath="//input[@formcontrolname='passwordRep']")
    WebElement rePassword_field;

    @FindBy (xpath = "//span[contains(text(),'Registration')]" )
    WebElement registrationButton;


    public CreateAccountAndLoginHelper(WebDriver driver) {
        super(driver);
    }

    public void waitUntilPageLoad() {
        waitUntilElementIsLoaded(driver,cancelButton, 40);
    }

    public String enterValueToFieldEmailRandom() {
        String email = latinDigitString(10)+"@gmail.com";
        setValueToField(email_field,email);
        return email;
    }

    public void emailFieldPressAndSendKeys (String value){
           setValueToField(email_field,value);
        //WebElement mailField = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        //mailField.click();
        //mailField.sendKeys(value);
            }

            public void passportFieldPressAndSendKeys (String value){
        setValueToField(password_field,value);
                //WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
                //passwordField.click();
                //passwordField.sendKeys(value);
            }
    public void repPassportFieldPressAndSendKeys (String value){
        setValueToField(rePassword_field,value);
        //WebElement repPasswordField = driver.findElement(By.xpath("//input[@formcontrolname='passwordRep']"));
        //repPasswordField.click();
        //repPasswordField.sendKeys(value);
    }

    public void registrationButtonWaitAndClick (){

        waitUntilElementIsLoaded(driver,registrationButton,20);
        //WebElement registrationButton = driver.findElement(By.xpath("//span[contains(text(),'Registration')]"));
        registrationButton.click();
    }



}
