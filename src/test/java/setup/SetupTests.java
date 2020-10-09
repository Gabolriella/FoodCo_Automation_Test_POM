package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObject.*;

public class SetupTests {

    //Create a WebDriver Object
    private WebDriver driver;
    //Create LoginPage Object
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
    protected HouseholdPage householdPage;
    protected BathandbedPage bathandbedPage;
    protected LogoutPage logoutPage;

    @BeforeTest
    public void setUp()
    {
        //Browser setup for Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOREMI TAIWO OLAMIDE\\Documents\\FOODCO_POM_TEST\\Resources\\chromedriver.exe");
        //Instantiate WebDriver Object
        driver = new ChromeDriver();

        //Maximize window size
        driver.manage().window().maximize();

        //Launch the application
        driver.get("https://foodco.ng/");

        //Instantiate login page after launching the browser - Handle
       homePage = new HomePage(driver);
    }
    @AfterTest
    public void closeBrowser()
    {
        driver.quit();
    }
}



