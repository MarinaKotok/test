package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage {
    ProfilePage profilePage;

    @FindBy(xpath = ".//input[@id='Email']")
    private WebElement loginField;

    @FindBy(xpath = ".//input[@id='Password']")
    private WebElement passField;

    @FindBy(xpath = ".//button[@class='btn btn-block main-color']")
    private WebElement loginButton;

    public void checkLoginUrl() {
        checkCurrentURL();
    }

    public LoginPage(WebDriver webDriver) {
        super(webDriver, "/members/logon/");
        profilePage = new ProfilePage(webDriver);
    }

    public void openPage() {
        try {
            webDriver.get(baseURL + "/members/logon/");
            checkCurrentURL();
            logger.info("Login Page is opened");
        } catch (Exception e) {
            logger.error("Login Page is not opened");
            Assert.fail("Login Page is not opened");
        }
    }

    public void enterLogin(String login) {
        actionWithElements.enterTextToElement(loginField, login);
    }

    public void enterPass(String password) {

        actionWithElements.enterTextToElement(passField, password);
    }

    public void clickOnLoginButton() {
        actionWithElements.clickOnElement(loginButton);
    }


    /**
     * Method validLogin
     * @param login (valid login only)
     * @param password (valid password only)
     */
    public void userLoggedIn(String login, String password) {
        openPage();
        enterLogin(login);
        enterPass(password);
        clickOnLoginButton();
        profilePage.checkCurrentURL();
        profilePage.checkProfile();

    }
}
