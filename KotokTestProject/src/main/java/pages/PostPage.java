package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostPage extends ParentPage {
    @FindBy(xpath = ".//input[@id='Name']")
    protected WebElement title;

    public PostPage(WebDriver webDriver) {

        super(webDriver, "topic/create/");
    }

    public void clickOnTitle() {
        actionWithElements.clickOnElement(title);
    }

    public void enterTitle() {
        actionWithElements.enterTextToElement(title, "TestTitle");
    }
}
