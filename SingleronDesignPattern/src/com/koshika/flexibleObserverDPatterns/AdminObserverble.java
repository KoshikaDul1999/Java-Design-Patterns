package com.koshika.flexibleObserverDPatterns;

public interface AdminObserverble {
    public void addOberver(StudentObserver studentObserver);
    public void removeObserver(StudentObserver studentObserver);
    public void notifyObserver();
}
