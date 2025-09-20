package com.abhishek.practicejava.design.observerDesignPattern.observer;

import com.abhishek.practicejava.design.observerDesignPattern.observable.StocksObservable;

public class SmsNotification implements NotificationObserver{

    StocksObservable stocksObservable;
    String phoneNumber;

    public SmsNotification(String phoneNumber,StocksObservable stocksObservable) {
        this.phoneNumber = phoneNumber;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendSms("product is in stock hurry up");
    }

    private void sendSms(String msg) {
        System.out.println("SMS sent to " + phoneNumber + " with message: " + msg);
    }
}
