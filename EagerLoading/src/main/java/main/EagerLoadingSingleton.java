package main;

public class EagerLoadingSingleton {
    private static final EagerLoadingSingleton instance = new EagerLoadingSingleton();

    //private constructor to stop clients creating a new instance because its a Singleton design pattern
    private EagerLoadingSingleton() {}

    public static EagerLoadingSingleton getInstance() {
        return instance;
    }
}
