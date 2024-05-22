package com.widyawacana.stuncare.ui.presentation.kehamilan

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.widyawacana.stuncare.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StatusPerkembanganKehamilanScreen(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color(0xFF756AB6)
            ),
                title = { Text(text = "Status Kehamilan", color = Color.White) },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBackIosNew,
                            contentDescription = "Back Icon",
                            tint = Color.White
                        )
                    }
                })
        }, modifier = Modifier
    ) { contentPadding ->
        Column(modifier = Modifier
            .padding(contentPadding)
            .padding(start = 24.dp, end = 24.dp)
            .verticalScroll(rememberScrollState())) {

            Spacer(modifier = Modifier.height(20.dp))

            LazyRow(

            ) {
                item {
                    CategoryJanin()
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Card(modifier = Modifier
                .fillMaxWidth(), elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)) {
                Column(modifier = Modifier) {
                    Image(painter = painterResource(id = R.drawable.kehamilan_7),
                        contentDescription = "Image Kehamilan",
                        modifier = Modifier
                            .height(160.dp)
                            .fillMaxWidth(),
                        contentScale = ContentScale.Crop)
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "Pada akhir minggu ketujuh, berat janin meningkat pesat. Ukuran saat ini sekitar sekitar 5 – 13 mm panjang dan beratnya 0,8 gram, kira-kira sebesar kacang hijau. Minggu ini, otak bayi akan berkembang, serta mata, hidung, usus, pankreas, dan tenggorokan. Tonjolan kecil yang tampak seperti tangan dan kaki, terbentuk pada minggu ke 6.\n" +
                            "\n" +
                            "Pada minggu ke-7 ini, biasanya merupakan minggu terakhir dimana gejala kehamilan terlihat. Pada tahap ini, bunda akan mengalami penurunan berat badan dan kondisi ini normal karena bunda masih sering mual dan muntah. Namun dalam beberapa minggu ke depan, berat badan bunda akan meningkat cepat. Jika masih merasa mual dan muntah, pastikan bunda makan dan minum dalam porsi sedikit namun sering.", fontSize = 14.sp, modifier = Modifier.padding(16.dp))
                }
            }
        }
    }
}

@Composable
fun CategoryJanin() {
    Row {
        OutlinedButton(onClick = { /* Tombol 1 diklik */ }) {
            Text(text = "Minggu 6")
        }
        Spacer(modifier = Modifier.width(10.dp))
        Button(onClick = { /* Tombol 2 diklik */ }) {
            Text(text = "Minggu 7")
        }
        Spacer(modifier = Modifier.width(10.dp))
        OutlinedButton(onClick = { /* Tombol 3 diklik */ }) {
            Text(text = "Minggu 8")
        }
        Spacer(modifier = Modifier.width(10.dp))
        OutlinedButton(onClick = { /* Tombol 3 diklik */ }) {
            Text(text = "Minggu 9")
        }
        Spacer(modifier = Modifier.width(10.dp))
        OutlinedButton(onClick = { /* Tombol 3 diklik */ }) {
            Text(text = "Minggu 10")
        }
    }

}