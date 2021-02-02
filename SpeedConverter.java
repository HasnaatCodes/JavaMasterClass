package academy.learnprogramming;

public class SpeedConverter {

    public static void main(String[] args) {
	    toMilesPerHour(10.25);
	    printConversion(1.5);
    }
    public static double toMilesPerHour (double kilometersPerHour){
        if (kilometersPerHour < 0){
            kilometersPerHour = -1;
        }else {
            kilometersPerHour /= 1.609d;
        }
        long roundedNumber = Math.round(kilometersPerHour);
        System.out.println(roundedNumber);
        return roundedNumber;
    }
    public static void printConversion(double kilometersPerHour){
        double milesPerHour = toMilesPerHour(kilometersPerHour);
        long roundedNumber = Math.round(milesPerHour);
        if(kilometersPerHour < 0){
            System.out.println("invalid value");
        }else {
            System.out.println(kilometersPerHour +  "km/h = " + roundedNumber + " mi/h");
        }
    }
}
