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
fun Minggu4Screen(navController: NavController) {
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
                    painter = painterResource(id = R.drawable.minggu_4),
                    contentDescription = "Image Kehamilan",
                    modifier = Modifier
                        .height(190.dp)
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Bayi Bunda Seukuran Biji Wijen",
                    fontSize = 16.sp, fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Perkembangan janin di usia kehamilan empat minggu sudah bisa terlihat. Pada tahap ini, sel-sel terpisah menjadi tiga lapisan berbeda yang selanjutnya akan berkembang menjadi struktur tubuh.\n" +
                            "\n" +
                            "Calon bayi yang dikenal dengan nama blastokista, mulai menetap di rahim Bunda. Besarnya janin kira-kira lebih kecil dari biji poppy. Blastokista mempersiapkan semua perkembangan penting yang terjadi selama enam minggu ke depan.\n" +
                            "\n" +
                            "Pada perkembangan janin minggu ke-4, calon bayi yang mulai terbentuk disebut blastokista dan ukurannya masih lebih kecil dari biji poppy. Bentuk perut pun sudah mulai terlihat tapi masih samar sekali.",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
        }

        Spacer(modifier = Modifier.height(20.dp))
    }
}