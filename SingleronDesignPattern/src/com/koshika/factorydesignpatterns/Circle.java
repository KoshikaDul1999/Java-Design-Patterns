package com.koshika.factorydesignpatterns;

//2. Create concrete classes implementing the interface
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
