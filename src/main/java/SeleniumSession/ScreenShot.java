package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

public class ScreenShot {
static WebDriver driver;
    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath(""));
        Thread.sleep(2000);
        takeScreenshot("Demo_nopcommerce");
        driver.close();
    }
    public static void takeScreenshot (String filename) throws IOException {

        //1.take screenshot and store it as  a file format:
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //2. now copy screenshot to desired location using copyfile method:
        FileUtils.copyFile(file,new File("C:\\Users\\C D Lad\\Desktop\\Software Testing\\src\\main\\java\\Screenshot"+filename+".jpg"));
    }

    }
