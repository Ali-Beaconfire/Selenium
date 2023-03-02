package SeleniumDay_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ActionsDragonDrop {
    WebDriver driver;
    @Before
    public void before(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/draggable/");
        driver.manage().window().maximize();
    }
    @Test
    public void Test() throws InterruptedException {

        //This class for how to handle hover over and drag and drop


        Actions action = new Actions(driver);

        WebElement selectItem = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img"));
        action.moveToElement(selectItem).build().perform();

        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[2]/a[1]/span")).click();


        // how to handle drag and drop

        Actions aa = new Actions(driver);

        driver.switchTo().frame(0);

        WebElement drr = driver.findElement(By.id("draggable"));

        WebElement dr1 = driver.findElement(By.id("droppable"));

        aa.dragAndDrop(drr, dr1).build().perform();

    }
}
