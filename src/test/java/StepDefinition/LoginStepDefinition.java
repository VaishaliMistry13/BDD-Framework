package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinition {

    WebDriver driver;

    @Given("^User is on login page$")
    public void User_is_on_login_page(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        driver.manage().window().maximize();
    }

    @When("^Title of login page$")
    public void title_of_login_page(){
       String title = driver.getTitle();
       System.out.println(title);
       Assert.assertEquals("nopCommerce demo store. Login", title);
    }

    @Then("^User enters username and password$")
    public void user_enters_username_and_password(){
       driver.findElement(By.id("Email")).sendKeys("vaishalimistry@gmail.com");
       driver.findElement(By.id("Password")).sendKeys("test123");
    }

    @Then("^User click on login button$")
    public void user_click_on_login_button(){
        driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]")).click();
    }

    @Then("^User is on homepage$")
    public void user_is_on_homepage(){
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("nopCommerce demo store.", title);
    }

    @Then("^Close the browser$")
    public void close_the_browser(){
        driver.quit();
    }
}
