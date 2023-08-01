package com.example.sisterslabuygulamadersleri.hafta1

/*
fun main(){
    val liste =ArrayList<Int>()

    println(liste)



    for(i in 1..5 ){

        var sayi=readLine()?.toIntOrNull()
        if(sayi != null) {
            liste.add(sayi)
        }
    }

liste.add(5)
liste.add(6)
liste.add(7)
liste.add(8)
liste.add(1)

val toplamHesabi = toplam(liste)
println(toplamHesabi)


}
fun toplam(liste:ArrayList<Int>): Int {
    var toplam= 0
    for (i in liste) {
        toplam = toplam +i
    }
    return toplam
}

 */
fun main() {
    val liste = ArrayList<Int>()


    println(liste)
    for (i in 1..5) {
        var sayi = readLine()?.toIntOrNull()
        if (sayi != null) {
            liste.add(sayi)
        }
    }

    val toplamHesabi = toplam(liste)
    println("Toplam: $toplamHesabi")
}

fun toplam(liste: ArrayList<Int>): Int {
    var toplam = 0
    for (i in liste) {
        toplam += i
    }
    return toplam
}

