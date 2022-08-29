package main;

import java.lang.reflect.Constructor;
public class ReflectionInActionApp {
    public static void main(String[] args) {
        EagerLoadingSingleton instance1 = EagerLoadingSingleton.getInstance();
        EagerLoadingSingleton instance2 = null;
        try {
            Constructor[] constructors = EagerLoadingSingleton.class.getDeclaredConstructors();
            for(Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instance2 = (EagerLoadingSingleton) constructor.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        System.out.println(instance1 == instance2);
    }
}
