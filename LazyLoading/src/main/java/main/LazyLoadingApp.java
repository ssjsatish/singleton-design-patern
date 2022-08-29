package main;

public class LazyLoadingApp {
    public static void main(String[] args) {
        LazyLoadSingleton instance1 = LazyLoadSingleton.getInstance();
        LazyLoadSingleton instance2 = LazyLoadSingleton.getInstance();
        System.out.println(instance2.equals(instance1));
        System.out.println(instance2.hashCode() == instance1.hashCode());
        System.out.println(instance1 == instance2);
    }
}
