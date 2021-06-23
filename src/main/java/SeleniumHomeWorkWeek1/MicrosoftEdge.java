package SeleniumHomeWorkWeek1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MicrosoftEdge {

    public static void main(String[] args) {

        //Microsoft Edge Driver Path
        System.setProperty("webdriver.edge.driver","C:\\Users\\C D Lad\\Desktop\\Software Testing\\src\\main\\java\\SeleniumHomeWorkWeek1\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("https://www.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.close();
    }
}

