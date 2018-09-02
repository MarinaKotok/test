package loginTest;

import org.junit.Assert;
import org.junit.Test;
import pages.ParentPage;
import parentTest.ParentTest;

public class LoginTest_Test extends ParentTest {

    @Test
    public void validLogin_TC() {
        loginPage.openPage();
        loginPage.enterLogin("m.kotok@pnn.in.ua");
        loginPage.enterPass("12345678");
        loginPage.clickOnLoginButton();

        checkAcceptanceCriteria("Profile Page isn't displayed", profilePage.checkProfile(), true );


     }

}
