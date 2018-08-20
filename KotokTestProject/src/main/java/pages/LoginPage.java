package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends ParentPage {

    public void checkLoginUrl() {
        checkCurrentURL();
    }

    public LoginPage(WebDriver webDriver) {
        super(webDriver, "/members/logon/");
    }

    public void openPage() {
        try {
            webDriver.get(baseURL + "/members/logon/");
            logger.info("Login Page is opened");
        } catch (Exception e) {
            logger.error("Login Page is not opened");
            Assert.fail("Login Page is not opened");
        }
    }

    public void enterLogin(String login) {
        try {
            WebElement webElement = webDriver.findElement(By.xpath(".//input[@id='Email']"));
            webElement.clear();
            webElement.sendKeys(login);
            logger.info(login + " is entered to the Email field");
        } catch (Exception e) {
            logger.error("Can't enter Login");
            Assert.fail("Can't enter Login");
        }
    }

    public void enterPass(String password) {
        try {
            WebElement webElement = webDriver.findElement(By.xpath(".//input[@id='Password']"));
            webElement.clear();
            webElement.sendKeys(password);
            logger.info(password + " is entered to the Password field");
        } catch (Exception e) {
            logger.error("Can't enter Password");
            Assert.fail("Can't enter Password");
        }
    }

    public void clickOnLoginButton() {
        try {
            WebElement webElement = webDriver.findElement(By.xpath(".//button[@class='btn btn-block main-color']"));
            webElement.click();
            logger.info("Login button is clicked");
        } catch (Exception e) {
            logger.error("Can't click on Login Button");
            Assert.fail("Can't click on Login Button");
        }
    }

}
