package com.abhishek.practicejava.design.observerDesignPattern.observable;

import com.abhishek.practicejava.design.observerDesignPattern.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class NikeAirForce implements StocksObservable {

    public List<NotificationObserver> notificationObserverList = new ArrayList<>();

    Integer currentStockCount = 0;


    @Override
    public void add(NotificationObserver notificationObserver) {
        notificationObserverList.add(notificationObserver);
    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
        notificationObserverList.remove(notificationObserver);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationObserver notificationObserver : notificationObserverList) {
            notificationObserver.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if (currentStockCount == 0){
            notifySubscribers();
        }
        currentStockCount = currentStockCount + newStockAdded;
    }

    @Override
    public int getStockCount() {
        return currentStockCount;
    }
}
