package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePageHelper extends PageBase {

    @FindBy(xpath = "//span[contains(text(),'Cancel')]")
    WebElement cancelButton;
    @FindBy (xpath = "//mat-icon[@mattooltip='Menu']")
    WebElement iconButton;
    @FindBy (xpath = "//span[@class='marginLeft']")
    WebElement logOutButton;
    @FindBy (xpath = "//h1[@class='classCentr']")
    WebElement headerRegistration;

    public ProfilePageHelper(WebDriver driver) {
        super(driver);
    }

    public void waitUntilPageLoad(){
        waitUntilElementIsLoaded(driver, headerRegistration,40);
        waitUntilElementIsLoaded(driver, cancelButton, 40);
        waitUntilElementIsLoaded(driver, iconButton, 40);

        System.out.println("Cancel button: "+ cancelButton.getText());
    }

    public void menuButtonClick(){
        iconButton.click();
    }

    public String getHeader() {
        return headerRegistration.getText();
    }

    public void pressLogOut (){
        //WebElement logOutMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
        logOutButton.click();
    }
}
