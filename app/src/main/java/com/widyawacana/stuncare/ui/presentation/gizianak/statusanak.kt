package com.widyawacana.stuncare.ui.presentation.gizianak

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Height
import androidx.compose.material.icons.filled.Scale
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.widyawacana.stuncare.ui.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StatusGiziAnakScreen(modifier: Modifier = Modifier,
    navController: NavController
) {
    Scaffold(topBar = {
        CenterAlignedTopAppBar(colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(0xFF756AB6)
        ), title = { Text(text = "Status Pertumbuhan Anak", color = Color.White) }, navigationIcon = {
            IconButton(onClick = { navController.navigate(Screen.Home.route) }) {
                Icon(
                    imageVector = Icons.Default.ArrowBackIosNew,
                    contentDescription = "Back Icon",
                    tint = Color.White
                )
            }
        })
    }, modifier = Modifier) { contentPadding ->
        Column(modifier = Modifier
            .padding(contentPadding)
            .padding(24.dp)) {
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
                Card(modifier = Modifier
                    .height(80.dp)
                    .width(100.dp), elevation = CardDefaults.cardElevation(10.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White)) {
                    Column {
                        Box(modifier = Modifier
                            .height(28.dp)
                            .width(100.dp)
                            .background(color = Color(0xFFAC87C5)), contentAlignment = Alignment.Center) {
                            Icon(imageVector = Icons.Default.CalendarMonth,
                                contentDescription = "Icon Umur",
                                modifier = Modifier.size(20.dp), tint = Color.White)
                        }
                        Column(modifier = modifier
                            .height(52.dp)
                            .width(100.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(text = "Umur", fontSize = 12.sp)
                            Text(text = "6 Bulan", fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
                        }
                    }
                }

                Card(modifier = Modifier
                    .height(80.dp)
                    .width(100.dp), elevation = CardDefaults.cardElevation(10.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White)) {
                    Column {
                        Box(modifier = Modifier
                            .height(28.dp)
                            .width(100.dp)
                            .background(color = Color(0xFFAC87C5)), contentAlignment = Alignment.Center) {
                            Icon(imageVector = Icons.Default.Scale,
                                contentDescription = "Icon Berat",
                                modifier = Modifier.size(20.dp), tint = Color.White)
                        }
                        Column(modifier = modifier
                            .height(52.dp)
                            .width(100.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(text = "Berat", fontSize = 12.sp)
                            Text(text = "2 KG", fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
                        }
                    }
                }

                Card(modifier = Modifier
                    .height(80.dp)
                    .width(100.dp), elevation = CardDefaults.cardElevation(10.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White)) {
                    Column {
                        Box(modifier = Modifier
                            .height(28.dp)
                            .width(100.dp)
                            .background(color = Color(0xFFAC87C5)), contentAlignment = Alignment.Center) {
                            Icon(imageVector = Icons.Default.Height,
                                contentDescription = "Icon Tinggi",
                                modifier = Modifier.size(20.dp), tint = Color.White)
                        }
                        Column(modifier = modifier
                            .height(52.dp)
                            .width(100.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(text = "Tinggi", fontSize = 12.sp)
                            Text(text = "40 CM", fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
                        }
                    }
                }

            }
            
            Spacer(modifier = Modifier.height(20.dp))

            Card(modifier = Modifier
                .fillMaxWidth(), elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(text = "Keterangan", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
                        Box(modifier = Modifier.background(color = Color(0xFFF56565), shape = RoundedCornerShape(32.dp))) {
                            Text(text = "Berat badan sangat kurang", fontSize = 12.sp, modifier = Modifier.padding(4.dp), color = Color.White)
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "Berat badan yang sangat kurang menunjukkan kemungkinan terindikasi stunting yang dapat mempengaruhi pertumbuhan dan perkembangan anak secara keseluruhan.\n\n" +
                            "Segera konsultasikan dengan dokter untuk menangani kondisi berat badan yang sangat kurang ini, terutama  jika terdapat indikasi stunting pada anak.", fontSize = 14.sp)
                }
            }

        }
    }
}