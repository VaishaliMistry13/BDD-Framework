package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterStepDefinition {

    WebDriver driver;

    @Given("^User is on register page$")
    public void User_is_on_register_page(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();
    }

    @When("^Title of register page$")
    public void title_of_register_page() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("nopCommerce demo store. Register", title);
    }

    @Then("^User enters register Details$")
    public void user_enters_register_Details(){
        driver.findElement(By.xpath("//input[@id=\"gender-female\"]")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Vaishali");
        driver.findElement(By.id("LastName")).sendKeys("Mistry");
        driver.findElement(By.id("DateOfBirthDay")).sendKeys("15");
        driver.findElement(By.id("DateOfBirthMonth")).sendKeys("04");
        driver.findElement(By.id("DateOfBirthYear")).sendKeys("1985");
        driver.findElement(By.id("Email")).sendKeys("vaishalimistry@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("Family Tester");
        driver.findElement(By.xpath("//input[@id=\"Newsletter\"]")).click();
        driver.findElement(By.id("Password")).sendKeys("test123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("test123");
    }

    @Then("^User click on register button$")
    public void user_click_on_register_button() {
        driver.findElement(By.xpath("//button[@id=\"register-button\"]")).click();
    }

    @Then("^User is on register result page$")
    public void user_is_on_register_result_page() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("nopCommerce register result.", title);
    }

    @Then("^Close the webbrowser$")
    public void close_the_webbrowser(){
        driver.quit();
    }
}
