package Utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {


    private static WebDriver driver;

    @Before
    public static WebDriver getDriver()throws Exception {

        if (null == driver) {
            driver = WebDriverManager.chromedriver().create();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            Thread.sleep(1000);
        }

        return driver;
    }

//    @After
//    public void tearDown() throws Exception
//    {
//        Thread.sleep(2000);
//        driver.quit();
//    }
}
