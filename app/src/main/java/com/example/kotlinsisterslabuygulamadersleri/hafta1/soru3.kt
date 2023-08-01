package com.example.sisterslabuygulamadersleri.hafta1

import java.util.Scanner
//2 sayının toplama, cıkarma,carpma, bolme islemleri
fun main() {
    val scanner = Scanner(System.`in`)
    println("sayi1:")
    val deger = scanner.nextInt()

    val scanner2 = Scanner(System.`in`)
    println("sayi2:")
    val deger2 = scanner2.nextInt()

    islemler(deger, deger2)
}

fun islemler(x: Int, y: Int) {
    var toplama = x + y
    var cikarma = x - y
    var carpma = x * y
    var bolme = x / y

    println("Toplama: $toplama")
    println("Çıkarma: $cikarma")
    println("Çarpma: $carpma")
    println("Bölme: $bolme")
}
