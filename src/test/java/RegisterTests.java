import Base.BaseTest;
import org.testng.annotations.Test;

public class RegisterTests extends BaseTest {

    @Test(description = "Kayıt işlemi")
    public void RegisterSuccessful() {

        String firstName = "testFirstName";
        String lastName = "testLastName";
        String tempText = "test";
        String phoneNumber = "5555555555";
        String userName = "test" + randomNumber(1000000);
        String userPassword = "test";

        loginPage.clickRegister();
        registerPage.fillFirstName(firstName)
                .fillLastName(lastName)
                .fillAddress(tempText)
                .fillAddressCity(tempText)
                .fillAddressState(tempText)
                .fillZipCode(tempText)
                .fillPhoneNumber(phoneNumber)
                .fillSSN(tempText)
                .fillUsername(userName)
                .fillPassword(userPassword)
                .fillRepeatedPassword(userPassword)
                .clickRegister();
        String welcomeText = homePage.getWelcomeText();
        assertEqualsText(welcomeText, "Welcome " + userName);
    }

}
