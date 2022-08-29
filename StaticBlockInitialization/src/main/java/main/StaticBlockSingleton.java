package main;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {}

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e ) {
            throw new RuntimeException("Exception occured while creating the intance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
