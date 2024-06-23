package com.widyawacana.stuncare.ui.presentation.kehamilan.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
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

@Composable
fun Minggu8Screen(navController: NavController) {
    Column(
        modifier = Modifier
            .padding(start = 24.dp, end = 24.dp)
            .verticalScroll(rememberScrollState())
    ) {

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth(), elevation = CardDefaults.cardElevation(10.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Column(modifier = Modifier) {
                Image(
                    painter = painterResource(id = R.drawable.minggu_8),
                    contentDescription = "Image Kehamilan",
                    modifier = Modifier
                        .height(190.dp)
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Bayi Bunda Seukuran Buah Anggur",
                    fontSize = 16.sp, fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Memasuki usia kehamilan delapan minggu, bentuk wajah sudah terlihat lebih jelas. Melalui pemeriksaan ultrasonografi (USG), kita bisa melihat telinga, bibir atas, dan ujung hidung bayi. Kelopak mata juga akan terbentuk dan melipat di minggu ini.\n" +
                            "\n" +
                            "Selain itu, muncul jaringan selaput pada jari-jari tangan dan kaki bayi. Nah, di usia delapan minggu ini, jantung si kecil semakin kuat. Perkembangan otaknya semakin kompleks.\n" +
                            "\n" +
                            "Bagian ujung hidung sudah ada, lengannya kini menekuk pada siku dan sedikit membengkok. Gigi dan langit-langit mulut sudah mulai terbentuk. Kulit bayi setipis kertas, membuat pembuluh venanya terlihat.\n" +
                            "\n" +
                            "Pada perkembangan janin minggu ke-8, ukuran bayi sudah sebesar buah raspberry dan bentuk wajahnya sudah jelas. Saat USG, sudah terlihat telinga, bibir atas dan ujung hidungnya.",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
        }

        Spacer(modifier = Modifier.height(20.dp))
    }
}