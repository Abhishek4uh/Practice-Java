package com.abhishek.practicejava.design.factory

/**
The Factory Pattern provides an interface for creating objects, but lets subclasses or logic decide which class to instantiate.

🔧 In simple terms:

You have many related classes ---> Factory can decide which one to create
You want to avoid new scattered all over ---> Centralized creation logic

It hides the object creation logic and makes the code more modular and easy to extend.
 **/

fun main() {
    val button= ButtonFactory.create()
    button.render()
}