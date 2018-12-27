package Step;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDef {
	
	WebDriver driver;
	
	@Given("^User is on landing page$")
	public void user_is_on_landing_page() {
		System.setProperty("webdriver.chrome.driver" , "C:\\Program Files\\SeleniumTool\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@When("^title of landing page is facebook$")
	public void title_of_landing_page_is_facebook()  {
	    String title = driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals("Facebook - Log In or Sign Up", title);
	    		
	}
    @Then("^user enters firsname and lastname and DOB$")
	public void user_enters_firsname_and_lastname_and_DOB() {
    	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("meet.israt@gmail.com");
    	driver.findElement(By.xpath("//input[@name=\"pass\" and @class=\"inputtext\"]")).sendKeys("Eva@sam13");
    
	
	 //  driver.findElement(By.xpath("//*[@id=\"u_0_c\"]")).sendKeys("Israt");
	  // driver.findElement(By.xpath("//*[@id=\"u_0_e\"]")).sendKeys("Eva");
    } 
	 /*@Then("^enter phone and password$")
	 public void enter_phone_and_password() {
		 driver.findElement(By.xpath("//*[@id=\"u_0_h\"]")).sendKeys("3475678782");
		 driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("Hey@1234");
		 driver.findElement(By.xpath("//*[@id=\"u_0_9\"]")).click();
	 
	}
	 @Then("^click signup$")
	 public void click_signup() throws InterruptedException {
		 driver.findElement(By.xpath("//button[@type=\"submit\" and @name = \"websubmit\"]")).click();
		 Thread.sleep(1000);
	 }*/
	 
    @Then("^click login$")
	 public void click_login() throws InterruptedException {
		 driver.findElement(By.xpath("//input[@value=\"Log In\" and @type=\"submit\"]")).click();
	
		 Thread.sleep(1000);
    }

		// JavascriptExecutor js= (JavascriptExecutor)driver;
	    //   js.executeScript("arguments[0].click();", loginBtn);
	      //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
    @Then("^user is on homepage$")
    public void user_in_homepage() {
    	String Title = driver.getTitle();
        System.out.println(Title);
        Assert.assertEquals("Facebook", Title);
    	
    }   
  
    
}
