package profileTest;

import org.junit.After;
import org.junit.Test;
import parentTest.ParentTest;

public class AddCar_Test extends ParentTest {
    final String carBrand = "Toyota";
    final String carModel = "RAV 4";
    final String carYear = "2010";
    final String carEngine = "2.2 D-CAT (150 Hp)";

    @Test
    public void AddCar_TC() {
        loginPage.userLoggedIn("m.kotok@pnn.in.ua", "12345678");
        profilePage.clickOnMenuCar();
        carsPage.checkCurrentURL();
        carsPage.deleteAllCarsWithCurrentName("Toyota", "RAV 4", "2010", "2.2 D-CAT (150 Hp)");
        carsPage.clickOnAddButton();
        addCarPage.checkCurrentURL();
        addCarPage.selectCarBrand("Toyota");
        addCarPage.selectCarModel("RAV 4");
        addCarPage.selectCarYear("2010");
        addCarPage.selectCarEngine("2.2 D-CAT (150 Hp)");
        addCarPage.clickButtonSave();
        carsPage.checkCurrentURL();

        checkAcceptanceCriteria("Car was not added",
                carsPage.isNewCarAdded(carBrand, carModel, carYear, carEngine),
                true);
    }

    @After
    public void deleteNewCar() {
        carsPage.deleteAllCarsWithCurrentName(carBrand, carModel, carYear, carEngine);
    }

}
