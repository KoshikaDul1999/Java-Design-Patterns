package com.koshika.flexibleObserverDPatterns;

import java.util.ArrayList;

public class Admin implements AdminObserverble{

    ArrayList<StudentObserver> studentObserverArrayList = new ArrayList<>();

    private String msg;
    @Override
    public void addOberver(StudentObserver studentObserver) {
        studentObserverArrayList.add(studentObserver);
    }

    @Override
    public void removeObserver(StudentObserver studentObserver) {
        studentObserverArrayList.remove(studentObserver);
    }

    @Override
    public void notifyObserver() {
        for(StudentObserver studentObserver : studentObserverArrayList){
            studentObserver.update(msg);
        }
    }
}
