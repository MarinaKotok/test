package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionWithElements {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());

    public ActionWithElements(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void enterTextToElement(WebElement webElement, String text) {
        try {
            webElement.clear();
            webElement.sendKeys(text);
            logger.info(text + " was inputted into the element");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    private void printErrorAndStopTest(Exception e) {
        logger.error("Can't enter text to the element " + e);
        Assert.fail("Can't enter text to the element " + e);
    }

    public void clickOnElement(WebElement webElement) {
        try {
            webElement.clear();
            logger.info("Element was clicked");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public boolean isElementDisplayed (WebElement webElement) {
        try {
            boolean state = webElement.isDisplayed();
            logger.info("Element is displayed " + state);
            return state;
        } catch (Exception e) {
            logger.info("Element is displayed  - false");
            return false;
        }
    }
}
