import Base.BaseTest;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test(description = "Başarılı kullanıcı girişi")
    public void LoginSuccessful() {

        loginPage.fillUsername(username)
                .fillPassword(password)
                .clickLogin();
        assertEqualsText(getCurrentUrl(),overviewUrl);
    }

    @Test(description = "Başarısız kullanıcı girişi ")
    public void LoginUnSuccessful() {

       loginPage.fillUsername(username)
               .fillPassword("aaa")
               .clickLogin();
        String errorText = loginPage.getErrorMessage();
        assertEqualsText(errorText, errorMessage);
    }

    @Test(description = "Zorunlu karakter kontrolü")
    public void LoginRequiredController(){

        loginPage.fillUsername(username)
                .clickLogin();
        String errorText = loginPage.getErrorMessage();
        assertEqualsText(errorText,errorRequiredMessage);
    }
}
