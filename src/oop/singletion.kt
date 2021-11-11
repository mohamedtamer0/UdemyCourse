package oop


fun main() {
    // 1 Instance
    println(FavoriteFood.name)
    FavoriteFood.name = "Watermelon"
    println(FavoriteFood.name)
    FavoriteFood.list.add("Salt")
    println(FavoriteFood.list.first())
    doStuff()
    println(FavoriteFood.name)
}

fun doStuff() {
    FavoriteFood.name = "Chicken"
}

