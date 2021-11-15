package reservation;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends HomeElementMap {
	
		public HomePage () {
			PageFactory.initElements(TestRule.getDriver(), this);
		}
		
		public void accessHome() {			
			TestRule.getDriver().get("https://www.ryanair.com/gb/en");
			
		}
		
		public void submitData() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(TestRule.getDriver(), Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(cookie_accept));
			cookie_accept.click();
			wait.until(ExpectedConditions.visibilityOf(depart_portfield));
			depart_portfield.click();
			wait.until(ExpectedConditions.visibilityOf(portugal_dep));
			portugal_dep.click();
			wait.until(ExpectedConditions.visibilityOf(lisbon_dep));
			lisbon_dep.click();			
			wait.until(ExpectedConditions.visibilityOf(france_dest));
			france_dest.click();
			wait.until(ExpectedConditions.visibilityOf(paris_dest));
			paris_dest.click();
			wait.until(ExpectedConditions.visibilityOf(monthdep_upmenu));
			monthdep_upmenu.click();	
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOf(date_dep));					
			date_dep.click();
			wait.until(ExpectedConditions.visibilityOf(date_ret));
			date_ret.click();
			wait.until(ExpectedConditions.visibilityOf(plus_adult));
			plus_adult.click();
			wait.until(ExpectedConditions.visibilityOf(plus_child));
			plus_child.click();
			wait.until(ExpectedConditions.visibilityOf(done_pass));
			done_pass.click();			
		}
		
		public void submitSearch() {
			WebDriverWait wait = new WebDriverWait(TestRule.getDriver(), Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(search));
			search.click();
		}

}
