package starter.helpers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.By;

public class AsksForA implements Performable {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String itemsLeftCount = actor.asksFor(Text.of(By.xpath("(//div[@data-ui-name='calendar_body']//h3)[1]")));
        System.out.println(itemsLeftCount);
    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Performable.super.then(nextPerformable);
    }

    public static AsksForA moment(){
        return new AsksForA();
    }
}
