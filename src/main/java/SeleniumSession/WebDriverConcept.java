package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConcept {
    public static void main(String[]args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        Thread.sleep(2000);

        driver.navigate().to("https://www.argos.co.uk/");
        System.out.println(driver.getTitle());

        Thread.sleep(2000);

        driver.navigate().back();
        System.out.println(driver.getTitle());

        Thread.sleep(2000);

        driver.navigate().forward();
        System.out.println(driver.getTitle());

        Thread.sleep(2000);

        driver.navigate().refresh();

        driver.quit();
    }
}
