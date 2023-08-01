package com.example.sisterslabuygulamadersleri.hafta1
/*
Meyve" adlı bir üst sınıf oluşturun ve bu sınıfta meyvelerin adı ve tatlılık derecesi
 gibi özellikleri tanımlayın.
Ardından "Elma" adlı bir alt sınıf oluşturun ve bu sınıfta elmalara özgü özellikleri ekleyin.
"Elma" sınıfı "Meyve" sınıfından kalıtım almalıdır.
Elma sınıfında "vitaminDegeri" adlı bir özelliği ve "yiyebilir" adlı bir metodu ekleyin.
 */
open class Meyve  ( var ad :String, var  renk: String ) {

  open fun bilgiAl() {
    println("$ad")
    println("$renk")
  }
  open fun  yiyebilir() {
    println("yiyebilir")

}
}