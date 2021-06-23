package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.className("ico-login")).click();
        Thread.sleep(2000);

        Util util = new Util(driver);

        By emailId = By.id("Email");
        By pwd = By.id("Password");
        By loginBtn = By.xpath("//button[@class='button-1 login-button']");

        util.getElement(emailId).sendKeys("test@gmail.com");
        util.getElement(pwd).sendKeys("test@123");
        util.doClick(loginBtn);
    }
}
