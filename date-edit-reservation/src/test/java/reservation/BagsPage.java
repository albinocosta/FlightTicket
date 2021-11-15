package reservation;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BagsPage extends BagsElementMap {
	
	public BagsPage () {
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	
	public void submitbags () {
		WebDriverWait wait = new WebDriverWait(TestRule.getDriver(), Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(smallbagradio));
		smallbagradio.click();
		wait.until(ExpectedConditions.visibilityOf(contuinuebutton));
		contuinuebutton.click();
	}

}
