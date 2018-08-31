package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ActionWithElements {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    WebDriverWait webDriverWait20;

    public ActionWithElements(WebDriver webDriver) {

        this.webDriver = webDriver;
        webDriverWait20 = new WebDriverWait(webDriver, 20);
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
            webElement.click();
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

    public boolean isElementInList(String carLocator) {
        try {
            List<WebElement> webElementList =  webDriver.findElements(By.xpath(carLocator));
            if (webElementList.size() > 0) {
                return true;
            }else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public void selectValueInDDL(WebElement ddlElement, String value) {
        try {
            Select select = new Select(ddlElement);
//            webDriverWait20.until(ExpectedConditions.elementToBeClickable(ddlElement));
            select.selectByValue(value);
            logger.info(value + " was selected from DDL");
        } catch (Exception e) {
            logger.error("Can't select " + value + " from DDL");
            printErrorAndStopTest(e);
        }

    }

    public void submit() {

    }
}
