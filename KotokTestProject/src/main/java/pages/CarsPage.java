package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarsPage extends ParentPage {
    AddCarPage addCarPage;

    @FindBy(xpath = ".//div[@class='car-item-container']//div[@class='car-item-info-grpup'][.//*[text()='Toyota'] and .//*[text()='RAV 4']and .//*[text()='2010']]//..//..//*[text()='Remove']")
    private WebElement buttonRemove;

    @FindBy(xpath = ".//div[@class='btn btn-success']")
    private WebElement addButton;


    public CarsPage(WebDriver webDriver) {
        super(webDriver, "members/edit/631daa86-7962-42b9-9af0-a7e0010a8c07/#user-cars");
        addCarPage = new AddCarPage(webDriver);
    }


    public void deleteAllCarsWithCurrentName(String carName) {
       while (isCarInList(carName)) {
           clickButtonRemove();
           logger.info("Car with name + " + carName + " was deleted");
       }
    }

    private boolean isCarInList(String carLocator) {
        return actionWithElements.isElementInList(".//div[@class='car-item-container']//div[@class='car-item-info-grpup'][.//*[text()='Toyota'] and .//*[text()='RAV 4']and .//*[text()='2010']]");
    }

    private void clickButtonRemove() {
        actionWithElements.clickOnElement(buttonRemove);

    }

    private boolean isEngineInList(String carBrand, String carModel, String carYear, String carEngine) {
        return actionWithElements.isElementInList(".//*[text()='" + carBrand + " " + carModel + " " + carYear + " " + carEngine + "']");
    }

    public void clickOnAddButton() {
        actionWithElements.clickOnElement(addButton);
    }

    public boolean isNewCarAdded(String xPathLocator) {
        return actionWithElements.isElementInList(".//div[@class='car-item-container']//div[@class='car-item-info-grpup'][.//*[text()='Toyota'] and .//*[text()='RAV 4']and .//*[text()='2010']]");
    }
}
