package com.abhishek.practicejava.design.strategyPattern;

public class SportsCar {
    Drive drive;
    public SportsCar(Drive drive) {
        this.drive = drive;
    }

    public void drive() {
        drive.drive();
    }
}
