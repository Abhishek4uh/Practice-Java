package com.abhishek.practicejava.design.factory;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Material Button");
    }
}
