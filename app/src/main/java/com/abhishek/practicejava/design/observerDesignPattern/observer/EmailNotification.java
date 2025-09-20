package com.abhishek.practicejava.design.observerDesignPattern.observer;

import com.abhishek.practicejava.design.observerDesignPattern.observable.StocksObservable;

public class EmailNotification implements NotificationObserver{

    StocksObservable stocksObservable;
    String email;

    public EmailNotification(String email,StocksObservable stocksObservable) {
        this.email = email;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update(){
        sendEmail("product is in stock hurry up");
    }

    private void sendEmail(String msg) {
        System.out.println("Email sent to " + email + " with message: " + msg);
    }
}
