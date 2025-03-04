package com.journaldev.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
    public static void main(String[] args) {
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;

        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                // Phá vỡ singleton bằng cách setAccessible(true)
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("HashCode of instanceOne: " + instanceOne.hashCode());
        System.out.println("HashCode of instanceTwo: " + instanceTwo.hashCode());
    }
}
