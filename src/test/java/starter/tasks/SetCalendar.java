package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static starter.userinterfaces.BookingForm.CALENDAR_DAY;

public class SetCalendar implements Performable {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(CALENDAR_DAY));
    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Performable.super.then(nextPerformable);
    }

    public static SetCalendar with(String flightFrom) {
        return new SetCalendar();

    }
}
