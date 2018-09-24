package spassMLB_stepDefinitions;

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


public class spassMLB_TestDefinitions {

	WebDriver driver;
	
			@Given("^Start Statspass application and login$")
			public void start_Statspass_application_and_login() throws Throwable {
				
				System.setProperty("webdriver.chrome.driver", "c:/chromedriver/chromedriver.exe");
				
			    driver = new ChromeDriver();
				driver.manage().window().maximize();
				//driver.get("http://statspass01:8393/");
				driver.get("http://statspass.com");
				WebDriverWait wait = new WebDriverWait(driver, 15);
				driver.findElement(By.name("txtUsername")).sendKeys("comm1");
				driver.findElement(By.name("txtPassword")).sendKeys("access");
				driver.findElement(By.cssSelector("body > p:nth-child(4) > table:nth-child(2) > tbody > tr > td:nth-child(2) > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type='submit']")).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(4) > table:nth-child(1) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")));
			}
	
			@Given("^the MLB module is open$")
			public void the_MLB_module_is_open() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);

				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(4) > table:nth-child(1) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")));
				//driver.findElement(By.xpath("//*[@id='Image1']")).click(); 
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(4) > table:nth-child(1) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")));
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/a")).click();  
				
			}
			
			@When("^a current player is selected with all links$")
			public void a_current_player_is_selected_with_all_links() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("//*[@id='oCMenu_top4']")).click();//MLB Players section selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Current players selection
				
				wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(2) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/table[3]/tbody/tr/td/font/a[12]")).click();//Tim Adleman selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(1) > tbody > tr:nth-child(2) > td:nth-child(2) > table:nth-child(4) > tbody > tr > td > a:nth-child(1)")));
				
				if(driver.getPageSource().contains("Adleman"));
				
				else
				{
					System.out.println("Current Player Selection Test FAIL");
				
				}
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr[2]/td[2]/table[3]/tbody/tr/td/a")).click();//Fielding Link
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(1) > tbody > tr:nth-child(2) > td:nth-child(2) > table:nth-child(1) > tbody > tr > td > table > tbody > tr > td.data > table > tbody > tr > td > input:nth-child(1)")));
				
				if(driver.getPageSource().contains("Adleman"));
				
				else
				{
					System.out.println("Fielding Link Test FAIL");
				
				}
				
				driver.findElement(By.xpath("//*[@id='oCMenu_top4']")).click();//MLB Players section selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Current players selection
				
				wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(2) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/table[3]/tbody/tr/td/font/a[12]")).click();//Tim Adleman selection
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(1) > tbody > tr:nth-child(2) > td:nth-child(2) > table:nth-child(4) > tbody > tr > td > a:nth-child(1)")));
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr[2]/td[2]/table[3]/tbody/tr/td/a[1]")).click();//Batting Link
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#bat > tbody > tr:nth-child(1) > td > b")));
				
				if(driver.getPageSource().contains("Adleman"));
				
				else
				{
					System.out.println("Batting Link Test FAIL");
				
				}			
				
				driver.findElement(By.xpath("//*[@id='oCMenu_top4']")).click();//MLB Players section selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Current players selection
				
				wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(2) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/table[3]/tbody/tr/td/font/a[12]")).click();//Tim Adleman selection
							
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(1) > tbody > tr:nth-child(2) > td:nth-child(2) > table:nth-child(4) > tbody > tr > td > a:nth-child(1)")));
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr[2]/td[2]/table[2]/tbody/tr/td[2]/a")).click();//Game Logs Link
				
				if(driver.getPageSource().contains("Adleman"));
				
				else
				{
					System.out.println("Game Logs Link Test FAIL");
				
				}
				
				
			}
				
															
			
			@When("^a historical player is selected$")
			public void a_historical_player_is_selected() throws Throwable {				
				
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("//*[@id='oCMenu_top4']")).click();//MLB Players section selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats2']")).click();//Historical players selection
				
				wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(2) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr:nth-child(1) > td")));
																																	
				driver.findElement(By.xpath("//*[@id='Last_name']/table/tbody/tr[2]/td/a[18]")).click();//'R' Link selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(2) > tbody > tr > td:nth-child(2) > table:nth-child(1) > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/table[2]/tbody/tr/td/font/a[8]")).click();//'Charlie Rabe' selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr > td > table > tbody > tr > td.data > table > tbody > tr > td > input:nth-child(1)")));
											
				
				if(driver.getPageSource().contains("Rabe"));
				
				else
				{
					System.out.println("Historical Player Test FAIL");
				
				}
					
				}
					
			
			@When("^a hall of fame player is selected$")
			public void a_hall_of_fame_player_is_selected() throws Throwable {
								
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("//*[@id='oCMenu_top4']")).click();//MLB Players section selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats3']")).click();//Hall of Fame players selection
				
				
				wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(1) > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/font/a[13]")).click();//'Lou Gehrig' Link selection								
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#bat > tbody > tr:nth-child(1) > td")));
								 
					if(driver.getPageSource().contains("Gehrig"));
					
					else
					{
						System.out.println("HOF Player Test FAIL");
					
					}
																
					}
											
						
			@When("^a player from the awards page is selected$")
			public void a_player_from_the_awards_page_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("//*[@id='oCMenu_top4']")).click();//MLB Players section selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats4']")).click();//Hall of Fame players selection
				
				wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table > tbody > tr > td:nth-child(2) > table:nth-child(1) > tbody > tr:nth-child(1) > td.title")));
				driver.findElement(By.xpath("/html/body/p[3]/table/tbody/tr/td[2]/table[5]/tbody/tr[1]/td[3]/a")).click();//'Rick Porcello' Link selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(1) > tbody > tr:nth-child(2) > td:nth-child(2) > table:nth-child(1) > tbody > tr > td > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(1) > td")));
				
				if(driver.getPageSource().contains("Porcello"));
				
				else
				{
					System.out.println("Awards Player Selection Test FAIL");
				
				}
				
				driver.findElement(By.name("Image7")).click();//logout				
				driver.close();
				
			}
																		
			
			@Then("^the correct player report pages will be populated$")
			public void the_correct_player_report_pages_will_be_populated() throws Throwable {
					
			}
			
			@When("^a current team stats page is selected$")
			public void a_current_team_stats_page_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("//*[@id='oCMenu_top5']")).click();//TEAM dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Current Team selection
				wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(1) > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(1) > td")));
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/font/a[1]")).click();//'Arizona Diamondbacks' Link selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#table_a > tbody > tr:nth-child(1) > td")));
				
				if(driver.getPageSource().contains("Arizona"));
				
				else
				{
					System.out.println("Current Team Stats Test FAIL");
				
				}
															
			}
			
			
			@When("^a current team games log is selected$")
			public void a_current_team_games_log_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 25);
				
				driver.findElement(By.xpath("//*[@id='oCMenu_top5']")).click();//TEAM dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Current Team selection
				wait = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(1) > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(1) > td")));
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/font/a[2]")).click();//'Atlanta Braves' Link selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#table_a > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/table[1]/tbody/tr/td[2]/a")).click();//'Game Logs' Link selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#overall > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/table[2]/tbody/tr/td/a[1]")).click();//'Batting' Link selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#hitting > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/table[2]/tbody/tr/td/a[2]")).click();//'Pitching' Link selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pitching > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/table[2]/tbody/tr/td/a[3]")).click();//'Fielding' Link selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#fielding > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/table[2]/tbody/tr/td/a[4]")).click();//'Catching' Link selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#catching > tbody > tr:nth-child(1) > td > b")));
				
				
				if(driver.getPageSource().contains("Atlanta"));
				
				else
				{
					System.out.println("Current Team Games Log TEST FAIL");				
				}												
			}
						
			@When("^a current team splits is selected$")
			public void a_current_team_splits_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("//*[@id='oCMenu_top5']")).click();//TEAM dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Current Team selection
				wait = new WebDriverWait(driver, 1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(1) > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(1) > td")));
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/font/a[3]")).click();//'Baltimore Orioles' Link selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#table_a > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/table[1]/tbody/tr/td[3]/a")).click();//'Team Splits' Link selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#hitting > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/table[2]/tbody/tr/td/a")).click();//'Pitching' Link selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pitching > tbody > tr:nth-child(1) > td > b")));
				
				if(driver.getPageSource().contains("Orioles"));
				
				else
				{
					System.out.println("Current Team Splits TEST FAIL");				
				}
			}
			
			@When("^a current team roster is selected$")
			public void a_current_team_roster_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("//*[@id='oCMenu_top5']")).click();//TEAM dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Current Team selection
				wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(1) > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(1) > td")));
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/font/a[4]")).click();//'Boston Red Sox' Link selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#table_a > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/table[1]/tbody/tr/td[4]/a")).click();//'Roster' Link selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#roster > tbody > tr:nth-child(2) > td > b")));
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/p/table[1]/tbody/tr/td/a[1]")).click();//'Depth Chart' Link selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pit_start > tbody > tr:nth-child(2) > td > b")));
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/p/table[1]/tbody/tr/td/a[2]")).click();//'Lineups' Link selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#common > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/p[1]/table[1]/tbody/tr/td/a[3]")).click();//'Staff' Link selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#all_coach > tbody > tr:nth-child(1) > td > b")));
				
				if(driver.getPageSource().contains("Boston"));
				
				else
				{
					System.out.println("Current Team Roster TEST FAIL");				
				}
							
			}
			
			@When("^a current team trans/inj is selected$")
			public void a_current_team_trans_inj_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("//*[@id='oCMenu_top5']")).click();//TEAM dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Current Team selection
				wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(1) > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(1) > td")));
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/font/a[5]")).click();//'Chicago White Sox' Link selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#table_a > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/table[1]/tbody/tr/td[5]/a")).click();//'Trans/Injuries' Link selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#transactions > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/font/a")).click();//'Injury' Link selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#injuries > tbody > tr:nth-child(1) > td > b")));
				
				if(driver.getPageSource().contains("Chicago"));
				
				else
				{
					System.out.println("Current Team Trans/Inj TEST FAIL");				
				}
							
			}
			
			@When("^a current team historical info is selected$")
			public void a_current_team_historical_info_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("//*[@id='oCMenu_top5']")).click();//TEAM dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Current Team selection
				wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(1) > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(1) > td")));
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/font/a[6]")).click();//'Chicago Cubs' Link selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#table_a > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/table[1]/tbody/tr/td[6]/a")).click();//'Historical' Link selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(1) > tbody > tr > td:nth-child(2) > table.tablemain > tbody > tr:nth-child(1) > td > b")));
				
				if(driver.getPageSource().contains("Cubs"));
				
				else
				{
					System.out.println("Current Team Historical Info TEST FAIL");				
				}			
				
			}
			
			@When("^a current team pitching trends is selected$")
			public void a_current_team_pitching_trends_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("//*[@id='oCMenu_top5']")).click();//TEAM dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Current Team selection
				wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(1) > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(1) > td")));
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/font/a[7]")).click();//'Cincinnati Reds' Link selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#table_a > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[2]/table[1]/tbody/tr/td[7]/a")).click();//'Pitch Trends' Link selection
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#trends > table > tbody > tr > td:nth-child(1) > select:nth-child(1)")));
				
				driver.findElement(By.xpath("//*[@id='trends']/table/tbody/tr/td[1]/select[2]")).click();//Season Selection Dropdown
				driver.findElement(By.xpath("//*[@id='trends']/table/tbody/tr/td[1]/select[2]/option[2]")).click();//Season Selection 
				driver.findElement(By.xpath("//*[@id='trends']/table/tbody/tr/td[2]/input")).click();//Click Submit button
				
				
				if(driver.getPageSource().contains("Reds"));
				
				else
				{
					System.out.println("Current Team Pitching Trends TEST FAIL");				
				}			
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/a")).click(); 	
				driver.findElement(By.name("Image7")).click();
				driver.close();
				
			}
			
			@Then("^the correct team report pages will be populated$")
			public void the_correct_team_report_pages_will_be_populated() throws Throwable {
	 
	}	
	
			@When("^a player batting leaders stat is selected$")
			public void a_player_batting_leaders_stat_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Season Leaders selection
				
				wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(2) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr:nth-child(1) > td")));
				
				driver.findElement(By.xpath("//*[@id='Batting']/table/tbody/tr/td[4]/input")).click();//Click submit button for default Batting Leaders report
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("//*[@id='results']/tbody/tr[5]/td[2]/a")).click();//Click 'George Springer' link
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#bat > tbody > tr:nth-child(1) > td > b")));
				if(driver.getPageSource().contains("Springer"));			
				else
				{
					System.out.println("Batting Leaders TEST FAIL");				
				}			
				driver.findElement(By.xpath("//*[@id='Image1']")).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(4) > table:nth-child(1) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")));
	
			}
			    
		
			@When("^a player batting leaders split is selected$")
			public void a_player_batting_leaders_split_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/a")).click(); //MLB Module 
				
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Season Leaders selection
				
				wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(2) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr:nth-child(1) > td")));
				
				driver.findElement(By.xpath("//*[@id='Batting']/table/tbody/tr/td[3]/select/option[2]")).click();//Click 'vs Lefthanders' split
				driver.findElement(By.xpath("//*[@id='Batting']/table/tbody/tr/td[4]/input")).click();//Click submit button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("//*[@id='results']/tbody/tr[9]/td[2]/a")).click();//Click 'Jesus Aguilar' link
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#bat > tbody > tr:nth-child(1) > td > b")));
				if(driver.getPageSource().contains("Aguilar"));			
				else
				{
					System.out.println("Batting Leaders Split TEST FAIL");				
				}	
				driver.findElement(By.xpath("//*[@id='Image1']")).click(); 	
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(4) > table:nth-child(1) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")));
			}

			@When("^a player batting leaders league/team is selected$")
			public void a_player_batting_leaders_league_team_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/a")).click();  //MLB Module
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Season Leaders selection
				
				wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(2) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr:nth-child(1) > td")));
				
				driver.findElement(By.xpath("//*[@id='Batting']/table/tbody/tr/td[4]/select/option[2]")).click();//Click 'American League'
				driver.findElement(By.xpath("//*[@id='Batting']/table/tbody/tr/td[4]/input")).click();//Click submit button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("//*[@id='results']/tbody/tr[6]/td[2]/a")).click();//Click 'Jose Altuve' link
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#bat > tbody > tr:nth-child(1) > td > b")));
				if(driver.getPageSource().contains("Altuve"));			
				else
				{
					System.out.println("Batting Leaders Split TEST FAIL");				
				}
				driver.findElement(By.xpath("//*[@id='Image1']")).click(); 	
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(4) > table:nth-child(1) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")));
			}
		
			@When("^a player pitching leaders stat is selected$")
			public void a_player_pitching_leaders_stat_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/a")).click(); //MLB Module
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Season Leaders selection
				wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(2) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr:nth-child(1) > td")));				
				driver.findElement(By.xpath("//*[@id='Pitching']/table/tbody/tr/td[4]/input")).click();//Click submit button for default Pitching Leaders report
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("//*[@id='results']/tbody/tr[7]/td[2]/a")).click();//Click 'Jake Arrieta' link
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pit > tbody > tr:nth-child(1) > td > b")));
				if(driver.getPageSource().contains("Arrieta"));			
				else
				{
					System.out.println("Pitching leaders stat TEST FAIL");				
				}
				driver.findElement(By.xpath("//*[@id='Image1']")).click(); 	
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(4) > table:nth-child(1) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")));
			}
			

			@When("^a player pitching  leaders split is selected$")
			public void a_player_pitching_leaders_split_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/a")).click(); //MLB Module
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Season Leaders selection
				wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(2) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("//*[@id='Pitching']/table/tbody/tr/td[3]/select/option[4]")).click();//Click 'Home'
				driver.findElement(By.xpath("//*[@id='Pitching']/table/tbody/tr/td[4]/input")).click();//Click submit button 
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("//*[@id='results']/tbody/tr[4]/td[2]/a")).click();//Click 'Jose Fernandez' link
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pit > tbody > tr:nth-child(1) > td > b")));
				if(driver.getPageSource().contains("Fernandez"));			
				else
				{
					System.out.println("Pitching leaders split TEST FAIL");				
				}
				driver.findElement(By.xpath("//*[@id='Image1']")).click(); 	
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(4) > table:nth-child(1) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")));
			
			}
			

			@When("^a player pitching  leaders league/teams is selected$")
			public void a_player_pitching_leaders_league_teams_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/a")).click(); //MLB Module
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Season Leaders selection
				wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(2) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("//*[@id='Pitching']/table/tbody/tr/td[4]/select/option[3]")).click();//Click 'National League'
				driver.findElement(By.xpath("//*[@id='Pitching']/table/tbody/tr/td[4]/input")).click();//Click submit button 
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("//*[@id='results']/tbody/tr[6]/td[2]/a")).click();//Click 'Johnny Cueto' link
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pit > tbody > tr:nth-child(1) > td > b")));
				if(driver.getPageSource().contains("Cueto"));			
				else
				{
					System.out.println("Pitching leaders league/teams TEST FAIL");				
				}
				driver.findElement(By.xpath("//*[@id='Image1']")).click(); 	
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(4) > table:nth-child(1) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")));
			}

			@When("^a player fielding leaders stat is selected$")
			public void a_player_fielding_leaders_stat_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/a")).click(); 
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Season Leaders selection
				wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(2) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("//*[@id='Fielding']/table/tbody/tr/td[4]/input")).click();//Click submit button for default Fielding Leaders report
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("//*[@id='results']/tbody/tr[5]/td[2]/a")).click();//Click 'Addison Reed' link
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pit > tbody > tr:nth-child(1) > td > b")));
				if(driver.getPageSource().contains("Reed"));			
				else
				{
					System.out.println("Current fielding leaders stats TEST FAIL");				
				}
				driver.findElement(By.xpath("//*[@id='Image1']")).click(); 	
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(4) > table:nth-child(1) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")));	
			
			
			}
			
			@When("^a player fielding  leaders split is selected$")
			public void a_player_fielding_leaders_split_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/a")).click(); 
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Season Leaders selection
				wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(2) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("//*[@id='Fielding']/table/tbody/tr/td[3]/select/option[2]")).click();//As Catcher'
				driver.findElement(By.xpath("//*[@id='Fielding']/table/tbody/tr/td[4]/input")).click();//Click submit button 
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("//*[@id='results']/tbody/tr[9]/td[2]/a")).click();//Click 'Buster Posey' link
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#bat > tbody > tr:nth-child(1) > td > b")));
				if(driver.getPageSource().contains("Posey"));			
				else
				{
					System.out.println("Current fielding leaders splits TEST FAIL");				
				}
				driver.findElement(By.xpath("//*[@id='Image1']")).click(); 	
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(4) > table:nth-child(1) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")));	
			}	
			

			@When("^a player fielding  leaders league/teams is selected$")
			public void a_player_fielding_leaders_league_teams_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/a")).click(); 
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Season Leaders selection
				wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(2) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("//*[@id='Fielding']/table/tbody/tr/td[4]/select/option[4]")).click();//Select Ari(NL)'
				driver.findElement(By.xpath("//*[@id='Fielding']/table/tbody/tr/td[4]/input")).click();//Click submit button 
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("//*[@id='results']/tbody/tr[9]/td[2]/a")).click();//Click 'Brad Ziegler' link
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pit > tbody > tr:nth-child(1) > td > b")));
				if(driver.getPageSource().contains("Ziegler"));			
				else
				{
					System.out.println("Current fielding leaders splits TEST FAIL");				
				}
				driver.findElement(By.xpath("//*[@id='Image1']")).click(); 	
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(4) > table:nth-child(1) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")));	
			
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/a")).click(); 	
				driver.findElement(By.name("Image7")).click();
				driver.close();
			
			}	
		

			@Then("^the correct player leaders pages will be populate$")
			public void the_correct_player_leaders_pages_will_be_populate() throws Throwable {
			   
				
				
			}
			@When("^a team batting leaders stat is selected$")
			public void a_team_batting_leaders_stat_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Season Leaders selection
				
				wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(2) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr:nth-child(1) > td")));
				
				driver.findElement(By.xpath("//*[@id='tmBatting']/table/tbody/tr/td[4]/input")).click();//Click submit button for default Team Batting Leaders report
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("//*[@id='results']/tbody/tr[6]/td[2]/a")).click();//Click 'Chicago Cubs' link
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#table_a > tbody > tr:nth-child(1) > td")));
				if(driver.getPageSource().contains("Cubs"));			
				else
				{
					System.out.println("Team Batting Leaders TEST FAIL");				
				}			
				driver.findElement(By.xpath("//*[@id='Image1']")).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(4) > table:nth-child(1) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")));
	
			}

			@When("^a team batting leaders split is selected$")
			public void a_team_batting_leaders_split_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/a")).click(); //MLB Module
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Season Leaders selection
				wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(2) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("//*[@id='tmBatting']/table/tbody/tr/td[3]/select/option[5]")).click();//Click 'on Road'
				driver.findElement(By.xpath("//*[@id='tmBatting']/table/tbody/tr/td[4]/input")).click();//Click submit button 
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("//*[@id='results']/tbody/tr[11]/td[2]/a")).click();//Click 'Houston Astros' link
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#table_a > tbody > tr:nth-child(1) > td")));
				if(driver.getPageSource().contains("Astros"));			
				else
				{
					System.out.println("Team Batting Leaders split TEST FAIL");				
				}
				driver.findElement(By.xpath("//*[@id='Image1']")).click(); 	
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(4) > table:nth-child(1) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")));
				
			}

			@When("^a team batting leaders league/team is selected$")
			public void a_team_batting_leaders_league_team_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/a")).click(); //MLB Module
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Season Leaders selection
				wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(2) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("//*[@id='tmBatting']/table/tbody/tr/td[4]/select/option[3]")).click();//Click 'National League'
				driver.findElement(By.xpath("//*[@id='tmBatting']/table/tbody/tr/td[4]/input")).click();//Click submit button 
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("//*[@id='results']/tbody/tr[11]/td[2]/a")).click();//Click 'Houston Astros' link
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#table_a > tbody > tr:nth-child(1) > td")));
				if(driver.getPageSource().contains("Astros"));			
				else
				{
					System.out.println("Team Batting Leaders league/team TEST FAIL");				
				}
				driver.findElement(By.xpath("//*[@id='Image1']")).click(); 	
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(4) > table:nth-child(1) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")));
			
			}

			@When("^a team pitching leaders stat is selected$")
			public void a_team_pitching_leaders_stat_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/a")).click(); //MLB Module
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Season Leaders selection
				
				wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(2) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr:nth-child(1) > td")));
				
				driver.findElement(By.xpath("//*[@id='tmPitching']/table/tbody/tr/td[4]/input")).click();//Click submit button for default Team Pitching Leaders report
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("//*[@id='results']/tbody/tr[4]/td[2]/a")).click();//Click 'Texas Rangers' link
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#table_a > tbody > tr:nth-child(1) > td")));
				if(driver.getPageSource().contains("Rangers"));			
				else
				{
					System.out.println("Team Pitching Leaders TEST FAIL");				
				}			
				driver.findElement(By.xpath("//*[@id='Image1']")).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(4) > table:nth-child(1) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")));
				
			}

			@When("^a team pitching  leaders split is selected$")
			public void a_team_pitching_leaders_split_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/a")).click(); //MLB Module
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Season Leaders selection
				wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(2) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("//*[@id='tmPitching']/table/tbody/tr/td[3]/select/option[8]")).click();//Click 'on Grass'
				driver.findElement(By.xpath("//*[@id='tmPitching']/table/tbody/tr/td[4]/input")).click();//Click submit button 
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("//*[@id='results']/tbody/tr[11]/td[2]/a")).click();//Click 'Seattle Mariners' link
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#table_a > tbody > tr:nth-child(1) > td")));
				if(driver.getPageSource().contains("Seattle"));			
				else
				{
					System.out.println("Team Pitching Leaders split TEST FAIL");				
				}
				driver.findElement(By.xpath("//*[@id='Image1']")).click(); 	
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(4) > table:nth-child(1) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")));
			
			}

			@When("^a team pitching  leaders league/teams is selected$")
			public void a_team_pitching_leaders_league_teams_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/a")).click(); //MLB Module
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Season Leaders selection
				wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(2) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("//*[@id='tmPitching']/table/tbody/tr/td[4]/select/option[3]")).click();//Click 'National League'
				driver.findElement(By.xpath("//*[@id='tmPitching']/table/tbody/tr/td[4]/input")).click();//Click submit button 
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("//*[@id='results']/tbody/tr[11]/td[2]/a")).click();//Click 'Houston Astros' link
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#table_a > tbody > tr:nth-child(1) > td")));
				if(driver.getPageSource().contains("Astros"));			
				else
				{
					System.out.println("Team Pitching Leaders league/team TEST FAIL");				
				}
				driver.findElement(By.xpath("//*[@id='Image1']")).click(); 	
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(4) > table:nth-child(1) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")));
		
			}

			@When("^a team fielding leaders stat is selected$")
			public void a_team_fielding_leaders_stat_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/a")).click(); //MLB Module
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Season Leaders selection
				
				wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(2) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr:nth-child(1) > td")));
				
				driver.findElement(By.xpath("//*[@id='tmFielding']/table/tbody/tr/td[4]/input")).click();//Click submit button for default Team Fielding Leaders report
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("//*[@id='results']/tbody/tr[11]/td[2]/a")).click();//Click 'KC Royals' link
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#table_a > tbody > tr:nth-child(1) > td")));
				if(driver.getPageSource().contains("Royals"));			
				else
				{
					System.out.println("Team Fielding Leaders TEST FAIL");				
				}			
				driver.findElement(By.xpath("//*[@id='Image1']")).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(4) > table:nth-child(1) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")));
			
			}

			@When("^a team fielding  leaders split is selected$")
			public void a_team_fielding_leaders_split_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/a")).click(); //MLB Module
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Season Leaders selection
				wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(2) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("//*[@id='tmFielding']/table/tbody/tr/td[3]/select/option[6]")).click();//Click 'as Shortstop'
				driver.findElement(By.xpath("//*[@id='tmFielding']/table/tbody/tr/td[4]/input")).click();//Click submit button 
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("//*[@id='results']/tbody/tr[15]/td[2]/a")).click();//Click 'Minnesota Twins' link
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#table_a > tbody > tr:nth-child(1) > td")));
				if(driver.getPageSource().contains("Minnesota"));			
				else
				{
					System.out.println("Team Fielding Leaders split TEST FAIL");				
				}
				driver.findElement(By.xpath("//*[@id='Image1']")).click(); 	
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(4) > table:nth-child(1) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")));
			
			}

			@When("^a team fielding  leaders league/teams is selected$")
			public void a_team_fielding_leaders_league_teams_is_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/a")).click(); //MLB Module
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics dropdown
				driver.findElement(By.xpath("//*[@id='oCMenu_stats1']")).click();//Season Leaders selection
				wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(2) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("//*[@id='tmFielding']/table/tbody/tr/td[4]/select/option[3]")).click();//Click 'National League'
				driver.findElement(By.xpath("//*[@id='tmFielding']/table/tbody/tr/td[4]/input")).click();//Click submit button 
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("//*[@id='results']/tbody/tr[11]/td[2]/a")).click();//Click 'Houston Astros' link
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#table_a > tbody > tr:nth-child(1) > td")));
				if(driver.getPageSource().contains("Astros"));			
				else
				{
					System.out.println("Team Fielding Leaders league/team TEST FAIL");				
				}
				driver.findElement(By.xpath("//*[@id='Image1']")).click(); 	
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(4) > table:nth-child(1) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")));
				
				driver.findElement(By.xpath("/html/body/p[3]/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/a")).click(); 	
				driver.findElement(By.name("Image7")).click();
				driver.close();
				
			}

			@Then("^the correct team leaders pages will be populate$")
			public void the_correct_team_leaders_pages_will_be_populate() throws Throwable {
			    
			}

			@When("^advanced search window is opened$")
			public void advanced_search_window_is_opened() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Enter > table > tbody > tr:nth-child(1) > td.title")));
				
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats2']")).click();//Advanced search selection
			}

			@When("^Player statistics can be selected$")
			public void Player_statistics_can_be_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(4) > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(1) > td")));
			
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select[1]")).click();//Season dropdown 
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select[1]/option[2]")).click();//2016 selection 
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[10]/td/table/tbody/tr/td[1]/select/option[3]")).click();//Runs Stat Selection
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[10]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[5]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("//*[@id='results']/tbody/tr[5]/td[2]/a")).click();//Click on Josh Donaldson
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#bat > tbody > tr:nth-child(1) > td > b")));
				if(driver.getPageSource().contains("Donaldson"));			
				else
				{
					System.out.println("Adv Search-Player Batting Stats TEST FAIL");				
				}
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats2']")).click();//Advanced search selection
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(4) > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select[1]")).click();//Season dropdown 
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select[1]/option[2]")).click();//2016 selection 
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Pitching Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[10]/td/table/tbody/tr/td[1]/select/option[4]")).click();//Shut Outs Stat Selection
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[10]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[5]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("//*[@id='results']/tbody/tr[5]/td[2]/a")).click();//Click on Corey Kluber
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pit > tbody > tr:nth-child(1) > td > b")));
				if(driver.getPageSource().contains("Kluber"));			
				else
				{
					System.out.println("Adv Search-Player Pitching Stats TEST FAIL");				
				}
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats2']")).click();//Advanced search selection
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(4) > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select[1]")).click();//Season dropdown 
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select[1]/option[2]")).click();//2016 selection 
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[3]/input")).click();//Fielding Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[10]/td/table/tbody/tr/td[1]/select/option[6]")).click();//Put Outs Stat Selection
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[10]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[5]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("//*[@id='results']/tbody/tr[7]/td[2]/a")).click();//Click on Brandon Belt
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#bat > tbody > tr:nth-child(1) > td > b")));
				if(driver.getPageSource().contains("Belt"));			
				else
				{
					System.out.println("Adv Search-Player Fielding Stats TEST FAIL");				
				}
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats2']")).click();//Advanced search selection
		
			}

			@When("^Player splits can be selected$")
			public void Player_splits_can_be_selected() throws Throwable {
				WebDriverWait wait = new WebDriverWait(driver, 15);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(4) > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select[1]")).click();//Season dropdown 
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select[1]/option[2]")).click();//2016 selection 
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[10]/td/table/tbody/tr/td[2]/select/option[4]")).click();//at Home Split Selection
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[10]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[5]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("//*[@id='results']/tbody/tr[5]/td[2]/a")).click();//Click on Chris Carter		
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#bat > tbody > tr:nth-child(1) > td > b")));
				if(driver.getPageSource().contains("Carter"));			
				else
				{
					System.out.println("Adv Search-Player Batting Splits TEST FAIL");				
				}
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats2']")).click();//Advanced search selection
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(4) > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select[1]")).click();//Season dropdown 
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select[1]/option[2]")).click();//2016 selection 
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/input")).click();//Pitching Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[10]/td/table/tbody/tr/td[2]/select/option[4]")).click();//at Home Split Selection
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[10]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[5]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("//*[@id='results']/tbody/tr[13]/td[2]/a")).click();//Click on David Price		
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pit > tbody > tr:nth-child(1) > td > b")));
				if(driver.getPageSource().contains("Price"));			
				else
				{
					System.out.println("Adv Search-Player Pitching Splits TEST FAIL");				
				}
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats2']")).click();//Advanced search selection
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select[1]")).click();//Season dropdown 
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[8]/td/table/tbody/tr/td[1]/select[1]/option[2]")).click();//2016 selection 
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(19) > table:nth-child(4) > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(1) > td")));
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[3]/input")).click();//Fielding Radio Button
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[10]/td/table/tbody/tr/td[2]/select/option[2]")).click();//as Catcher Split Selection
				driver.findElement(By.xpath("//*[@id='Search']/table[1]/tbody/tr[10]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[5]")).click();//Generate Report Button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results > tbody > tr:nth-child(1) > td > b")));
				driver.findElement(By.xpath("//*[@id='results']/tbody/tr[7]/td[2]/a")).click();//Click on Russell Martin	
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#bat > tbody > tr:nth-child(1) > td > b")));
				if(driver.getPageSource().contains("Martin"));			
				else
				{
					System.out.println("Adv Search-Player Fielding Splits TEST FAIL");				
				}
				driver.findElement(By.xpath("//*[@id='oCMenu_stats']")).click();//Statistics module selection
				driver.findElement(By.xpath("//*[@id='oCMenu_stats2']")).click();//Advanced search selection
				driver.findElement(By.name("Image7")).click();
				
				
			}

			@When("^Player participant types can be selected$")
			public void Player_participant_types_can_be_selected() throws Throwable {
			    
				
				
				
				
			}

			@When("^All time spans can be selected$")
			public void all_time_spans_can_be_selected() throws Throwable {
			    
			}

			@When("^Custom filters can be selected$")
			public void custom_filters_can_be_selected() throws Throwable {
						
			}
			
			@Then("^the correct players displayed when link is clicked$")
			public void the_correct_players_displayed_when_link_is_clicked() throws Throwable {
			  
			}
			
			@When("^Percent First Pitch is selected for pitchers$")
			public void Percent_First_Pitch_is_selected_for_pitchers() throws Throwable {
				
			}
			
			@When("^Percent First Pitch is selected for teams$")
			public void Percent_First_Pitch_is_selected_for_teams() throws Throwable {
				
			}

			@Then("^the correct page is displayed with correct stat values$")
			public void the_correct_page_is_displayed_with_correct_stat_values() throws Throwable {
				
			}
			
			
}
