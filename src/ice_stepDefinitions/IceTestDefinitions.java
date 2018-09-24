package ice_stepDefinitions;

import java.util.concurrent.TimeUnit;
//import org.apache.jasper.tagplugins.jstl.core.Set;
//import org.openqa.jetty.html.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class IceTestDefinitions




{
	//WebDriver driver;
		WebDriver driver;
		 public static final String xVersionNumber = "8";
		 private static final String connection_user = "oraconnect";
		 private static final String connection_passwd = "letme1n2";

		public static Connection conn;    // dbase connection
		public void getConn() {
		}
		int xconn = 2;		
		int xprod = 2;		
		String selstmt = "";
		Statement stmt;
		ResultSet rset;
		
		String xusername = "oraconnect";
		String xpassword = "letme1n2";
		String xservice = "stagerac";
		String xin = "10.241.5.83";
		String xout = "stagerac-cluster.stats.com"; //209.116.117.153
		String xvpn = "10.241.5.83";
		String xovh = "51.254.42.44";
		String xovhservice = "pzinteg";
		String xuatrac = "uatrac-cluster.stats.com";
		
		String idname = "";
		String xcnt_string = "";
		
		
	@Given("^Oracle database connection is made$")
	public void oracle_database_connection_is_made() throws Throwable {
		{
						
		xcnt_string = "jdbc:oracle:thin:@stagerac-cluster.stats.com:1521/stagerac.stats.com";	//" + xout + ":1521:" + xservice + _N1"
					
		      try 
		   {
		   
		      // Load the JDBC driver
		      String driverName = "oracle.jdbc.driver.OracleDriver";
		      Class.forName(driverName);

		       // Create a connection to the database
		         conn = DriverManager.getConnection(xcnt_string, xusername, xpassword);
		      }
		      
		       catch (ClassNotFoundException e) 
		    {
		     System.out.println("Class not found from database" );
		      e.printStackTrace();
		    } 
		    catch (SQLException e1) 
		    {
		     System.out.println("ORACLE Connection error " );
		      e1.printStackTrace();
		    }	
		}
	}
		   		
	    		    
		    
		    //oracleconnect sc = new oracleconnect(xcnt_string,
		      //      connection_user,
		        //    connection_passwd);
		    //conn = sc.getConnection();
		    

	@When("^proper setup and credetials are set$")
	public void proper_setup_and_credetials_are_set() throws Throwable {
		
	}				

	@Then("^the database can be queried$")
	public void the_database_can_be_queried() throws Throwable {
		String selstmt = "";
		Statement stmt;
		ResultSet rset = null;
		
		
		if (!(conn == null)) {
		      try {
		        stmt = conn.createStatement();
		        selstmt = "select split_number,optical_games_played from commercial.bk_opt_player_ytd_general where league_id = 1 and season_id = 201601 and team_id = 9 and player_id = 57934";
								        
		        
		       rset = stmt.executeQuery(selstmt);}
		       
		        catch(SQLException e1)
		        {
		         System.out.println("Query Execution Error" );
		      e1.printStackTrace();
		        }	   
		    	    
	              
	           DBTablePrinter.printResultSet(rset);
		      
		      }
		          
		}      
		

	
	@Given("^Open Chrome and start ICE QA application$")
	public void open_Chrome_and_start_ICE_QA_application() throws Throwable {
	  
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://push-bk.ice.stats.com");
		//driver.get("https://qa-bk2.ice.stats.com");
		//driver.findElement(By.name("ctl00$ContentPlaceHolder1$txt_username")).sendKeys("gtracey");
	}

	@Given("^Open Chrome and start ICE Dev application$")
	public void open_Chrome_and_start_ICE_Dev_application() throws Throwable {
	  
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://push-bk.ice.stats.com");
		driver.get("https://dev-bk.ice.stats.com/Login.aspx");
		//driver.findElement(By.name("ctl00$ContentPlaceHolder1$txt_username")).sendKeys("gtracey");
	}
	
	
	@When("^a valid username and password$")
	public void a_valid_username_and_password() throws Throwable {
		
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txt_username")).sendKeys("gtracey");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txt_password")).sendKeys("S123");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$login_btn")).click();
		
	}

	@Then("^user should be able to login and logout successfully$")
	public void user_should_be_able_to_login_and_logout_successfully() throws Throwable {
		
		driver.findElement(By.id("ctl00_ctl00_lblFullName")).click();
		driver.findElement(By.id("aSignOut")).click();
		driver.close();
	}	
	

	@Given("^Ice application is open$")
	public void ice_application_is_open() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://push-bk.ice.stats.com");
		//driver.get("https://qa-bk2.ice.stats.com");
	}

	@When("^a user signs in with admin ID$")
	public void a_user_signs_out_of_the_system() throws Throwable {
		
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txt_username")).sendKeys("Statsadminmin");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txt_password")).sendKeys("BasKetBall16");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$login_btn")).click();
					
	}

	
	@Then("^user should be able to login successfully$")
	public void the_application_closes() throws Throwable {
		driver.getPageSource().contains("Minnesota Timberwolves");
		driver.close();	
	}
		
	@Given("^Ice video module is open$")
	public void ice_video_module_is_open() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa-bk2.ice.stats.com");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txt_username")).sendKeys("gtracey");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txt_password")).sendKeys("stern123");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$login_btn")).click();
		driver.findElement(By.id("aVideo")).click();
					
	}
	
	@When("^a team and player YTD is selected$")
	public void a_team_and_player_YTD_is_selected() throws Throwable {
		driver.findElement(By.id("ddlTeams1")).click();
		driver.findElement(By.cssSelector("#ddlTeams1 > div > li > ol > li:nth-child(2)")).click();//team Selection
		driver.findElement(By.id("ddlPlayers1")).click();
		driver.findElement(By.cssSelector("#ddlPlayers1 > div > li > ol > li:nth-child(13)")).click();//player selection
		driver.findElement(By.id("ddlGameSeason")).click();
		driver.findElement(By.cssSelector("#ddlGameSeason > div > li > ol > li:nth-child(2)")).click();//YTD selection
		
	}
	
	@When("^premium>shot defense category is selected$")
	public void premium_shot_defense_category_is_selected() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#divEventList > div.large-12 > table > thead > tr.headerRow.grpevents-toggle > th > div:nth-child(2)")));
		
		
		driver.findElement(By.cssSelector("#divEventList > div.large-12 > table > thead > tr.headerRow.grpevents-toggle > th > div:nth-child(2)")).click();
		//Select premium option
		driver.findElement(By.xpath("//*[@id='ctl01_rptEvents_ctl03_rptEvents_ctl00_lblHasChild']")).click();
		//Select FGA Defense
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='divEventList']/div[2]/table/tbody/tr[20]/td/span[2]/input")));
		
		driver.findElement(By.xpath("//*[@id='divEventList']/div[2]/table/tbody/tr[20]/td/span[2]/input")).click();
		
	
		
	}

	@Then("^the FGA event should be available to select$")
	public void the_FGA_event_should_be_available_to_select() throws Throwable {
			driver.getPageSource().contains("FGA Defense");
		
	
	}	

			
	@Then("^the FGM event should be available to select$")
	public void the_FGM_event_should_be_available_to_select() throws Throwable {
		driver.getPageSource().contains("FGM Defense");
		driver.close();
	
		
		
	}
		
	private void driverclose() {
		// TODO Auto-generated method stub
		
	}

	private WebDriver ChromeDriver() {
		// TODO Auto-generated method stub
		return null;
	}

	@When("^the FGA Defense events are selected$")
	public void the_FGA_Defense_events_are_selected() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#divEventList > div.large-12 > table > thead > tr.headerRow.grpevents-toggle > th > div:nth-child(2)")));
		
		
		driver.findElement(By.cssSelector("#divEventList > div.large-12 > table > thead > tr.headerRow.grpevents-toggle > th > div:nth-child(2)")).click();
		//Select premium option
		driver.findElement(By.xpath("//*[@id='ctl01_rptEvents_ctl03_rptEvents_ctl00_lblHasChild']")).click();
		//Select FGA Defense
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='divEventList']/div[2]/table/tbody/tr[20]/td/span[2]/input")));
		
		driver.findElement(By.xpath("//*[@id='divEventList']/div[2]/table/tbody/tr[20]/td/span[2]/input")).click();
		
		
		
		}

	@When("^the FGM Defense events are selected$")
	public void the_FGM_Defense_events_are_selected() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='video']")));
		
		driver.findElement(By.xpath("//*[@id='ctl01_rptEvents_ctl03_rptEvents_ctl01_lblHasChild']")).click();
		//Select FGM Defense
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='divEventList']/div[2]/table/tbody/tr[21]/td/span/input")));
		
		driver.findElement(By.xpath("//*[@id='divEventList']/div[2]/table/tbody/tr[21]/td/span/input")).click();
		
	
		
		}

	@Then("^the video clips play$")
	public void the_video_clips_play() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='video']")));
		
			
		driver.getPageSource().contains("FGM Defense");
		//driver.close();
}

	@Given("^the Report Builder module is opened$")
	public void the_Report_Builder_module_is_opened() throws Throwable {				
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();		
		WebDriverWait wait = new WebDriverWait(driver, 15); 
		driver.manage().window().maximize();
		driver.get("https://push-bk.ice.stats.com");
		//driver.get("http://qa-bk2.ice.stats.com/Leaders.aspx");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txt_username")).sendKeys("gtracey");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txt_password")).sendKeys("S123");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$login_btn")).click();
		//driver.get("https://qa-bk2.ice.stats.com/ReportBuilder.aspx");
		driver.get("https://push-bk.ice.stats.com/ReportBuilder.aspx");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ctl00_ctl00_ContentPlaceHolder1_dynamicModules > li:nth-child(10) > label")));

	}
	
	@Given("^a report is created in Report Builder$")
	public void a_report_is_created_in_Report_Builder() throws Throwable {
				
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CreateReportHeaderPanel']/div[1]/div/span")));			
		driver.findElement(By.xpath("//*[@id='CreateReportHeaderPanel']/div[1]/div/span")).click();//Click Create New Report
		driver.findElement(By.xpath("//*[@id='rptBuildEditTitle']")).click();
		driver.findElement(By.xpath("//*[@id='rptBuildEditTitle']")).sendKeys("Automation Report");//Name the report
		driver.findElement(By.xpath("//*[@id='rptBuildEditDesc']")).click();
		driver.findElement(By.xpath("//*[@id='rptBuildEditDesc']")).sendKeys("Automation Report Desc.");//Add report description
		driver.findElement(By.xpath("//*[@id='tags']")).click();
		driver.findElement(By.xpath("//*[@id='tags']")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ddlTeams1']/div/li")));
		driver.findElement(By.xpath("//*[@id='rptBuildSearchRB']/div[1]/ul/li[2]/label")).click();//Select Players Tab
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ReportBuildertab']")));
		driver.findElement(By.xpath("//*[@id='tags']")).sendKeys("wade");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/ul/li/a")));
		driver.findElement(By.xpath("/html/body/ul/li/a")).click();
		driver.findElement(By.xpath("//*[@id='tags']")).sendKeys("thomas");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/ul/li/a")));
		driver.findElement(By.xpath("/html/body/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='tags']")).sendKeys("bradley");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/ul/li/a")));
		driver.findElement(By.xpath("/html/body/ul/li/a")).click();
		driver.findElement(By.xpath("//*[@id='tags']")).sendKeys("crowder");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/ul/li/a")));
		driver.findElement(By.xpath("/html/body/ul/li/a")).click();
		driver.findElement(By.xpath("//*[@id='tags']")).sendKeys("horford");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/ul/li/a")));
		driver.findElement(By.xpath("/html/body/ul/li/a")).click();
		driver.findElement(By.xpath("//*[@id='tags']")).sendKeys("butler");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/ul/li/a")));
		driver.findElement(By.xpath("/html/body/ul/li/a")).click();
		driver.findElement(By.xpath("//*[@id='tags']")).sendKeys("rondo");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/ul/li/a")));
		driver.findElement(By.xpath("/html/body/ul/li/a")).click();
			
		driver.findElement(By.xpath("//*[@id='form_comparison']/div[5]/div[2]/span")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='divSubEventsHA']/div[2]/input")));
		driver.findElement(By.xpath("//*[@id='divSubEventsHA']/div[1]/input")).click();//Home split
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rptBuildStats']/div[2]/div[17]/div[3]/span")));
		driver.findElement(By.cssSelector("#divRBStats > div:nth-child(9) > div.RptBuild-plusIcon > span")).click();//Close Touches Stat +
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='divSubEvents4']/div[1]/input")));
		driver.findElement(By.cssSelector("#divSubEvents4 > div:nth-child(1) > input")).click();//Assists stat
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='divSubEvents4']/div[2]/input")));
		driver.findElement(By.cssSelector("#divSubEvents4 > div:nth-child(2) > input")).click();//Drives stat		
		driver.findElement(By.xpath("//*[@id='tags']")).click();
		driver.findElement(By.xpath("//*[@id='tags']")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='rptBuildstatistic']/div[7]/ul/li/label")).click();//Generate Report button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rptYTD']/div/div/div/div[1]/table/thead/tr[2]/th[1]")));
		driver.findElement(By.xpath("//*[@id='rptYTD']/div/div/div/div[3]/ul/li/label")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='popup_ok']")));
		driver.findElement(By.xpath("//*[@id='popup_ok']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='popup_ok']")));
		driver.findElement(By.xpath("//*[@id='popup_ok']")).click();
		
	}

	@When("^a created report is opened$")
	public void a_created_report_is_opened() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);		
		driver.findElement(By.xpath("//*[@id='reportDiv']/ul/li[2]")).click();//Click on report name
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rName']")));
		
		//driver.findElement(By.xpath("//*[@id='reportDiv']/ul/li[2]")).click();
	
	}

	@Then("^the correct player position is displayed after the player name$")
	public void the_correct_player_position_is_displayed_after_the_player_name() throws Throwable {
		//WebDriverWait wait = new WebDriverWait(driver, 15);	
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rptYTD']/div/div/div/div[1]/table/thead/tr[2]/th[1]")));
		if(driver.getPageSource().contains("PG"));
	
		else
		{
			System.out.println("Player's Position Test FAIL");
		
		}
	}

	@Then("^the correct player team displayed after the player name$")
	public void the_correct_player_team_displayed_after_the_player_name() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);	
		if(driver.getPageSource().contains("Bos"));
		
		else
		{
			System.out.println("Player's Team Test FAIL");
		
		}
		
		driver.findElement(By.xpath("//*[@id='EditReportHeaderPanel']/div[1]/div/span[2]")).click();//Return to Reports
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='MyReports']")));
		driver.findElement(By.xpath("//*[@id='imgRptBuildlnk']")).click();
		driver.findElement(By.xpath("//*[@id='reportDiv']/ul/li[6]/div/span[3]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='popup_ok']")));
		driver.findElement(By.xpath("//*[@id='popup_ok']")).click();
		driver.findElement(By.xpath("//*[@id='popup_ok']")).click();
		driver.findElement(By.id("ctl00_ctl00_lblFullName")).click();
		driver.findElement(By.id("aSignOut")).click();
		driver.close();		
	}

	@When("^the user attempts to change report name or report description$")
	public void the_user_attempts_to_change_report_name_or_report_description() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ReportBuildertab']")));
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id='rptBuildEditTitle']")).click();
		//driver.findElement(By.xpath("//*[@id='rptBuildEditTitle']")).sendKeys("Automation Report Change");//Attempt to change report name
		//driver.findElement(By.xpath("//*[@id='rptBuildEditDesc']")).click();
		//driver.findElement(By.xpath("//*[@id='rptBuildEditDesc']")).sendKeys("Report Description Change");//Attempt to change report name
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ReportBuildertab']")));
	}

	@When("^the report information is displayed in the first gray bar of the table$")
	public void the_report_information_is_displayed_in_the_first_gray_bar_of_the_table() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ReportBuildertab']"))); 
	}

	@When("^the report is populated with data$")
	public void the_report_is_populated_with_data() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ReportBuildertab']")));
	}

	@Then("^report name or report description cannot be changed$")
	public void report_name_or_report_description_cannot_be_changed() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ReportBuildertab']")));
		
		if(driver.getPageSource().contains("Automation Report"));
		if(driver.getPageSource().contains("Automation Report Desc."));
		
		else
		{
			System.out.println("Report Name Change Test FAIL");		
		}
	}

	@Then("^the 'Seasons' format should be displayed as Stern123$")
	public void the_Seasons_format_should_be_displayed_as_Stern123() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ReportBuildertab']")));
		
		if(driver.getPageSource().contains("2016"));
		
		else
		{
			System.out.println("Year Format Test FAIL");		
		}
	}

	@Then("^report name should be the only description displayed$")
	public void report_name_should_be_the_only_description_displayed() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ReportBuildertab']")));
		
		if(driver.getPageSource().contains("Automation Report"));

		else
		{
			System.out.println("Report Name Change Test FAIL");		
		}
		driver.findElement(By.xpath("//*[@id='EditReportHeaderPanel']/div[1]/div/span[2]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CreateReportHeaderPanel']/div[1]/div/span")));		
		driver.findElement(By.xpath("//*[@id='imgRptBuildlnk']")).click();//Report options download
		driver.findElement(By.xpath("//*[@id='reportDiv']/ul/li[6]/div/span[3]")).click();//Delete option		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='popup_ok']")));
		driver.findElement(By.xpath("//*[@id='popup_ok']")).click();
		driver.findElement(By.xpath("//*[@id='popup_ok']")).click();
		driver.findElement(By.id("ctl00_ctl00_lblFullName")).click();
		driver.findElement(By.id("aSignOut")).click();
		driver.close();		
	
	}
	
	@Given("^the ICE DEV site is open and logged in$")
	public void the_ICE_DEV_site_is_open_and_logged_in() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		driver.manage().window().maximize();
		driver.get("https://dev-bk.ice.stats.com/Login.aspx");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txt_username")).sendKeys("gtracey");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txt_password")).sendKeys("S123");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$login_btn")).click();	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#main > div.Resourcemainsitepad > div.sportvuContainer > div > div.ice-logo > img")));
		
	}
	
	@Given("^the Report Leaders module is open$")
	public void the_Report_Leaders_module_is_open() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		driver.get("http://qa-bk2.ice.stats.com/Leaders.aspx");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#btnExcel > span")));	
	}

	@Given("^players rebounding reports are selected$")
	public void players_rebounding_reports_are_selected() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		driver.findElement(By.xpath("//*[@id='RepeaterPOff']/li")).click();
		
		Actions builder = new Actions(driver);//Begin hover actions
		WebElement element = driver.findElement(By.xpath("//*[@id='Rebounding']"));//Hover on rebounding option
		builder.moveToElement(element).build().perform();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='Rebounding']/ul/li[1]")).click();//Select Contested Rebounds report while hovering
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fullTEAMNAME")));	
		driver.findElement(By.xpath("//*[@id='startdatepicker']")).click();//Start Date
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/a[1]/span")).click();//Calendar Back Arrow
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/a[1]/span")).click();//Calendar Back Arrow
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[5]/a")).click();//Select start date
		driver.findElement(By.xpath("//*[@id='enddatepicker']")).click();
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[4]/a")).click();//Select end date
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentPlaceHolder1_ReportNewNavigationContent_selectTotal']/li[2]/label")).click();//Select Per Game
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fullTEAMNAME")));
		driver.getPageSource().contains("Per Game");
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentPlaceHolder1_ReportNewNavigationContent_selectTotal']/li[3]/label")).click();//Select Per 36
		driver.getPageSource().contains("Per 36");
		
		driver.findElement(By.xpath("//*[@id='RepeaterPOff']/li")).click();
		Actions builder2 = new Actions(driver);
		WebElement element2 = driver.findElement(By.xpath("//*[@id='Rebounding']"));//Hover on rebounding option
		builder2.moveToElement(element2).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='Rebounding']/ul/li[2]")).click();//Select Rebound Breakdown report
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fullTEAMNAME")));	
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentPlaceHolder1_ReportNewNavigationContent_selectTotal']/li[2]/label")).click();//Select Per Game
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fullTEAMNAME")));
		driver.getPageSource().contains("Per Game");
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentPlaceHolder1_ReportNewNavigationContent_selectTotal']/li[3]/label")).click();//Select Per 36
		driver.getPageSource().contains("Per 36");
		
	}

	@Given("^teams events reports are selected$")
	public void teams_events_reports_are_selected() throws Throwable {		
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentPlaceHolder1_ReportNewNavigationContent_selectTeamPlayer']/li[2]/label")).click();//Select Teams option
		
		driver.findElement(By.xpath("//*[@id='RepeaterTOff']/li")).click();
		Thread.sleep(2000);	
		Actions builder = new Actions(driver);//Begin hover actions
		WebElement element = driver.findElement(By.xpath("//*[@id='RepeaterTOff']/li/ol/span[5]"));//Hover on events option
		builder.moveToElement(element).build().perform();
	
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Events']/ul/li[1]")));
	
		driver.findElement(By.xpath("//*[@id='Events']/ul/li[1]")).click();//Select Drives report while hovering		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fullTeamName")));	
		driver.findElement(By.xpath("//*[@id='startdatepicker']")).click();//Start Date
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/a[1]/span")).click();//Calendar Back Arrow
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/a[1]/span")).click();//Calendar Back Arrow
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[5]/a")).click();//Select start date
		driver.findElement(By.xpath("//*[@id='enddatepicker']")).click();
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[4]/a")).click();//Select end date
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentPlaceHolder1_ReportNewNavigationContent_selectTotal']/li[2]/label")).click();//Select Per Game
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fullTeamName")));
		driver.getPageSource().contains("Per Game");
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentPlaceHolder1_ReportNewNavigationContent_selectTotal']/li[3]/label")).click();//Select Per 36
		driver.getPageSource().contains("Per 36");
		
		driver.findElement(By.xpath("//*[@id='RepeaterTOff']/li")).click();
		Actions builder2 = new Actions(driver);
		WebElement element2 = driver.findElement(By.xpath("//*[@id='Events']"));//Hover on Events option
		builder2.moveToElement(element2).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='Events']/ul/li[2]")).click();//Select Isolations report
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fullTeamName")));	
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentPlaceHolder1_ReportNewNavigationContent_selectTotal']/li[1]/label")).click();//Select Total
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fullTeamName")));
		driver.getPageSource().contains("Total");
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentPlaceHolder1_ReportNewNavigationContent_selectTotal']/li[2]/label")).click();//Select Per Game
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fullTeamName")));
		driver.getPageSource().contains("Per Game");
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentPlaceHolder1_ReportNewNavigationContent_selectTotal']/li[3]/label")).click();//Select Per 36
		driver.getPageSource().contains("Per 36");
		
		driver.findElement(By.xpath("//*[@id='RepeaterTOff']/li")).click();
		Actions builder3 = new Actions(driver);
		WebElement element3 = driver.findElement(By.xpath("//*[@id='Events']"));//Hover on Events option
		builder3.moveToElement(element3).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='Events']/ul/li[3]")).click();//Select Postups report
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fullTeamName")));
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentPlaceHolder1_ReportNewNavigationContent_selectTotal']/li[1]/label")).click();//Select Total
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fullTeamName")));
		driver.getPageSource().contains("Total");
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentPlaceHolder1_ReportNewNavigationContent_selectTotal']/li[2]/label")).click();//Select Per Game
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fullTeamName")));
		driver.getPageSource().contains("Per Game");
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentPlaceHolder1_ReportNewNavigationContent_selectTotal']/li[3]/label")).click();//Select Per 36
		driver.getPageSource().contains("Per 36");
	
	}
	
	@When("^a valid start date is added to the start date box$")
	public void a_valid_start_date_is_added_to_the_start_date_box() throws Throwable {
	    
				
		
		
	}

	@When("^default splits are selected$")
	public void default_splits_are_selected() throws Throwable {
	    
		
		
	}

	@Then("^the report opens with the correct data populated$")
	public void the_report_opens_with_the_correct_data_populated() throws Throwable {
	    
	}
	

	
	@Given("^the report list page is open$")
	public void the_report_list_page_is_open() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CreateReportHeaderPanel']/div[1]/div/span")));
		
	}

	@When("^share is selected from options list$")
	public void share_is_selected_from_options_list() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CreateReportHeaderPanel']/div[1]/div/span")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='imgRptBuildlnk']")).click();//Select ... dropdown
		driver.findElement(By.xpath("//*[@id='reportDiv']/ul/li[6]/div/span[4]")).click();//Select Share option
	
		
	}

	@Then("^the correct list of users is displayed and can be selected$")
	public void the_correct_list_of_users_is_displayed_and_can_be_selected() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement frame = driver.findElement(By.xpath("//*[@id='cboxLoadedContent']/iframe"));
		driver.switchTo().frame(frame);
		Thread.sleep(3000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtBody")));
		driver.findElement(By.xpath("//*[@id='form1']/div[3]/div[2]/div[2]/div[3]/div/li")).click();//User dropdown
		driver.findElement(By.xpath("//*[@id='form1']/div[3]/div[2]/div[2]/div[3]/div/li/ol/li[171]/input")).click();//Select shared user
		
		
		//*[@id="btnPopupClose"]
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='form1']/div[3]/div[2]/div[2]/div[3]/div/li/ol/li[1]")));
		driver.findElement(By.xpath("//*[@id='form1']/div[3]/div[2]/div[2]/div[3]/div/li/ol/li[171]/input")).click();//Select shared user
		driver.findElement(By.xpath("//*[@id='btnSubCom']")).click();//Press send button
		//driver.switchTo().window(parent);
		
		
	}

	@Given("^shared user logs into ICE$")
	public void shared_user_logs_into_ICE() throws Throwable {
	    
	}

	@Given("^that share user is notified about the shared report$")
	public void that_share_user_is_notified_about_the_shared_report() throws Throwable {
	    
	}

	@When("^the colleague reports section is opened$")
	public void the_colleague_reports_section_is_opened() throws Throwable {
	    
	}

	@Then("^the shared report will be listed$")
	public void the_shared_report_will_be_listed() throws Throwable {
	    
	}

	@Then("^the report opens when selected$")
	public void the_report_opens_when_selected() throws Throwable {
	    
	
	}
	
	
	
	
	@Given("^a report is displayed in the all reports section$")
	public void a_report_is_displayed_in_the_all_reports_section() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CreateReportHeaderPanel']/div[1]/div/span")));
		
			
		
	}

	@Given("^a report is displayd in the favorites section$")
	public void a_report_is_displayd_in_the_favorites_section() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		driver.findElement(By.xpath("//*[@id='imgRptBuildlnk']")).click();//Select ... dropdown
		driver.findElement(By.xpath("//*[@id='reportDiv']/ul/li[7]/div/span[1]")).click();//Select Favorite option
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CreateReportHeaderPanel']/div[1]/div/span")));	
		driver.findElement(By.xpath("//*[@id='popup_ok']")).click();//click ok
		//*[@id="reportDiv"]/ul/li[7]/div/span[1]
		
	}

	@When("^a user deletes the report from all reports section$")
	public void a_user_deletes_the_report_from_all_reports_section() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CreateReportHeaderPanel']/div[1]/div/span")));
		driver.findElement(By.xpath("//*[@id='imgRptBuildlnk']")).click();//Select ... dropdown
		driver.findElement(By.xpath("//*[@id='reportDiv']/ul/li[6]/div/span[3]")).click();//Select delete option
		
		if(driver.getPageSource().contains("Are you sure you want to delete this report?"));

		else
		{
			System.out.println("Delete Message Display Test FAIL");		
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CreateReportHeaderPanel']/div[1]/div/span")));
		driver.findElement(By.xpath("//*[@id='popup_ok']")).click();//click ok
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CreateReportHeaderPanel']/div[1]/div/span")));
		driver.findElement(By.xpath("//*[@id='popup_ok']")).click();//click ok again
	
	}

	@Then("^the report is removed from all report sections$")
	public void the_report_is_removed_from_all_report_sections() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CreateReportHeaderPanel']/div[1]/div/span")));
		
		if(driver.getPageSource().contains("No Reports to Display"));

		else
		{
			System.out.println("Delete Message Display Test FAIL");		
		}
		
		
	}

	@Then("^the correct confirmation message is displayed$")
	public void the_correct_confirmation_message_is_displayed() throws Throwable {
		driver.close();
		
		
	}

	@Given("^a report is displayed in the Recent reports section$")
	public void a_report_is_displayed_in_the_Recent_reports_section() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CreateReportHeaderPanel']/div[1]/div/span")));
		driver.findElement(By.xpath("//*[@id='imgRptBuildlnk']")).click();//Select ... dropdown
		driver.findElement(By.xpath("//*[@id='reportDiv']/ul/li[6]/div/span[1]")).click();//Select Favorite option
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CreateReportHeaderPanel']/div[1]/div/span")));	
		driver.findElement(By.xpath("//*[@id='popup_ok']")).click();//click ok
		
		
		
	}

	@When("^a user deletes the report from Recent reports section$")
	public void a_user_deletes_the_report_from_Recent_reports_section() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CreateReportHeaderPanel']/div[1]/div/span")));
		driver.findElement(By.xpath("//*[@id='imgRptBuildlnk']")).click();//Select ... dropdown
		driver.findElement(By.xpath("//*[@id='reportDiv']/ul/li[6]/div/span[3]")).click();//Select delete option
		
	
		
		if(driver.getPageSource().contains("Are you sure you want to delete this report?"));

		else
		{
			System.out.println("Delete Message Display Test FAIL");		
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CreateReportHeaderPanel']/div[1]/div/span")));
		driver.findElement(By.xpath("//*[@id='popup_ok']")).click();//click ok
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CreateReportHeaderPanel']/div[1]/div/span")));
		driver.findElement(By.xpath("//*[@id='popup_ok']")).click();//click ok again
	}
	
	

	@Then("^the shared user receives a notification$")
	public void the_shared_user_receives_a_notification() throws Throwable {
	   
	}

	@Then("^the shared user can view the report in the colleague report section$")
	public void the_shared_user_can_view_the_report_in_the_colleague_report_section() throws Throwable {
	    
	}

	@Then("^the shared report will be opened$")
	public void the_shared_report_will_be_opened() throws Throwable {
	  
	}

	@Then("^the report is deleted$")
	public void the_report_is_deleted() throws Throwable {
	    
	}
	
	@Given("^a shared user logs into ICE$")
	public void a_shared_user_logs_into_ICE() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa-bk2.ice.stats.com");
		
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txt_username")).sendKeys("gtracey2");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txt_password")).sendKeys("S123");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$login_btn")).click();
	}

	@When("^the notification icon is selected$")
	public void the_notification_icon_is_selected() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_ctl00_lblFullName']")));
		driver.findElement(By.xpath("//*[@id='container']/header/div[2]/span")).click();//Click notification icon
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_ctl00_rptrNotification_ctl00_a1']")));
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_rptrNotification_ctl00_a1']")).click();//Select shared report
		
		
	}

	@Then("^the shared report name link is displayed$")
	public void the_shared_report_name_link_is_displayed() throws Throwable {
	   
	}

	@Then("^the report opens when the link is selected$")
	public void the_report_opens_when_the_link_is_selected() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_ctl00_lblFullName']")));
	}

	@Given("^the colleague reports section is opened in Report Builder$")
	public void the_colleague_reports_section_is_opened_in_Report_Builder() throws Throwable {
	    
	}

	@When("^the shared report is selected$")
	public void the_shared_report_is_selected() throws Throwable {
	   
	}

	@When("^the report is deleted by the shared user$")
	public void the_report_is_deleted_by_the_shared_user() throws Throwable {
	   
	}

	@Then("^the shared report can be deleted$")
	public void the_shared_report_can_be_deleted() throws Throwable {
	   
	}
	
	
	
}
