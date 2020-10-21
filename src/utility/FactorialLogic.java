package utility;

public class FactorialLogic {
    public int Logic(int Number)
    {
        int factorial=1;
        if (Number == 0)
            System.out.println("Factorial of 0 is 1");
        else {
            for (int i = 2; i <= Number; i++)
            {
                factorial = factorial * i;
            }
            System.out.println("factorial of a " + Number + " is " +factorial);
        }
        return 0;
    }
}
