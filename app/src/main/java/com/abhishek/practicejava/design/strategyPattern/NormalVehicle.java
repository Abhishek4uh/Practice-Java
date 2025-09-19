package com.abhishek.practicejava.design.strategyPattern;

public class NormalVehicle extends Vehicle{
    public NormalVehicle() {
        super(new NormalDriveStrategy());
    }

}
