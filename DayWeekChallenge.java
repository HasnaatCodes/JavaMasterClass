package academy.learnprogramming;

public class DayWeekChallenge {

    public static void main(String[] args) {
	printDayOfTheWeek(5);
	echoDayOfTheWeek(4);
    }





    public static void printDayOfTheWeek(int day) {

        switch (day) {
            case 0:
                System.out.println("Today is Monday");
                break;

            case 1:
                System.out.println("Today is Tuesday");
                break;

            case 2:
                System.out.println("Today is Wednesday");
                break;

            case 3:
                System.out.println("Today is Thursday");
                break;

            case 4:
                System.out.println("Today is Friday");
                break;

            case 5:
                System.out.println("Today is Saturday");
                break;

            case 6:
                System.out.println("Today is Sunday");
                break;

            default:
                System.out.println("Invalid Day");
                break;
        }
    }

    public static void echoDayOfTheWeek(int day){
        if (day == 0)
            System.out.println("Today is Monday");
        else if (day == 1)
            System.out.println("Today is Tuesday");
        else if (day == 2)
            System.out.println("Today is Wednesday");
        else if (day == 3)
            System.out.println("Today is Thursday");
        else if (day == 4)
            System.out.println("Today is Friday");
        else if (day == 5)
            System.out.println("Today is Saturday");
        else if (day == 6)
            System.out.println("Today is Sunday");
        else
            System.out.println("Invalid Day");

    }
}
