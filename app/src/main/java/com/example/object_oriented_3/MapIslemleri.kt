package com.example.object_oriented_3

fun main(){

    val sayilar = mapOf(1 to "Bir",2 to "İki")

    val oranlar = mutableMapOf(1.5 to "Oran1", 3.4 to "Oran2")

    val iller = HashMap<Int,String>()

    iller.put(16,"BURSA")                                       //VERİ EKLEME
    iller.put(34,"İSTANBUL")
    println(iller.toString())                                   //EKRANA YAZ

    iller.put(16,"YENİ BURSA")                                  //VERİYİ DEĞİŞTİRME
    println(iller.toString())

    println(iller.get(34))                                      //VERİYİ GETİR

    println(iller.size)
    println(iller.count())                                      //DİZİ BOYUTU

    println(iller.isEmpty())                                    //BOŞ MU?

    println(iller.containsKey(16))                              //KEYLER ARASINDA VAR MI?
    println(iller.containsValue("İSTANBUL"))                    //DEĞERLER ARSINDA VAR MI?


    for ((anahtar,deger) in iller){
        println("$anahtar: $deger")
    }

    iller.remove(16)                                        //KEYİ SİLER
    println(iller.toString())

    iller.clear()                                               //HEPSİNİ SİLER
    println(iller.toString())



}