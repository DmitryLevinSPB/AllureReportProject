import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class FirstClass {
String SiteUrl = "https://www.ozon.ru/";
WebDriver driver;
@Test
    public void firstTest() {
WebDriverManager.chromedriver().setup();

}

@Test
    public void secondTest() {


}
}
