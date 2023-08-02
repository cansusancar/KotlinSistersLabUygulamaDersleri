package com.example.kotlinsisterslabuygulamadersleri.hafta2

fun main() {
    val dikdortgen = Dikdortgen(5.0, 3.0)
    val a= dikdortgen.alan()
    println("Dikdörtgen Alanı: $a")


    val daire = Daire(4.0)
    val b= daire.alan()
    println("Daire Alanı: $b")

}
