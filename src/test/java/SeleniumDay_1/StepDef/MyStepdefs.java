package SeleniumDay_1.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {

    WebDriver driver;
    @Given("I go to the google home page")
    public void iGoToTheGoogleHomePage() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");


    }

    @And("I enter the Iphone to search Text box")
    public void iEnterTheIphoneToSearchTextBox() {
        
    }

    @When("I click on search button on the google")
    public void iClickOnSearchButtonOnTheGoogle() {
    }
}
