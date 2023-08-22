package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSD 
{

	WebDriver driver;
	
	@Given("^User should of Ranford Home Page$")
	public void user_should_of_Ranford_Home_Page() throws Throwable 
	{
        driver=new ChromeDriver();
		
		//Maximise
		
		driver.manage().window().maximize();
		
		//URL
		
	   driver.get("http://103.211.39.246/ranford2/");
	}

	@When("^User enters Username password click on Login$")
	public void user_enters_Username_password_click_on_Login() throws Throwable
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("TestingMindq");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'login\']")).click();
	
	}

	@Then("^User Validates login Functionality$")
	public void user_Validates_login_Functionality() throws Throwable 
	{
	
		String Expval="Welcome to Admin";
		
        String Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		
		//Comparision
		
		if (Expval.equalsIgnoreCase(Actval)) 
		{
			System.out.println("Admin Login Succ");
		}
		else
		{
			System.out.println("Admin Login Failed");
		}
	}


}
