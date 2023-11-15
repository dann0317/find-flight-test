package starter.helpers;

public class DataFligth {

    private String flightFrom;
    private String flightTo;
    private String departDay;
    private String returnDay;
    private String departMonth;
    private String returnMonth;

    public static final String DEFAULTFLIGHTFROM = "Medellin";
    public static final String DEFAULTFLIGHTTO = "Manizales";
    public static final String DEFAULTDEPARTDAY = "02";
    public static final String DEFAULTDEPARTMONTH = "enero";
    public static final String DEFAULTRETURNDAY = "30";
    public static final String DEFAULTRETURNMONTH = "diciembre";

    public DataFligth(){
        this.flightFrom = DEFAULTFLIGHTFROM;
        this.flightTo = DEFAULTFLIGHTTO;
        this.departDay = DEFAULTDEPARTDAY;
        this.departMonth = DEFAULTDEPARTMONTH;
        this.returnDay = DEFAULTRETURNDAY;
        this.returnMonth = DEFAULTRETURNMONTH;
    }


    public DataFligth(String flightFrom, String flightTo, String departDay,
                      String returnDay, String departMonth, String returnMonth){
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
        this.departDay = departDay;
        this.returnDay = returnDay;
        this.departMonth = departMonth;
        this.returnMonth = returnMonth;
    }

    /*public void setFlightDates (){

        LocalDate actualDate = LocalDate.now();
        // Toma la fecha y aumenta 3 meses
        departDay = String.valueOf(actualDate.getDayOfMonth());
        departMonth = actualDate.getMonthValue()+3;

        if ((actualDate.getDayOfMonth() == 31)) {
            returnDay = "1";
        } else {
            returnDay = String.valueOf(actualDate.getDayOfMonth() + 1);
        }
        if (departMonth >= 12) {
            departMonth = (departMonth - 12);
            returnMonth = departMonth + 1;

        } else {
            returnMonth = actualDate.getMonthValue() + 1;
        }
        Month theDepartMonth = Month.of(departMonth);
        Month theReturnMonth = Month.of(returnMonth);

        String nameDepartMonth = theDepartMonth.getDisplayName(java.time.format.TextStyle.FULL, java.util.Locale.getDefault());
        String nameReturnMonth = theReturnMonth.getDisplayName(java.time.format.TextStyle.FULL, java.util.Locale.getDefault());

        System.out.println("Fecha actual:..."+departDay+" "+nameDepartMonth+" "+returnDay+" "+nameReturnMonth);
    }*/

    public String getDepartDay() {
        return departDay;
    }

    public void setDepartDay(String departDay) {
        this.departDay = departDay;
    }

    public String getReturnDay() {
        return returnDay;
    }

    public void setReturnDay(String returnDay) {
        this.returnDay = returnDay;
    }

    public String getDepartMonth() {
        return departMonth;
    }

    public void setDepartMonth(String departMonth) {
        this.departMonth = departMonth;
    }

    public String getReturnMonth() {
        return returnMonth;
    }

    public void setReturnMonth(String returnMonth) {
        this.returnMonth = returnMonth;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public void setFlightFrom(String flightFrom) {
        this.flightFrom = flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public void setFlightTo(String flightTo) {
        this.flightTo = flightTo;
    }
}
