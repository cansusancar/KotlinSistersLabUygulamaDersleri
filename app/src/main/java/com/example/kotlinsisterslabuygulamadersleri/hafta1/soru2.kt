package com.example.sisterslabuygulamadersleri.hafta1
import java.util.Scanner
// faktoriyel hesaplama


fun main(){
    println ("faktoriyel sayisi:")
    val scanner = Scanner(System.`in`)
    val deger= scanner.nextInt ()
    faktoriyel(deger)
    /*
    val scanner = Scanner(System.`in`)
    println ("faktoriyel sayisi:")
    val sayi = scanner.nextInt ()
    var faktoriyel=1
    var hesaplama =""
    for (i in 1..sayi) {
        faktoriyel=faktoriyel * i
        hesaplama +=   if (i == 1) "$i" else " x$i"

    }
    println("$sayi! = $hesaplama= $faktoriyel ")
    scanner.close()

     */
}
fun faktoriyel(sayi:Int)  {
    var faktoriyel = 1
    for (i in 1..sayi) {
        faktoriyel =faktoriyel*i
    }
println("$faktoriyel")
}