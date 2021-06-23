package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

    public static  void main(String[] args) {

        //Chromedriver - it's path.
        System.setProperty("webdriver.chrome.driver","C:\\Users\\C D Lad\\Desktop\\Software Testing\\src\\main\\java\\SeleniumSession\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.nopcommerce.com/");
        driver.manage().window().maximize();

       String url = driver.getCurrentUrl();
       System.out.println(url);

       String title = driver.getTitle();
       System.out.println(title);

       //verify = expected vs actual results = Validation point

        if (title.equals("Free and open-source eCommerce platform.")) {
            System.out.println("The title is correct");
        }
        else {
            System.out.println("The title is incorrect");
        }

        driver.close(); //closes the whole browser.
        driver.quit(); //Terminates the session ID
    }

}
