package academy.learnprogramming;

import org.w3c.dom.ls.LSOutput;

public class SumOdd {

    public static void main(String[] args) {
//        System.out.println(sumOdd(1, 100));
    }


    public static boolean isOdd(int number){
        if(number < 0){
            return false;
        }else if(number % 2 == 0) {
            return false;
        }else {
            return true;
        }
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if((end < start) || (start < 0) || (end < 0)){
            return -1;
        }else {
            for(int i = start; i <= end; i++){
                if(isOdd(i)){
                    sum += i;
                }
            }
        }
        return sum;

    }
}
