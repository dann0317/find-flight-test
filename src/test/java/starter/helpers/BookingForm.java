package starter.helpers;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BookingForm {

    static Target LOGIN_POPUP = Target.the("login popup").locatedBy("//button[contains(@aria-label, 'Ignorar')]");
    static Target FLIGHTS_OPTION = Target.the("flights option").located(By.id("flights"));
    static Target ONE_WAY_OPTION = Target.the("One way option").locatedBy("//label[@for='search_type_option_ONEWAY']");
    static Target WHERE_FROM_FIELD = Target.the("Where from field").locatedBy("//button[@data-ui-name='input_location_from_segment_0']");
    static Target AIRPORT = Target.the("Airport").locatedBy("//input[@placeholder='Aeropuerto o ciudad']");
    static Target CITYMDE_PRECHECK = Target.the("citymedpre").locatedBy("//body/div[3]//span[@aria-hidden='true']");
    static Target CITYMDE_CHECK = Target.the("citymed").locatedBy("//input[@name='CITYMDE']");
    static Target WHERE_TO_FIELD = Target.the("Where from field").locatedBy("//button[@data-ui-name='input_location_to_segment_0']");
    static Target CITYMZL_CHECK = Target.the("citymzl").locatedBy("//input[@name='AIRPORTMZL']");
    static Target LEAVE_DATE_CALENDAR = Target.the("leave date").locatedBy("//button[@placeholder='Elige fecha de ida']");
    static Target INITIAL_MONTH = Target.the("initial month").locatedBy("(//div[@data-ui-name='calendar_body']//h3)[1]");
    static Target NEXT_MONTH_CALENDAR_BUTTON = Target.the("next_button_calendar").locatedBy("//div[@data-ui-name='calendar_body']/button[2]");
    static Target CALENDAR = Target.the("calendar").locatedBy("//div[@data-ui-name='calendar_body']//table");
    static Target CALENDAR_DAY = Target.the("calendar_day").locatedBy("//div[@data-ui-name='calendar_body']//span[span[@data-ui-name='calendar_cell_2024-01-02']]");
    static Target SEARCHBUTTON = Target.the("search_button").locatedBy("//button[@data-ui-name='button_search_submit']");

}
