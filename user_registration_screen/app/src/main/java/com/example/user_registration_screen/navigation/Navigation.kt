package com.example.user_registration_screen.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.user_registration_screen.views.KullaniciKayit
import com.example.user_registration_screen.views.SonucEkrani


@Composable
fun Navigation(){
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination =Router.KullaniciKayit ) {
        composable<Router.KullaniciKayit> {
            KullaniciKayit(navController=navController)
        }
        composable<Router.SonucEkrani> {
            val args=it.toRoute<Router.SonucEkrani>()
            SonucEkrani(ad = args.ad, soyad =args.soyad , yas =args.yas , mail =args.mail ,navController)
        }
    }
}