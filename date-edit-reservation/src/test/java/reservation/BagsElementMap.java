package reservation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BagsElementMap {
	@FindBy (css = "label[for='ry-radio-button--0']")
	protected WebElement smallbagradio;
	
	@FindBy (xpath = "//button[text()=' Continue']")
	protected WebElement contuinuebutton;

}
