package com.abhishek.practicejava.design.strategyPattern;

public class GoodsCar {
    Drive drive;

    public GoodsCar(Drive drive) {
        this.drive = drive;
    }

    public void drive() {
        drive.drive();
    }

}
