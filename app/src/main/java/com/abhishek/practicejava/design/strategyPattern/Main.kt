package com.abhishek.practicejava.design.strategyPattern


fun main() {

    val sportsDriveCapability= SportsDriveCapability()
    val normalDriveCapability = NormalDriveCapability()


    val normalCar= NormalCar(normalDriveCapability)
    normalCar.drive()

    val sportsCar= NormalCar(sportsDriveCapability)
    sportsCar.drive()


    val goodsCar = GoodsCar(normalDriveCapability)
    goodsCar.drive()


}