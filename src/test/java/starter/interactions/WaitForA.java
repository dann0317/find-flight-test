package starter.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;

public class WaitForA implements Performable {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Performable.super.then(nextPerformable);
    }

    public static WaitForA moment(){
        return new WaitForA();
    }
}
