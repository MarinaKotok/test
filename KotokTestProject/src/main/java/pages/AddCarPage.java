package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.Key;

public class AddCarPage extends ParentPage {

    @FindBy(xpath = ".//div[@class='save btn btn-success']")
    private WebElement saveButton;

    @FindBy(xpath = ".//select[@id='Brand']") /* добавить локатор для BrandDDL */
    private WebElement brandListDDL;

    @FindBy(xpath = ".//select[@id='Model']") /* добавить локатор для ModelDDL */
    private WebElement modelListDDL;

    @FindBy(xpath = ".//select[@id='CarModelYear']") /* добавить локатор для YearDDL */
    private WebElement yearlListDDL;

    @FindBy(xpath = ".//select[@id='ModelConfiguration']") /* добавить локатор для EngineDDL */
    private WebElement engineListDDL;

    @FindBy(xpath = ".//input[@id='Brand_input']")
    private WebElement brandInput;

    @FindBy(xpath = ".//input[@id='Model_input']")
    private WebElement modelInput;

    @FindBy(xpath = ".//input[@id='CarModelYear_input']")
    private WebElement yearInput;

    @FindBy (xpath = ".//input[@id='ModelConfiguration_input']")
    private WebElement engineInput;


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

    public void clickOnBrandDDL() {
        actionWithElements.clickOnElement(brandInput);
    }

    public void clickOnModelDDL() {
        actionWithElements.clickOnElement(modelInput);
    }

    public void clickOnYearDDL() {
        actionWithElements.clickOnElement(yearInput);
    }

    public void clickOnEngineDDL() {
        actionWithElements.clickOnElement(engineInput);
    }

    public void enterBrandName(String brand) {
        actionWithElements.enterTextToElement(brandInput, brand);
        brandInput.sendKeys(Keys.ENTER);
        brandInput.sendKeys(Keys.TAB);
    }

    public void enterModelName(String model) {
        actionWithElements.enterTextToElement(modelInput, model);
        modelInput.sendKeys(Keys.ENTER);
        modelInput.sendKeys(Keys.TAB);
    }

    public void enterYear(String year) {
        actionWithElements.enterTextToElement(yearInput, year);
        yearInput.sendKeys(Keys.ENTER);
        yearInput.sendKeys(Keys.TAB);

    }

    public void enterEngine(String engine) {
        actionWithElements.enterTextToElement(engineInput, engine);
        yearInput.sendKeys(Keys.ENTER);
        yearInput.sendKeys(Keys.TAB);
    }
}
