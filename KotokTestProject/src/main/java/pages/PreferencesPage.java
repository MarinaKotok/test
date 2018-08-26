package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PreferencesPage extends ParentPage {

    @FindBy(xpath = ".//input[@id='Distance_input']")
    protected WebElement distance;

    public PreferencesPage(WebDriver webDriver) {
        super(webDriver, "members/edit/631daa86-7962-42b9-9af0-a7e0010a8c07/#user-preferences");
    }

    public void clickOnDistanceDDL() {
        actionWithElements.clickOnElement(distance);
    }
}
