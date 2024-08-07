package com.example.user_registration_screen.views

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.user_registration_screen.R
import com.example.user_registration_screen.navigation.Router

@Composable
fun KullaniciKayit(navController: NavController){
    Image(modifier = Modifier
        .fillMaxSize(),painter = painterResource(id = R.drawable.indirrr), contentDescription = "")
    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        Alignment.CenterHorizontally,
    ) {
        val ad= remember { mutableStateOf("") }
        val soyad= remember { mutableStateOf("") }
        val yas= remember { mutableStateOf("") }
        val mail= remember { mutableStateOf("") }


        OutlinedTextField(modifier = Modifier.background(Color.Black.copy(0.2f)),
            placeholder = { Text(text = "adınız", color = Color.White, modifier = Modifier.padding(start = 10.dp).weight(1f)) },
            shape = RoundedCornerShape(20.dp),
            value = ad.value,
            onValueChange= {veri->ad.value=veri},
        )
        Spacer(modifier = Modifier.size(20.dp))
        OutlinedTextField(modifier = Modifier.background(Color.Black.copy(0.2f)),
            placeholder = { Text(text = "soyadınız ", color = Color.White, modifier = Modifier.padding(start = 10.dp)) },
            shape = RoundedCornerShape(20.dp),
            value = soyad.value,
            onValueChange= {veri->soyad.value=veri}
        )
        Spacer(modifier = Modifier.size(20.dp))

        OutlinedTextField(modifier = Modifier.background(Color.Black.copy(0.2f)),
            placeholder = { Text(text = "yaşınız ", color = Color.White, modifier = Modifier.padding(start = 10.dp)) },
            shape = RoundedCornerShape(20.dp),
            value = yas.value,
            onValueChange= {veri->yas.value=veri}
        )
        Spacer(modifier = Modifier.size(20.dp))

        OutlinedTextField(modifier = Modifier.background(Color.Black.copy(0.2f)),
            placeholder = { Text(text = "mail", color = Color.White, modifier = Modifier.padding(start = 10.dp)) },
            shape = RoundedCornerShape(20.dp),
            value = mail.value,
            onValueChange= {veri->mail.value=veri}
        )
        Spacer(modifier = Modifier.size(60.dp))

        Button(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 100.dp),
            shape = RoundedCornerShape(20.dp),
            border = BorderStroke(1.dp,Color.Gray),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black.copy(0.4f)),
            onClick = {
                navController.navigate(Router.SonucEkrani(ad =ad.value,soyad=soyad.value,yas=yas.value.toInt(),mail=mail.value))
            }) {
            Text(
                color = Color.White,
                text = "Kayıt Ol")
            
        }



    }
}


@Preview
@Composable
fun KullaniciKayitPreview(){
    KullaniciKayit(navController = rememberNavController())
}