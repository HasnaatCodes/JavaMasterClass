package academy.learnprogramming;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int maxAdditions = 6;

        HealthyBurger healthy = new HealthyBurger("chicken");

        System.out.println("Healthy Burger Price is " + healthy.getPrice());

//        Hamburger hamburger = new Hamburger("chicken", "white buns");
//        System.out.println("Hamburger Price is " + hamburger.getPrice());
        Scanner scanner = new Scanner(System.in);
//
//
        System.out.println("Would you like to add any additions? Press 'Y' for yes and 'N' for no");
        String addExtras = scanner.nextLine();
        String choice;
//
        if(addExtras.toUpperCase().equals("Y")){
//
            HealthyBurger.addAdditions();
//            Hamburger.addAdditions();
            choice = scanner.nextLine();
//            hamburger.selectedAdditions(choice);
            healthy.selectedAdditions(choice);


//
            for(int i=1; i < maxAdditions; i++){
                System.out.println("Would you like to add more additions? Press 'Y' for yes and 'N' for no");
                addExtras = scanner.nextLine();

                if(addExtras.toUpperCase().equals("Y")){
//                    Hamburger.addAdditions();
                    HealthyBurger.addAdditions();
                    choice = scanner.nextLine();
                    healthy.selectedAdditions(choice);
//                    hamburger.selectedAdditions(choice);
                }else{
//                    System.out.println("Final Price is " + hamburger.getPrice());
                    System.out.println("Final Price is " + healthy.getPrice());
                    break;
                }
            }
        }
    }

}
