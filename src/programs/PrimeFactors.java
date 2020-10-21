package programs;

import utility.PrimeFactorLogic;
import utility.PrimeFactorObjects;

public class PrimeFactors {
    public static void main(String[] argv){
        PrimeFactorObjects objects=new PrimeFactorObjects();
        PrimeFactorLogic primeFactorLogic=new PrimeFactorLogic();
        objects.setNumber(60);
        primeFactorLogic.Logic(objects.getNumber());
    }
}
