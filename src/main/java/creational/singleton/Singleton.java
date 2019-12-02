package creational.singleton;

public class Singleton {

    private static Singleton singleton = null;

    private Singleton(){
        System.out.println("Initialize singleton");
    }

    public static Singleton getInstance(){
        if (singleton ==null){
            singleton = new Singleton();
        }else {
            System.out.println("Singleton is already initialized");
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton singleton = getInstance();

        singleton = getInstance();

        Singleton singleton1 = getInstance();
    }
}
