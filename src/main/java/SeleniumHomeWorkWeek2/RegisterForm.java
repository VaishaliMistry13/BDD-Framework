package SeleniumHomeWorkWeek2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterForm {

    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.className("ico-register")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("gender-female")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("FirstName")).sendKeys("Vaishali");
        Thread.sleep(1000);

        driver.findElement(By.id("LastName")).sendKeys("Mistry");
        Thread.sleep(1000);

        driver.findElement(By.name("DateOfBirthDay")).sendKeys("15");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("June");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1980");
        Thread.sleep(1000);

        driver.findElement(By.id("Email")).sendKeys("vaishmistry@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.id("Company")).sendKeys("Unify Testing");
        Thread.sleep(1000);

        driver.findElement(By.id("Newsletter")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("Password")).sendKeys("test123");
        Thread.sleep(1000);

        driver.findElement(By.id("ConfirmPassword")).sendKeys("test123");
        Thread.sleep(1000);

        driver.findElement(By.id("register-button")).click();
        Thread.sleep(500);
    }
}
