package programs;

import utility.UnitConversionLogic;
import utility.UnitConversionObjects;

public class UnitConversion {
    public static void main(String[] argv){
        UnitConversionObjects objects=new UnitConversionObjects();
        UnitConversionLogic unitConversionLogic=new UnitConversionLogic();
        objects.setFeets(10);
        objects.setInchs(20);
        objects.setMeters(40);
        unitConversionLogic.ConversionsLogic(objects.getFeets(),objects.getInchs(),objects.getMeters());
    }
}
