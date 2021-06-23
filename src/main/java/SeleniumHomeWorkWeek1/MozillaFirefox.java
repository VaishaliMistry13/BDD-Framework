package SeleniumHomeWorkWeek1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MozillaFirefox {

    public static void main(String[] args) {

        //Mozilla Firefox Driver Path
        System.setProperty("webdriver.gecko.driver","C:\\Users\\C D Lad\\Desktop\\Software Testing\\src\\main\\java\\SeleniumHomeWorkWeek1\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.close();
    }
}
