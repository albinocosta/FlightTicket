package reservation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeatsElementMap {
	@FindBy (xpath = "//button[text()=' Okay, got it. ']")
	protected WebElement childadvise;
	@FindBy (xpath = "(//button[@class='ng-star-inserted seatmap__seat seatmap__seat--standard'])[48]")
	protected WebElement passengerseat;
	@FindBy (xpath = "//button[text()=' Next flight ']")
	protected WebElement nextflightbutton;
	@FindBy (xpath = "//button[text()=' Continue ']")
	protected WebElement continuebutton;
	@FindBy (css = "span[class*='price--loading']")
	protected WebElement nganimating;
	@FindBy (xpath = "//button[text()=' Pick these seats ']")
	protected WebElement sameseatsbutton;
	@FindBy (xpath = "//button[text()=' No, thanks ']")
	protected WebElement resufebutton;
}
