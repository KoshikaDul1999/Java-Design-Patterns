package com.koshika.abstractfactorydesignpatterns;

public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Filling Red...");
    }
}
