package academy.learnprogramming;

public class HealthyBurger extends Hamburger {

    public HealthyBurger(String meat) {
        super(meat, "brownBread");
        price = 4;
    }

    @Override
    public void selectedAdditions(String choice){
        switch(choice){
            case "1":
                addLettuce();
                break;
            case "2":
                addTomato();
                break;
            case "3":
                addCarrot();
                break;
            case "4":
                addCheese();
                break;
            case "5":
                addJalapenos();
            case "6":
                addMayo();
        }
    }

    public void addJalapenos(){
        System.out.println("Jalapenos Added to Burger");
        price += 0.30;
        System.out.println("New Price = " + price);
    }

    public void addMayo(){
        System.out.println("Mayo Added to Burger");
        price += 0.30;
        System.out.println("New Price = " + price);
    }

    public static void addAdditions(){
        System.out.println("Type 1 to Add Lettuce \n" +
                "Type 2 to Add Tomatoes \n" +
                "Type 3 to Add Carrots \n" +
                "Type 4 to Add Cheese \n" +
                "Type 5 to Add Jalapenos \n" +
                "Type 6 to Add Mayo \n");
    }

}
