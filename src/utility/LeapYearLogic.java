package utility;

public class LeapYearLogic {
    public int LeapYear(int Year) {

        if (((Year % 4 == 0) && (Year % 100 != 0)) || (Year % 400 == 0))
        {
            System.out.println("Specified year is a leap year");
            return 1;
        }
        else
            System.out.println("Specified year is not a leap year");
        return 0;
    }
}
