package SeleniumHomeWorkWeek3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Util {

    // Utility class for reusable methods

    //Constructor
    WebDriver driver;

    public Util(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getElement(By locator){
        WebElement element = driver.findElement(locator);
        return element;
    }

    public void doClick(By locator){
        getElement(locator).click();
    }
}
