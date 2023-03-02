package SeleniumDay_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
    WebDriver driver;
//https://www.hyrtutorials.com/p/alertsdemo.html
    @Before
   public void before(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
}
 @Test
  public void test() throws InterruptedException {

        driver.findElement(By.id("alertBox")).click();
        String alert1 = driver.switchTo().alert().getText();
        System.out.println(alert1);
        driver.switchTo().alert().accept();

        //Second Alert
     Thread.sleep(3000);
     driver.findElement(By.id("confirmBox")).click();
     String alert2 = driver.switchTo().alert().getText();
     driver.switchTo().alert().dismiss();
     System.out.println(alert2);
     
     //Third
     Thread.sleep(3000);
     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("window.scrollBy(0,250)", "");
     driver.findElement(By.id("promptBox")).click();
     String alert3 = driver.switchTo().alert().getText();
     System.out.println(alert3);
     driver.switchTo().alert().sendKeys("Hello world");
     driver.switchTo().alert().accept();

     String output = driver.findElement(By.id("output")).getText();
     System.out.println(output);




 }

}
