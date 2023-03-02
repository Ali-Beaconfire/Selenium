package SeleniumDay_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SeleniumDay2 {

     WebDriver driver;
     @Before
     public void Before(){

          WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver();
          driver.get("http://demo.automationtesting.in/Index.html");
          driver.manage().window().maximize();
     }
     @Test
     public void test1() throws InterruptedException {

          driver.findElement(By.id("email")).sendKeys("yusanAli@gmail.com");
          driver.findElement(By.id("enterimg")).click();
          System.out.println(driver.getTitle());
          driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Yusan");
          driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Ali");
          Thread.sleep(2000);
          driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("26319 w grey st ,Houston Texas,77433");
          driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("Testing@gmail.com");
          driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("123-456-7899");
          driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
          driver.findElement(By.id("checkbox2")).click();
          driver.findElement(By.cssSelector("input[placeholder='Last Name']")).click();


          // This class for how to handle static dropdown in selenium
          //Select

           Select skills = new Select(driver.findElement(By.id("Skills")));
           Thread.sleep(5000);
           //skills.selectByIndex(2);
           skills.selectByValue("Documentation");

           Select country = new Select(driver.findElement(By.id("country")));

           country.selectByValue("Australia");



     }


     }


