package com.example.object_oriented_3

fun main(){

    val meyveler = setOf<String>("Çilek","Muz","Elma","Kivi")

    val iller = mutableSetOf("Bursa","Ankara","İstanbul","Kastamonu")

    val sayilar = HashSet<Int>()

    sayilar.add(1)
    sayilar.add(20)
    sayilar.add(30)

    println(sayilar.toString())

    sayilar.add(20)             //AYNI İFADEYİ KAYIT ETMEZ
    println(sayilar.toString())

    println(sayilar.elementAt(1))       //İNDEXTEKİ ELEMANI GETİRİR

    println(sayilar.size)
    println(sayilar.count())                //DİZİ BÜYÜKLÜĞÜ

    println(sayilar.isEmpty())              //BOŞ MU

    println(sayilar.contains(20))           //İSTENEN VERİ VAR MI?

    for (s in sayilar){
        println(s)
    }

    for ((i,s) in sayilar.withIndex()){
        println("$i. --> $s")
    }

}