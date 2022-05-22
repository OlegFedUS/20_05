package HM7;

public class MonthUtils {

    private static Month[] MONTH_ARRAY = {
            new Month("January", 31, 20),
            new Month("February", 28, 18),
            new Month("March", 31, 24),
            new Month("April", 30, 23),
            new Month("May", 31, 25),
            new Month("June", 30, 20),
            new Month("July", 31,21),
            new Month("August", 31, 25),
            new Month("September", 30, 24),
            new Month("October", 31, 27),
            new Month("November", 30,26),
            new Month("December", 31, 19)
    };

    public static Month[] getMonth(){
        return MONTH_ARRAY;
    }



}
