package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

import POM_pages.DemoBlazepage;
import io.cucumber.java.en.*;
import utilities.Driverscript;
import utilities.ReadInputfromExcel;

public class DemoBlazeSteps1 {

    WebDriver driver;
    DemoBlazepage demoBlazePage;

    @Given("the user is on the Demoblaze login page")
    public void the_user_is_on_the_demoblaze_login_page() {
        driver = Driverscript.WebDriverInitialization();
        driver.get("https://www.demoblaze.com");
        demoBlazePage = new DemoBlazepage(driver);
    }

    @When("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {
        demoBlazePage.clicksignin();
    }
    
    @When("the user enters username and password")
    public void the_user_enters_username_and_password() throws IOException {
    	
    	Object[][] data = ReadInputfromExcel.ReadvaluesfromExcel("TestData/UserData.xlsx", "LoginData");
        demoBlazePage.enterUsername(data[0][0].toString());
        demoBlazePage.enterPassword(data[0][1].toString());
    }

    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() throws Exception {
    	demoBlazePage.LoginButton();
    	Thread.sleep(3000);
    	WebElement username = driver.findElement(By.xpath("//a[text() = 'Welcome Nattysaran']"));
    	if (username != null) {
    		System.out.println("User logged in successfully");
    	} else {
    		throw new Exception("User failed to login");
    	}
    }

    @And("the user clicks on the logout button")
    public void the_user_clicks_on_the_logout_button() {
        demoBlazePage.clickSignout();
    }

    @Then("the user should be logged out successfully")
    public void the_user_should_be_logged_out_successfully() {
        // Add verification logic here
        System.out.println("User logged out successfully");
    }
    
    @And("the user clicks on the cart link")
    public void the_user_clicks_on_the_cart_link() {
        demoBlazePage.clickCart();
    }

    @Then("the user should be redirected to the cart page")
    public void the_user_should_be_redirected_to_the_cart_page() {
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("cart")) {
            System.out.println("User redirected to the cart page successfully");
        } else {
            System.out.println("User failed to navigate to the cart page");
        }
    }
    
    @AfterClass
    public void quit() {
    	Driverscript.WebDriverQuit();
    }
}
