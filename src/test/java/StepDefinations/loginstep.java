package StepDefinations;

import Pages.loginPage;
import Utility.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class loginstep {

    public WebDriver driver;

    loginPage lp;

    public loginstep()throws Exception{
        this.driver = Hooks.getDriver();

        lp = new loginPage (driver);
    }

    @Given("user open browser with credentials")
    public void user_open_browser() throws InterruptedException{
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(1000);

        lp.set_username();
        Thread.sleep(2000);

        lp.set_password();
        Thread.sleep(2000);

        lp.click_login_button();
        Thread.sleep(2000);
    }
}