package com.abhishek.practicejava.design.singleton


fun main() {
    val instance = Logger.getInstance()
    val instance2 = Logger.getInstance()
    val instance3 = Logger.getInstance()
    instance.log("This is first instance: $instance")
    instance2.log("This is second instance: $instance2")
    instance3.log("This is third instance: $instance3")
}