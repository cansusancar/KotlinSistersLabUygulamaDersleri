package com.example.kotlinsisterslabuygulamadersleri.hafta2



    class Kalem : Cizilebilir, Cizilemez{
        override fun ciz() {
            println("Kalem ile çizim yapıldı.")
        }
        override fun cizme() {
            println("Kalem ile çizim yapılamadı.")
        }
    }
