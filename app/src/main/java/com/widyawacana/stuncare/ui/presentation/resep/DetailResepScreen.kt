package com.widyawacana.stuncare.ui.presentation.resep

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.widyawacana.stuncare.R
import com.widyawacana.stuncare.ui.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailResepScreen(modifier: Modifier = Modifier, navController: NavController, id: Int?) {
    Scaffold(topBar = {
        CenterAlignedTopAppBar(colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(0xFF756AB6)
        ), title = { Text(text = "Detail Resep", color = Color.White) }, navigationIcon = {
            IconButton(onClick = { navController.popBackStack() }) {
                Icon(
                    imageVector = Icons.Default.ArrowBackIosNew,
                    contentDescription = "Back Icon",
                    tint = Color.White
                )
            }
        })
    }, modifier = Modifier
    ) {contentPadding ->
        Column(modifier = Modifier
            .padding(contentPadding)
            .verticalScroll(rememberScrollState())){
            Box {
                Image(painter = painterResource(id = R.drawable.resep_1), contentDescription = "Image Resep", modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp), contentScale = ContentScale.Crop)
            }
            Column(modifier = Modifier.padding(start = 24.dp, end = 24.dp)) {
                Spacer(modifier = Modifier.height(20.dp))
                Text("Bubur Udang Tahu", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(16.dp))
                CardInfoResep(navController = navController)
                Spacer(modifier = Modifier.height(16.dp))
                Text("Bahan-Bahan", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(16.dp))
                Text("- 60 gram nasi\n" +
                        "- 45 gram udang giling\n" +
                        "- 30 ml santan cair\n" +
                        "- 20 gram tahu, potong kecil-kecil\n" +
                        "- 10 gram tomat, potong kecil-kecil\n" +
                        "- Kemangi secukupnya\n" +
                        "- Daun salam secukupnya\n" +
                        "- Jeruk nipis secukupnya\n" +
                        "- Garam secukupnya (jika diperlukan)", fontSize = 16.sp, fontWeight = FontWeight.Normal)
                Spacer(modifier = Modifier.height(16.dp))
                Text("Langkah Penyajian", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(16.dp))
                Text("1. Lumuri udang dengan air jeruk nipis dan garam, lalu diamkan sekitar 15 menit.\n" +
                        "2. Campur udang, tahu, tomat, kemangi, santan cair, dan bumbu halus hingga merata.\n" +
                        "3. Bungkus dengan daun pisang, masukkan juga daun salam. Kukus hingga matang. ", fontSize = 16.sp, fontWeight = FontWeight.Normal)
                Spacer(modifier = Modifier.height(16.dp))
                Text("Informasi Nilai Gizi", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(16.dp))
                Text("- Energi 67 kkal\n" +
                        "- Karbohidrat 6,1 gram\n" +
                        "- Lemak 3,2 gram\n" +
                        "- Protein 4,3 gram\n" +
                        "- Zat besi 1,3 mg\n" +
                        "- Seng 0,5 mg", fontSize = 16.sp, fontWeight = FontWeight.Normal)
            }
        }

    }
}

// Card Info Resep
@Composable
fun CardInfoResep(modifier: Modifier = Modifier, navController: NavController) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(60.dp),
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, top = 10.dp, end = 10.dp)

        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                Text(text = "Kalori", fontSize = 12.sp)
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "220 kkal", fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                Text(text = "Durasi", fontSize = 12.sp)
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "15 Menit", fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                Text(text = "Porsi", fontSize = 12.sp)
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "4 Porsi", fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                Text(text = "Usia", fontSize = 12.sp)
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "6-9 Bulan", fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
            }



        }

    }

}