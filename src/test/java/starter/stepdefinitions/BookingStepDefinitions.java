package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

import starter.helpers.AsksForA;
import starter.userinterfaces.FlightResultForm;
import starter.tasks.NavigateTo;
import starter.tasks.MakeAReservation;


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

        actor.attemptsTo(Ensure.that(FlightResultForm.list()).isDisplayed());
        actor.wasAbleTo(AsksForA.moment());
    }
}
