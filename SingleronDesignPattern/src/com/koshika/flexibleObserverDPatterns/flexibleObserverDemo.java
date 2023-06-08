package com.koshika.flexibleObserverDPatterns;

public class flexibleObserverDemo {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Student student = new Student("Koshika");

        admin.addOberver(student);
        admin.notifyObserver();
    }
}
