package com.abhishek.practicejava.design.strategyPattern;

public class GoodsVehicle extends Vehicle{

    public GoodsVehicle() {
        super(new GoodsDriveStrategy());
    }

}
