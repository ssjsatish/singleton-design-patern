package main;

public class ThreadSafeSingletonApp {
    public static void main(String[] args) {
        ThreadSafeSynchronizedSingleton instance1 = ThreadSafeSynchronizedSingleton.getInstance();
        ThreadSafeSynchronizedSingleton instance2 = ThreadSafeSynchronizedSingleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode() == instance2.hashCode());

        System.out.println("Thread Safe singleton pattern using double checks ");
        ThreadSafeSingleton instance3 = ThreadSafeSingleton.getInstanceDoubleLocking();
        ThreadSafeSingleton instance4 = ThreadSafeSingleton.getInstanceDoubleLocking();
        System.out.println(instance3 == instance4);
        System.out.println(instance3.hashCode() == instance4.hashCode());
    }
}
