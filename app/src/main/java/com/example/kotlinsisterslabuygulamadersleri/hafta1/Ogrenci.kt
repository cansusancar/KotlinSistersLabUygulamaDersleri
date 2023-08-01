package com.example.sisterslabuygulamadersleri.hafta1

/*
Bir "Öğrenci" adlı sınıf oluşturun ve öğrencilerin adı,
soyadı ve sınıfı gibi özellikleri içeren özellikleri tanımlayın. Ardından,
bu sınıftan beş öğrenci nesnesi oluşturun
ve bu öğrencilerin özelliklerini ekrana yazdıran bir fonksiyon yazın

 */
class Ogrenci(var ad:String,var soyad :String, var  sinif: Int ) {
    fun bilgiAl(){
        println("Ad : $ad")
        println("Soyad : $soyad")
        println("Sınıf : $sinif")
    }
}