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
fun Minggu5Screen(navController: NavController) {
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
                    painter = painterResource(id = R.drawable.minggu_5),
                    contentDescription = "Image Kehamilan",
                    modifier = Modifier
                        .height(190.dp)
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Bayi Bunda Seukuran Biji Padi",
                    fontSize = 16.sp, fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Memasuki usia kehamilan lima minggu, organ tubuh bayi bersiap untuk terbentuk. Di minggu ini, detak jantung juga mulai muncul.\n" +
                            "\n" +
                            "Embrio di minggu ini memiliki tiga lapisan. Pertama, lapisan ektoderm luar yang akan membentuk sistem saraf, telinga, mata, dan jaringan ikat. Kedua, lapisan dalam atau endoderm, yang akan tumbuh menjadi organ-organ internal seperti paru-paru, usus, dan kandung kemih.\n" +
                            "\n" +
                            "Terakhir yaitu mesoderm tengah untuk membentuk jantung dan sistem peredaran darah. Dalam beberapa minggu, mesoderm akan berkembang menjadi tulang, otot, ginjal, dan organ reproduksi.\n" +
                            "\n" +
                            "Pada perkembangan janin minggu ke-5, organ sudah siap terbentuk dan detak jantung mulai muncul. Ukurannya sendiri sudah naik menjadi sebesar biji buah stroberi dengan berat 1 gram",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
        }

        Spacer(modifier = Modifier.height(20.dp))
    }
}