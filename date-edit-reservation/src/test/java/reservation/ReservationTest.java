package reservation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Reservation.feature", glue = { "" }, monochrome = true, dryRun = false)

public class ReservationTest {

}
