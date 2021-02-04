package academy.learnprogramming;

public class EqualSumChecker {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1,2));
    }

    public static boolean hasEqualSum(int numberOne, int numberTwo, int numberThree){

        if ((numberOne + numberTwo) == numberThree){
            return true;
        }
        return false;
    }


}
