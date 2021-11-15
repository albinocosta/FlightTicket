package reservation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightChoiceElementMap {
	@FindBy (css = "button[data-ref='2022-06-06']")
	protected WebElement currentselection;
	@FindBy (xpath = "(//button[contains(@class, 'carousel-next ng-tns')])[1]")
	protected WebElement deprightsidebutton;
	@FindBy (css = "ul[class*='animating']")
	protected WebElement nganimating;
	@FindBy (css = "button[data-ref='2022-06-24']")
	protected WebElement newdepdate;
	@FindBy (xpath = "(//button[contains(@class, 'carousel-next ng-tns')])[2]")
	protected WebElement retrightsidebutton;
	@FindBy (css = "button[data-ref='2022-07-23']")
	protected WebElement newretdate;
	@FindBy (xpath = "(//flight-card[@data-e2e='flight-card--outbound'])[1]")
	protected WebElement newdepflight;
	@FindBy (xpath = "(//flight-card[@data-e2e='flight-card--inbound'])[1]")
	protected WebElement newretflight;	
	@FindBy (css = "button[class='fare-card__button fare-card__price ry-button--outline-dark-blue']")
	protected WebElement valuefarebutton;
	@FindBy (xpath = "//button[text()=' Continue with Value fare ']")
	protected WebElement valuecontinuebutton;
	@FindBy (xpath = "//span[text()='Log in later']")
	protected WebElement loginlaterbutton;
	@FindBy (xpath = "(//button[@class='dropdown__toggle b2'])[1]")
	protected WebElement pass1combobox;
	@FindBy (xpath = "//div[text()='Mrs']")
	protected WebElement pass1title;
	@FindBy (css = "input[id='form.passengers.ADT-0.name']")
	protected WebElement fnamepass1;
	@FindBy (css = "input[id='form.passengers.ADT-0.surname']")
	protected WebElement lnamepass1;
	@FindBy (xpath = "//button[@class='dropdown__toggle b2']")
	protected WebElement pass2combobox;
	@FindBy (xpath = "//div[text()='Mr']")
	protected WebElement pass2title;
	@FindBy (css = "input[id='form.passengers.ADT-1.name']")
	protected WebElement fnamepass2;
	@FindBy (css = "input[id='form.passengers.ADT-1.surname']")
	protected WebElement lnamepass2;
	@FindBy (css = "input[id='form.passengers.CHD-0.name']")
	protected WebElement fnamepass3;
	@FindBy (css = "input[id='form.passengers.CHD-0.surname']")
	protected WebElement lnamepass3;
	@FindBy (xpath = "//button[text()=' Continue ']")
	protected WebElement continuebutton;
}
