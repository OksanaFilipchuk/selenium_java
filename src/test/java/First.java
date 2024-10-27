import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class First {
    protected SoftAssert softAssert;

    @Test()
    public static void main(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.greencity.cx.ua/#/greenCity");
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(driver.getTitle(),"Новий спосіб виховати в собі корисні звички");
        driver.close();
        driver.quit();

    }

}
