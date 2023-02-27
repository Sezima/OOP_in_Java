package Meals;

public class Salad extends VegFood{
    String name = "Olivie";
    public Salad(){
        System.out.println("New const");


    }
    public Salad(String name, int price){
        super(name, price);

    }

}
