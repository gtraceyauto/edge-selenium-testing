package Pro2_stepDefinitions;

//import org.openqa.jetty.html.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Pro2_TestDefinitions {

	WebDriver driver;
	
	@Given("^Open Chrome and start ProTwo application$")
	public void open_Chrome_and_start_ProTwo_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver/chromedriver.exe");
		
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://pre.bsportspro.com/login?redirect=http%3A%2F%2Fpre.bsportspro.com%2F");
	
	}

	@When("^a valid username and password$")
	public void a_valid_username_and_password() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("gtracey");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("S123");
		driver.findElement(By.cssSelector("#login-form > input.btn")).click();
		
	}

	@Then("^user should be able to login and logout successfully$")
	public void user_should_be_able_to_login_and_logout_successfully() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#bsportsBar > div > ul > li:nth-child(1) > a > img")));
		
		
		driver.getPageSource().contains("For customer support");
		driver.findElement(By.xpath("//*[@id='bsportsBar']/div/ul/li[6]/a/img")).click();
		driver.close();
	}

	
	
}			