package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Util {

    // Utility class - generic methods - reusable methods

    //Create a constructor
    WebDriver driver;

    public Util(WebDriver driver){
        this.driver = driver;
    }

    /*This method is used create the Web Element on the basis of By locator.
     * @param locator
     * @return
     */

    public WebElement getElement(By locator){                // Pass any locator as a parameter
        // nonstatic - no object
        WebElement element = driver.findElement(locator);
        return element;
    }

    /* This method is used to click on a element.
     * @param locator
     */
    public void doClick(By locator){
        getElement(locator).click();
    }

    //write method for sendkeys

    public void sendkeys(By locator){

    }
}
