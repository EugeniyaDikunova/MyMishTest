package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;


// для всех методов класс,которые относятся к HomePage

public class HomePageHelper extends PageBase  {

    @FindBy(className = "mat-stroked-button")
    WebElement goToEventsButton;

    @FindBy(xpath = "//span[contains(text(),'Login')]")
    WebElement loginButton;

    @FindBy(css = ".mat-button-wrapper .mat-button-wrapper")
    List<WebElement> topLinksList;


    @FindBy (xpath ="//span[contains(text(),'Create Account')]")
    WebElement createAcoountButton;


    @FindBy (xpath = "//mat-icon[@class='but mat-icon material-icons']")
    WebElement iconMenu;

    @FindBy (xpath = "//span[@class='marginLeft']")
    WebElement logOutButton;

    public HomePageHelper (WebDriver driver){

        super(driver);

    }

    public void waitUntilPageLoad() {

        waitUntilElementIsLoaded(driver,loginButton,45);
        waitUntilElementIsLoaded(driver,createAcoountButton,20);
        waitUntilElementIsLoaded(driver,iconMenu,20);
        waitUntilElementIsLoaded(driver,goToEventsButton,20);


    }

    public void pressLoginButton (){

        //WebElement loginButton = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        loginButton.click();
    }


    public String getGoToEventButtonName() {
        /*WebElement goToEventsButton = driver.findElement(
                By.className("mat-stroked-button"));*/
        return goToEventsButton.getText();
    }


    public void pressGoToEventButton() {

       // WebElement goToEventsButton = driver.findElement(By.className("mat-stroked-button"));
        goToEventsButton.click();
    }

    public void pressButtonMenu (){

        //WebElement iconMenu = driver.findElement(By.xpath("//mat-icon[@class='but mat-icon material-icons']"));
        iconMenu.click();
    }

    public void pressLogOut (){
        //WebElement logOutMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
        logOutButton.click();
    }

}
