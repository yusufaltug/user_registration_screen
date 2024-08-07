package com.example.user_registration_screen.views

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.user_registration_screen.R
import com.example.user_registration_screen.navigation.Router

@Composable
fun SonucEkrani(ad:String,soyad:String,yas:Int,mail:String,navController: NavController){
    Image(modifier = Modifier.fillMaxSize(), painter = painterResource(id = R.drawable.indirrr ), contentDescription = "")
    Column(modifier= Modifier

        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        Alignment.CenterHorizontally) {


        Ekran(ad = ad)
        Spacer(modifier = Modifier.size(20.dp))
        Ekran1(soyad = soyad)
        Spacer(modifier = Modifier.size(20.dp))
        Ekran2(yas = yas)
        Spacer(modifier = Modifier.size(20.dp))
        Ekran3(mail = mail)
        Spacer(modifier = Modifier.size(40.dp))
        Button(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 100.dp),
            shape = RoundedCornerShape(20.dp),
            border = BorderStroke(1.dp,Color.Gray),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray.copy(0.5f)),
            onClick = {
                navController.navigate(Router.KullaniciKayit)
            }) {
            Text(color = Color.Black,text = "geri")

        }
    }
}
@Preview
@Composable
fun SonucEkraniPreview(){
    SonucEkrani(ad ="yusuf", soyad ="altuğ" , yas = 14, mail ="usufaltug@gmail.cm" , navController = rememberNavController())
}