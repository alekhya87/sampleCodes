package programs;

import utility.PrimeNumberLogic;
import utility.PrimeNumberObject;

public class PrimeNumber {
    public static void main(String[] argv){
        PrimeNumberObject objects=new PrimeNumberObject();
        PrimeNumberLogic primeNumberLogic=new PrimeNumberLogic();
        objects.setNumber(10);
        primeNumberLogic.Logic(objects.getNumberRange());
    }
}
