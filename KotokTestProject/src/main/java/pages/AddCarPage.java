package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCarPage extends ParentPage {

    @FindBy(xpath = ".//div[@class='save btn btn-success']")
    private WebElement saveButton;

    @FindBy(xpath = "") /* добавить локатор для BrandDDL */
    private WebElement brandListDDL;

    @FindBy(xpath = "") /* добавить локатор для ModelDDL */
    private WebElement modelListDDL;

    @FindBy(xpath = "") /* добавить локатор для YearDDL */
    private WebElement yearlListDDL;

    @FindBy(xpath = "") /* добавить локатор для EngineDDL */
    private WebElement engineListDDL;

    public void clickButtonSave () {
        actionWithElements.clickOnElement(saveButton);
    }

    public AddCarPage(WebDriver webDriver) {
        super(webDriver, "members/edit/631daa86-7962-42b9-9af0-a7e0010a8c07/#user-cars");
    }

    public void selectCarBrand(String brand) {
        actionWithElements.selectValueInDDL(brandListDDL, brand);
    }


    public void selectCarModel(String model) {
        actionWithElements.selectValueInDDL(modelListDDL, model);
    }

    public void selectCarYear(String year) {
        actionWithElements.selectValueInDDL(yearlListDDL, year);
    }

    public void selectCarEngine(String engine) {
        actionWithElements.selectValueInDDL(engineListDDL, engine);
    }
}
