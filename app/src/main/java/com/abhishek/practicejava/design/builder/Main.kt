package com.abhishek.practicejava.design.builder


fun main() {
    val user = User.Builder("abhishek")
        .age(30)
        .phone("1234567890")
        .email("abhishek@example.com")
        .build()
    println(user)


    val alertDialog= AlertDialog
        .Builder("Exit Confirmation")
        .setMessage("Are you sure you want to exit?")
        .setNegativeButtonText("No")
        .setPositiveButtonText("Yes")
        .build()

    println(alertDialog)
}