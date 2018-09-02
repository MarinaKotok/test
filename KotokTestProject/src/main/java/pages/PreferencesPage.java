package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PreferencesPage extends ParentPage {

    @FindBy(xpath = ".//input[@id='Distance_input']")
    protected WebElement distance;

    @FindBy(xpath = ".//input[@id='Distance_input']")
    private WebElement distanceInput;

    @FindBy(xpath = ".//input[@id='Volume_input']")
    private WebElement volumeInput;

    @FindBy(xpath = ".//div[@id='#user-preferences']//button[@class='btn btn-success edit-save-btn']")
    private WebElement saveButton;

    public PreferencesPage(WebDriver webDriver) {
        super(webDriver, "members/edit/631daa86-7962-42b9-9af0-a7e0010a8c07/#user-preferences");
    }

    public void clickOnDistanceDDL() {
        actionWithElements.clickOnElement(distance);
    }

    public void clickOnDistanceInput() {
        actionWithElements.clickOnElement(distanceInput);
    }

    public void enterDistanceValue(String distanceValue) {
        actionWithElements.enterTextToElement(distanceInput, distanceValue);
        distanceInput.sendKeys(Keys.ENTER);
        distanceInput.sendKeys(Keys.TAB);
    }

    public void clickOnVolumeInput() {
        actionWithElements.clickOnElement(volumeInput);
    }

    public void enterVolumeValue(String volumeValue) {
        actionWithElements.enterTextToElement(volumeInput, volumeValue);
        volumeInput.sendKeys(Keys.ENTER);
        volumeInput.sendKeys(Keys.TAB);
    }

    public void clickOnSaveButton() {
        actionWithElements.clickOnElement(saveButton);
    }

    public void clearDistanceInput() {
        actionWithElements.clearElement(distanceInput);
    }

    public void clearVolumInput() {
        actionWithElements.clearElement(volumeInput);
    }

    public boolean isDistanceChanged(String distanceValue) {
        return actionWithElements.isElementInList(".//*[text()='" + distanceValue + "']");
    }
}
