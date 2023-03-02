package SeleniumDay_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OpenTheBrowser {

WebDriver driver;
@Before
public void setup(){

    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://www.amazon.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
@Test
public void Test(){

driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone",Keys.ENTER);

}

}
