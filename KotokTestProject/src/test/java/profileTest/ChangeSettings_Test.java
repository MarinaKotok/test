package profileTest;

import org.junit.Test;
import parentTest.ParentTest;

public class ChangeSettings_Test extends ParentTest {
    final String distance = "miles";
    final String volume = "Gallons US";

    @Test
    public void changeSettings_TC() {
        loginPage.userLoggedIn("m.kotok@pnn.in.ua", "12345678");
        profilePage.clickOnMenuSettings();
        smallProfilePage.checkCurrentURL();
        profilePage.clickOnMyPreferencesMenu();
        preferencesPage.checkCurrentURL();
//        preferencesPage.




    }

}
