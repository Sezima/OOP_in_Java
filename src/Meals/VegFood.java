package Meals;

public class VegFood extends Food {
    int price = 100;
    String name = "Salad with eggs";


    public VegFood() {
        System.out.println("First constructuor");


    }

    public VegFood(String name, int price) {
        super(name, price);

    }
}




