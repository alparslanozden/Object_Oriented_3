package com.example.object_oriented_3

fun main(){

    val o1= Ogrenci(1,"Ahmet","11F")
    val o2= Ogrenci(2,"Alparslan","12C")
    val o3 = Ogrenci(3,"Özden","10C")

    val ogrenciler = HashMap<Int,Ogrenci>()

    ogrenciler.put(o1.no,o1)
    ogrenciler.put(o2.no,o2)
    ogrenciler.put(o3.no,o3)

    for ((ogrenciNo,nesne) in ogrenciler){
        println("****************")
        println("Öğrenci No: $ogrenciNo")
        println("Öğrenci Adı: ${nesne.ad}")
        println("Öğrenci Sınıfı: ${nesne.sinif}")

    }

}