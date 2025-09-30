package com.abhishek.practicejava.java

import com.abhishek.practicejava.java.recursion.GenerateSubset

fun main() {
   val generateSubsets= GenerateSubset()
    generateSubsets.generateSubsets("","abc")
    println(generateSubsets.subsets("","abc"))
}