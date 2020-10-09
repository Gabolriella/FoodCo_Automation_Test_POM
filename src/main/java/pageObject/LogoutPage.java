package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
    //In the page class we need the fields that represents the elements on the page and Methods to interact with the element
    private WebDriver driver;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    //Using By as a locator for elements
    private By confirmLogout = By.xpath("//*[@id=\"content\"]/article/div/div/div[1]/a");

    //Function to instantiate with the element
    public LoginPage clickConfirmLogout() {
        //find the potpourriFlower element and verify
        driver.findElement(confirmLogout).click();
        return new LoginPage(driver);
    }
}
