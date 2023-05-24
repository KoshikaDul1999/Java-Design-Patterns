package com.koshika.designpatterns;

public class SingletonDemo {
    public static void main(String[] args) {
        //Testing the Singleton variation

        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        eagerSingleton.showMessage();
    }
}