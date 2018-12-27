package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	WebDriver driver;
	
	@Given("^User is on login page$")
public void user_on_home_page() {
		System.setProperty("webdriver.chrome.driver" , "C:\\Program Files\\SeleniumTool\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");
		}
	@SuppressWarnings("deprecation")
	@When("^title of login page is Free CRM$")
	public void titleOfPage() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	}
	
	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_username_password(String username,String password) {
    	driver.findElement(By.name("username")).sendKeys(username);
    	driver.findElement(By.name("password")).sendKeys(password);
    } 
   @Then("^user clicks on login button$")
   public void ClickOnLoginBtn() {
	   WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
       JavascriptExecutor js= (JavascriptExecutor)driver;
       js.executeScript("arguments[0].click();", loginBtn);
  
}
   @SuppressWarnings("deprecation")
@Then("^user is on home page$")
public void userOnHomepage(){
	String Title= driver.getTitle();
	System.out.println("Home Page Title :" +Title);
    Assert.assertEquals("CRMPRO",Title);
   
}
   @Then("^close the browser$")
   public void CloseBrowser() {
	   driver.quit();
   }
  
      }
	
