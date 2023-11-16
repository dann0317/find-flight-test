package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.helpers.AsksForA;
import starter.helpers.DataFligth;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static starter.userinterfaces.BookingForm.*;

public class MakeAReservation {

    public static Performable oneWayType() {

        DataFligth newflight = new DataFligth();

        return Task.where(
                Check.whether(LOGIN_POPUP.isVisibleFor(theActorInTheSpotlight()))
                        .andIfSo(Click.on(LOGIN_POPUP)),
                Click.on(FLIGHTS_OPTION),
                WaitUntil.the(ONE_WAY_OPTION, isClickable()),
                Click.on(ONE_WAY_OPTION),
                Click.on(WHERE_FROM_FIELD),
                WaitUntil.the(AIRPORT, isPresent()),
                Click.on(CITYMDE_PRECHECK),
                Enter.theValue(newflight.getFlightFrom()).into(AIRPORT),
                Click.on(CITYMDE_CHECK),
                Click.on(WHERE_TO_FIELD),
                Enter.theValue(newflight.getFlightTo()).into(AIRPORT),
                Click.on(CITYMZL_CHECK),
                Click.on(LEAVE_DATE_CALENDAR),
                SetCalendar.with(newflight.getDepartMonth()),
                Click.on(SEARCHBUTTON),
                AsksForA.moment()
        );
    }
}
