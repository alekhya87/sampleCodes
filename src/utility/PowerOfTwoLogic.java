package utility;

public class PowerOfTwoLogic {
    int count =0;
    double poweroftwo;
    public int Logic(int NumberPower){
        while (count <= NumberPower) {
            poweroftwo =Math.pow(2,count);
            count++;
            System.out.println("power of two are :" + String.format("%.0f",poweroftwo));
        }
            return 0;
    }
}
