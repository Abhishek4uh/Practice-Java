package com.abhishek.practicejava.design.strategyPattern;

public class GoodsDriveStrategy implements DriveStrategy {
    public void drive() {
        System.out.println("Driving with heavy load");
    }
}
