package spassNBA_stepDefinitions;

//import org.openqa.jetty.html.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SpassNBA_TestDefinitions
{

	WebDriver driver;
	
	@Given("^Open Chrome and start Statspass application$")
	public void open_Chrome_and_start_Statspass_application() throws Throwable {
	  
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://statspass.com:8393/");
		
	}

	@When("^valid username and password$")
	public void valid_username_and_password() throws Throwable {
		
		driver.findElement(By.name("txtUsername")).sendKeys("gtracey");
		driver.findElement(By.name("txtPassword")).sendKeys("s123");
		driver.findElement(By.cssSelector("body > p:nth-child(4) > table:nth-child(2) > tbody > tr > td:nth-child(2) > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type='submit']")).click();
		
	}

	@Then("^users should be able to login and logout successfully$")
	public void users_should_be_able_to_login_and_logout_successfully() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(4) > table:nth-child(1) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")));
		
		
		driver.getPageSource().contains("What's New on STATSPASS?");
		driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/a")).click();
		driver.findElement(By.name("Image7")).click();
		driver.close();
	}	
	

	@Given("^Statspass application is open$")
	public void statspass_application_is_open() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://statspass01:8393/");
	}

	@When("^a user signs in with admin ID$")
	public void a_user_signs_out_of_the_system() throws Throwable {
		
		driver.findElement(By.name("txtUsername")).sendKeys("gtracey");
		driver.findElement(By.name("txtPassword")).sendKeys("s123");
		driver.findElement(By.cssSelector("body > p:nth-child(4) > table:nth-child(2) > tbody > tr > td:nth-child(2) > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type='submit']")).click();
		
	}

	
	@Then("^user should be able to login successfully$")
	public void the_application_closes() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(4) > table:nth-child(1) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")));
		
		driver.getPageSource().contains("What's New on STATSPASS?");
		driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/a")).click();
		driver.findElement(By.name("Image7")).click();
		driver.close();
		
		
	}
	
	@Given("^Start Statspass application and login$")
	public void start_Statspass_application_and_login() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.statspass.com");
		driver.findElement(By.name("txtUsername")).sendKeys("gtracey");
		driver.findElement(By.name("txtPassword")).sendKeys("stern123");
		driver.findElement(By.cssSelector("body > p:nth-child(4) > table:nth-child(2) > tbody > tr > td:nth-child(2) > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type='submit']")).click();
			
		
	}

	@Given("^the NBA module is open$")
	public void the_NBA_module_is_open() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(4) > table:nth-child(1) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")));
		
		driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[1]/table/tbody/tr[4]/td[2]/a")).click();
			
		
	}

	@When("^advanced search window is opened$")
	public void advanced_search_window_is_opened() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Enter > table:nth-child(3) > tbody > tr:nth-child(3) > td:nth-child(1) > a")));
		
		driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
		driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
		
		
	}

	@Then("^FTA diff/game can be selected as a statistic$")
	public void fta_game_can_be_selected_as_a_statistic() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
		
		
		driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
		driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[81]")).click();//FTA Diff per game Stat Selection
		driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
		
	}

	@Then("^All splits for FTA diff/game can be selected$")
	public void all_splits_for_FTA_diff_per_game_can_be_selected() throws Throwable {
		//Loop through current season splits
		
		WebDriverWait wait = new WebDriverWait(driver, 1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
		driver.getPageSource().contains("Team Per Game Differential");
		
		String split = "";
		
		for (int x = 1; x<= 5; x ++)//set to 135
		{
			try 
			{
			driver.getPageSource().contains("Team Per Game Differential");
			driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[1]/td[2]/a[2]")).click();//Modify search criteria
			driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/select/option[" + x + "]")).click();//loop though split Selections
			split = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/select/option[" + x + "]")).getText();
			driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
			
					
			}
			catch(Exception ex){
									
				
				System.out.println("Current Season Split " + split + " FAIL");
			
			}
	}
	}
		@Then("^All participant types for FTA diff/game can be selected$")
		public void all_participant_types_for_FTA_diff_per_game_can_be_selected() throws Throwable {
			String team = "";
			
			for (int x = 1; x<= 5; x ++)//set to 35
			{
				try 
				{
			
			driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
			driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
			
			WebDriverWait wait = new WebDriverWait(driver, 1);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
			driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
			driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[81]")).click();//FTA Diff per game Stat Selection
			
			driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/select")).click();//Team dropdown
			driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/select/option[" + x + "]")).click();//Team selections
			team = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/select/option[" + x + "]")).getText();
			driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
			
						
			
			}
			catch(Exception ex){
									
				
				System.out.println("Team Report " + team + " FAIL");
			
						
			}
		}
		}
			@Then("^All time spans for FTA diff/game can be selected$")
			public void all_time_spans_for_FTA_diff_per_game_can_be_selected() throws Throwable {
				//Loops through X number of single seasons
				
				String season = "";
				WebDriverWait wait = new WebDriverWait(driver, 1);
				for (int x = 1; x<= 5; x ++)//set to 70
				{
					try 
					{
				
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
				
				wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[81]")).click();//FTA Diff per game Stat Selection
				
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[1]")).click();//Single Season Dropdown
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[1]/option[" + x + "]")).click();//Season selections
				season = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[1]/option[" + x + "]")).getText();
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
				
					}
					catch(Exception ex){
											
						
						System.out.println("Team Report " + season + " FAIL");
										}
								
					}
				
				
				//Loops through X number of season ranges up to the current season
				
				for (int x = 1; x<= 5; x ++)//set to 70
				{
					try 
					{
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
				
				wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[81]")).click();//FTA Diff per game Stat Selection
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[2]")).click();//Season Range Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[4]/option[3]")).click();//Totals during time range selection
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[2]")).click();//Season Range Dropdown
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[2]/option[" + x + "]")).click();//Season selections
				season = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[2]/option[" + x + "]")).getText();
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
								
				}
				catch(Exception ex){
										
					
					System.out.println("Team Report " + season + " FAIL");
								}
				
				}
					
					//Date range testing
					
					driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
					driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
					
					wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));	
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[81]")).click();//FTA Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[3]")).click();//Date Range Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[4]/option[2]")).click();//Totals during time range selection
					driver.findElement(By.name("d1")).sendKeys("11/1/2016");
					driver.findElement(By.name("d2")).sendKeys("12/30/2016");
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
					
					//All Time testing- Regular season
					
					driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
					driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
					wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));	
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[81]")).click();//FTA Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[81]")).click();//FTA Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
					
					//All Time testing- Postseason
					
					driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
					driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
					wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));	
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[81]")).click();//FTA Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[81]")).click();//FTA Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[2]/select/option[2]")).click();//Postseason selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
					
					//All Time testing- Regular+Postseason (single seasons)
					
					driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
					driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
					wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));	
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[81]")).click();//FTA Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[81]")).click();//FTA Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[2]/select/option[3]")).click();//Reg+Post selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
					
					//All Time testing- Regular+Postseason (totals during time range)
					
					driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
					driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
					wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));	
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[81]")).click();//FTA Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[81]")).click();//FTA Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[2]/select/option[3]")).click();//Reg+Post selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[4]/option[3]")).click();//Totals during time range selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
					
					
					//All Time testing- Regular+Postseason (loop through splits)
	
					String AllTimeSplit = "";
					wait = new WebDriverWait(driver, 1);
					for (int i= 1; i<= 5; i ++)//set to 135
					{
						try 
						{
						driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
						driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[81]")).click();//FTA Diff per game Stat Selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[81]")).click();//FTA Diff per game Stat Selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[2]/select/option[3]")).click();//Reg+Post selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/select/option[" + i + "]")).click();//loop though split Selections
						AllTimeSplit = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/select/option[" + i + "]")).getText();
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
						
								
						}
						catch(Exception ex){
												
							
							System.out.println("All-Time Split " + AllTimeSplit + " FAIL");
							
							
						}
					}}
				
				@Then("^Custom filters for FTA diff/game can be selected$")
				public void custom_filters_for_FTA_diff_per_game_can_be_selected() throws Throwable {
				
				//Loop through all Customer Filter Statistic selections
					String filter = "";
					WebDriverWait wait = new WebDriverWait(driver, 1);					
					for (int x = 1; x<= 5; x ++)//set to 81
					{
						try 
						{
					
					driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
					driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
							
					wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[81]")).click();//FTA Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[1]")).click();//Single Season Radio Button
					driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form[3]/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/select")).click();//Custom Filter Stat Dropdown
					driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form[3]/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/select/option[" + x + "]")).click();//CF stat selections
					filter = driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form[3]/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/select/option[" + x + "]")).getText();
					driver.findElement(By.name("filternum")).sendKeys("0");//enter value of '0' for all loops
					driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form[3]/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr/td[1]/fieldset/input[1]")).click();//Add Filter Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
												
							
						}
						catch(Exception ex){
												
							
							System.out.println("Customer Filter " + filter + " FAIL");
						}								
						
						//logout of system
						
						if (x == 5)
						{
						driver.findElement(By.xpath("//*[@id='Image6']")).click();
											//driver.close();
								}
																		
									
								}				
				
}

				@Then("^FT Made diff/game can be selected as a statistic$")
				public void ft_Made_game_diff_can_be_selected_as_a_statistic() throws Throwable {
					WebDriverWait wait = new WebDriverWait(driver, 15);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
					
					
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[80]")).click();//FTM Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					
				}		
				
				
				@Then("^All splits for FT Made diff/game can be selected$")
				public void all_splits_for_FT_Made_diff_game_can_be_selected() throws Throwable {
					WebDriverWait wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
					driver.getPageSource().contains("Team Per Game Differential");
					
					String split = "";
					
					for (int x = 1; x<= 5; x ++)//set to 135
					{
						try 
						{
						driver.getPageSource().contains("Team Per Game Differential");
						driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[1]/td[2]/a[2]")).click();//Modify search criteria
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/select/option[" + x + "]")).click();//loop though split Selections
						split = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/select/option[" + x + "]")).getText();
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
							
									
							}
							catch(Exception ex){
													
								
								System.out.println("Current Season Split " + split + " FAIL");
							
							}
					}
				}
					
					

				@Then("^All participant types for FT Made diff/game can be selected$")
				public void all_participant_types_for_FT_Made_diff_game_can_be_selected() throws Throwable {
					String team = "";
					
					for (int x = 1; x<= 5; x ++)//set to 35
					{
						try 
						{
					
					driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
					driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
					
					WebDriverWait wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[80]")).click();//FTM Diff per game Stat Selection
					
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/select")).click();//Team dropdown
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/select/option[" + x + "]")).click();//Team selections
					team = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/select/option[" + x + "]")).getText();
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
					
										
					
					}
					catch(Exception ex){
											
						
						System.out.println("Team Report " + team + " FAIL");
					
								
					}
				}  
									
					
				}

				@Then("^All time spans for FT Made diff/game can be selected$")
				public void all_time_spans_for_FT_Made_diff_game_can_be_selected() throws Throwable {
					//Loops through X number of single seasons
					
					String season = "";
					WebDriverWait wait = new WebDriverWait(driver, 1);
					for (int x = 1; x<= 5; x ++)//set to 70
					{
						try 
						{
					
					driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
					driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
					
					wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[80]")).click();//FTM Diff per game Stat Selection
					
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[1]")).click();//Single Season Dropdown
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[1]/option[" + x + "]")).click();//Season selections
					season = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[1]/option[" + x + "]")).getText();
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
					
						}
						catch(Exception ex){
												
							
							System.out.println("Team Report " + season + " FAIL");
						
									
						}}
					
					//Loops through X number of season ranges up to the current season
					
					for (int x = 1; x<= 5; x ++)//set to 70
					{
						try 
						{
					driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
					driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
					
					wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[80]")).click();//FTM Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[2]")).click();//Season Range Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[4]/option[3]")).click();//Totals during time range selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[2]")).click();//Season Range Dropdown
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[2]/option[" + x + "]")).click();//Season selections
					season = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[2]/option[" + x + "]")).getText();
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
															
					
					}
					catch(Exception ex){
											
						
						System.out.println("Team Report " + season + " FAIL");
									}
					
					}	
						//Date range testing
						
						driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
						driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
						
						wait = new WebDriverWait(driver, 1);
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));	
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[80]")).click();//FTM Diff per game Stat Selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[3]")).click();//Date Range Radio Button
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[4]/option[2]")).click();//Totals during time range selection
						driver.findElement(By.name("d1")).sendKeys("11/1/2016");
						driver.findElement(By.name("d2")).sendKeys("12/30/2016");
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
						
						//All Time testing- Regular season
						
						driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
						driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
						wait = new WebDriverWait(driver, 1);
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));	
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[80]")).click();//FTM Diff per game Stat Selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[80]")).click();//FTM Diff per game Stat Selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
						
						//All Time testing- Postseason
						
						driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
						driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
						wait = new WebDriverWait(driver, 1);
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));	
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[80]")).click();//FTM Diff per game Stat Selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[80]")).click();//FTM Diff per game Stat Selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[2]/select/option[2]")).click();//Postseason selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
						
						//All Time testing- Regular+Postseason (single seasons)
						
						driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
						driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
						wait = new WebDriverWait(driver, 1);
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));	
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[80]")).click();//FTA Diff per game Stat Selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[80]")).click();//FTM Diff per game Stat Selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[2]/select/option[3]")).click();//Reg+Post selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
						
						//All Time testing- Regular+Postseason (totals during time range)
						
						driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
						driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
						wait = new WebDriverWait(driver, 1);
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));	
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[80]")).click();//FTM Diff per game Stat Selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[80]")).click();//FTA Diff per game Stat Selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[2]/select/option[3]")).click();//Reg+Post selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[4]/option[3]")).click();//Totals during time range selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
						
						
						//All Time testing- Regular+Postseason (loop through splits)
		
						String AllTimeSplit = "";
						wait = new WebDriverWait(driver, 1);
						for (int i= 1; i<= 5; i ++)//set to 135
						{
							try 
							{
							driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
							driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
							wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
							driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
							driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[80]")).click();//FTM Diff per game Stat Selection
							driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
							driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[80]")).click();//FTM Diff per game Stat Selection
							driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[2]/select/option[3]")).click();//Reg+Post selection
							driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/select/option[" + i + "]")).click();//loop though split Selections
							AllTimeSplit = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/select/option[" + i + "]")).getText();
							driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
							wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
							
									
							}
							catch(Exception ex){
													
								
								System.out.println("All-Time Split " + AllTimeSplit + " FAIL");
								
								
							}
						}}
												
				

				@Then("^Custom filters for FT Made diff/game can be selected$")
				public void custom_filters_for_FT_Made_diff_game_can_be_selected() throws Throwable {
					//Loop through all Customer Filter Statistic selections
					String filter = "";
					WebDriverWait wait = new WebDriverWait(driver, 1);					
					for (int x = 1; x<= 5; x ++)//set to 81
					{
						try 
						{
					
					driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
					driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
							
					wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[80]")).click();//FTM Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[1]")).click();//Single Season Radio Button
					driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form[3]/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/select")).click();//Custom Filter Stat Dropdown
					driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form[3]/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/select/option[" + x + "]")).click();//CF stat selections
					filter = driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form[3]/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/select/option[" + x + "]")).getText();
					driver.findElement(By.name("filternum")).sendKeys("0");//enter value of '0' for all loops
					driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form[3]/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr/td[1]/fieldset/input[1]")).click();//Add Filter Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
												
							
						}
						catch(Exception ex){
												
							
							System.out.println("Customer Filter " + filter + " FAIL");
						}								
						
						//logout of system
						
						if (x == 5)
						{
						driver.findElement(By.xpath("//*[@id='Image6']")).click();
											//driver.close();
						}								
									
								}							
				
				}
				
										
				
				@Then("three pt FG Made/game can be selected as a statistic$")
				public void three_pt_FG_Made_game_can_be_selected_as_a_statistic() throws Throwable {
					WebDriverWait wait = new WebDriverWait(driver, 15);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
					
					
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[82]")).click();//3pt FGM Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
				}
				
								
				
				@Then("^All splits for Three pt FGM diff/game can be selected$")
				public void all_splits_for_Three_pt_FGM_diff_game_can_be_selected() throws Throwable {
					WebDriverWait wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
					driver.getPageSource().contains("Team Per Game Differential");
					
					String split = "";
					
					for (int x = 1; x<= 5; x ++)//set to 135
					{
						try 
						{
						driver.getPageSource().contains("Team Per Game Differential");
						driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[1]/td[2]/a[2]")).click();//Modify search criteria
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/select/option[" + x + "]")).click();//loop though split Selections
						split = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/select/option[" + x + "]")).getText();
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
							
									
							}
							catch(Exception ex){
													
								
								System.out.println("Current Season Split " + split + " FAIL");
							
							}
					}
									
					
				}

				@Then("^All participant types for Three pt FGM diff/game can be selected$")
				public void all_participant_types_for_Three_pt_FGM_diff_game_can_be_selected() throws Throwable {
					String team = "";
					
					for (int x = 1; x<= 5; x ++)//set to 35
					{
						try 
						{
					
					driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
					driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
					
					WebDriverWait wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[82]")).click();//3pt FGM Diff per game Stat Selection
					
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/select")).click();//Team dropdown
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/select/option[" + x + "]")).click();//Team selections
					team = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/select/option[" + x + "]")).getText();
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
															
					
					}
					catch(Exception ex){
											
						
						System.out.println("Team Report " + team + " FAIL");
					
								
					}
				} 
										
					
				}

				@Then("^All time spans for Three pt FGM diff/game can be selected$")
				public void all_time_spans_for_Three_pt_FGM_diff_game_can_be_selected() throws Throwable {
					//Loops through X number of single seasons
					
					String season = "";
					WebDriverWait wait = new WebDriverWait(driver, 1);
					for (int x = 1; x<= 5; x ++)//set to 70
					{
						try 
						{
					
					driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
					driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
					
					wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[82]")).click();//3pt FGM Diff per game Stat Selection
					
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[1]")).click();//Single Season Dropdown
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[1]/option[" + x + "]")).click();//Season selections
					season = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[1]/option[" + x + "]")).getText();
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
					
						}
						catch(Exception ex){
												
							
							System.out.println("Team Report " + season + " FAIL");
						
									
						}}
					
					//Loops through X number of season ranges up to the current season
					
					for (int x = 1; x<= 5; x ++)//set to 70
					{
						try 
						{
					driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
					driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
					
					wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[82]")).click();//3pt FGM Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[2]")).click();//Season Range Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[4]/option[3]")).click();//Totals during time range selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[2]")).click();//Season Range Dropdown
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[2]/option[" + x + "]")).click();//Season selections
					season = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[2]/option[" + x + "]")).getText();
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
															
					
					}
					catch(Exception ex){
											
						
						System.out.println("Team Report " + season + " FAIL");
										}
					}
						
						
						//Date range testing
						
						driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
						driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
						
						wait = new WebDriverWait(driver, 1);
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));	
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[82]")).click();//3pt FGM Diff per game Stat Selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[3]")).click();//Date Range Radio Button
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[4]/option[2]")).click();//Totals during time range selection
						driver.findElement(By.name("d1")).sendKeys("11/1/2016");
						driver.findElement(By.name("d2")).sendKeys("12/30/2016");
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
						
						//All Time testing- Regular season
						
						driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
						driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
						wait = new WebDriverWait(driver, 1);
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));	
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[82]")).click();//3pt FGM Diff per game Stat Selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
						//driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[83]")).click();//3pt FGM Diff per game Stat Selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
						
						//All Time testing- Postseason
						
						driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
						driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
						wait = new WebDriverWait(driver, 1);
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));	
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[82]")).click();//3pt FGM Diff per game Stat Selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
						//driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[83]")).click();//3pt FGM Diff per game Stat Selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[2]/select/option[2]")).click();//Postseason selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
						
						//All Time testing- Regular+Postseason (single seasons)
						
						driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
						driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
						wait = new WebDriverWait(driver, 1);
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));	
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[82]")).click();//3pt FGM Diff per game Stat Selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
						//driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[83]")).click();//3pt FGM Diff per game Stat Selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[2]/select/option[3]")).click();//Reg+Post selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
						
						//All Time testing- Regular+Postseason (totals during time range)
						
						driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
						driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
						wait = new WebDriverWait(driver, 1);
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));	
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[82]")).click();//3pt FGM Diff per game Stat Selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
						//driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[83]")).click();//3pt FGM Diff per game Stat Selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[2]/select/option[3]")).click();//Reg+Post selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[4]/option[3]")).click();//Totals during time range selection
						driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
						
						
						//All Time testing- Regular+Postseason (loop through splits)
		
						String AllTimeSplit = "";
						wait = new WebDriverWait(driver, 1);
						for (int i= 1; i<= 5; i ++)//set to 135
						{
							try 
							{
							driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
							driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
							wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
							driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
							driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[82]")).click();//3pt FGM Diff per game Stat Selection
							driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
							//driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[83]")).click();//3pt FGM Diff per game Stat Selection
							driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[2]/select/option[3]")).click();//Reg+Post selection
							driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/select/option[" + i + "]")).click();//loop though split Selections
							AllTimeSplit = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/select/option[" + i + "]")).getText();
							driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
							wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
							
									
							}
							catch(Exception ex){
													
								
								System.out.println("All-Time Split " + AllTimeSplit + " FAIL");
								
								
							}
						}} 
										
				@Then("^Custom filters for Three pt FGM diff/game can be selected$")
				public void custom_filters_for_Three_pt_FGM_diff_game_can_be_selected() throws Throwable {
					//Loop through all Customer Filter Statistic selections
					String filter = "";
					WebDriverWait wait = new WebDriverWait(driver, 1);					
					for (int x = 1; x<= 81; x ++)//set to 81
					{
						try 
						{
					
					driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
					driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
							
					wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[82]")).click();//3pt FGM Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[1]")).click();//Single Season Radio Button
					driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form[3]/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/select")).click();//Custom Filter Stat Dropdown
					driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form[3]/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/select/option[" + x + "]")).click();//CF stat selections
					filter = driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form[3]/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/select/option[" + x + "]")).getText();
					driver.findElement(By.name("filternum")).sendKeys("0");//enter value of '0' for all loops
					driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form[3]/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr/td[1]/fieldset/input[1]")).click();//Add Filter Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
												
							
						}
						catch(Exception ex){
												
							
							System.out.println("Customer Filter " + filter + " FAIL");
						}								
						
						//logout of system
						
						if (x == 81)
						{
						driver.findElement(By.xpath("//*[@id='Image6']")).click();
											//driver.close();
						}								
									
								} 
				
				
				
				}	
				
											
				@Then("^Three pt FGA diff/game can be selected as a statistic$")
				public void Three_pt_FGA_diff_per_game_can_be_selected_as_a_statistic() throws Throwable {
					WebDriverWait wait = new WebDriverWait(driver, 15);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
					
					
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[83]")).click();//3pt FGA Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					
				}

				@Then("^All splits for Three pt FGA diff/game can be selected$")
				public void all_splits_for_Three_pt_FGA_diff_per_game_can_be_selected() throws Throwable {
					//Loop through current season splits
					
				WebDriverWait wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
				driver.getPageSource().contains("Team Per Game Differential");
				
				String split = "";
				
				for (int x = 1; x<= 5; x ++)//set to 135
				{
					try 
					{
					driver.getPageSource().contains("Team Per Game Differential");
					driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[1]/td[2]/a[2]")).click();//Modify search criteria
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/select/option[" + x + "]")).click();//loop though split Selections
					split = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/select/option[" + x + "]")).getText();
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
						
								
						}
						catch(Exception ex){
												
							
							System.out.println("Current Season Split " + split + " FAIL");
						
						}
				}
				}
				@Then("^All participant types for Three pt FGA diff/game can be selected$")
				public void all_participant_types_for_Three_pt_FGA_diff_per_game_can_be_selected() throws Throwable {
					String team = "";
					
					for (int x = 1; x<= 5; x ++)//set to 35
					{
						try 
						{
					
					driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
					driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
					
					WebDriverWait wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[83]")).click();//3pt FGA Diff per game Stat Selection
					
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/select")).click();//Team dropdown
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/select/option[" + x + "]")).click();//Team selections
					team = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/select/option[" + x + "]")).getText();
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
																							
						}
						catch(Exception ex){
												
							
							System.out.println("Team Report " + team + " FAIL");
						
						}			
					}
					}
					
				@Then("^All time spans for Three pt FGA diff/game can be selected$")
				public void all_time_spans_for_Three_pt_FGA_diff_per_game_can_be_selected() throws Throwable {
					//Loops through X number of single seasons
					
					String season = "";
					WebDriverWait wait = new WebDriverWait(driver, 1);
					for (int x = 1; x<= 5; x ++)//set to 70
					{
						try 
						{
					
					driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
					driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
					
					wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[83]")).click();//3pt FGA Diff per game Stat Selection
					
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[1]")).click();//Single Season Dropdown
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[1]/option[" + x + "]")).click();//Season selections
					season = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[1]/option[" + x + "]")).getText();
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
							
								}
						catch(Exception ex){
												
							
							System.out.println("Team Report " + season + " FAIL");
						
									
						}
					}
					
					//Loops through X number of season ranges up to the current season
					
					for (int x = 1; x<= 5; x ++)//set to 70
					{
						try 
						{
					driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
					driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
					
					wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[83]")).click();//3pt FGA Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[2]")).click();//Season Range Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[4]/option[3]")).click();//Totals during time range selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[2]")).click();//Season Range Dropdown
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[2]/option[" + x + "]")).click();//Season selections
					season = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[2]/option[" + x + "]")).getText();
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
																				
							
					}
					catch(Exception ex){
											
						
						System.out.println("Team Report " + season + " FAIL");
										}
					}
						
						//Date range testing
						
					driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
					driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
						
					wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));	
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[83]")).click();//3pt FGA Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[3]")).click();//Date Range Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[4]/option[2]")).click();//Totals during time range selection
					driver.findElement(By.name("d1")).sendKeys("11/1/2016");
					driver.findElement(By.name("d2")).sendKeys("12/30/2016");
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
						
					//All Time testing- Regular season
						
					driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
					driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
					wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));	
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[83]")).click();//3pt FGA Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
					//driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[80]")).click();//3pt FGA Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
						
					//All Time testing- Postseason
						
					driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
					driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
					wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));	
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[83]")).click();//3pt FGA Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
					//driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[80]")).click();//3pt FGA Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[2]/select/option[2]")).click();//Postseason selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
						
					//All Time testing- Regular+Postseason (single seasons)
						
					driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
					driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
					wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));	
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[83]")).click();//3pt FGA Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
					//driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[80]")).click();//3pt FGA Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[2]/select/option[3]")).click();//Reg+Post selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
						
					//All Time testing- Regular+Postseason (totals during time range)
						
					driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
					driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
					wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));	
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[83]")).click();//3pt FGA Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
					//driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[83]")).click();//3pt FGA Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[2]/select/option[3]")).click();//Reg+Post selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[4]/option[3]")).click();//Totals during time range selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
						
						
					//All Time testing- Regular+Postseason (loop through splits)
		
					String AllTimeSplit = "";
					wait = new WebDriverWait(driver, 1);
					for (int i= 1; i<= 5; i ++)//set to 135
					{
						try 
						{
					driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
					driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[83]")).click();//3pt FGA Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
					//driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[83]")).click();//3pt FGA Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[2]/select/option[3]")).click();//Reg+Post selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/select/option[" + i + "]")).click();//loop though split Selections
					AllTimeSplit = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/select/option[" + i + "]")).getText();
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
							
									
							}
						catch(Exception ex){
													
								
						System.out.println("All-Time Split " + AllTimeSplit + " FAIL");
															
										  }	
					}
				}
					@Then("^Custom filters for Three pt FGA diff/game can be selected$")
					public void custom_filters_for_Three_pt_FGA_diff_per_game_can_be_selected() throws Throwable {
							
					//Loop through all Customer Filter Statistic selections
						String filter = "";
						WebDriverWait wait = new WebDriverWait(driver, 1);					
					for (int x = 1; x<= 5; x ++)//set to 81
								{
								try 
									{
								
					driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
					driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
								
					wait = new WebDriverWait(driver, 1);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Teams Own Radio Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[83]")).click();//3pt FGA Diff per game Stat Selection
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[1]")).click();//Single Season Radio Button
					driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form[3]/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/select")).click();//Custom Filter Stat Dropdown
					driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form[3]/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/select/option[" + x + "]")).click();//CF stat selections
					filter = driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form[3]/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/select/option[" + x + "]")).getText();
					driver.findElement(By.name("filternum")).sendKeys("0");//enter value of '0' for all loops
					driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form[3]/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr/td[1]/fieldset/input[1]")).click();//Add Filter Button
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
																	
												
							}
					catch(Exception ex){
													
								
						System.out.println("Customer Filter " + filter + " FAIL");
							}
						
						//logout of system
						if (x == 5)
						{
						driver.findElement(By.xpath("//*[@id='Image6']")).click();
											//driver.close();
						}
						else
						{
						}
										}}			
								
					
			@When("^Double-Doubles is selected as a statistic$")
			public void double_Doubles_is_selected_as_a_statistic() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
								
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/input")).click();//Players Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[29]")).click();//Double-Doubles Stat Selection
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
				
			}

			@Then("^All splits for Double-Doubles can be selected$")
			public void all_splits_for_Double_Doubles_can_be_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td")));
				driver.getPageSource().contains("Leaders");
				
				String split = "";
				
				for (int x = 1; x<= 5; x ++)//set to 135
				{
					try 
					{
					driver.getPageSource().contains("Leaders");
					driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[1]/td[2]/a[2]")).click();//Modify search criteria
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/select/option[" + x + "]")).click();//loop though split Selections
					split = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/select/option[" + x + "]")).getText();
					driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td")));
						
								
						}
						catch(Exception ex){
												
							
							System.out.println("DD:Current Season Split " + split + " FAIL");
						
						}
				}
				
				
			}

			@Then("^All participant types for Double-Doubles can be selected$")
			public void all_participant_types_for_Double_Doubles_can_be_selected() throws Throwable {
				String team = "";
				
				for (int x = 1; x<= 5; x ++)//set to 35
				{
					try 
					{
				
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
				
				WebDriverWait wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/input")).click();//Players Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[29]")).click();//Double-Doubles Stat Selection
				
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/select")).click();//Team dropdown
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/select/option[" + x + "]")).click();//Team selections
				team = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/select/option[" + x + "]")).getText();
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
																													
					}
					catch(Exception ex){
																
						System.out.println("DD:Team Report " + team + " FAIL");					
					}			
				}
				
				String position = "";
				
				for (int x = 1; x<= 5; x ++)//set to 10
				{
					try 
					{
				
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
				
				WebDriverWait wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/input")).click();//Players Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/select/option[1]")).click();//Set Franchise back to default
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[29]")).click();//Double-Doubles Stat Selection
				
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[3]/td[1]/select")).click();//Position dropdown
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[3]/td[1]/select/option[" + x + "]")).click();//Position selections
				position = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[3]/td[1]/select/option[" + x + "]")).getText();
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
																													
					}
					catch(Exception ex){
																
						System.out.println("DD:Position Report " + position + " FAIL");					
					}			
				}	
			
				String birthstate = "";
				
				for (int x = 1; x<= 5; x ++)//set to 52
				{
					try 
					{
				
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
				
				WebDriverWait wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/input")).click();//Players Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[3]/td[1]/select/option[1]")).click();//Set Postions back to default
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[29]")).click();//Double-Doubles Stat Selection
				
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[4]/td[1]/select")).click();//Birthdate dropdown
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[4]/td[1]/select/option[" + x + "]")).click();//Birthdate selections
				birthstate = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[4]/td[1]/select/option[" + x + "]")).getText();
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
																													
					}
					catch(Exception ex){
																
						System.out.println("DD:Birth State Report " + birthstate + " FAIL");					
					}			
				}	
				
				String draftpick = "";
				
				for (int x = 1; x<= 5; x ++)//set to 6
				{
					try 
					{
				
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
				
				WebDriverWait wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/input")).click();//Players Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[4]/td[1]/select/option[1]")).click();//Set Birthdate back to default
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[29]")).click();//Double-Doubles Stat Selection
				
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[5]/td[1]/select")).click();//Draft pick dropdown
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[5]/td[1]/select/option[" + x + "]")).click();//Draft pick selections
				draftpick = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[5]/td[1]/select/option[" + x + "]")).getText();
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
																													
					}
					catch(Exception ex){
																
						System.out.println("DD:Draft Pick Report " + draftpick + " FAIL");					
					}			
				}
			
				String draftyear = "";
				
				for (int x = 1; x<= 5; x ++)//set to 48
				{
					try 
					{
				
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
				
				WebDriverWait wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/input")).click();//Players Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[5]/td[1]/select/option[1]")).click();//Set Draft Pick back to default
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[29]")).click();//Double-Doubles Stat Selection
				
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[6]/td[1]/select")).click();//Draft year dropdown
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[6]/td[1]/select/option[" + x + "]")).click();//Draft year selections
				draftyear = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[6]/td[1]/select/option[" + x + "]")).getText();
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
																													
					}
					catch(Exception ex){
																
						System.out.println("DD:Draft Year Report " + draftyear + " FAIL");					
					}			
				}			
				
				String conference = "";
				
				for (int x = 1; x<= 5; x ++)//set to 3
				{
					try 
					{
				
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
				
				WebDriverWait wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/input")).click();//Players Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[6]/td[1]/select/option[1]")).click();//Set Draft year back to default
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[29]")).click();//Double-Doubles Stat Selection
				
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/select")).click();//Conference dropdown
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/select/option[" + x + "]")).click();//Conference selections
				conference = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/select/option[" + x + "]")).getText();
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
																													
					}
					catch(Exception ex){
																
						System.out.println("DD:Conference Report " + conference + " FAIL");					
					}			
				}		
				String playerstatus = "";
				
				for (int x = 1; x<= 5; x ++)//set to 35
				{
					try 
					{
				
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
				
				WebDriverWait wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/input")).click();//Players Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/select/option[1]")).click();//Set Conference back to default
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[29]")).click();//Double-Doubles Stat Selection
				
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/select")).click();//Player status dropdown
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/select/option[" + x + "]")).click();//Player status selections
				playerstatus = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/select/option[" + x + "]")).getText();
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
																													
					}
					catch(Exception ex){
																
						System.out.println("DD:Player Status Report " + playerstatus + " FAIL");					
					}			
				}	
				
				String birthcountry = "";
				
				for (int x = 1; x<= 5; x ++)//set to 91
				{
					try 
					{
				
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
				
				WebDriverWait wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/input")).click();//Players Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/select/option[1]")).click();//Set Player status back to default
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[29]")).click();//Double-Doubles Stat Selection
				
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/select")).click();//Birth country dropdown
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/select/option[" + x + "]")).click();//Birth country selections
				birthcountry = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/select/option[" + x + "]")).getText();
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
																													
					}
					catch(Exception ex){
																
						System.out.println("DD:Birth Country Report " + birthcountry + " FAIL");					
					}			
				}
				
				String college = "";
				
				for (int x = 1; x<= 5; x ++)//set to 499
				{
					try 
					{
				
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
				
				WebDriverWait wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/input")).click();//Players Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/select/option[1]")).click();//Set Birth Country back to default
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[29]")).click();//Double-Doubles Stat Selection
				
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/select")).click();//College dropdown
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/select/option[" + x + "]")).click();//College selections
				college = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/select/option[" + x + "]")).getText();
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
																													
					}
					catch(Exception ex){
																
						System.out.println("DD:College Report " + college + " FAIL");					
					}			
				}			
				
				String rookiestatus = "";
				
				for (int x = 1; x<= 5; x ++)//set to 3
				{
					try 
					{
				
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
				
				WebDriverWait wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/input")).click();//Players Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/select/option[1]")).click();//Set College back to default
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[29]")).click();//Double-Doubles Stat Selection
				
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[5]/td[2]/select")).click();//Rookie Status dropdown
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[5]/td[2]/select/option[" + x + "]")).click();//College selections
				rookiestatus = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[5]/td[2]/select/option[" + x + "]")).getText();
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
																													
					}
					catch(Exception ex){
																
						System.out.println("DD:Rookie Status Report " + rookiestatus + " FAIL");					
					}			
				}
				String height = "";
				
				for (int x = 1; x<= 5; x ++)//set to 27
				{
					try 
					{
				
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
				
				WebDriverWait wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/input")).click();//Players Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[5]/td[2]/select/option[1]")).click();//Set Rookie Status back to default
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[29]")).click();//Double-Doubles Stat Selection
				
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[6]/td[2]/select")).click();//Height dropdown
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[6]/td[2]/select/option[" + x + "]")).click();//Height selections
				height = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[4]/td/table/tbody/tr[6]/td[2]/select/option[" + x + "]")).getText();
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
																													
					}
					catch(Exception ex){
																
						System.out.println("DD:Height Report " + height + " FAIL");					
					}			
				}
				
				
			}

			@Then("^All time spans for Double-Doubles can be selected$")
			public void all_time_spans_for_Double_Doubles_can_be_selected() throws Throwable {
				//Loops through X number of single seasons
				
				String season = "";
				WebDriverWait wait = new WebDriverWait(driver, 1);
				for (int x = 1; x<= 5; x ++)//set to 70
				{
					try 
					{
				
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
				
				wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/input")).click();//Players Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[29]")).click();//Double-Doubles Stat Selection
				
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[1]")).click();//Single Season Dropdown
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[1]/option[" + x + "]")).click();//Season selections
				season = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[1]/option[" + x + "]")).getText();
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
						
							}
					catch(Exception ex){
											
						
						System.out.println("DD:Player Report " + season + " FAIL");
					
								
					}
				}
				
				//Loops through X number of season ranges up to the current season
				
				for (int x = 1; x<= 5; x ++)//set to 70
				{
					try 
					{
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
				
				wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/input")).click();//Players Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[29]")).click();//Double-Doubles Stat Selection
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[2]")).click();//Season Range Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[4]/option[3]")).click();//Totals during time range selection
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[2]")).click();//Season Range Dropdown
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[2]/option[" + x + "]")).click();//Season selections
				season = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[2]/option[" + x + "]")).getText();
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
																			
						
				}
				catch(Exception ex){
										
					
					System.out.println("DD:Player Report " + season + " FAIL");
									}
				}
					
					//Date range testing
					
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
					
				wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));	
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/input")).click();//Players Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[29]")).click();//Double-Doubles Stat Selection
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[3]")).click();//Date Range Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[4]/option[2]")).click();//Totals during time range selection
				driver.findElement(By.name("d1")).sendKeys("11/1/2016");
				driver.findElement(By.name("d2")).sendKeys("12/30/2016");
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
					
				//All Time testing- Regular season
					
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
				wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));	
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/input")).click();//Players Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[29]")).click();//Double-Doubles Stat Selection
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
					
				//All Time testing- Postseason
					
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
				wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));	
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/input")).click();//Players Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[29]")).click();//Double-Doubles Stat Selection
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[2]/select/option[2]")).click();//Postseason selection
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
					
				//All Time testing- Regular+Postseason (single seasons)
					
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
				wait = new WebDriverWait(driver, 1);
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/input")).click();//Players Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[29]")).click();//Double-Doubles Stat Selection
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[2]/select/option[3]")).click();//Reg+Post selection
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
					
				//All Time testing- Regular+Postseason (totals during time range)
					
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
				wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));	
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/input")).click();//Players Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[29]")).click();//Double-Doubles Stat Selection
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[2]/select/option[3]")).click();//Reg+Post selection
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/select[4]/option[3]")).click();//Totals during time range selection
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
					
					
				//All Time testing- Regular+Postseason (loop through splits)
	
				String AllTimeSplit = "";
				wait = new WebDriverWait(driver, 1);
				for (int i= 1; i<= 5; i ++)//set to 135
				{
					try 
					{
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/input")).click();//Players Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[29]")).click();//Double-Doubles Stat Selection
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[6]")).click();//All Time Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[2]/select/option[3]")).click();//Reg+Post selection
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/select/option[" + i + "]")).click();//loop though split Selections
				AllTimeSplit = driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/select/option[" + i + "]")).getText();
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
														
						}
					catch(Exception ex){
												
							
					System.out.println("All-Time Split " + AllTimeSplit + " FAIL");
														
									  }	
				}
							
			}

			@Then("^Custom filters for Double-Doubles can be selected$")
			public void custom_filters_for_Double_Doubles_can_be_selected() throws Throwable {
			
			//Loop through all Customer Filter Statistic selections
			String filter = "";
			WebDriverWait wait = new WebDriverWait(driver, 1);					
				for (int x = 1; x<= 5; x ++)//set to 81
						{
						try 
							{
						
			driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
			driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Advanced search selection
						
			wait = new WebDriverWait(driver, 1);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Search > table:nth-child(1) > tbody > tr:nth-child(5) > td")));
			driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/input")).click();//Players Radio Button
			driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select/option[29]")).click();//Double-Doubles Stat Selection
			driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[6]/td/table/tbody/tr/td[1]/input[1]")).click();//Single Season Radio Button
			driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form[3]/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/select")).click();//Custom Filter Stat Dropdown
			driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form[3]/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/select/option[" + x + "]")).click();//CF stat selections
			filter = driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form[3]/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/select/option[" + x + "]")).getText();
			driver.findElement(By.name("filternum")).sendKeys("0");//enter value of '0' for all loops
			driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/form[3]/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr/td[1]/fieldset/input[1]")).click();//Add Filter Button
			driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[3]")).click();//Generate Report Button
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(3) > td:nth-child(2) > a")));
															
										
					}
			catch(Exception ex){
											
						
				System.out.println("Customer Filter " + filter + " FAIL");
					}
				
				//logout of system
				if (x == 5)
				{
				driver.findElement(By.xpath("//*[@id='Image6']")).click();
									//driver.close();
				}
				else
				{
				}
								}		
				
			}

			@When("^Triple-Doubles is selected as a statistic$")
			public void triple_Doubles_is_selected_as_a_statistic() throws Throwable {
			   
				
				
			}

			@Then("^All splits for Triple-Doubles can be selected$")
			public void all_splits_for_Triple_Doubles_can_be_selected() throws Throwable {
			  
				
				
			}

			@Then("^All participant types for Triple-Doubles can be selected$")
			public void all_participant_types_for_Triple_Doubles_can_be_selected() throws Throwable {
			  
				
				
			}

			@Then("^All time spans for Triple-Doubles can be selected$")
			public void all_time_spans_for_Triple_Doubles_can_be_selected() throws Throwable {
			  
				
				
			}

			@Then("^Custom filters for Triple-Doubles can be selected$")
			public void custom_filters_for_Triple_Doubles_can_be_selected() throws Throwable {
			    	
					
								
					
			}		
					
					
					
					
					
					
					
					
						
					
					
					
				
									

			
											
}
			
			
			
