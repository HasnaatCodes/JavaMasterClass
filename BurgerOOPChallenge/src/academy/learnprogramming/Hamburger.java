package academy.learnprogramming;

import org.w3c.dom.ls.LSOutput;

public class Hamburger {

    private String meat;
    private String breadType;
    protected float price;

    public Hamburger(String meat, String breadType) {
        this.meat = meat;
        this.breadType = breadType;
        price = 3;
    }

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
        }
    }

    public static void addAdditions(){
        System.out.println("Type 1 to Add Lettuce \n" +
                "Type 2 to Add Tomatoes \n" +
                "Type 3 to Add Carrots \n" +
                "Type 4 to Add Cheese \n");
    }


    public void addLettuce(){
        System.out.println("Lettuce Added to Burger");
        price += 0.30;
        System.out.println("New Price = " + price);
    }

    public void addTomato(){
        System.out.println("Tomato Added to Burger");
        price += 0.30;
        System.out.println("New Price = " + price);

    }

    public void addCarrot(){
        System.out.println("Carrot Added to Burger");
        price += 0.40;
        System.out.println("New Price = " + price);

    }

    public void addCheese(){
        System.out.println("Cheese Added to Burger");
        price += 0.50;
        System.out.println("New Price = " + price);
    }

    public float getPrice() {
        return (float) Math.round(price * 100) / 100;
    }

}
