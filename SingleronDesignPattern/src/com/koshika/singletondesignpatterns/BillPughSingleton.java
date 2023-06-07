package com.koshika.singletondesignpatterns;

public class BillPughSingleton {

    //make constructor private
    public BillPughSingleton() {
    }

    private static class Helper{
        //create the private static final object
        private static final BillPughSingleton bps = new BillPughSingleton();
    }

    //return the only object available
    public static BillPughSingleton getInstance(){
        return Helper.bps;
    }

    public void showMessage(){
        System.out.println("Hello From Bill Pugh Singleton...!!!");
    }
}
