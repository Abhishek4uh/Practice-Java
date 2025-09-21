package com.abhishek.practicejava.design.observerDesignPattern

import com.abhishek.practicejava.design.observerDesignPattern.observable.NikeAirForce
import com.abhishek.practicejava.design.observerDesignPattern.observable.StocksObservable
import com.abhishek.practicejava.design.observerDesignPattern.observer.EmailNotification
import com.abhishek.practicejava.design.observerDesignPattern.observer.SmsNotification


fun main(){
    val nikeAirForce:StocksObservable= NikeAirForce()
    val smsNotification= SmsNotification("+919876543210", nikeAirForce)
    val emailNotification= EmailNotification("abhishek@gmail.com", nikeAirForce)
    val emailNotification2= EmailNotification("JhonDoe@gmail.com", nikeAirForce)
    nikeAirForce.add(smsNotification)
    nikeAirForce.add(emailNotification)
    nikeAirForce.add(emailNotification2)
    nikeAirForce.setStockCount(10)
}