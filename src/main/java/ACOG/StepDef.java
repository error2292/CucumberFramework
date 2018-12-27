package ACOG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDef {
	WebDriver driver;
	
	@Given("^user is on landing page$")
	public void user_is_on_landing_page(){
		System.setProperty("webdriver.chrome.driver" , "C:\\Program Files\\SeleniumTool\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://acog.nylinsure2.com/");
		driver.manage().window().maximize();
	}

	@When("^title of login page is Acog$")
	public void title_of_login_page_is_Acog() {
	  String title = driver.getTitle();
	  System.out.println(title);
	  Assert.assertEquals("The American College of Obstetricians and Gynecologists", title);
	}

	@Then("^click on apply now$")
	public void click_on_apply_now() throws InterruptedException {
	   driver.findElement(By.xpath("//button[@id=\"idNewApplicant\" and @type = \"buton\"]")).click();
	   Thread.sleep(1000);
	}
	@Then ("^click on selfBtn$")
	public void click_on_selfBtn() {
		driver.findElement(By.xpath("//*[@id=\"eligi-self-chk\"]/div/div/div")).click();
		
	}
	
	@Then("^enter firstname and lastname and email$")
	public void enter_firstname_and_lastname_and_email_and_DOB () {
	   driver.findElement(By.xpath("//input[@id=\"eligSelfDetails_txtEligFirstNameSlf\" and @name = \"name\"]")).sendKeys("Test");
	   driver.findElement(By.xpath("//input[@id=\"eligSelfDetails_txtEligLastNameSlf\" and @type= \"text\"]")).sendKeys("Data");
	   driver.findElement(By.xpath("//input[@id=\"eligSelfDetails_txtEligEmailSlf\" and @name = \"email\"]")).sendKeys("asdf@gmail.com");
	}
	 
	
	@Then("^Select State$")
	public void select_State() {
		Select sel = new Select (driver.findElement(By.xpath("//select[@id=\"eligSelfDetails_selEligStateSlf\" and @name =\"selEligStateSlf\"]")));
		sel.selectByVisibleText("Alabama");
	}
	@Then ("^click no for Q1$")
	public void clickNo() {
		driver.findElement(By.id("rdEligIsMemberSlf-0")).click();
		
	}
	@Then ("^click no for Q2$")
	public void clickNoForQ1() {
		driver.findElement(By.id("rdEligEmpOcuption-1")).click();
		
	}
	@Then("^enter DOB$")
	 public void enter_dob() {
	 driver.findElement(By.xpath("//input[@id=\"eligSelfDetails_dtEligBirthDateSlf\" and @name = \"dtEligBirthDateSlf\"]")).sendKeys("10/12/1986");
	 
	}	
	@Then("^click Next$")
	public void Clicknext() {
		driver.findElement(By.id("next")).click();
	}
}
