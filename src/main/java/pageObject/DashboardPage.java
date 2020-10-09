package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    //Create a WebDriver Object for this class
    private WebDriver driver;

    //Create a constructor
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    //Using By as a locator for elements

        //Function to instantiate with the element
        public HouseholdPage clickHousehold() {
        //find the houseHold element
        driver.findElement(By.xpath("//*[@id=\"nav-menu-item-3339\"]/a")).click();
        return new HouseholdPage(driver);
    }
}
