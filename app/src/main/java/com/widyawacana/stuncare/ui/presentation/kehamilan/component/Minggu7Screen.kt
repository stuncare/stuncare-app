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
fun Minggu7Screen(navController: NavController) {
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
                    painter = painterResource(id = R.drawable.minggu_7),
                    contentDescription = "Image Kehamilan",
                    modifier = Modifier
                        .height(190.dp)
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Bayi Bunda Seukuran Buah Raspberry",
                    fontSize = 16.sp, fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Di usia kehamilan tujuh minggu, otak bayi dalam kandungan berkembang pesat. Bentuk wajah si kecil juga mulai terbentuk dan sudah seukuran blueberry. Meskipun masih sangat kecil, tapi dia berkembang 10 ribu kali lebih besar dibanding sebulan yang lalu.\n" +
                            "\n" +
                            "Bila Bunda memeriksa melalui ultrasonografi (USG), ada bintik-bintik gelap yang menandai mata, lubang hidung, mulut, dan telinga. Sel-sel saraf di otak bayi tumbuh dengan kecepatan yang luar biasa, yaitu 100.000 sel per menit. Janin sudah mulai bergerak, namun Bunda belum bisa merasakannya.\n" +
                            "\n" +
                            "Pada perkembangan janin minggu ke-7, otak sudah berkembang pesat. Bentuk wajahnya pun sudah mulai terbentuk dan ukurannya kira-kira sebesar buah bluberry. Janin berkembang 10 ribu lebih besar dibanding bula lalu.",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
        }

        Spacer(modifier = Modifier.height(20.dp))
    }
}