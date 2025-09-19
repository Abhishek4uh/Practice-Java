package com.abhishek.practicejava.design.strategyPattern;

public class NormalCar {
    Drive drive;
    public NormalCar(Drive drive){
        this.drive = drive;
    }

    public void drive(){
        drive.drive();
    }
}