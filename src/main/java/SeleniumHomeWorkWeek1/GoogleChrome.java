package SeleniumHomeWorkWeek1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleChrome {

    public static void main(String[] args) {

        //Google Chrome Driver Path
        System.setProperty("webdriver.chrome.driver","C:\\Users\\C D Lad\\Desktop\\Software Testing\\src\\main\\java\\SeleniumHomeWorkWeek1\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.close();
    }
}
