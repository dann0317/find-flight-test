package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import starter.userinterfaces.BookingForm;

import static starter.userinterfaces.BookingForm.*;

public class SetCalendar implements Performable {
    //static Actor actor;

    @Override
    public <T extends Actor> void performAs(T actor) {
       // this.actor = actor;
       // List<Map<Object, String>> resultTable;
        String itemsLeftCount = actor.asksFor(Text.of(INITIAL_MONTH));
        String[] splitDate = itemsLeftCount.split(" ");
        System.out.println(itemsLeftCount);
        System.out.println(splitDate[0]);


        while(!splitDate[0].equals("enero")){
            actor.wasAbleTo(Click.on(NEXT_MONTH_CALENDAR_BUTTON));
            itemsLeftCount = actor.asksFor(Text.of(INITIAL_MONTH));
            splitDate = itemsLeftCount.split(" ");
        }
        /*resultTable = HtmlTable.rowsFrom((WebElement) CALENDAR);
        for (int i = 0; i < resultTable.size(); i++) {
            Map<Object, String> row = resultTable.get(i);
            if(row.containsValue("25")){

            }
        }*/
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
