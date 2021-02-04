package academy.learnprogramming;

public class NumberToWords {

    public static void main(String[] args) {
//        numberToWords(102);
        System.out.println(getDigitCount(53));
    }

    public static void numberToWords(int number){
        int originalDigitCount = getDigitCount(number);
        number = reverse(number);
        int tempNumber = number;
        int newDigitCount = getDigitCount(number);
        int lastDigit = 0;
        String word;

        if (number > 0){
            while(number != 0){
                lastDigit = number % 10;
                number /= 10;

                switch (lastDigit){
                    case 0:
                        word = "Zero";
                        System.out.println(word);
                        break;

                    case 1:
                        word = "One";
                        System.out.println(word);
                        break;

                    case 2:
                        word = "Two";
                        System.out.println(word);
                        break;

                    case 3:
                        word = "Three";
                        System.out.println(word);
                        break;

                    case 4:
                        word = "Four";
                        System.out.println(word);
                        break;

                    case 5:
                        word = "Five";
                        System.out.println(word);
                        break;

                    case 6:
                        word = "Six";
                        System.out.println(word);
                        break;

                    case 7:
                        word = "Seven";
                        System.out.println(word);
                        break;

                    case 8:
                        word = "Eight";
                        System.out.println(word);
                        break;

                    case 9:
                        word = "Nine";
                        System.out.println(word);
                        break;
                }
            }
        }else if(number == 0){
            System.out.println("Zero");
        }else {
            System.out.println("Invalid Value");
        }

        if(newDigitCount != originalDigitCount){
            while(newDigitCount != originalDigitCount){
                tempNumber *= 10;
                newDigitCount = getDigitCount(tempNumber);
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number){

        int lastDigit = 0;
        int reversedNumber = 0;

        while(number != 0){
            lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        }
        int count;
        if(number == 0)
            count = 1;
        else
            count = 0;

        while(number != 0){
            number /= 10;
            count++;
        }
        return count;
    }
}
