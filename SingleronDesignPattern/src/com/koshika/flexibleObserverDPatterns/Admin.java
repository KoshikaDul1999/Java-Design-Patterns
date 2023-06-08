package com.koshika.flexibleObserverDPatterns;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin implements AdminObserverble{

    ArrayList<StudentObserver> studentObserverArrayList = new ArrayList<>();

    private String msg;

    Scanner scanner = new Scanner(System.in);
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

    public void sendMessage(){
        System.out.println("Enter the message :");
        msg = scanner.nextLine();
        notifyObserver();
    }
}
