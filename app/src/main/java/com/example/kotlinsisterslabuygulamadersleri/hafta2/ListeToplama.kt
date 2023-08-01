package com.example.kotlinsisterslabuygulamadersleri.hafta2

/*
Verilen bir listedeki tüm elemanları toplayan bir fonksiyon yazın.
 */
fun main() {
    val liste =  listOf(10, 20, 30, 40, 50)

    val toplamHesabi = toplam(liste)
    println("Toplam: $toplamHesabi")
}

fun toplam(liste: List<Int>): Int {
    var toplam = 0
    for (eleman in liste) {
        toplam += eleman
    }
    return toplam
}
