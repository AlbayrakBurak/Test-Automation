package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class HomePage extends BaseTest {

    @Step("Welcome mesajı alınır")
    public String getWelcomeText(){
        screenshot();
        return webDriver.findElement(By.cssSelector("[class='title']")).getText();
    }
}
