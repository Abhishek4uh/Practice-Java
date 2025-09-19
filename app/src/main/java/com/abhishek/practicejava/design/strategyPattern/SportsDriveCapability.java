package com.abhishek.practicejava.design.strategyPattern;


public class SportsDriveCapability implements Drive{
    @Override
    public void drive() {
        System.out.println("Sports Drive Capability");
    }
}
