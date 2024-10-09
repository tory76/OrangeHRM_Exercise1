package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adminPage {

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")
    public WebElement adminopt;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span")
    public WebElement usermang;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li")
    public WebElement useropt;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
    public WebElement adduser;


    @FindBy(xpath =" //*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")
    public WebElement userRole;



    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")
    public WebElement employeeName;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div")
    public WebElement status;

   @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
   public WebElement password;

   @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
   public WebElement userName;

   @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
   public WebElement confirmPass;

   @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
   public WebElement saveBtn;

   @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[1]")
   public WebElement cancelBtn;

   @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")
   public WebElement jobOptn;

   @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")
   public WebElement jobTitle;

   @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")
   public WebElement addjob;

    @FindBy(xpath ="//span[text()='Performance']")
    public WebElement performance;




    public adminPage(WebDriver driver) {

        PageFactory.initElements(driver,this);
    }

    public void click_admin_option() throws InterruptedException {

        adminopt.click();
        Thread.sleep(2000);
    }



    public void click_job() throws InterruptedException {

        jobOptn.click();
        Thread.sleep(2000);
    }

    public void click_job_title() throws InterruptedException {

        jobTitle.click();
        Thread.sleep(2000);
    }

    public void click_add_job_btn() throws InterruptedException {

        addjob.click();
        Thread.sleep(2000);

    }

    public void click_performance() throws InterruptedException {
        performance.click();
        Thread.sleep(2000);
    }


}
