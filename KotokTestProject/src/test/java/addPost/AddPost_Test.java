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
        postPage.enterTitle("Test title");
        postPage.selectCategory("");
        postPage.enterComment("test Comment");
        postPage.clickOnCreateDiscussionButton();







    }

}
