package com.example.pam3

import android.telecom.Call.Details
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PlayActivity(){
    Column(modifier = Modifier.fillMaxSize()) {
        HeaderSection()
        Text(text = "Kepada YTH,",
            modifier = Modifier.padding(16.dp))
        Text(text = "Muhammad Adifa Firmansyah",
            modifier = Modifier.padding(start = 16.dp))

        Spacer(modifier = Modifier.size(50.dp))
        DetailsSurat(
            judul = "Nama",
            Isinya = "Muhammad Adifa Firmansyah"
        )
        DetailsSurat(
            judul = "Alamat",
            Isinya = "Kota Jogja, Daerah Istimewa Yogyakarta"
        )
        DetailsSurat(
            judul = "No Telp",
            Isinya = "021123123123"
        )
        DetailsSurat(
            judul = "Kepentingan",
            Isinya = "Untuk keperluan praktikum ke 2"
        )
    }
}

@Composable
fun HeaderSection(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.DarkGray)
        .padding(15.dp)){
        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {
            Column {
                Text(text = "Daerah Istimewa Yogyakarta",
                    color = Color.White)
                Text(text = "Fax : 021-12121212, Tlp : 0821212121",
                    color = Color.White)
            }
            Box(
                contentAlignment = Alignment.BottomStart
            ){
                Image(painter = painterResource(id = R.drawable.diy),
                    contentDescription = null, modifier = Modifier
                        .size(70.dp)
                        .clip(CircleShape)
                )
                Icon(imageVector = Icons.Filled.Done,
                    contentDescription = null)
            }
        }
    }
}

@Composable
fun DetailsSurat(judul: String, Isinya: String){
    Column (modifier = Modifier
        .fillMaxWidth()
        .padding(top = 5.dp)
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 12.dp)
        ){
            Text(text = judul,
                modifier = Modifier.weight(0.8f))
            Text(text = " : ",
                modifier = Modifier.weight(0.2f))
            Text(text = Isinya,
                modifier = Modifier.weight(2f))
        }
    }
}

