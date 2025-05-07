package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class RegisterPage extends BaseTest {

    @Step("FirstName alanı doldurulur")
    public RegisterPage fillFirstName(String text){
        webDriver.findElement(By.id("customer.firstName")).sendKeys(text);
        return this;
    }

    @Step("LastName alanı doldurulur")
    public RegisterPage fillLastName(String text){
        webDriver.findElement(By.id("customer.lastName")).sendKeys(text);
        return this;
    }

    @Step("Address alanı doldurulur")
    public RegisterPage fillAddress(String text){
        webDriver.findElement(By.id("customer.address.street")).sendKeys(text);
        return this;
    }

    @Step("AddressCity alanı doldurulur")
    public RegisterPage fillAddressCity(String text){
        webDriver.findElement(By.id("customer.address.city")).sendKeys(text);
        return this;
    }

    @Step("AddressState alanı doldurulur")
    public RegisterPage fillAddressState(String text){
        webDriver.findElement(By.id("customer.address.state")).sendKeys(text);
        return this;
    }

    @Step("ZipCode alanı doldurulur")
    public RegisterPage fillZipCode(String text){
        webDriver.findElement(By.id("customer.address.zipCode")).sendKeys(text);
        return this;
    }

    @Step("PhoneNumber alanı doldurulur")
    public RegisterPage fillPhoneNumber(String text){
        webDriver.findElement(By.id("customer.phoneNumber")).sendKeys(text);
        return this;
    }

    @Step("SSN alanı doldurulur")
    public RegisterPage fillSSN(String text){
        webDriver.findElement(By.id("customer.ssn")).sendKeys(text);
        return this;
    }

    @Step("Username alanı doldurulur")
    public RegisterPage fillUsername(String text){
        webDriver.findElement(By.id("customer.username")).sendKeys(text);
        return this;
    }

    @Step("Password alanı doldurulur")
    public RegisterPage fillPassword(String text){
        webDriver.findElement(By.id("customer.password")).sendKeys(text);
        return this;
    }

    @Step("RepeatedPassword alanı doldurulur")
    public RegisterPage fillRepeatedPassword(String text){
        webDriver.findElement(By.id("repeatedPassword")).sendKeys(text);
        return this;
    }

    @Step("Register butonuna tıklanır")
    public RegisterPage clickRegister(){
        webDriver.findElement(By.cssSelector("[value='Register']")).click();
        screenshot();
        return this;
    }

}
