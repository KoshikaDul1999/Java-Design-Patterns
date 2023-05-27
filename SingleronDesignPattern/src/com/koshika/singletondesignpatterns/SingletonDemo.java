package com.koshika.singletondesignpatterns;

public class SingletonDemo {
    public static void main(String[] args) {
        //Testing the Singleton variation

        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        eagerSingleton.showMessage();

        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.showMessage();

        StaticSingleton staticSingleton = StaticSingleton.getInstance();
        staticSingleton.showMessage();
    }
}