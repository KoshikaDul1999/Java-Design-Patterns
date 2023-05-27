package com.koshika.singletondesignpatterns;

public class LazySingleton {

    private static LazySingleton lazySingleton;


    private LazySingleton(){
    }


    public static LazySingleton getInstance(){
        if (lazySingleton == null)
        {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }


    public void showMessage(){
        System.out.println("Hello form Lazy Singleton...");
    }
}
