package com.journaldev.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {}

    // Inner static class responsible for holding the Singleton instance
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
