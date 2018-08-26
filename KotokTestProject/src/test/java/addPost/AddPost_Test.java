package addPost;

import org.junit.Test;
import parentTest.ParentTest;

public class AddPost_Test extends ParentTest {
    final String testComment = "testComment_2_test";

    @Test
    public void addPost_TC() {
        loginPage.userLoggIn("m.kotok@pnn.in.ua", "12345678");

    }

}
