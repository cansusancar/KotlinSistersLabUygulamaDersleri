package com.example.kotlinsisterslabuygulamadersleri.hafta2

    class Silgi : Cizilebilir {
        override fun ciz() {
            println("Silgi ile çizim yapıldı.")
        }

    }
        fun main() {
            val kalem = Kalem()
            val silgi = Silgi()

            kalem.ciz()
            silgi.ciz()
            kalem.cizme()
        }


