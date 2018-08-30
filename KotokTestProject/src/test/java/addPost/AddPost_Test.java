package addPost;

import org.junit.Test;
import parentTest.ParentTest;

public class AddPost_Test extends ParentTest {
    final String testComment = "testComment_2_test";

    @Test
    public void addPost_TC() {
        loginPage.userLoggedIn("m.kotok@pnn.in.ua", "12345678");
        profilePage.clickOnAddPostButton();
        postPage.checkCurrentURL();
        postPage.clickOnTitle();
        postPage.enterTitle("Test title");  /* .//div[@id='mceu_26']//iframe[@id='Content_ifr'] - локатор для поля комментария*/
        postPage.selectCategory("73346f8e-e5bd-45ce-a84a-46520343e176");
        postPage.enterComment("test Comment");
        postPage.clickOnCreateDiscussionButton();







    }

}
