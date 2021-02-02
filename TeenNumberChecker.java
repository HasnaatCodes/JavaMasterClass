package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99,19));
    }

    public static boolean hasTeen(int numberOne, int numberTwo, int numberThree){
//        if (numberOne >= 13 && numberOne <= 19){
//            return true;
//        }else if(numberTwo >= 13 && numberTwo <= 19){
//            return true;
//        }else if (numberThree >= 13 && numberThree <= 19){
//            return true;
//        }else {
//            return false;
//        }
        return isTeen(numberOne) || isTeen(numberTwo) || isTeen(numberThree);
    }

    public static boolean isTeen(int numberOne){
        if(numberOne >= 13 && numberOne <= 19){
            return true;
        }else{
            return false;
        }

    }

}
