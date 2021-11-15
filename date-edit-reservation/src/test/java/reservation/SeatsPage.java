package reservation;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeatsPage extends SeatsElementMap {
	
	public SeatsPage () {
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	
	public void chooseSeats () throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(TestRule.getDriver(), Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(childadvise));
		childadvise.click();
		wait.until(ExpectedConditions.visibilityOf(passengerseat));
		passengerseat.click();
		passengerseat.click();
		passengerseat.click();
		nextflightbutton.click();
		wait.until(ExpectedConditions.visibilityOf(sameseatsbutton));
		sameseatsbutton.click();		
		wait.until(ExpectedConditions.visibilityOf(resufebutton));
		resufebutton.click();
		continuebutton.click();	
	}

}
