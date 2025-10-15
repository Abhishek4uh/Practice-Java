package com.abhishek.practicejava.design.lruCache

fun main() {
    val cache = LRUCache<Int, String>(3)
    cache.put(1, "A")
    cache.put(2, "B")
    cache.put(3, "C")

    println(cache[1]) //A
    cache.put(4, "D") //Evicts key 2 (least recently used)
    println(cache[2]) //null
    println(cache[3]) //C
}