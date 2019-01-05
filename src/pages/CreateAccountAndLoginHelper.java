package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountAndLoginHelper  extends PageBase {


    public CreateAccountAndLoginHelper(WebDriver driver) {
        super(driver);
    }

public void createAccountPushButton () {
    WebElement createAccount = driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
    createAccount.click();
    }

    public void emailFieldPressAndSendKeys (String value){

        WebElement mailField = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        mailField.click();
        mailField.sendKeys(value);
            }

            public void passportFieldPressAndSendKeys (String value){
                WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
                passwordField.click();
                passwordField.sendKeys(value);
            }
    public void repPassportFieldPressAndSendKeys (String value){
        WebElement repPasswordField = driver.findElement(By.xpath("//input[@formcontrolname='passwordRep']"));
        repPasswordField.click();
        repPasswordField.sendKeys(value);
    }

    public void registrationButtonWaitAndClick (){
        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Registration')]"),20);
        WebElement registrationButton = driver.findElement(By.xpath("//span[contains(text(),'Registration')]"));
        registrationButton.click();
    }




}
