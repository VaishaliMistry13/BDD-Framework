package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement searchbtn = driver.findElement(By.xpath(""));
        Thread.sleep(2000);
        highlight(searchbtn,driver);
    }
    public static void border(WebElement element, WebDriver driver){
    }
    public static void highlight(WebElement element,WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        String backcolor = element.getCssValue("backgroundColor");
        for (int i = 0; i<20; i++){
            changeColor("rgb(255,64,52)", element,driver);
            changeColor(backcolor,element,driver);
        }
    }
    public static void changeColor(String color, WebElement element, WebDriver driver){
    }
}

