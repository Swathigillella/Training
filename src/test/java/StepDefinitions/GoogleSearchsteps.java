package StepDefinitions;

import java.util.concurrent.TimeUnit;
import io.cucumber.core.cli.Main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchsteps {
	WebDriver driver =null;
	@Given("user is on google search page")
	public void user_is_on_google_search_page() throws Exception {
		
	
		System.out.println("Inside Step-browser is open");
		String path =System.getProperty("user.dir");
		System.out.println("Path is :" +path);
		System.setProperty("webdriver.chrome.driver",path+"/src/test/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(2000);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}

	@And("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("Inside Step-user entesr a text in the search box");
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Automation Step by Step");
		
	}

	@When("hits enter")
	public void hits_enter() throws Exception {
		System.out.println("Inside Step-hits enter");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
	}

	@And("user is navigated to search results")
	public void user_is_navigated_to_search_results() throws Exception {
		System.out.println("Inside Step-user is navigated to search results");
		driver.getPageSource().contains("Online Courses");
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}



}
