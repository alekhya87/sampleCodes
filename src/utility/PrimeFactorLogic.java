package utility;

public class PrimeFactorLogic {
    public int Logic(int Number){
        for (int i=2; i*i<=Number; i++){
            int count=0;
            for (int j=2; j<i; j++)
            {
                if (i%j == 0)
                    count++;
            }
            if (count == 0){
                while (Number%i == 0) {
                    System.out.println("Prime Factor of "+ Number+" is "+i);
                    Number/=i;
                }
            }
        }
        if (Number != 1)
            System.out.println("Prime factor of "+ Number+" is "+Number);
        return 0;
    }
}
