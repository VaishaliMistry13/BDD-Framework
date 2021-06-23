package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.id("accept-choices")).click();
        Thread.sleep(2000);

        driver.switchTo().frame("iframeResult");
        driver.findElement(By.id("fname")).clear();
        driver.findElement(By.id("fname")).sendKeys("Tester");
        driver.switchTo().parentFrame();
        Thread.sleep(2000);
        driver.close();
    }
}
