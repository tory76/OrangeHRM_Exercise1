package StepDefinations;

import Pages.adminPage;
import Pages.loginPage;
import Utility.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static Utility.Hooks.getDriver;

public class adminSteps {


    public WebDriver driver;

    adminPage ap;

    public adminSteps()throws Exception{
        this.driver = Hooks.getDriver();
        ap = new adminPage(driver);
    }

    @When("user clicks admin option")
    public void userClicksAdminOption() throws InterruptedException {

        ap.click_admin_option();
        Thread.sleep(2000);
    }



    @When("user clicks job")
    public void userClicksJob() throws InterruptedException {
        ap.click_job();
        Thread.sleep(2000);
    }

    @And("user clicks job titles")
    public void userClicksJobTitles() throws InterruptedException {
        ap.click_job_title();
        Thread.sleep(2000);
        
    }

    @And("user clicks add job button")
    public void userClicksAddJobButton() throws InterruptedException {

        ap.click_add_job_btn();
        Thread.sleep(2000);
    }


    @When("user clicks performance")
    public void userClicksPerformance() throws InterruptedException {
        ap.click_performance();
        Thread.sleep(2000);
    }


}
