import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

abstract public class BaseSeleniumTest {
protected WebDriver driver;

@Before
public void SetUp () {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();



}

}