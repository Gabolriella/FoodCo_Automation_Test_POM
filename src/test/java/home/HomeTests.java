package home;

import org.testng.annotations.Test;
import pageObject.*;
import setup.SetupTests;

//This class extends to the SetupTests as the SetupTests class contains all the setup requirements to run our test
public class HomeTests extends SetupTests {
    //TestNG annotation
    @Test
    public void testFoodCoApp () {

        homePage.verifySelectADeliveryArea();
        homePage.clickLagos();
        homePage.verifyWelcomeToFoodCo();
        homePage.clickMyAccountButton();
        LoginPage loginPage = homePage.clickMyAccountButton();
        loginPage.enterUsername("too_great1@yahoo.com");
        loginPage.enterUserPassword("foodcoclient##.");
        DashboardPage dashboardPage = loginPage.clickLoginButton();
        HouseholdPage householdPage = dashboardPage.clickHousehold();
        //householdPage.clickBathAndBed();
        BathandbedPage bathandbedPage = householdPage.clickBathAndBed();
        bathandbedPage.verifyPotpourriFlower();
        bathandbedPage.verifyLifestyleEmmaBarclayHandTowelCobalt();
        bathandbedPage.verifyLifestyleEmmaBarclayFaceClothWalnut();
        bathandbedPage.clickLogoutMenu();
        LogoutPage logoutPage = bathandbedPage.clickLogoutMenu();
        logoutPage.clickConfirmLogout();

    }
}
