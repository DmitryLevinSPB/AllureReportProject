import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class FirstClass {


@Test
public void first(){
    ChromeDriverManager.chromedriver().setup();
    driver = new
    driver.("https://market-delivery.yandex.ru/moscow?shippingType=delivery");


}

}