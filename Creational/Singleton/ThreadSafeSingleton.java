package Creational.Singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    public ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}

class Main{
    public static void main(String[] args) {
        ThreadSafeSingleton obj1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton obj2 = ThreadSafeSingleton.getInstance();
        System.out.println(obj1 == obj2);
    }
}
