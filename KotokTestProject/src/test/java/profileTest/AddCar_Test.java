package profileTest;

import org.junit.Test;
import parentTest.ParentTest;

public class AddCar_Test extends ParentTest {
    final String carBrand = "Toyota";
    final String carModel = "";
    final String carYear = "";
    final String carEngine = "";

    @Test
    public void AddCar_TC() {
        loginPage.userLoggedIn("m.kotok@pnn.in.ua", "12345678");
        profilePage.clickOnMenuCar();
        carsPage.checkCurrentURL();
        carsPage.deleteAllCarsWithName()






    }

}
