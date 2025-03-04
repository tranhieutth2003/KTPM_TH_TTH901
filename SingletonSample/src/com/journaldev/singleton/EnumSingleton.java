package com.journaldev.singleton;

public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("Doing something in Enum Singleton");
    }
}
