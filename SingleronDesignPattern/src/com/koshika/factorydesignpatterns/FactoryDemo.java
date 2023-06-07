package com.koshika.factorydesignpatterns;

//4.Use the Factory to get object of concrete classes
// by passing information
public class FactoryDemo {
    public static void main(String[] args) {
        //Create a specific object through factory and test it
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();
    }
}
