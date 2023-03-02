package SeleniumDay_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Assertion {

    WebDriver driver;  //Interface
    WebDriverWait wait;  //initilize wait


    //Selenium Assertion


    @Before
    public void tesbeforetest() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get( "https://the-internet.herokuapp.com/checkboxes");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void test() {

        WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));

        checkbox1.isSelected();

        Assert.assertFalse((checkbox1.isSelected()));

        System.out.println("hello");


        WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));



        Assert.assertFalse(checkbox2.isSelected());

        System.out.println("hello2");




    }


    @Test
    public void assertTrueTest() {

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).isDisplayed());
        System.out.println("code didn't throw an exception on assertTrueTest");
        // Assert.assertTrue(true);

    }


    @Test
    public void assertEqualsTest() {
        String actualTitle = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();

        String expectedTitle = "Checkboxes";



        Assert.assertEquals(actualTitle, expectedTitle);




    }
}


