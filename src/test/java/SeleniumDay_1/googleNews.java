package SeleniumDay_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class googleNews {

    WebDriver driver;
@Before
    public void before(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://news.google.com/topics/CAAqIggKIhxDQkFTRHdvSkwyMHZNRGxqTjNjd0VnSmxiaWdBUAE?hl=en-US&gl=US&ceid=US%3Aen");
    }
    @Test
    public void Test() throws InterruptedException {

    driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/main/c-wiz/div[2]/c-wiz/c-wiz[2]/c-wiz/div/div/article[2]/div[1]/a")).click();


    // This class for how to handle  multiple windows in selenium


        Set<String> ids = driver.getWindowHandles();

        Iterator<String> it = ids.iterator();

        String parentID = it.next();
        String childID = it.next();

        System.out.println(parentID);
        System.out.println(childID);
        driver.switchTo().window(childID);


        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Sports']")).click();
        driver.switchTo().window(parentID);


    }
}
