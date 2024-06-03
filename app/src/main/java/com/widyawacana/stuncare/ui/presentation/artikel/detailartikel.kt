package com.widyawacana.stuncare.ui.presentation.artikel


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.widyawacana.stuncare.R
import com.widyawacana.stuncare.model.artikel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun detailartikel(navController: NavController, id: Int?) {
    val artikel = artikel(
        id = 1,
        judul = "Ternyata Cegah Stunting Bisa Dimulai dari Kehamilan Bukan Kelahiran! Intip Penjelasannya",
        photo = R.drawable.detailartikel1,
        ket = "Pertumbuhan",
        detailartikel = "Masalah stunting masih menjadi episode panjang masalah kesehatan balita di Indonesia. Stunting adalah kondisi gagal tumbuh pada anak balita akibat kekurangan gizi kronis terutama pada 1.000 Hari Pertama Kehidupan (HPK). Maka dari itu, pencegahan terutama pada 1000 HPK sangat diperlukan, yakni mulai dari bayi dalam kandungan hingga usia 23 bulan." +
                "\n\n" +
                "Pemeriksaan kehamilan rutin atau antenatal care (ANC) merupakan salah satu usaha pencegahan stunting selama masa kehamilan. Selama hamil ibu disarankan untuk periksa minimal 6 kali. 1 kali pada trimester pertama, 2 kali pada trimester kedua, dan 3 kali pada trimester ketiga. Paling sedikit 2 kali pemeriksaan oleh dokter atau dokter spesialis kebidanan dan kandungan pada trimester pertama dan ketiga dengan memakai USG." +
                "\n\n" +
                "Selain melakukan pemeriksaan rutin, selama kehamilan ibu perlu rutin minum tablet tambah darah (TTD) minimal 90 tablet seperti makanan pokok, protein hewani, kacang-kacangan, buah dan sayur, minum air 8-12 gelas/hari (2-3 liter)/hari, serta menambahkan 1 porsi makanan utama atau makanan selingan dari sebelumnya."
    )


    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color(0xFF756AB6)
            ),
                title = { Text(text = "Detail Artikel", color = Color.White) },
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
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
        ) {
            Image(
                painter = painterResource(id = artikel.photo),
                contentDescription = null, // Berikan deskripsi yang bermakna
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp), contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(16.dp))

            Column(modifier = Modifier.padding(horizontal = 24.dp)) {
                Text(
                    text = artikel.judul,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .fillMaxWidth(),
                )

                Spacer(modifier = Modifier.height(10.dp))

                // Card
                Card(
                    modifier = Modifier
                        .width(100.dp)
                        .height(28.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF756AB6)),
                ) {
                    // Dummy data id
                    Text(
                        text = artikel.ket,
                        color = Color.White,
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()

                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = artikel.detailartikel,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .fillMaxWidth(),
                )

                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}