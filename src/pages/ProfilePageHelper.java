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

    public ProfilePageHelper(WebDriver driver) {
        super(driver);
    }

    public void waitUntilPageLoad() {
        waitUntilElementIsLoaded(driver,cancelButton,40);
    }

    public void waitUntilPageMenuLoadAndPush() {
        waitUntilElementIsLoaded(driver,iconButton,40);
        iconButton.click();
    }
    public String getTooltipIconMenu() {

        return iconButton.getAttribute("mattooltip");
    }


    public void pressLogOut (){
        //WebElement logOutMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
        logOutButton.click();
    }
}
