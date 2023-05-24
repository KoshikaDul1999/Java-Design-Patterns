package com.koshika.designpatterns;

public class EagerSingleton {

    //creating a private static instance
    private static EagerSingleton eagerSingleton = new EagerSingleton();

    //Make constructor private
    private EagerSingleton(){
    }

    //Return the only object available
    public static EagerSingleton getInstance(){
        return eagerSingleton;
    }

    //Sample method to test
    public void showMessage(){
        System.out.println("Hello from Eager Singleton!!!");
    }
}
