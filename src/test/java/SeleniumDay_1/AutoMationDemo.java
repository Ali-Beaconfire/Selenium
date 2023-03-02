package SeleniumDay_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AutoMationDemo {

    WebDriver driver;
    @Before
    public void Before(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://practice.automationtesting.in/");
        driver.manage().window().maximize();
    }
    @Test
    public void test() throws InterruptedException {

        driver.findElement(By.xpath("//a[text()='My Account']")).click();


        Set<String> ids = driver.getWindowHandles();

        Iterator<String> it = ids.iterator();

        String parentID = it.next();
        String childID = it.next();

        driver.switchTo().window(childID);

        Thread.sleep(5500);
        driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]")).click();




            }

}
