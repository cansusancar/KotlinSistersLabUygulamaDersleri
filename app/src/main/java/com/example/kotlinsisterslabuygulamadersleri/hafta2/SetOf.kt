package com.example.kotlinsisterslabuygulamadersleri.hafta2

//setOf olarak döndürme
fun main() {

    val liste = listOf(1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 1, 10)
    val yeniListe= sadelesmisListe(liste)
    println("$yeniListe")
}

fun sadelesmisListe(liste: List<Int>):Set<Int>{

  return liste.toSet() }
