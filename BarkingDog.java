package academy.learnprogramming;

public class BarkingDog {
    public static void main(String[] args) {

        System.out.println("hello");
        boolean result = shouldWakeUp(true, 24);
        System.out.println(result);

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if (hourOfDay > 22 || hourOfDay < 8) {
            return true;
        } else if (hourOfDay > 23 || hourOfDay < 0){
            return false;
        } else {
            return false;
        }

    }
}

public class Main {

    public static void main(String[] args) {
        //boolean result = shouldWakeUp(true, 24);
        System.out.println(shouldWakeUp(true, 0));

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if (hourOfDay >= 0 && hourOfDay < 8 && barking){
            return true;
        }else if (hourOfDay > 7 && hourOfDay < 23){
            return false;
        }else if (hourOfDay > 22 && hourOfDay <= 23 & barking){
            return true;
        }else if (hourOfDay > 23){
            return false;
        }else {
            return false;
        }

    }

}
