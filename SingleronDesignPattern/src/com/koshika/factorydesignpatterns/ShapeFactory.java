package com.koshika.factorydesignpatterns;

public class ShapeFactory {
    public Shape getShape(String name){
        if(name == null){
            return null;
        } else if (name.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (name.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (name.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return  null;
    }
}
