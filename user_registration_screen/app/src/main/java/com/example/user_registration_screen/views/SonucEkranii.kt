package com.example.user_registration_screen.views

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Ekran(ad:String){
    Box(modifier = Modifier
        .padding(start = 40.dp, end = 40.dp)
        .clip(shape = RoundedCornerShape(7.dp))
        .height(30.dp)
        .fillMaxWidth()
        .background(Color.Gray.copy(0.5f)),
        Alignment.Center) {

        Row(modifier = Modifier
            .padding(start = 10.dp)) {
            Text(text = "Ad:  ")
            Text(text = ad)
            Spacer(modifier = Modifier.weight(1f))

        }


    }
}
@Composable
fun Ekran1(soyad:String){
    Box(modifier = Modifier
        .padding(start = 40.dp, end = 40.dp)
        .clip(shape = RoundedCornerShape(7.dp))
        .height(30.dp)
        .fillMaxWidth()
        .background(Color.Gray.copy(0.5f)),
        Alignment.Center) {
        Row(modifier = Modifier
            .padding(start = 10.dp)) {
            Text(text = "Soyad:  ")
            Text(text = soyad)
            Spacer(modifier = Modifier.weight(1f))

        }


    }
}
@Composable
fun Ekran2(yas:Int){
    Box(modifier = Modifier

        .padding(start = 40.dp, end = 40.dp)
        .clip(shape = RoundedCornerShape(7.dp))

        .height(30.dp)
        .fillMaxWidth()
        .background(Color.Gray.copy(0.5f))
        ,
        Alignment.Center){
        Row(modifier = Modifier
            .padding(start = 10.dp)) {
            Text(text = "yaş:  ")
            Text(text = yas.toString())
            Spacer(modifier = Modifier.weight(1f))

        }

    }
}
@Composable
fun Ekran3(mail:String){

    Box(modifier = Modifier
        .padding(start = 40.dp, end = 40.dp)
        .clip(shape = RoundedCornerShape(7.dp))
        .height(30.dp)
        .width(400.dp)
        .background(Color.Gray.copy(0.5f)),
        Alignment.Center) {
        Row(modifier = Modifier
            .padding(start = 10.dp)) {
            Text(text = "Mail:")
            Text(text = mail)
            Spacer(modifier = Modifier.weight(1f))
        }

    }
}
