package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    public class LoginPage {
    //In the page class we need the fields that represents the elements on the page and Methods to interact with the element
    private WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //Using By as a locator for elements
    private By username = By.xpath("//*[@id=\"username\"]");

    private By loginButton = By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[4]/button");

    //Function to instantiate with the element
    public void enterUsername(String uName){
        //Find the username element and enter the username
        driver.findElement(username).sendKeys(uName);
    }
        private By password = By.xpath("//*[@id=\"password\"]");
    public void enterUserPassword(String pwd){
        //Find the password element and enter the password
        driver.findElement(password).sendKeys(pwd);
    }
    public DashboardPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new DashboardPage(driver);
    }
}

