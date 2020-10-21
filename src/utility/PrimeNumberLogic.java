package utility;

public class PrimeNumberLogic {
    public int Logic(int NumberRange){
        int counter , number=1,count;
        System.out.println("prime numbers in a range of "+NumberRange+" are: " );
        while (number<NumberRange){
            count=0;
            for (counter=2; counter<=number/2; counter++)
            {
                if (number%counter ==0)
                {
                    count++;
                    break;
                }
            }
            if (count==0 && number!=1)
            {
                System.out.println(number+" ");
            }
            number++;
        }
        return 0;
    }
}
