package com.koshika.abstractfactorydesignpatterns;

public abstract class AbstractFactory {
    abstract Color getColor(String colorType);
    abstract Shape getShape(String shapeType) ;
}
