import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ttttt {


    @Test
    public void yyy() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59");
        Thread.sleep(10000);
        driver.quit();
    }
}
