package Base;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.util.Random;

public class BaseLibrary extends Data{

    public static WebDriver webDriver ;

    public String getCurrentUrl(){
        return webDriver.getCurrentUrl();
    }

    public void assertEqualsText(String actual, String expected){
        Assert.assertEquals(actual,expected);
    }

    public int randomNumber(int length){
        Random random = new Random();
        return random.nextInt(length);
    }
}
