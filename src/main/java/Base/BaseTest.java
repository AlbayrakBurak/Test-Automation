package Base;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BaseLibrary{

    public static HomePage homePage =new HomePage();
    public static RegisterPage registerPage = new RegisterPage();
    public static LoginPage loginPage = new LoginPage();


    @BeforeMethod
    public void openBrowser(){
        webDriver = new ChromeDriver();
        webDriver.get("https://parabank.parasoft.com/parabank/index.htm");
        webDriver.manage().window().maximize();
    }

    @AfterMethod
    public void closeBrowser(){
        webDriver.quit();
    }
}
