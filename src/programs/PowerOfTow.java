package programs;

import utility.PowerOfTwoLogic;
import utility.PowerOfTwoObjects;

public class PowerOfTow {
    public static void main(String[] argv){
        PowerOfTwoObjects objects=new PowerOfTwoObjects();
        PowerOfTwoLogic powerOfTwoLogic=new PowerOfTwoLogic();
        objects.setNumberPower(8);
        powerOfTwoLogic.Logic(objects.getNumberPower());
    }
}
