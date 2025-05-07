package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;

public class RegisterPage extends BaseTest {

    public RegisterPage fillFirstName(String text){
        webDriver.findElement(By.id("customer.firstName")).sendKeys(text);
        return this;
    }

    public RegisterPage fillLastName(String text){
        webDriver.findElement(By.id("customer.lastName")).sendKeys(text);
        return this;
    }

    public RegisterPage fillAddress(String text){
        webDriver.findElement(By.id("customer.address.street")).sendKeys(text);
        return this;
    }

    public RegisterPage fillAddressCity(String text){
        webDriver.findElement(By.id("customer.address.city")).sendKeys(text);
        return this;
    }

    public RegisterPage fillAddressState(String text){
        webDriver.findElement(By.id("customer.address.state")).sendKeys(text);
        return this;
    }

    public RegisterPage fillZipCode(String text){
        webDriver.findElement(By.id("customer.address.zipCode")).sendKeys(text);
        return this;
    }

    public RegisterPage fillPhoneNumber(String text){
        webDriver.findElement(By.id("customer.phoneNumber")).sendKeys(text);
        return this;
    }

    public RegisterPage fillSSN(String text){
        webDriver.findElement(By.id("customer.ssn")).sendKeys(text);
        return this;
    }

    public RegisterPage fillUsername(String text){
        webDriver.findElement(By.id("customer.username")).sendKeys(text);
        return this;
    }

    public RegisterPage fillPassword(String text){
        webDriver.findElement(By.id("customer.password")).sendKeys(text);
        return this;
    }

    public RegisterPage fillRepeatedPassword(String text){
        webDriver.findElement(By.id("repeatedPassword")).sendKeys(text);
        return this;
    }

    public RegisterPage clickRegister(){
        webDriver.findElement(By.cssSelector("[value='Register']")).click();
        return this;
    }

}
