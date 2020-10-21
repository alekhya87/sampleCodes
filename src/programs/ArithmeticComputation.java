package programs;

import utility.ArithmeticComputationLogic;
import utility.ArithmeticComputationObjects;

public class ArithmeticComputation {
    public static void main(String[] argv){
        ArithmeticComputationObjects objects=new ArithmeticComputationObjects();
        ArithmeticComputationLogic arithmeticComputationLogic=new ArithmeticComputationLogic();
        objects.setFirstNumber(30);
        objects.setSecondNumber(10);
        objects.setThirdNumber(20);
        int firstComputation=arithmeticComputationLogic.Computation1(objects.getFirstNumber(),objects.getSecondNumber(),objects.getThirdNumber());
        System.out.println("Arithmetic first computation is :"+firstComputation);
        int secondComputation=arithmeticComputationLogic.Computation2(objects.getFirstNumber(),objects.getSecondNumber(),objects.getThirdNumber());
        System.out.println("Arithmetic second computation is :"+secondComputation);
        int thirdComputation=arithmeticComputationLogic.Computation3(objects.getFirstNumber(),objects.getSecondNumber(),objects.getThirdNumber());
        System.out.println("Arithmetic third computation is :"+thirdComputation);
        int fourthComputation=arithmeticComputationLogic.Computation4(objects.getFirstNumber(),objects.getSecondNumber(),objects.getThirdNumber());
        System.out.println("Arithmetic fourth computation is :"+fourthComputation);
    }
}
