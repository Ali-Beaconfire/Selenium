package SeleniumDay_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Practise {

    WebDriver driver;
    @Before
    public void beforeClss(){

        WebDriverManager.chromedriver().setup();
        driver.get("https/:www.amazon.com");
        driver.manage().window().maximize();
    }
    @Test
    public void testtt(){


    }

}
