package com.example.sisterslabuygulamadersleri.hafta1

fun main()
{

    var muzikAleti: MuzikAleti = Gitar() //PolyMorphism
    var muzikAleti2 : MuzikAleti = Piyano()//PolyMorphism
    muzikAleti.sesCikar()
    muzikAleti2.sesCikar()

    var muzikDersi = MuzikDersi2()
    muzikDersi.cal(muzikAleti)
}