package SeleniumHomeWorkWeek3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class MakePurchase {

    public static void main(String[] args) {

        //Path to Chrome Driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Load Demo-NopCommerce Webpage
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Select Computer and Open up Desktop Page
        WebElement computers = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
        WebElement desktop = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a"));

        Actions actions = new Actions(driver);
        actions.moveToElement(computers).click(desktop).build().perform();

        //Scrolling Page Down
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,400)","");

        //Click on Lenovo and Open Up its Webpage
        WebElement lenovo = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a"));
        actions.click(lenovo).build().perform();

        //Adding Lenovo PC to cart
        driver.findElement(By.xpath("//button[@id='add-to-cart-button-3']")).click();

        //Scrolling Page Up
        jse.executeScript("window.scrollBy(0,-200)");
        //This code will take to Shopping Cart
        WebElement shoppingcart = driver.findElement(By.xpath("//span[@class=\"cart-label\"]"));
        actions.click(shoppingcart).build().perform();

        //Adding Qty to 3
        //driver.findElement(By.id("itemquantity11223")).clear();
        //driver.findElement(By.id("itemquantity11223")).sendKeys("3");

        //Scrolling Page Down and Tickbox
        jse.executeScript("window.scrollBy(0,900)");
        driver.findElement(By.xpath("//input[@id=\"termsofservice\"]")).click();

        //Checkout
        driver.findElement(By.xpath("//button[@id=\"checkout\"]")).click();
        driver.findElement(By.xpath("//button[@class=\"button-1 checkout-as-guest-button\"]")).click();

        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Vaishali");
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Mistry");
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("vaishmistry@gmail.com");
        driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys("United Kingdom");
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Leicester");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("150 ChurchHill Road");
        driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("Thurmaston");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("LE4 8DP");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("01162424242");
        driver.findElement(By.xpath("//button[@class=\"button-1 new-address-next-step-button\"]")).click();

    }
}