package com.abhishek.practicejava.java.hashmap


fun main() {

    /*

    val nMap = HashMap<String,Int>()
    nMap["player1"] = 121
    nMap["player2"] = 22

    println(nMap)
    println(nMap["player1"])
    println(nMap.containsValue(121))
    println(nMap.containsValue(122))


    println("\n<------->\n")


    val playerMap= HashMap<Player, Rank>()
    playerMap[Player("player1")] = Rank(121)
    playerMap[Player("player2")] = Rank(22)

    println(playerMap)
    println(playerMap[Player("player1")])
    println(playerMap.containsValue(Rank(121)))
    println(playerMap.containsValue(Rank(122)))


    println("\n<----Other Implementation--->\n")



    val customHashmap= CustomHashmap<Int,String>()
    customHashmap.put(1,"Java")
    customHashmap.put(2,"Kotlin")
    customHashmap.put(3,"Python")
    customHashmap.put(4,"C++")
    customHashmap.put(5,"JavaScript")
    println(customHashmap.get(1))
    customHashmap.put(1,"Dart")
    println(customHashmap.get(1))
    println(customHashmap.containsKey(1))
    println(customHashmap.containsKey(6))
    println(customHashmap.containsValue("Kotlin"))
    println(customHashmap.containsValue("Swift"))
    customHashmap.remove(1)
    customHashmap.iterator()
    println(customHashmap.size())

*/



    val testMap = HashMap<String,Int>()
    testMap["player1"] = 121
    testMap["player2"] = 22


    println(testMap["player1"])
    println(testMap.containsValue(121))
    println(testMap.containsValue(122))


    println("\n<------->\n")


    val playerTestMap = CustomHashmap<Player, Rank>()
    playerTestMap.put(Player("player1"), Rank(121))
    playerTestMap.put(Player("player2"), Rank(22))


    println(playerTestMap[Player("player1")])
    println(playerTestMap.containsValue(Rank(121)))
    println(playerTestMap.containsValue(Rank(122)))

}
