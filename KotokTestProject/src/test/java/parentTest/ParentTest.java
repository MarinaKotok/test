package parentTest;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.io.File; /* что это? */
import java.util.concurrent.TimeUnit;

public class ParentTest {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected ProfilePage profilePage;
    protected CarsPage carsPage;
    protected PreferencesPage preferencesPage;
    protected PostPage postPage;
    protected SmallProfilePage smallProfilePage;



    @Before
    public void setUp() {
        File file = new File("./src/drivers/chromedriver");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath()); /* что это? */
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginPage = new LoginPage(webDriver); /* создается объект */
        homePage = new HomePage(webDriver);
        profilePage = new ProfilePage(webDriver);
        carsPage = new CarsPage(webDriver);
        preferencesPage = new PreferencesPage(webDriver);
        postPage = new PostPage(webDriver);
        profilePage = new ProfilePage(webDriver);
        smallProfilePage = new SmallProfilePage(webDriver);

    }

    @After
    public void tearDown() {
        webDriver.quit();
    }

    protected void checkAcceptanceCriteria(String message, boolean actual, boolean expected) {
        if (actual != expected) {
            logger.error("Acceptance Criteria ia failed: " + message);
            Assert.assertEquals(message, expected, actual);
        }
    }

}
