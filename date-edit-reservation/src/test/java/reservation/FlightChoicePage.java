package reservation;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightChoicePage extends FlightChoiceElementMap {

	public FlightChoicePage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void changeflightDate() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(TestRule.getDriver(), Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(currentselection));
		deprightsidebutton.click();
		wait.until(ExpectedConditions.invisibilityOf(nganimating));
		deprightsidebutton.click();
		wait.until(ExpectedConditions.invisibilityOf(nganimating));
		deprightsidebutton.click();
		wait.until(ExpectedConditions.invisibilityOf(nganimating));
		deprightsidebutton.click();
		wait.until(ExpectedConditions.invisibilityOf(nganimating));
		newdepdate.click();
		retrightsidebutton.click();
		wait.until(ExpectedConditions.invisibilityOf(nganimating));
		retrightsidebutton.click();
		wait.until(ExpectedConditions.invisibilityOf(nganimating));
		retrightsidebutton.click();
		wait.until(ExpectedConditions.invisibilityOf(nganimating));
		retrightsidebutton.click();
		wait.until(ExpectedConditions.invisibilityOf(nganimating));
		newretdate.click();
		newdepflight.click();
		newretflight.click();
		wait.until(ExpectedConditions.visibilityOf(valuefarebutton));
		valuefarebutton.click();
		wait.until(ExpectedConditions.visibilityOf(valuecontinuebutton));
		valuecontinuebutton.click();
		wait.until(ExpectedConditions.visibilityOf(loginlaterbutton));
		loginlaterbutton.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(pass1combobox));
		pass1combobox.click();
		wait.until(ExpectedConditions.visibilityOf(pass1title));
		pass1title.click();
		wait.until(ExpectedConditions.visibilityOf(fnamepass1));
		fnamepass1.sendKeys("Sónia");
		wait.until(ExpectedConditions.visibilityOf(lnamepass1));
		lnamepass1.sendKeys("Pereira");
		wait.until(ExpectedConditions.visibilityOf(pass2combobox));
		pass2combobox.click();
		wait.until(ExpectedConditions.visibilityOf(pass2title));
		pass2title.click();
		wait.until(ExpectedConditions.visibilityOf(fnamepass2));
		fnamepass2.sendKeys("Diogo");
		wait.until(ExpectedConditions.visibilityOf(lnamepass2));
		lnamepass2.sendKeys("Bettencourt");
		fnamepass3.sendKeys("Inês");
		lnamepass3.sendKeys("Marçal");
		continuebutton.click();

		// boolean depselected= newdepdate.isDisplayed();
		// System.out.println(depselected);
		// if (depselected) {
		// newdepdate.click();
		// } else {
		// deprightsidebutton.click();
		// }

	}

	public void submitpassInfo() {

	}

}
