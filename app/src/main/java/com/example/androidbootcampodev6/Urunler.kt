package com.example.androidbootcampodev6

import java.io.Serializable

data class Urunler (var id: Int,
                    var urunAdi: String,
                    var resim : String,
                    var hakkinda : String,
                    var fiyat:Int) : Serializable{
}