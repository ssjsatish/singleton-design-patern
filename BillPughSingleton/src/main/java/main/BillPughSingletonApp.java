package main;

public class BillPughSingletonApp {
    public static void main(String[] args) {
        BillPughSingleton instance1 = BillPughSingleton.getInstance();
        BillPughSingleton instance2 = BillPughSingleton.getInstance();
        System.out.println(instance1 == instance2);

    }
}
