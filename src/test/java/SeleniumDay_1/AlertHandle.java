package SeleniumDay_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {
    WebDriver driver;
    @Before
    public void Before(){

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //https://www.hyrtutorials.com/p/alertsdemo.html


    }
    @Test
    public void Test() throws InterruptedException {

        //This Class for how to handle alert poup up


        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
        String element = driver.switchTo().alert().getText();
        System.out.println(element);
        Thread.sleep(4000);
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
        String element2 = driver.switchTo().alert().getText();
        System.out.println(element2);
        Thread.sleep(4000);
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();

        String element3 = driver.switchTo().alert().getText();
        System.out.println(element3);
        String name = "Ali";
        Thread.sleep(4000);
        driver.switchTo().alert().sendKeys(name);
        Thread.sleep(4000);
        driver.switchTo().alert().accept();

        String actualResult = driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();

        if(actualResult.contains(name)){

            System.out.println("Test Pass!!!!");
            System.out.println(actualResult);
        }

    }

}
