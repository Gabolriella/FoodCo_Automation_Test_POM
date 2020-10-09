package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class HomePage {
    //In the page class we need the fields that represents the elements on the page and Methods to interact with the element
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Using By as a locator for elements
    private By selectADeliveryArea = By.xpath("/html/body/div[6]/div[2]/h3");
    private By lagos = By.xpath("/html/body/div[6]/div[2]/div[1]/form/label[2]");
    private By welcomeToFoodCo = By.xpath("/html/body/div[2]/div[1]/header/div[1]/div/div[3]/div");
    private By myAccountButton = By.xpath("//*[@id=\"nav-menu-item-20267\"]/a");

        //Function to instantiate with the element
        public void verifySelectADeliveryArea(){
            //find selectADeliveryArea element and verify
            driver.findElement(selectADeliveryArea).isDisplayed();
        }

        public void clickLagos() {
            //find lagos element
        driver.findElement(lagos).click();
    }

        public void verifyWelcomeToFoodCo() {
            //find WelcomeToFoodCo element and verify
        driver.findElement(welcomeToFoodCo).isDisplayed();
    }

        public LoginPage clickMyAccountButton(){
            //find myAccountButton element
        driver.findElement(myAccountButton).click();
        return new LoginPage(driver);

    }
}



