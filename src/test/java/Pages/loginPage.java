package Pages;

import net.bytebuddy.implementation.bind.annotation.Super;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public WebElement loginbtn;


    public loginPage(WebDriver driver) throws Exception {
        PageFactory.initElements(driver,this);
    }

    public void set_username() throws InterruptedException {

        username.sendKeys("Admin");
        Thread.sleep(2000);
    }

    public void set_password() throws InterruptedException {
        password.sendKeys("admin123");
        Thread.sleep(2000);
    }

    public void click_login_button() throws InterruptedException {

        loginbtn.click();
        Thread.sleep(2000);
    }
}
