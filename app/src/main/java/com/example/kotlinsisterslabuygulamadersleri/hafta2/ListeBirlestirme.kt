package com.example.kotlinsisterslabuygulamadersleri.hafta2

//Ornek1:(2 parametre alan bir fonksiyon çağırarak: + operatoruyle)
/* fun main() {
    val liste1 = listOf(5, 1, 9, 3, 7)
    val liste2 = listOf(2, 4, 6, 8, 10)

    val birlesikListe = birlestirVeSirala(liste1, liste2)
    println("Birleştirilmiş ve Sıralanmış Liste: $birlesikListe")
}

fun birlestirVeSirala(liste1: List<Int>, liste2: List<Int>): List<Int> {
    val birlesikListe = liste1 + liste2
    return birlesikListe.sorted() // veya birlesikListe.sortedBy { it } (artan sıralama)
}

 */

//Ornek2:(addAll yöntemiyle)
/*
fun main() {
    val liste1 = mutableListOf(1, 2, 3)
    val liste2 = listOf(4, 5, 6)

    liste1.addAll(liste2)

    println("Birleştirilmiş Liste: $liste1")
}

 */

//Ornek3:(fonksiyonsuz: + operatoruyle)

fun main() {
    val liste1 = listOf(1, 2, 3)
    val liste2 = listOf(4, 5, 6)

    val birlesikListe = liste1 + liste2
    println("$birlesikListe")
}
