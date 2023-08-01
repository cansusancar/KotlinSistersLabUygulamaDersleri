package com.example.sisterslabuygulamadersleri.hafta1
import java.util.Scanner


// sayıyı ondalık sayıya cevirme
fun main() {
    val scanner = Scanner(System.`in`)
    print("Sayıyı giriniz: ")

    val userInput = scanner.nextInt()

    try {
        val convertedNumber = userInput.toDouble()
        val convertedNumber2 = userInput.toFloat()
        println("Girilen sayı: $convertedNumber")
        println("Girilen sayı: $convertedNumber")
    } catch (e: NumberFormatException) {
        println("Geçersiz bir sayı girdiniz.")
    }
}




