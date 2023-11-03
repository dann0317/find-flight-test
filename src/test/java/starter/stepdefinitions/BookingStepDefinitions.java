package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

import starter.helpers.AsksForA;
import starter.helpers.FlightResult;
import starter.navigation.NavigateTo;
import starter.helpers.MakeAReservation;



public class BookingStepDefinitions {
    @Given("{actor} wants to flight")
    public void wantsToFlight(Actor actor) {
        actor.wasAbleTo(NavigateTo.theBookingHomePage());
    }

    @When("{actor} make a one-way reservation")
    public void makeOneWayReservation(Actor actor) {
        actor.attemptsTo(MakeAReservation.oneWayType());

    }
    @Then("{actor} should get the flight list")
    public void sheShouldGetTheFlightList(Actor actor) {
        /*String badir = "andres";
        actor.attemptsTo(Ensure.that(badir).isEqualToIgnoringCase("andres"));*/
        actor.attemptsTo(Ensure.that(FlightResult.list()).isDisplayed());
        actor.wasAbleTo(AsksForA.moment());
    }
}
