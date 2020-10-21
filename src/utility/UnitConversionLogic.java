package utility;

import java.util.Scanner;

public class UnitConversionLogic
{
    public int ConversionsLogic(int Feets, int Inches, int Meters)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter an options from \n1)feets to inch \n2)feet to meter \n3)inch to feet \n4)meter to feet");
        int option=scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("unit conversions for feet to inches  is "+Feets*12);
                break;
            case 2:
                System.out.println("Unit conversions for feet to meters is :"+Feets*0.3048);
                break;
            case 3:
                System.out.println("unit conversions for inches to feet's is "+Inches/12);
                break;
            case 4:
                System.out.println("Unit conversions for meters to feet's is :"+Meters/0.3048);
                break;
            default:
                System.out.println("given input is wrong");
                break;
        }
        return 0;
    }
}
