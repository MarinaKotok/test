package pages;


import libs.ActionWithElements;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ParentPage {
    Logger logger = Logger.getLogger(getClass());
    WebDriver webDriver;
    String expectedURL;
    final String baseURL = "https://obd-car-doctor.com/en-us/";
    ActionWithElements actionWithElements;


    public ParentPage(WebDriver webDriver, String expectedURL) {
        this.webDriver = webDriver;
        this.expectedURL = baseURL + expectedURL;
        PageFactory.initElements(webDriver, this);
        actionWithElements = new ActionWithElements(webDriver);
    }

//    public ParentPage(WebDriver webDriver) {
//    }

    public String getCurrentUrl() {
        return webDriver.getCurrentUrl();
    }

    public void checkCurrentURL() {
        try {
            Assert.assertEquals("URLS is not expected", expectedURL, getCurrentUrl());

        } catch (Exception e){
            logger.error("Cannot work with URL");
            Assert.fail("Cannot work with URL");
        }

    }

    public void openPage() {
        try {
            webDriver.get(baseURL);
            logger.info("Page is opened");
        }catch (Exception e) {
            logger.error("Can't open a page");
            Assert.fail("Can't open a page");
        }
    }
}
