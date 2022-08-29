package main;

public class StaticBlockMainApp {
    public static void main(String[] args) {
        StaticBlockSingleton instance1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton instance2 = StaticBlockSingleton.getInstance();
        System.out.println(instance1.hashCode() == instance2.hashCode());
        System.out.println(instance1 == instance2);
    }
}
