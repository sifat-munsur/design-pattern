package Behavioral.FactoryMethod.PizzaFactory;

public class Main {
    public static void main(String[] args) {
        
        Pizza pizza = PizzaFactory.createPizza("chicken");
        pizza.prepare();        

    }
}
