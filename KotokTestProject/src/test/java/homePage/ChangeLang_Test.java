package homePage;

import org.junit.Test;
import parentTest.ParentTest;

public class ChangeLang_Test extends ParentTest {


    @Test
    public void changeLanguage_TC() {
        homePage.openPage();
        homePage.clickOnLanguageSelector();
        homePage.clickOnRUSelector();

        checkAcceptanceCriteria("Language is not changed", homePage.checkSelector(), true );

    }

}
