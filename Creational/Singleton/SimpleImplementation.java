package Creational.Singleton;

public class SimpleImplementation {
    private static SimpleImplementation instance;

    private SimpleImplementation(){

    }

    public static SimpleImplementation getInstance(){

        if(instance == null){
            instance = new SimpleImplementation();
        }
        return instance;
    }
}

class Object{
    public static void main(String[] args) {
        SimpleImplementation obj1 = SimpleImplementation.getInstance();
        SimpleImplementation obj2 = SimpleImplementation.getInstance();
        System.out.println(obj1==obj2);
    }
}
