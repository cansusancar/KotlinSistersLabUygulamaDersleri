package com.example.kotlinsisterslabuygulamadersleri.hafta2

class Dikdortgen( val uzunluk: Double, val genislik: Double): Shape{

    override fun alan(): Double {
        return uzunluk * genislik
    }
}