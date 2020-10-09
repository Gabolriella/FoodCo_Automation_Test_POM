package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BathandbedPage {

    //Create a WebDriver Object for this class
    private WebDriver driver;

    //Create a constructor
    public BathandbedPage(WebDriver driver) { this.driver = driver;
    }

    //Using By to locate Household elements
    private By potpourriFlower = By.xpath("//*[@id=\"content\"]/div[3]/ul/li[26]/div/div[2]/a/h3");
    private By lifestyleEmmaBarclayHandTowelCobalt = By.xpath("//*[@id=\"content\"]/div[3]/ul/li[16]/div/div[2]/a/h3");
    private By lifestyleEmmaBarclayFaceClothWalnut = By.xpath("//*[@id=\"content\"]/div[3]/ul/li[15]/div/div[2]/a/h3");
    private By logoutButton = By.xpath("//*[@id=\"nav-menu-item-6558\"]/a");

        //Function to instantiate with the element
        public void verifyPotpourriFlower() {
            //find the potpourriFlower element and verify
            driver.findElement(potpourriFlower).isDisplayed();
        }
        public void verifyLifestyleEmmaBarclayHandTowelCobalt(){
        //find the lifestyleEmmaBarclayHandTowelCobalt element and verify
        driver.findElement(lifestyleEmmaBarclayHandTowelCobalt).isDisplayed();
        }
        public HouseholdPage verifyLifestyleEmmaBarclayFaceClothWalnut() {
            //find the lifestyleEmmaBarclayFaceClothWalnut element and verify
            driver.findElement(lifestyleEmmaBarclayFaceClothWalnut).isDisplayed();
            return new HouseholdPage(driver);
        }

        public LogoutPage clickLogoutMenu() {
            //find the logout element and click on the log
            driver.findElement(logoutButton).click();
            return new LogoutPage (driver);
        }
    }

