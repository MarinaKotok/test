package addPost;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentTest.ParentTest;

import java.util.concurrent.TimeUnit;

public class AddPost_Test extends ParentTest {
    final String testComment = "testComment_2_test";

    @FindBy(xpath = ".//*[text()='This Field is Required']")
    private WebElement alert;

    @Test
    public void addPost_TC() {
        loginPage.userLoggedIn("m.kotok@pnn.in.ua", "12345678");
        profilePage.clickOnAddPostButton();
        postPage.checkCurrentURL();
        postPage.clickOnTitle();
        postPage.enterTitle("Test title");  /* .//div[@id='mceu_26']//iframe[@id='Content_ifr'] - локатор для поля комментария*/
        postPage.clickOnCategoryInput();
        postPage.enterCategory("- Hello forum!");
//        postPage.clickOnCategoryDDL();
//        postPage.selectValue("");
//        postPage.clickOnCommentField();
//        postPage.enterComment("test Comment");
        postPage.clickOnCreateDiscussionButton();
        webDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);


        /* не работает */
        checkAcceptanceCriteria("Alert is not appeared",
                postPage.isAlertAppears(alert),
                true);







    }

}
