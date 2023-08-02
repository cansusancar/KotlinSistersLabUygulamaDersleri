package com.example.kotlinsisterslabuygulamadersleri.hafta2

import kotlin.math.PI

class Daire( val yaricap: Double ): Shape {

        override fun alan(): Double {
            return PI * yaricap * yaricap
        }
}


