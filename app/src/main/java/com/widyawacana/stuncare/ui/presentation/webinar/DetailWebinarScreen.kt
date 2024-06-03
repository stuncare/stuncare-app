package com.widyawacana.stuncare.ui.presentation.webinar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
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
import com.widyawacana.stuncare.ui.presentation.resep.CardInfoResep

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailWebinarScreen(modifier: Modifier = Modifier, navController: NavController, id: Int?) {
    Scaffold(topBar = {
        CenterAlignedTopAppBar(colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(0xFF756AB6)
        ), title = { Text(text = "Detail Webinar", color = Color.White) }, navigationIcon = {
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
            .verticalScroll(rememberScrollState())){
            Box {
                Image(painter = painterResource(id = R.drawable.webinar_1), contentDescription = "Image Webinar", modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp), contentScale = ContentScale.Crop)
            }
            Column(modifier = Modifier.padding(start = 24.dp, end = 24.dp)) {
                Spacer(modifier = Modifier.height(20.dp))
                Text("WEBINAR, Menuju Generasi Emas Bebas Stunting", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(10.dp))
                Card(
                    modifier = Modifier
                        .width(80.dp)
                        .height(28.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF756AB6)),
                ) {
                    // Dummy data id
                    Text(
                        text = "Zoom",
                        color = Color.White,
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
//                CardInfoResep(navController = navController)
                Spacer(modifier = Modifier.height(20.dp))
                Text("Pembicara", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(8.dp))
                Text("Dr. Tan Shot Yen, M. Hum.\n" +
                        "Dr. Nani Nurhaeni, S. Kep., MN.\n" +
                        "Kresensia Tania, S. Kep.\n" +
                        "Ns. Elisabeth Isti Daryanti, S. Kep., MSN", fontSize = 16.sp, fontWeight = FontWeight.Normal)
                Spacer(modifier = Modifier.height(16.dp))
                Text("Lokasi", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(8.dp))
//                Text("Zoom", fontSize = 16.sp, fontWeight = FontWeight.Normal)
                Text("https://us06web.zoom.us/j/89554588370pwd=fQTIuqCO" +
                        "N8Y3AIjo9gGxyRpkMeFOt0.1", fontSize = 16.sp, fontWeight = FontWeight.Normal, color = Color(0xFF756AB6))
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = {  },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF756AB6)
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(45.dp)
                ) {
                    Text(
                        text = "Daftar Sekarang",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))

            }
        }

    }
}