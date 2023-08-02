package com.example.kotlinsisterslabuygulamadersleri.hafta2

fun main() {

        val set1 = hashSetOf(1, 2, 3, 4)
        val set2 = hashSetOf(5, 6, 7)

        println("set1: $set1")
        println("set2: $set2")

        set1.addAll(set2)
        println("1. hashsetin 2. ye eklenmiş hali: $set1")

}