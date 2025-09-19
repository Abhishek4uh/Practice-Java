package com.abhishek.practicejava.design.strategyPattern;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving normally");
    }
}
