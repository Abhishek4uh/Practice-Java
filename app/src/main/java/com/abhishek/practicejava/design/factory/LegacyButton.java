package com.abhishek.practicejava.design.factory;

public class LegacyButton implements  Button{
    @Override
    public void render() {
        System.out.println("Rendering Legacy Button");
    }
}
