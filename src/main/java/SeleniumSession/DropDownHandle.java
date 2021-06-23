package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.className("ico-register")).click();
        Thread.sleep(2000);

        //driver.findElement(By.name("DateOfBirthDay")).sendKeys("13");
        //driver.findElement(By.name("DateOfBirthMonth")).sendKeys("04");
        //driver.findElement(By.name("DateOfBirthYear")).sendKeys("1986");

        WebElement day =driver.findElement(By.name("DateOfBirthDay"));
        WebElement month =driver.findElement(By.name("DateOfBirthDay"));
        WebElement year =driver.findElement(By.name("DateOfBirthDay"));

        Select select = new Select(day);
        select.selectByVisibleText("13");
        select.selectByIndex(13);

        Select select1 = new Select(month);
        select1.selectByVisibleText("April");

        Select select2 = new Select(day);
        select2.selectByVisibleText("1986");

        selectValueFromDropDown(day, "30");
        selectValueFromDropDown(month, "april");
        selectValueFromDropDown(year, "1990");
    }

    public static void selectValueFromDropDown(WebElement element, String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
}
