package Behavioral.FactoryMethod.PizzaFactory;

public class VegPizza implements Pizza{
    
    @Override
    public void prepare(){

        System.out.println("Preparing Veg Pizza");

    }

}
