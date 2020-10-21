package programs;

import utility.FactorialLogic;
import utility.FactorialObjects;

public class Factorial {
    public static void main(String[] argv){
        FactorialObjects objects=new FactorialObjects();
        FactorialLogic factorialLogic=new FactorialLogic();
        objects.setNumber(5);
        factorialLogic.Logic(objects.getNumber());
    }
}

