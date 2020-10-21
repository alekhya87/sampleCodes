package programs;

import utility.LeapYearLogic;
import utility.LeapYearObjects;

public class LeapYear {
    public static void main(String[] argv){
        LeapYearObjects objects=new LeapYearObjects();
        LeapYearLogic leapYearLogic=new LeapYearLogic();
        objects.setYear(2016);
        leapYearLogic.LeapYear(objects.getYear());
    }
}
