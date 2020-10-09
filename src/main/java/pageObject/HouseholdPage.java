package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HouseholdPage {
    //Create a WebDriver Object for this class
    private WebDriver driver;

    //Create a constructor
    public HouseholdPage(WebDriver driver) {
        this.driver = driver;
    }

    //Using By to locate Household elements
    private By bathAndBed = By.xpath("//*[@id=\"content\"]/div[3]/ul/li[1]/a/span/span[2]/span/h3");

    //Function to instantiate with the element
    public BathandbedPage clickBathAndBed() {
        //find the bath and bed element and verify
        driver.findElement(bathAndBed).click();
        return new BathandbedPage(driver);
    }
}




