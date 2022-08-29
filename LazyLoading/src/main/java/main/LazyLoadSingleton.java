package main;

public class LazyLoadSingleton {
    private static LazyLoadSingleton instance;

    private LazyLoadSingleton() {}
    public static LazyLoadSingleton getInstance() {
        if(instance == null)
            instance = new LazyLoadSingleton();
        return instance;
    }
}
