package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends ParentPage{

    @FindBy(xpath = ".//div[@class='main-profile-container-name']")
    private WebElement profileName;

    public ProfilePage(WebDriver webDriver) {
        super(webDriver, "members/userprofile/631daa86-7962-42b9-9af0-a7e0010a8c07/");
    }

    public boolean checkProfile () {
        return actionWithElements.isElementDisplayed(profileName);
    }
}
