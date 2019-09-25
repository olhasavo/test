import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class weather {


@Test
    public void Kyiv () throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://weather.com/uk-UA/weather/5day/l/874007233ad152f9a0541234e94fc0722a06a81db728ad9e08be04b58fbe18fa");
       Thread.sleep( 10000);
        driver.quit();


    }
}