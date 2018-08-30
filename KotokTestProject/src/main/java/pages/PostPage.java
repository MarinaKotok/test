package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostPage extends ParentPage {
    @FindBy(xpath = ".//input[@id='Name']")
    protected WebElement titlefield;

    @FindBy(xpath = ".//select[@id='Category']")
    private WebElement categoryDDL;

    @FindBy(xpath = ".//body[@id='tinymce']//p") /* ----? должен быть input?*/
    private WebElement commentField;

    @FindBy(xpath = ".//button[@id='createTopicSubmitBtn']")
    private WebElement createDiscussionButton;

    public PostPage(WebDriver webDriver) {

        super(webDriver, "topic/create/");
    }

    public void clickOnTitle() {

        actionWithElements.clickOnElement(titlefield);
    }

    public void enterTitle(String title) {

        actionWithElements.enterTextToElement(titlefield, title);
    }

    public void selectCategory(String value) {
        actionWithElements.selectValueInDDL(categoryDDL, value);

    }

    public void enterComment(String comment) {

        actionWithElements.enterTextToElement(commentField, comment);
    }

    public void clickOnCreateDiscussionButton() {

        actionWithElements.clickOnElement(createDiscussionButton);
    }
}
