package com.journaldev.singleton;

public class SingletonTest {
    public static void main(String[] args) {

        // Test EagerInitializedSingleton
        EagerInitializedSingleton eagerInstance1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton eagerInstance2 = EagerInitializedSingleton.getInstance();

        System.out.println("Eager Initialized Singleton:");
        System.out.println(eagerInstance1.hashCode());
        System.out.println(eagerInstance2.hashCode());

        // Test StaticBlockSingleton
        StaticBlockSingleton staticBlockInstance1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton staticBlockInstance2 = StaticBlockSingleton.getInstance();

        System.out.println("\nStatic Block Singleton:");
        System.out.println(staticBlockInstance1.hashCode());
        System.out.println(staticBlockInstance2.hashCode());

        // Test LazyInitializedSingleton
        LazyInitializedSingleton lazyInstance1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton lazyInstance2 = LazyInitializedSingleton.getInstance();

        System.out.println("\nLazy Initialized Singleton:");
        System.out.println(lazyInstance1.hashCode());
        System.out.println(lazyInstance2.hashCode());
    }
}
