package com.example.kotlinsisterslabuygulamadersleri.hafta2
//Bir listedeki tek sayıları filtreleyen bir fonksiyon yazın
/*
fun main() {
    val liste = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val tekSayilar = filtreTekSayilar(liste)
    println("Tek Sayılar: $tekSayilar")
}

fun filtreTekSayilar(liste: List<Int>): List<Int> {
    return liste.filter { it % 2 != 0 }
}

 */
fun main() {
    val liste = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val tekSayilar = filtreTekSayilar(liste)
    println("Tek Sayılar: $tekSayilar")
}

fun filtreTekSayilar(liste: ArrayList<Int>): List<Int> {
    return liste.filter { it % 2 != 0 }
}

