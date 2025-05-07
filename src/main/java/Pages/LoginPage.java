package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {

    public LoginPage fillUsername(String username){
        webDriver.findElement(By.name("username")).sendKeys(username);
        return this;
    }

    public LoginPage fillPassword(String password){
        webDriver.findElement(By.name("password")).sendKeys(password);
        return this;
    }

    public LoginPage clickLogin(){
        webDriver.findElement(By.cssSelector("[value='Log In']")).click();
        return this;
    }

    public String getErrorMessage(){
        String errorText = webDriver.findElement(By.cssSelector("[class='error']")).getText();
        return errorText;
    }

    public LoginPage clickRegister(){
        webDriver.findElement(By.cssSelector("[href*='register.htm']")).click();
        return this;
    }
}
