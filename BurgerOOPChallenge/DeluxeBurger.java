package academy.learnprogramming;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger(String meat, String breadType) {
        super(meat, breadType);
        price = 5;
    }

    public void additions(){
        System.out.println("Your Deluxe Burger comes with chips and a drink");
    }


}
