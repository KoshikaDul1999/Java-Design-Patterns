package com.koshika.decoratordesignpatterns;

public class ComMoniter extends ComputerDecorator{
    Computer moniCom;
    public ComMoniter(Computer com) {
        moniCom = com;
    }

    @Override
    public String description() {

        return moniCom.description() + " and a Monitor ";
    }
}
