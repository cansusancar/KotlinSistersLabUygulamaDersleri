package com.example.sisterslabuygulamadersleri.hafta1



    class Elma ( renk :String , var vitaminDegeri: String) : Meyve ( "Elma" , renk ){

        override fun yiyebilir() {
            println("yiyemez")
        }
        override fun bilgiAl(){
            println("$renk")
            println("$vitaminDegeri")
        }



    }
