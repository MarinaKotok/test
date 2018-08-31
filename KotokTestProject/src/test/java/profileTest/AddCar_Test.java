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
//        carsPage.deleteAllCarsWithCurrentName(".//div[@class='car-item-container']//div[@class='car-item-info-grpup'][.//*[text()='Toyota'] and .//*[text()='RAV 4']and .//*[text()='2010']]");
        carsPage.clickOnAddButton();
        addCarPage.checkCurrentURL();
        addCarPage.clickOnBrandDDL();
        addCarPage.enterBrandName("Toyota");
//        addCarPage.selectCarBrand("Toyota");
        addCarPage.clickOnModelDDL();
        addCarPage.enterModelName("RAV 4");
//        addCarPage.selectCarModel("RAV 4");
        addCarPage.clickOnYearDDL();
        addCarPage.enterYear("2010");
//        addCarPage.selectCarYear("2010");
        addCarPage.clickOnEngineDDL();
        addCarPage.enterEngine("2.2 D-CAT (150 Hp)");
//        addCarPage.selectCarEngine("2.2 D-CAT (150 Hp)");
        addCarPage.clickButtonSave();
        carsPage.checkCurrentURL();

//        checkAcceptanceCriteria("Car was not added",
//                carsPage.isNewCarAdded(carBrand, carModel, carYear, carEngine),
//                true);
    }

//    @After
//    public void deleteNewCar() {
//        carsPage.deleteAllCarsWithCurrentName(carBrand, carModel, carYear, carEngine);
//    }

}
