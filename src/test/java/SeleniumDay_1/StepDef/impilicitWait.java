package SeleniumDay_1.StepDef;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class impilicitWait {
    WebDriver driver;
    WebDriverWait wait;


    //Implicit and explicit wait
    @Before
    public void tesbeforetest() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get( "http://practice.automationtesting.in/");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void test1() {

        //login
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

        //initiating explicit wait object
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        //waiting for the element to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("welcome")));

        //after visibility is true, then store the element text for verification
        String actualWelcomeText = driver.findElement(By.id("welcome")).getText();
        String expected = "Welcome Paul";




        if(actualWelcomeText.equalsIgnoreCase(expected)) {
            System.out.println("PASSED");
        }else {
            System.out.println("GO LEARN JAVA");
        }





    }
}
