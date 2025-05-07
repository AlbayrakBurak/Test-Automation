import Base.BaseTest;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test(description = "Başarılı kullanıcı girişi")
    public void LoginSuccessful() {

        loginPage.fillUsername("testUser")
                .fillPassword("test")
                .clickLogin();

        System.out.println("Test Deneme");
        String url = webDriver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals(url, "https://parabank.parasoft.com/parabank/overview.htm");

    }

    @Test(description = "Başarısız kullanıcı girişi ")
    public void LoginUnSuccessful() {

        webDriver.findElement(By.name("username")).sendKeys("user");
        webDriver.findElement(By.name("password")).sendKeys("user123");
        webDriver.findElement(By.cssSelector("[value='Log In']")).click();
        String errorText = webDriver.findElement(By.cssSelector("[class='error']")).getText();
        Assert.assertEquals(errorText, "The username and password could not be verified.");


    }
}
