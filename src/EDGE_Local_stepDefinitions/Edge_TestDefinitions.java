package EDGE_Local_stepDefinitions;

import java.util.concurrent.TimeUnit;

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
	
	@Given("^Open Chrome on Windows and start Edge application$")
	public void open_Chrome_on_Windows_and_start_Edge_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver/chromedriver.exe");
		
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://edge.stats.com");
	
	}

	@When("^a valid username and password$")
	public void a_valid_username_and_password() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("gtracey@stats.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("testing123");
		driver.findElement(By.cssSelector("#btn-login")).click();
			
	}

	@When("^match viewer is clicked$")
	public void match_viewer_is_clicked() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]")));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/a[2]")).click();//click match viewer
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#root > div.navigation-bar")));
		
	}
	
	@When("^set play analysis is clicked$")
	public void set_play_analysis_is_clicked() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#root > div.navigation-bar")));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/a[3]")).click();//click set plays
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[2]/div[2]/div[2]/div/div[1]")));
	}
	
	@When("^find videos is clicked$")
	public void find_videos_is_clicked() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/a[4]")).click();//click find videos
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[1]/div[2]/div")));
	}
	
	@When("^playlists is clicked$")
	public void playlists_is_clicked() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/a[5]")).click();//click playlists
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[1]/div")));
	}
	
	@When("^downloads is clicked$")
	public void downloads_is_clicked() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/a[6]")).click();//click downnloads
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]")));
	}
	
	@When("^my account is clicked$")
	public void my_account_is_clicked() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/a[7]")).click();//click my account
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div")));
	}
	
	@When("^each competition is selected$")
	public void each_competition_is_selected() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/a[2]")));
		driver.getPageSource().contains("TEAM TO ANALYSE");
	
	String competition = "";
		
	for (int x=1; x<=3; x ++) //set to 13 for number of competitions
	
	{	
		try
		{
			driver.getPageSource().contains("TEAM TO ANALYSE");
			driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-display > span.league-dropdown-chevron")).click();
			competition=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div[2]/div[" + x + "]/div/div")).getAttribute("textContent");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div[2]/div[" + x + "]/div/div")).click(); //loop through competition selections
				
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));
			driver.getPageSource().contains("Possession");
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div/a[1]/img"));
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]"));			
	
		}
		catch (Exception ex){
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));			
			System.out.println("Competition " + competition + " FAILED to display");		
			
		}
	}	
		
	}
	
	@When("^each team is selected from EPL$")
	public void each_team_is_selected_from_EPL() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/a[2]")));
		driver.getPageSource().contains("TEAM TO ANALYSE");
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-display > span.league-dropdown-chevron")).click();
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-items.show > div:nth-child(1) > div > div")).click();
	
	String competition = "";
	String teams = "";
	
	//for (int c=1; c<=3; c ++) //set to 13 for number of competitions
	for (int t=1; t<=3; t ++) //set to 20 for number of teams
	{	
		try
		{
			driver.getPageSource().contains("TEAM TO ANALYSE");
			
			//competition=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div[2]/div[" + c + "]/div/div")).getAttribute("textContent");
			teams=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a/div[1]/div")).getAttribute("textContent");	
			driver.findElement(By.cssSelector("#root > div.main-content.team-summary-container > div.selected-team-logo-and-form > div.team-dropdown-container > div.team-dropdown-display-container > div > div.team-dropdown-display > span.team-dropdown-chevron")).click();		
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a")).click(); //loop through team selections
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a")).click(); //loop through team selections				
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));
			driver.getPageSource().contains("Possession");
			
			//*[@id="root"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a/div
			
	
		}
		catch (Exception ex){
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));			
			System.out.println("Competition " + competition + " "+ teams + " FAILED to display");
		
		
			
		}
	}	
		
	}
	
	@When("^each team is selected from Bundesliga$")
	public void each_team_is_selected_from_Bundesliga() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/a[2]")));
		driver.getPageSource().contains("TEAM TO ANALYSE");
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-display > span.league-dropdown-chevron")).click();
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-items.show > div:nth-child(3) > div > div")).click();
	
	String competition = "";
	String teams = "";
	
	//for (int c=1; c<=3; c ++) //set to 13 for number of competitions
	for (int t=1; t<=3; t ++) //set to 18 for number of teams
	{	
		try
		{
			driver.getPageSource().contains("TEAM TO ANALYSE");
			
			//competition=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div[2]/div[" + c + "]/div/div")).getAttribute("textContent");
			teams=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a/div[1]/div")).getAttribute("textContent");	
			driver.findElement(By.cssSelector("#root > div.main-content.team-summary-container > div.selected-team-logo-and-form > div.team-dropdown-container > div.team-dropdown-display-container > div > div.team-dropdown-display > span.team-dropdown-chevron")).click();		
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a")).click(); //loop through team selections
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a")).click(); //loop through team selections				
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));
			driver.getPageSource().contains("Possession");
			
			//*[@id="root"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a/div
			
	
		}
		catch (Exception ex){
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));			
			System.out.println("Competition " + competition + " "+ teams + " FAILED to display");
		
		
			
		}
	}	
		
	}
	
	@When("^each team is selected from England Championship$")
	public void each_team_is_selected_from_England_Championship() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/a[2]")));
		driver.getPageSource().contains("TEAM TO ANALYSE");
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-display > span.league-dropdown-chevron")).click();
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-items.show > div:nth-child(4) > div > div")).click();
	
	String competition = "";
	String teams = "";
	
	//for (int c=1; c<=3; c ++) //set to 13 for number of competitions
	for (int t=1; t<=3; t ++) //set to 24 for number of teams
	{	
		try
		{
			driver.getPageSource().contains("TEAM TO ANALYSE");
			
			//competition=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div[2]/div[" + c + "]/div/div")).getAttribute("textContent");
			teams=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a/div[1]/div")).getAttribute("textContent");	
			driver.findElement(By.cssSelector("#root > div.main-content.team-summary-container > div.selected-team-logo-and-form > div.team-dropdown-container > div.team-dropdown-display-container > div > div.team-dropdown-display > span.team-dropdown-chevron")).click();		
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a")).click(); //loop through team selections
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a")).click(); //loop through team selections				
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));
			driver.getPageSource().contains("Possession");
			
			//*[@id="root"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a/div
			
	
		}
		catch (Exception ex){
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));			
			System.out.println("Competition " + competition + " "+ teams + " FAILED to display");
		
		
			
		}
	}	
		
	}
	
	@When("^each team is selected from France LFP$")
	public void each_team_is_selected_from_France_LFP() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/a[2]")));
		driver.getPageSource().contains("TEAM TO ANALYSE");
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-display > span.league-dropdown-chevron")).click();
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-items.show > div:nth-child(5) > div > div")).click();
	
	String competition = "";
	String teams = "";
	
	//for (int c=1; c<=3; c ++) //set to 13 for number of competitions
	for (int t=1; t<=3; t ++) //set to 24 for number of teams
	{	
		try
		{
			driver.getPageSource().contains("TEAM TO ANALYSE");
			
			//competition=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div[2]/div[" + c + "]/div/div")).getAttribute("textContent");
			teams=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a/div[1]/div")).getAttribute("textContent");	
			driver.findElement(By.cssSelector("#root > div.main-content.team-summary-container > div.selected-team-logo-and-form > div.team-dropdown-container > div.team-dropdown-display-container > div > div.team-dropdown-display > span.team-dropdown-chevron")).click();		
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a")).click(); //loop through team selections
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a")).click(); //loop through team selections				
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));
			driver.getPageSource().contains("Possession");
			
			//*[@id="root"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a/div
			
	
		}
		catch (Exception ex){
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));			
			System.out.println("Competition " + competition + " "+ teams + " FAILED to display");
		
		
			
		}
	}	
		
	}
	
	@When("^each team is selected from UAE$")
	public void each_team_is_selected_from_UAE() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/a[2]")));
		driver.getPageSource().contains("TEAM TO ANALYSE");
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-display > span.league-dropdown-chevron")).click();
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-items.show > div:nth-child(6) > div > div")).click();
	
	String competition = "";
	String teams = "";
	
	//for (int c=1; c<=3; c ++) //set to 13 for number of competitions
	for (int t=1; t<=3; t ++) //set to 24 for number of teams
	{	
		try
		{
			driver.getPageSource().contains("TEAM TO ANALYSE");
			
			//competition=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div[2]/div[" + c + "]/div/div")).getAttribute("textContent");
			teams=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a/div[1]/div")).getAttribute("textContent");	
			driver.findElement(By.cssSelector("#root > div.main-content.team-summary-container > div.selected-team-logo-and-form > div.team-dropdown-container > div.team-dropdown-display-container > div > div.team-dropdown-display > span.team-dropdown-chevron")).click();		
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a")).click(); //loop through team selections
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a")).click(); //loop through team selections				
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));
			driver.getPageSource().contains("Possession");
			
			//*[@id="root"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a/div
			
	
		}
		catch (Exception ex){
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));			
			System.out.println("Competition " + competition + " "+ teams + " FAILED to display");
		
		
			
		}
	}	
		
	}
	
	@When("^each team is selected from Scotland$")
	public void each_team_is_selected_from_Scotland() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/a[2]")));
		driver.getPageSource().contains("TEAM TO ANALYSE");
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-display > span.league-dropdown-chevron")).click();
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-items.show > div:nth-child(7) > div > div")).click();
	
	String competition = "";
	String teams = "";
	
	//for (int c=1; c<=3; c ++) //set to 13 for number of competitions
	for (int t=1; t<=3; t ++) //set to 24 for number of teams
	{	
		try
		{
			driver.getPageSource().contains("TEAM TO ANALYSE");
			
			//competition=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div[2]/div[" + c + "]/div/div")).getAttribute("textContent");
			teams=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a/div[1]/div")).getAttribute("textContent");	
			driver.findElement(By.cssSelector("#root > div.main-content.team-summary-container > div.selected-team-logo-and-form > div.team-dropdown-container > div.team-dropdown-display-container > div > div.team-dropdown-display > span.team-dropdown-chevron")).click();		
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a")).click(); //loop through team selections
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a")).click(); //loop through team selections				
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));
			driver.getPageSource().contains("Possession");
			
			//*[@id="root"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a/div
			
	
		}
		catch (Exception ex){
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));			
			System.out.println("Competition " + competition + " "+ teams + " FAILED to display");
		
		
			
		}
	}	
		
	}
	
	@When("^each team is selected from League Two$")
	public void each_team_is_selected_from_League_Two() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/a[2]")));
		driver.getPageSource().contains("TEAM TO ANALYSE");
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-display > span.league-dropdown-chevron")).click();
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-items.show > div:nth-child(8) > div > div")).click();
	
	String competition = "";
	String teams = "";
	
	//for (int c=1; c<=3; c ++) //set to 13 for number of competitions
	for (int t=1; t<=3; t ++) //set to 24 for number of teams
	{	
		try
		{
			driver.getPageSource().contains("TEAM TO ANALYSE");
			
			//competition=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div[2]/div[" + c + "]/div/div")).getAttribute("textContent");
			teams=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a/div[1]/div")).getAttribute("textContent");	
			driver.findElement(By.cssSelector("#root > div.main-content.team-summary-container > div.selected-team-logo-and-form > div.team-dropdown-container > div.team-dropdown-display-container > div > div.team-dropdown-display > span.team-dropdown-chevron")).click();		
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a")).click(); //loop through team selections
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a")).click(); //loop through team selections				
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));
			driver.getPageSource().contains("Possession");
			
			//*[@id="root"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a/div
			
	
		}
		catch (Exception ex){
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));			
			System.out.println("Competition " + competition + " "+ teams + " FAILED to display");
		
		
			
		}
	}	
		
	}
	
	@When("^each team is selected from League One$")
	public void each_team_is_selected_from_League_One() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/a[2]")));
		driver.getPageSource().contains("TEAM TO ANALYSE");
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-display > span.league-dropdown-chevron")).click();
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-items.show > div:nth-child(9) > div > div")).click();
	
	String competition = "";
	String teams = "";
	
	//for (int c=1; c<=3; c ++) //set to 13 for number of competitions
	for (int t=1; t<=3; t ++) //set to 24 for number of teams
	{	
		try
		{
			driver.getPageSource().contains("TEAM TO ANALYSE");
			
			//competition=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div[2]/div[" + c + "]/div/div")).getAttribute("textContent");
			teams=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a/div[1]/div")).getAttribute("textContent");	
			driver.findElement(By.cssSelector("#root > div.main-content.team-summary-container > div.selected-team-logo-and-form > div.team-dropdown-container > div.team-dropdown-display-container > div > div.team-dropdown-display > span.team-dropdown-chevron")).click();		
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a")).click(); //loop through team selections
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a")).click(); //loop through team selections				
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));
			driver.getPageSource().contains("Possession");
			
			//*[@id="root"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a/div
			
	
		}
		catch (Exception ex){
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));			
			System.out.println("Competition " + competition + " "+ teams + " FAILED to display");
		
		
			
		}
	}	
		
	}
	
	@When("^each team is selected from PSL$")
	public void each_team_is_selected_from_PSL() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/a[2]")));
		driver.getPageSource().contains("TEAM TO ANALYSE");
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-display > span.league-dropdown-chevron")).click();
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-items.show > div:nth-child(10) > div > div")).click();
	
	String competition = "";
	String teams = "";
	
	//for (int c=1; c<=3; c ++) //set to 13 for number of competitions
	for (int t=1; t<=3; t ++) //set to 24 for number of teams
	{	
		try
		{
			driver.getPageSource().contains("TEAM TO ANALYSE");
			
			//competition=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div[2]/div[" + c + "]/div/div")).getAttribute("textContent");
			teams=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a/div[1]/div")).getAttribute("textContent");	
			driver.findElement(By.cssSelector("#root > div.main-content.team-summary-container > div.selected-team-logo-and-form > div.team-dropdown-container > div.team-dropdown-display-container > div > div.team-dropdown-display > span.team-dropdown-chevron")).click();		
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a")).click(); //loop through team selections
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a")).click(); //loop through team selections				
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));
			driver.getPageSource().contains("Possession");
			
			//*[@id="root"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a/div
			
	
		}
		catch (Exception ex){
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));			
			System.out.println("Competition " + competition + " "+ teams + " FAILED to display");
		
		
			
		}
	}	
		
	}
	
	@When("^each team is selected from QSL$")
	public void each_team_is_selected_from_QSL() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/a[2]")));
		driver.getPageSource().contains("TEAM TO ANALYSE");
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-display > span.league-dropdown-chevron")).click();
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-items.show > div:nth-child(11) > div > div")).click();
	
	String competition = "";
	String teams = "";
	
	//for (int c=1; c<=3; c ++) //set to 13 for number of competitions
	for (int t=1; t<=3; t ++) //set to 24 for number of teams
	{	
		try
		{
			driver.getPageSource().contains("TEAM TO ANALYSE");
			
			//competition=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div[2]/div[" + c + "]/div/div")).getAttribute("textContent");
			teams=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a/div[1]/div")).getAttribute("textContent");	
			driver.findElement(By.cssSelector("#root > div.main-content.team-summary-container > div.selected-team-logo-and-form > div.team-dropdown-container > div.team-dropdown-display-container > div > div.team-dropdown-display > span.team-dropdown-chevron")).click();		
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a")).click(); //loop through team selections
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a")).click(); //loop through team selections				
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));
			driver.getPageSource().contains("Possession");
			
			//*[@id="root"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a/div
			
	
		}
		catch (Exception ex){
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));			
			System.out.println("Competition " + competition + " "+ teams + " FAILED to display");
		
		
			
		}
	}	
		
	}
	
	@When("^each team is selected from Serie A$")
	public void each_team_is_selected_from_Serie_A() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/a[2]")));
		driver.getPageSource().contains("TEAM TO ANALYSE");
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-display > span.league-dropdown-chevron")).click();
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-items.show > div:nth-child(12) > div > div")).click();
	
	String competition = "";
	String teams = "";
	
	//for (int c=1; c<=3; c ++) //set to 13 for number of competitions
	for (int t=1; t<=3; t ++) //set to 24 for number of teams
	{	
		try
		{
			driver.getPageSource().contains("TEAM TO ANALYSE");
			
			//competition=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div[2]/div[" + c + "]/div/div")).getAttribute("textContent");
			teams=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a/div[1]/div")).getAttribute("textContent");	
			driver.findElement(By.cssSelector("#root > div.main-content.team-summary-container > div.selected-team-logo-and-form > div.team-dropdown-container > div.team-dropdown-display-container > div > div.team-dropdown-display > span.team-dropdown-chevron")).click();		
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a")).click(); //loop through team selections
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a")).click(); //loop through team selections				
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));
			driver.getPageSource().contains("Possession");
			
			//*[@id="root"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a/div
			
	
		}
		catch (Exception ex){
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));			
			System.out.println("Competition " + competition + " "+ teams + " FAILED to display");
		
		
			
		}
	}	
		
	}
	
	@When("^each team is selected from Spain LaLiga$")
	public void each_team_is_selected_from_Spain_LaLiga() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/a[2]")));
		driver.getPageSource().contains("TEAM TO ANALYSE");
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-display > span.league-dropdown-chevron")).click();
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-items.show > div:nth-child(13) > div > div")).click();
	
	String competition = "";
	String teams = "";
	
	//for (int c=1; c<=3; c ++) //set to 13 for number of competitions
	for (int t=1; t<=3; t ++) //set to 24 for number of teams
	{	
		try
		{
			driver.getPageSource().contains("TEAM TO ANALYSE");
			
			//competition=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div[2]/div[" + c + "]/div/div")).getAttribute("textContent");
			teams=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a/div[1]/div")).getAttribute("textContent");	
			driver.findElement(By.cssSelector("#root > div.main-content.team-summary-container > div.selected-team-logo-and-form > div.team-dropdown-container > div.team-dropdown-display-container > div > div.team-dropdown-display > span.team-dropdown-chevron")).click();		
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a")).click(); //loop through team selections
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a")).click(); //loop through team selections				
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));
			driver.getPageSource().contains("Possession");
			
			//*[@id="root"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a/div
			
	
		}
		catch (Exception ex){
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));			
			System.out.println("Competition " + competition + " "+ teams + " FAILED to display");
		
		
			
		}
	}	
		
	}
	
	@When("^each team is selected from Argentina$")
	public void each_team_is_selected_from_Argentina() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/a[2]")));
		driver.getPageSource().contains("TEAM TO ANALYSE");
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-display > span.league-dropdown-chevron")).click();
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-items.show > div:nth-child(14) > div > div")).click();
	
	String competition = "";
	String teams = "";
	
	//for (int c=1; c<=3; c ++) //set to 13 for number of competitions
	for (int t=1; t<=3; t ++) //set to 24 for number of teams
	{	
		try
		{
			driver.getPageSource().contains("TEAM TO ANALYSE");
			
			//competition=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div[2]/div[" + c + "]/div/div")).getAttribute("textContent");
			teams=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a/div[1]/div")).getAttribute("textContent");	
			driver.findElement(By.cssSelector("#root > div.main-content.team-summary-container > div.selected-team-logo-and-form > div.team-dropdown-container > div.team-dropdown-display-container > div > div.team-dropdown-display > span.team-dropdown-chevron")).click();		
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a")).click(); //loop through team selections
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a")).click(); //loop through team selections				
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));
			driver.getPageSource().contains("Possession");
			
			//*[@id="root"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a/div
			
	
		}
		catch (Exception ex){
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));			
			System.out.println("Competition " + competition + " "+ teams + " FAILED to display");
		
		
			
		}
	}	
		
	}
	
	@When("^each team is selected from Dutch$")
	public void each_team_is_selected_from_Dutch() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/a[2]")));
		driver.getPageSource().contains("TEAM TO ANALYSE");
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-display > span.league-dropdown-chevron")).click();
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-items.show > div:nth-child(15) > div > div")).click();
	
	String competition = "";
	String teams = "";
	
	//for (int c=1; c<=3; c ++) //set to 13 for number of competitions
	for (int t=1; t<=3; t ++) //set to 24 for number of teams
	{	
		try
		{
			driver.getPageSource().contains("TEAM TO ANALYSE");
			
			//competition=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div[2]/div[" + c + "]/div/div")).getAttribute("textContent");
			teams=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a/div[1]/div")).getAttribute("textContent");	
			driver.findElement(By.cssSelector("#root > div.main-content.team-summary-container > div.selected-team-logo-and-form > div.team-dropdown-container > div.team-dropdown-display-container > div > div.team-dropdown-display > span.team-dropdown-chevron")).click();		
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a")).click(); //loop through team selections
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a")).click(); //loop through team selections				
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));
			driver.getPageSource().contains("Possession");
			
			//*[@id="root"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a/div
			
	
		}
		catch (Exception ex){
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));			
			System.out.println("Competition " + competition + " "+ teams + " FAILED to display");
		
		
			
		}
	}	
		
	}
	
	@When("^each team is selected from Belgium$")
	public void each_team_is_selected_from_Belgium() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/a[2]")));
		driver.getPageSource().contains("TEAM TO ANALYSE");
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-display > span.league-dropdown-chevron")).click();
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-items.show > div:nth-child(16) > div > div")).click();
	
	String competition = "";
	String teams = "";
	
	//for (int c=1; c<=3; c ++) //set to 13 for number of competitions
	for (int t=1; t<=3; t ++) //set to 24 for number of teams
	{	
		try
		{
			driver.getPageSource().contains("TEAM TO ANALYSE");
			
			//competition=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div[2]/div[" + c + "]/div/div")).getAttribute("textContent");
			teams=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a/div[1]/div")).getAttribute("textContent");	
			driver.findElement(By.cssSelector("#root > div.main-content.team-summary-container > div.selected-team-logo-and-form > div.team-dropdown-container > div.team-dropdown-display-container > div > div.team-dropdown-display > span.team-dropdown-chevron")).click();		
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a")).click(); //loop through team selections
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a")).click(); //loop through team selections				
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));
			driver.getPageSource().contains("Possession");
			
			//*[@id="root"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a/div
			
	
		}
		catch (Exception ex){
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));			
			System.out.println("Competition " + competition + " "+ teams + " FAILED to display");
		
		
			
		}
	}	
		
	}
	
	@When("^each team is selected from World Cup$")
	public void each_team_is_selected_from_World_Cup() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/a[2]")));
		driver.getPageSource().contains("TEAM TO ANALYSE");
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-display > span.league-dropdown-chevron")).click();
		driver.findElement(By.cssSelector("#root > div.navigation-bar > div.competition-menu > div.league-dropdown-display-container > div > div.league-dropdown-items.show > div:nth-child(17) > div > div")).click();
	
	String competition = "";
	String teams = "";
	
	//for (int c=1; c<=3; c ++) //set to 13 for number of competitions
	for (int t=1; t<=3; t ++) //set to 24 for number of teams
	{	
		try
		{
			driver.getPageSource().contains("TEAM TO ANALYSE");
			
			//competition=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div[2]/div[" + c + "]/div/div")).getAttribute("textContent");
			teams=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a/div[1]/div")).getAttribute("textContent");	
			driver.findElement(By.cssSelector("#root > div.main-content.team-summary-container > div.selected-team-logo-and-form > div.team-dropdown-container > div.team-dropdown-display-container > div > div.team-dropdown-display > span.team-dropdown-chevron")).click();		
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[" + t + "]/a")).click(); //loop through team selections
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a")).click(); //loop through team selections				
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));
			driver.getPageSource().contains("Possession");
			
			//*[@id="root"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[5]/a/div
			
	
		}
		catch (Exception ex){
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[3]/div[1]/div/div[1]")));			
			System.out.println("Competition " + competition + " "+ teams + " FAILED to display");
		
		
			
		}
	}	
		
	}
	
	@Then("^the selected team data will be displayed$")
	public void the_selected_team_data_will_be_displayed() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[2]")));
	}
	
	@Then("^the default team for the selected competition will be displayed$")
	public void the_default_team_for_the_selected_competition_will_be_displayed() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/div[2]")));
	}
	
		
	@Then("^each page will be displayed with data$")
	public void each_page_will_be_displayed_with_data() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]")));
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