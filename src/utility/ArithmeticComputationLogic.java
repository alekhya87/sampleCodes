package utility;

public class ArithmeticComputationLogic {
    public int Computation1(int firstNumber, int secondNumber, int thirdNumber){
        int firstComputation=(firstNumber+(secondNumber*thirdNumber));
        return firstComputation;
    }
    public int Computation2(int firstNumber, int secondNumber, int thirdNumber){
        int secondComputation=((firstNumber*secondNumber)+thirdNumber);
        return secondComputation;
    }
    public int Computation3(int firstNumber, int secondNumber, int thirdNumber){
        int thirdComputation=(thirdNumber+(firstNumber/secondNumber));
        return thirdComputation;
    }
    public int Computation4(int firstNumber, int secondNumber, int thirdNumber){
        int fourthComputation=((firstNumber%secondNumber)+thirdNumber);
        return fourthComputation;
    }
}
