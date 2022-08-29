package main;

public class EagerLoadMainApp {
    public static void main(String[] args) {
        EagerLoadingSingleton instance1 = EagerLoadingSingleton.getInstance();
        EagerLoadingSingleton instance2 = EagerLoadingSingleton.getInstance();
        System.out.println(instance2 == instance1);
    }
}
