package EDGE_Remote_stepDefinitions;

//import org.openqa.jetty.html.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.URL;

//import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

public class Edge_Remote_Smoke_TestDefinitions {

	WebDriver driver;
	
	  public static final String USERNAME = "genetracey1";
	  public static final String AUTOMATE_KEY = "SzL8rqjBts4YuhU8LxCE";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  public static void main(String[] args) throws Exception {    
	   
	  }
	
	
	  	@Given("^Open Chrome on Windows and start Edge application$")
	  		public void Open_Chrome_on_Windows_and_start_Edge_application() throws Throwable {
	  			DesiredCapabilities caps = new DesiredCapabilities();
	  			caps.setCapability("browser", "Chrome");
	  			caps.setCapability("browser_version", "68.0");
	  			caps.setCapability("os", "Windows");
	  			caps.setCapability("os_version", "10");
	  			caps.setCapability("resolution", "1024x768");
	  			caps.setCapability("browserstack.local", "false");
	  			caps.setCapability("browserstack.selenium_version", "3.14.0");
	  			//caps.setCapability("browserstack.debug", "true");
	  			driver = new RemoteWebDriver(new URL(URL), caps);
	  			driver.get("http://stats-edge-website-stage.s3-website.us-east-1.amazonaws.com");
	
	}
		 @Given("^Open Chrome on MacOS and start Edge application$")
			public void Open_Chrome_on_MacOS_and_start_Edge_application() throws Throwable {
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability("browser", "Chrome");
				caps.setCapability("browser_version", "69.0");
				caps.setCapability("os", "OS X");
				caps.setCapability("os_version", "Sierra");
				caps.setCapability("resolution", "1024x768");
			    //caps.setCapability("browserstack.debug", "true");
			    caps.setCapability("browserstack.local", "false");
			    caps.setCapability("browserstack.selenium_version", "3.14.0");
				 driver = new RemoteWebDriver(new URL(URL), caps);
				 driver.get("http://stats-edge-website-stage.s3-website.us-east-1.amazonaws.com");
			
			}
			
			@Given("^Open Safari on MacOS and start Edge application$")
			public void Open_Safari_on_MacOS_and_start_Edge_application() throws Throwable {
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability("browser", "Safari");
				caps.setCapability("browser_version", "11.1");
				caps.setCapability("os", "OS X");
				caps.setCapability("os_version", "High Sierra");
				caps.setCapability("resolution", "1024x768");
			    //caps.setCapability("browserstack.debug", "true");
				caps.setCapability("browserstack.local", "false");
			    caps.setCapability("browserstack.selenium_version", "3.14.0");
				 driver = new RemoteWebDriver(new URL(URL), caps);
				 driver.get("http://stats-edge-website-stage.s3-website.us-east-1.amazonaws.com");
			
			}
					
			@Given("^Open Firefox on Windows and start Edge application$")
			public void Open_Firefox_on_Windows_and_start_Edge_application() throws Throwable {
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability("browser", "Firefox");
				caps.setCapability("browser_version", "60.0");
				caps.setCapability("os", "Windows");
				caps.setCapability("os_version", "10");
				caps.setCapability("resolution", "1024x768");
			    //caps.setCapability("browserstack.debug", "true");
			    caps.setCapability("browserstack.local", "false");
			    caps.setCapability("browserstack.selenium_version", "3.14.0");
			    driver = new RemoteWebDriver(new URL(URL), caps);			    
				driver.get("http://stats-edge-website-stage.s3-website.us-east-1.amazonaws.com");
			
			}
			
			@Given("^Open Firefox on MacOS and start Edge application$")
			public void Open_Firefox_on_MacOS_and_start_Edge_application() throws Throwable {
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability("browser", "Firefox");
				caps.setCapability("browser_version", "61.0");
				caps.setCapability("os", "OS X");
				caps.setCapability("os_version", "High Sierra");
				caps.setCapability("resolution", "1024x768");
			    //caps.setCapability("browserstack.debug", "true");
				caps.setCapability("browserstack.local", "false");
			    caps.setCapability("browserstack.selenium_version", "3.14.0");
			    driver = new RemoteWebDriver(new URL(URL), caps);		    	 
			   	    driver.get("http://stats-edge-website-stage.s3-website.us-east-1.amazonaws.com");
			
			}	 
		 

	@When("^a valid username and password$")
	public void a_valid_username_and_password() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email\"]")));
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("gtracey@stats.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("testing123");
		driver.findElement(By.cssSelector("#btn-login")).click();
	}
		
	@When("^each competition is selected$")
	public void each_competition_is_selected() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/a[2]")));
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-display > span.league-dropdown-chevron")).click();
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-items.show > div:nth-child(2) > div > div")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));
		driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div[2]/div[2]/div[2]/div[2]/div/div[1]/span[1]")).getText().equalsIgnoreCase("1. FC Nurnberg");
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-display > span.league-dropdown-chevron")).click();
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-items.show > div:nth-child(3) > div > div")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"root\\\"]/div[2]/div[2]/div[2]/div[2]/div/div[1]/span[1]")));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[1]/span[1]")).getText().equalsIgnoreCase("Aston Villa");
		
		
	}

		
	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/a[2]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/a[4]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[1]/div/ul/li[2]/span")));		
		
		//driver.getPageSource().contains("TEAM TO ANALYSE");
		//driver.findElement(By.cssSelector("#root > div.navigation-bar > a.nav-link.logout")).click();
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/a[8]"))).clickAt(88,806);
		//ClickAt(driver,"#root > div.navigation-bar > a.nav-link.logout",88,806);	
				
	}
	   
	@Then("^user should be able to logout successfully$")
	public void user_should_be_able_to_logout_successfully() throws Throwable {
		ClickAt(driver,"#root > div.navigation-bar > a.nav-link.logout",88,806);
		System.out.println(driver.getTitle());
		 driver.quit();	
	   		
	}
	
	@Then("^the default team for the selected competition will be displayed$")
	public void the_default_team_for_the_selected_competition_will_be_displayed() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));
	}
	
	@Then("^remote browser will close$")
	public void remote_browser_will_close() throws Throwable {
		System.out.println(driver.getTitle());
	    driver.quit();	
	    
	}    
	 
	 //public void user should be able to logout successfully() throws Throwable {
		 //WebDriverWait wait = new WebDriverWait(driver, 120);
	  
	
	
	
	private void ClickAt(WebDriver driver2, String string, int i, int j) {
				// TODO Auto-generated method stub

		
	}

	
	
	
}			