package reservation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeElementMap {
	@FindBy (css = "iframe[id='_hjRemoteVarsFrame']")
	protected WebElement iframe;
	@FindBy (xpath = "//button[text()='Yes, I agree']")
	protected WebElement cookie_accept;
	@FindBy (css = "#input-button__departure")
	protected WebElement depart_portfield;
	@FindBy (xpath = "//span[contains(text(),' Portugal ')]")
	protected WebElement portugal_dep;
	@FindBy (xpath = "//span[contains(text(),' Lisbon ')]")
	protected WebElement lisbon_dep;
	@FindBy (xpath = "//span[contains(text(),' France ')]")
	protected WebElement france_dest;
	@FindBy (xpath = "//span[contains(text(),' Paris Beauvais ')]")
	protected WebElement paris_dest;
	@FindBy (xpath = "(//div[text()=' Jun '])[1]")
	protected WebElement monthdep_upmenu;
	@FindBy (css = "div[data-id='2022-06-06']")
	protected WebElement date_dep;	
	@FindBy (css = "div[data-id='2022-07-01']")
	protected WebElement date_ret;
	@FindBy (xpath = "//ry-counter[@data-ref='passengers-picker__adults']//descendant::div[@data-ref='counter.counter__increment']")
	protected WebElement plus_adult;
	@FindBy (xpath = "//ry-counter[@data-ref='passengers-picker__children']//descendant::div[@data-ref='counter.counter__increment']")
	protected WebElement plus_child;
	@FindBy (xpath = "//button[text()=' Done ']")	
	protected WebElement done_pass;
	@FindBy (css = "button[data-ref*='flight-search']")	
	protected WebElement search;

}
