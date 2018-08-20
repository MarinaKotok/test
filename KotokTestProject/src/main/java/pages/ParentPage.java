package pages;


import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ParentPage {
    Logger logger = Logger.getLogger(getClass());
    WebDriver webDriver;
    String expectedURL;
    final String baseURL = "https://stg.obd-car-doctor.com/en-us/";


    public ParentPage(WebDriver webDriver, String expectedURL) {
        this.webDriver = webDriver;
        this.expectedURL = baseURL + expectedURL;
    }

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
}
