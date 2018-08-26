package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {

    @FindBy(xpath = ".//li[@class='dropdown language-selector']")
    private WebElement enLang;

    @FindBy(xpath = ".//ul[@id='languages-list']//li[2]//a[@href='/ru-ru/language/changelanguage/?lang=b3a76f0c-5f5f-4c5e-b6ae-c03bd103509f']")
    private WebElement ruSelector;

    @FindBy(xpath = ".//div[span='RU']")
    private WebElement ruLang;

    public HomePage(WebDriver webDriver) {
        super(webDriver, "");
    }

    public void clickOnLanguageSelector(){
        actionWithElements.clickOnElement(enLang);
    }

    public void clickOnRUSelector(){
        actionWithElements.clickOnElement(ruSelector);
    }

    public boolean checkSelector() {
        return actionWithElements.isElementDisplayed(ruLang);
    }


}
