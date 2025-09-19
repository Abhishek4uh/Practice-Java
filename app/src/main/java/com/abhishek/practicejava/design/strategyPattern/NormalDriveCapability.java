package com.abhishek.practicejava.design.strategyPattern;

public class NormalDriveCapability implements Drive{
    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }
}
