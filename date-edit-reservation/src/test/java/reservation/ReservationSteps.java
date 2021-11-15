package reservation;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReservationSteps {
	@Given("I access ryanair home page")
	public void accessHome() {
		HomePage mainPage = new HomePage();
		mainPage.accessHome();

	}

	@And("I submit my data for new search")
	public void inputDep() throws InterruptedException {
		HomePage mainPage = new HomePage();
		mainPage.submitData();	

	}

	@And("submit search")
	public void submitSearch() {
		HomePage mainPage = new HomePage();
		mainPage.submitSearch();

	}

	@When("I change flight date for departure 2022-06-25 return 2022-07-23")
	public void changeDate() throws InterruptedException {
		FlightChoicePage flightchoicePage = new FlightChoicePage();
		flightchoicePage.changeflightDate();

	}

	@And("procceed with flights needed info")
	public void inputFlightInfo() throws InterruptedException {
		FlightChoicePage flightchoicePage = new FlightChoicePage();
		flightchoicePage.submitpassInfo();
		SeatsPage seatsPage = new SeatsPage();
		seatsPage.chooseSeats();
		
	}

	@Then("I can procced to checkout payment page")
	public void reachPayment() {
		BagsPage bagsPage = new BagsPage();
		bagsPage.submitbags();

	}
}
