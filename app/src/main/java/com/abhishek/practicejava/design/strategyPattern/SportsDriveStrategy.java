package com.abhishek.practicejava.design.strategyPattern;


public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving fast and sporty");
    }
}
