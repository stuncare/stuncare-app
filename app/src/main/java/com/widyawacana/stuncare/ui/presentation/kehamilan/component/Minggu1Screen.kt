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
fun Minggu1Screen(navController: NavController) {
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
                    painter = painterResource(id = R.drawable.minggu_1),
                    contentDescription = "Image Kehamilan",
                    modifier = Modifier
                        .height(190.dp)
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Bayi Bunda Seukuran Chia Seed",
                    fontSize = 16.sp, fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Pada tahapan ini, sebagian Bunda mulai merasakan perubahan pada tubuh. Biasanya, gejalanya hampir mirip dengan sebelum menstruasi. Seperti merasakan payudara sakit, mual, kadang lelah disertai lesu. Namun, pada minggu-minggu ini Bunda justru tidak mendapatkan menstruasi.\n" +
                            "\n" +
                            "Itu sebabnya, pada minggu pertama banyak yang tidak menyadari kehamilannya. Selama periode ini, terjadi pembuahan sel telur di tubuh ibu dan zigot menempel ke rahim. Janin baru saja terbentuk dan mulai tumbuh dari dua sel. \n" +
                            "\n" +
                            "Bentuk perut biasanya akan mulai terlihat saat kehamilan memasuki usia 16 minggu. Sedangkan gejalanya baru terasa di kehamilan setelah dua minggu. Untuk janinnya sendiri belum bisa dilihat, karena Bunda belum dinyatakan benar-benar hamil di minggu pertama.",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
        }

        Spacer(modifier = Modifier.height(20.dp))
    }
}