package StepDefinitions;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;




public class GoogleSearchSteps {
	
	WebDriver driver = null;


	@Given("browser is open")
	public void browser_is_open()  {
		System.out.println("inside the step browser is open");
		//System.setProperty("webdriver.gecko.driver","C:/eclipse/Marcelo_Workspace/CucumberJava/src/test/resources/Drivers/geckodriver.exe"); // launch FF
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","C:/eclipse/Marcelo_Workspace/CucumberJava/src/test/resources/Drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:/eclipse/Marcelo_Workspace/CucumberJava/src/test/resources/Drivers/Linux/chromedriver");		//linux
		ChromeOptions option = new ChromeOptions ();
		option.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors"); 
		//option.setHeadless(true); //launch Chrome browser as headless option2
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() throws Exception {
		System.out.println("inside the step user is on");
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(1000);
		
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws Exception {
		System.out.println("inside the step user enters the text");
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		Thread.sleep(2000);
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("inside the step user hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navegated to search results")
	public void user_is_navegated_to_search_results() {
		System.out.println("inside the step result is displyed");
		
		
		driver.getPageSource().contains("Online Courses");
				
		
		driver.close();
		
	}

}