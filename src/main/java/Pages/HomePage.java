package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;

public class HomePage extends BaseTest {

    public String getWelcomeText(){
        return webDriver.findElement(By.cssSelector("[class='title']")).getText();
    }
}
