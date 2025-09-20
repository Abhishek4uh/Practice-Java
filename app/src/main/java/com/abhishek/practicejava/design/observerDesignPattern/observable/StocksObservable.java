package com.abhishek.practicejava.design.observerDesignPattern.observable;

import com.abhishek.practicejava.design.observerDesignPattern.observer.NotificationObserver;

public interface StocksObservable {
    void add(NotificationObserver notificationObserver);
    void remove(NotificationObserver notificationObserver);
    void notifySubscribers();
    void setStockCount(int newStockAdded);
    int getStockCount();
}
