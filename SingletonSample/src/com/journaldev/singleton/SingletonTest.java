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

        // Test ThreadSafeSingleton with synchronized method
        ThreadSafeSingleton threadSafeInstance1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeInstance2 = ThreadSafeSingleton.getInstance();

        System.out.println("\nThread Safe Singleton (synchronized method):");
        System.out.println(threadSafeInstance1.hashCode());
        System.out.println(threadSafeInstance2.hashCode());

        // Test ThreadSafeSingleton with double-checked locking
        ThreadSafeSingleton doubleLockingInstance1 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
        ThreadSafeSingleton doubleLockingInstance2 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();

        System.out.println("\nThread Safe Singleton (double-checked locking):");
        System.out.println(doubleLockingInstance1.hashCode());
        System.out.println(doubleLockingInstance2.hashCode());

        // Test BillPughSingleton
        BillPughSingleton billPughInstance1 = BillPughSingleton.getInstance();
        BillPughSingleton billPughInstance2 = BillPughSingleton.getInstance();

        System.out.println("\nBill Pugh Singleton:");
        System.out.println(billPughInstance1.hashCode());
        System.out.println(billPughInstance2.hashCode());
    }
}
