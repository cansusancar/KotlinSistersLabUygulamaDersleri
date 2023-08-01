package com.example.sisterslabuygulamadersleri.hafta1

//Sayının asal olup olmadığını kontrol eden bir fonksiyonu nasıl yazarsınız?

import java.util.Scanner

fun main () {



    println("Asal olup olmadıgı hesaplanacak sayiyi giriniz:")
    var girdi= Scanner(System.`in`)
    var sayi= girdi.nextInt()
    asalMi(sayi)
}
fun asalMi(number: Int) {
    var isPrime = true

    if (number <= 1) {
        isPrime = false
    } else {
        for (i in 2..(number / 2)) {
            if (number % i == 0) {
                isPrime = false
                break
            }
        }
    }

if (isPrime== true) {
    println("Sayı asaldır.")
} else {
    println("Sayı asal değildir.")
}
}
