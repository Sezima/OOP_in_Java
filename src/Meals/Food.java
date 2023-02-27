package Meals;

public class Food {
    String name = "Beef";
    int price = 100;


    public Food(){
        System.out.println("no args");
    }

    public Food(String name, int price){
        this.name = name;
        this.price = price;
    }

}
