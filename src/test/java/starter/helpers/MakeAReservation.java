package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static starter.helpers.BookingForm.*;

public class MakeAReservation {

    public static Performable oneWayType() {

        DataFligth newflight = new DataFligth();

        return Task.where(
                WaitUntil.the(LOGIN_POPUP, WebElementStateMatchers.isClickable()),
                Click.on(LOGIN_POPUP),
                Click.on(FLIGHTS_OPTION),
                WaitUntil.the(ONE_WAY_OPTION, WebElementStateMatchers.isClickable()),
                Click.on(ONE_WAY_OPTION),
                Click.on(WHERE_FROM_FIELD),
                WaitUntil.the(AIRPORT, WebElementStateMatchers.isPresent()),
                Click.on(CITYMDE_PRECHECK),
                Enter.theValue(newflight.getFlightFrom()).into(AIRPORT),
                Click.on(CITYMDE_CHECK),
                Click.on(WHERE_TO_FIELD),
                Enter.theValue(newflight.getFlightTo()).into(AIRPORT),
                Click.on(CITYMZL_CHECK),
                Click.on(LEAVE_DATE_CALENDAR),
                SetCalendar.with(newflight.getDepartMonth()),
                Click.on(SEARCHBUTTON),
                AsksForA.moment(),
                WaitForA.moment()
        );
    }
}
