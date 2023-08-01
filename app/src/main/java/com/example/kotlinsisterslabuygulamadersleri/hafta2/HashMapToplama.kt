package com.example.kotlinsisterslabuygulamadersleri.hafta2

//Bir HashMap'teki tüm değerleri toplayan bir fonksiyon yazın.


fun main() {
    println("alınan eşyaların fiyatı:")
    val hashMap = mapOf(
        "arabanın fiyatı" to 10,
        "bilgisayarın" to 20,
        "çantanın" to 30,
        "vazonun fiyatı" to 40,
        "gözlüğün fiyatı" to 50
    )

    println(hashMap)
    println("Total fiyat:")
    val toplam = toplamTumDegerler(hashMap)
    print("     $toplam")
}

fun toplamTumDegerler(hashMap: Map<String, Int>): Int {
    var toplam = 0
    for (deger in hashMap.values) {
        toplam += deger
    }
    return toplam
}


/*
fun sumHashMapValues(map: HashMap<String, Int>): Int {
    var sum = 0
    for (value in map.values) {
        sum += value
    }
    return sum
}

fun main() {
    val oyuncakFiyatlari = HashMap<String, Int>()
    oyuncakFiyatlari["top"] = 10
    oyuncakFiyatlari["araba"] = 20
    oyuncakFiyatlari["bebek"] = 15

    val toplamFiyat = sumHashMapValues(oyuncakFiyatlari)

    println("Oyuncakların Toplam Fiyatı: $toplamFiyat")
}

 */



