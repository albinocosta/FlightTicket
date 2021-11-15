package reservation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestRule {
	
	private static WebDriver driver;
	
	@Before
	public void beforescenario() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");		
		driver = new ChromeDriver();			
		driver.manage().window().maximize();		
	}
	
	@After
	public void afterscenario() {
		//driver.close();
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}
