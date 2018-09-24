package EDGE_Local_stepDefinitions;

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


public class Edge_TestDefinitions {

	WebDriver driver;
	
	@Given("^Open Chrome and start Edge application$")
	public void open_Chrome_and_start_Edge_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver/chromedriver.exe");
		
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://edge.stats.com");
	
	}

	@When("^a valid username and password$")
	public void a_valid_username_and_password() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test@stats.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("stats1234");
		driver.findElement(By.cssSelector("#btn-login")).click();
		
		
	}

	@Then("^user should be able to login and logout successfully$")
	public void user_should_be_able_to_login_and_logout_successfully() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#root > div.navigation-bar > div:nth-child(3)")));
		
		
		driver.getPageSource().contains("TEAM TO ANALYSE");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/a[8]")).click();
		driver.close();
	}

	
	
	
}			