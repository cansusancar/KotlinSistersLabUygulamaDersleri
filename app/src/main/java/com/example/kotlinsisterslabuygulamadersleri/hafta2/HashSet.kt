package com.example.kotlinsisterslabuygulamadersleri.hafta2


//Verilen bir listedeki tekrar eden elemanları HashSet olarak döndüren bir fonksiyon yazın (aşağıda)

//listeyi hash set e atıp aynı olan elemanları tekrar yazmayan (filtreleyen) bir liste yazmak için kod:
/*
fun main() {

    val liste = listOf(1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 1, 10)
     val yeniListe= sadelesmisListe(liste)
      println("$yeniListe")
}

fun sadelesmisListe(liste: List<Int>):Set<Int>{
    val yeniListe = HashSet<Int>()


    for (eleman in liste) {
           yeniListe.add(eleman)
        }
   return yeniListe
}

*/







//Verilen bir listedeki tekrar eden elemanları HashSet olarak döndüren bir fonksiyon yazın (aşağıda)


fun main () {


    val liste = listOf<Int>( 1,2,3,4,4,3,2)

    //tekrarliElemanlar(liste)
    println(tekrarliSayilar2(liste))
}


fun tekrarliSayilar2(liste : List<Int>) :  HashSet<Int>{
    val tekrarEdenler = hashSetOf<Int>()
    val tekrarEtmeyenler = hashSetOf<Int>()

    //    val liste = listOf<Int>( 1,2,3,4,4,3,2)

        for (i in liste) {

            if (!tekrarEtmeyenler.add(i)) {

                tekrarEdenler.add(i)
            }

        }
    println("tekrar edenler:")

    return tekrarEdenler
}

/*
    for (i in liste) {
    if (i in tekrarEtmeyenler) {
            tekrarEdenler.add(i)
            println("tekrar edenler $i ")
        } else {
            tekrarEtmeyenler.add(i)
            println("tekrar etmeyenler $i " )
        }
    }
}*/


