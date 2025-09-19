package com.abhishek.practicejava.design.strategyPattern
/**
🧨 Problem Statement (Vehicle Driving Behavior)

I have a base Drive class with a drive() method.
Then I have multiple vehicle types like GoodsVehicle, NormalVehicle, SportsVehicle, etc.

Each vehicle needs different driving behavior, so they override the drive() method.
But this leads to duplicate code, because each class writes its own version of drive() — even if some are similar.

If I want to reuse a specific driving style in another vehicle, I have to copy-paste the code again.

So:

Code is repetitive

Drive logic is scattered across classes

Hard to reuse or change behavior

Violates Single Responsibility Principle

✅ This is where the Strategy Pattern helps by moving the driving behavior out of the vehicle classes and into separate reusable strategy classes.
 **/


fun main() {
    val normalVehicle= NormalVehicle()
    normalVehicle.drive()

    val sportVehicle= SportsVehicle()
    sportVehicle.drive()

    val goodsVehicle = GoodsVehicle()
    goodsVehicle.drive()

}