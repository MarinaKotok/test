package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends ParentPage{

    @FindBy(xpath = ".//div[@class='main-profile-container-name']")
    private WebElement profileName;

    @FindBy(xpath = ".//a[@href='/en-us/members/edit/631daa86-7962-42b9-9af0-a7e0010a8c07/#user-cars']")
    private WebElement carMenuBatton;

    @FindBy(xpath = ".//a[@href= '/en-us/members/edit/631daa86-7962-42b9-9af0-a7e0010a8c07/#user-profile']")
    private WebElement settingsMenuBatton;

    @FindBy(xpath = ".//a[@href='/en-us/topic/create/']")
    private WebElement addPostButton;

    @FindBy(xpath = ".//a[@href='#user-preferences']")
    private WebElement myPreferences;

    public ProfilePage(WebDriver webDriver) {
        super(webDriver, "members/userprofile/631daa86-7962-42b9-9af0-a7e0010a8c07/");
    }

    public boolean checkProfile () {

        return actionWithElements.isElementDisplayed(profileName);
    }

    public void clickOnMenuCar() {

        actionWithElements.clickOnElement(carMenuBatton);
    }

    public void clickOnMenuSettings() {

        actionWithElements.clickOnElement(settingsMenuBatton);
    }

    public void clickOnAddPostButton() {

        actionWithElements.clickOnElement(addPostButton);
    }

    public void clickOnMyPreferencesMenu() {
        actionWithElements.clickOnElement(myPreferences);
    }
}
