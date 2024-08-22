package POM_pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoBlazepage {

	WebDriver driver;
	
	//Constructor
	public DemoBlazepage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Locate the elements
	By Usernamefield = By.id("loginusername");
	By Passwordfield = By.id("loginpassword");
	By loginButton = By.xpath("//button[text() = 'Log in']");
	By loginField = By.id("login2");
	By Signoutfield = By.xpath("//a[text() = 'Log out']");
	By Cartfield = By.id("cartur");
	By CategoriesField = By.id("cat");
	By phonesLink = By.linkText("Phones");
    By samsungPhoneLink = By.linkText("Samsung galaxy s6");
	
	// Method to enter username
    public void enterUsername(String username) {
        WebElement usernameElement = driver.findElement(Usernamefield);
        usernameElement.sendKeys(username);
    }

    // Method to enter password
    public void enterPassword(String password) {
        WebElement passwordElement = driver.findElement(Passwordfield);
        passwordElement.sendKeys(password);
    }

    // Method to click on signin button
    public void clicksignin() {
        WebElement loginButtonElement = driver.findElement(loginField);
        loginButtonElement.click();
    }
    
 // Method to click on the login button
    public void LoginButton() {
        WebElement signinElement = driver.findElement(loginButton);
        signinElement.click();
    }

    // Method to click on the Signout button
    public void clickSignout() {
        WebElement signoutElement = driver.findElement(Signoutfield);
        signoutElement.click();
    }

    // Method to click on the Cart link
    public void clickCart() {
        WebElement cartElement = driver.findElement(Cartfield);
        cartElement.click();
    }

    // Method to click on the Categories link
    public void clickCategories() {
        WebElement categoriesElement = driver.findElement(CategoriesField);
        categoriesElement.click();
    }
    
 // Method to select a category
    public void selectCategory(String category) {
        WebElement category1 = driver.findElement(phonesLink);
        category1.click();
    }

    // Method to select a product
    public void selectProduct(String product) {
        WebElement product1 = driver.findElement(samsungPhoneLink);
        product1.click();
    }

	public void loginToApplication(String username, String password) {
		// TODO Auto-generated method stub
		
	}
}
