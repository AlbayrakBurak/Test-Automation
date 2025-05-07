package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {

    @Step("Username alanı doldurulur")
    public LoginPage fillUsername(String username){
        webDriver.findElement(By.name("username")).sendKeys(username);
        return this;
    }

    @Step("Password alanı doldurulur")
    public LoginPage fillPassword(String password){
        webDriver.findElement(By.name("password")).sendKeys(password);
        return this;
    }

    @Step("Login butonuna tıklanır")
    public LoginPage clickLogin(){
        webDriver.findElement(By.cssSelector("[value='Log In']")).click();
        return this;
    }

    @Step("Hata mesajı alınır")
    public String getErrorMessage(){
        String errorText = webDriver.findElement(By.cssSelector("[class='error']")).getText();
        screenshot();
        return errorText;
    }

    @Step("Register butonuna tıklanır")
    public LoginPage clickRegister(){
        webDriver.findElement(By.cssSelector("[href*='register.htm']")).click();
        return this;
    }
}
