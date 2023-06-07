package com.koshika.decoratordesignpatterns;

public class MyDecoratorDemo {
    public static void main(String[] args) {
        Computer com = new Computer();
        //System.out.println(com.description());

        com = new ComDVD(com);
        //System.out.println(comd.description());

        com = new ComMoniter(com);
        System.out.println(com.description());
    }
}
