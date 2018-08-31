package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostPage extends ParentPage {
    @FindBy(xpath = ".//input[@id='Name']")
    protected WebElement titlefield;

    @FindBy(xpath = ".//select[@id='Category']")
    private WebElement categoryDDL;

    @FindBy(xpath = ".//div[@id='mceu_26']//iframe[@id='Content_ifr']") /* ----? должен быть input?*/
    private WebElement commentField;

    @FindBy(xpath = ".//button[@id='createTopicSubmitBtn']")
    private WebElement createDiscussionButton;

    @FindBy(xpath = ".//span[@class='input-group-addon dropdown-toggle']")
    private WebElement category;

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

    public void clickOnCategoryDDL() {
        actionWithElements.clickOnElement(category);
    }

    public void clickOnCommentField() {
        actionWithElements.clickOnElement(commentField);
    }

    public void selectValue(String valueFromCategoryDDL) {
        actionWithElements.selectValueInDDL(categoryDDL, valueFromCategoryDDL);
    }
}
