package com.koshika.singletondesignpatterns;

public class ThreadSafeSingleton {

    //creating a private static instance
    private static ThreadSafeSingleton threadSafeSingleton;

    //Make contructor private
    private ThreadSafeSingleton(){

    }

    //Return the only object available
    public static synchronized ThreadSafeSingleton getInstance(){
        if (threadSafeSingleton == null){
            threadSafeSingleton = new ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }

    //Sample method to test
    public void showMessage(){
        System.out.println("Hello From Thread Safe Singleton...");
    }
}
