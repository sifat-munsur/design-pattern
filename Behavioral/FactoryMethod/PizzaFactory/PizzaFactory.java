package Behavioral.FactoryMethod.PizzaFactory;

public class PizzaFactory {
    public static Pizza createPizza(String type){
        if(type.equalsIgnoreCase("cheese")){
            return new CheesePizza();
        }

        if(type.equalsIgnoreCase("chicken")){
            return new ChickenPizza();
        }

        if(type.equalsIgnoreCase("veg")){
            return new VegPizza();
        }
        throw new IllegalArgumentException("Unknown pizza type");
    }
}
