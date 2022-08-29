package main;

public class ThreadSafeSynchronizedSingleton {
    private static ThreadSafeSynchronizedSingleton instance;

    private ThreadSafeSynchronizedSingleton() {}

    public static synchronized ThreadSafeSynchronizedSingleton getInstance() {
        if(instance == null)
            instance = new ThreadSafeSynchronizedSingleton();
        return instance;
    }
}
