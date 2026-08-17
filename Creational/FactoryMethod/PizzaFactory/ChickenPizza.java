package Creational.FactoryMethod.PizzaFactory;

public class ChickenPizza implements Pizza{

    @Override
    public void prepare(){
        System.out.println("Preparing Chicken Pizza");
    }
    
}
