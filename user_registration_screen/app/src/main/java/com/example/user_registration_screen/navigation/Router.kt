package com.example.user_registration_screen.navigation

import kotlinx.serialization.Serializable

sealed class Router {
    @Serializable
    object KullaniciKayit

    @Serializable
    data class SonucEkrani(val ad:String ,val soyad:String,val yas:Int,val mail:String)


}