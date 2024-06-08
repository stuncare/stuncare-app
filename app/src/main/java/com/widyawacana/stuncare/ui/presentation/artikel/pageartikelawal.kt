package com.widyawacana.stuncare.ui.presentation.artikel


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.widyawacana.stuncare.data.local.dummy.DummyData.gambarartikel
import com.widyawacana.stuncare.model.artikel
import com.widyawacana.stuncare.ui.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PageArtikelAwal(navController: NavController) {
    val articles = remember { gambarartikel }

    Scaffold(topBar = {
        CenterAlignedTopAppBar(colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(0xFF756AB6)
        ), title = { Text(text = "Artikel", color = Color.White) }, navigationIcon = {
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
            modifier = Modifier.padding(innerPadding)
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            // Baris tombol
            Row(
                modifier = Modifier.padding(horizontal = 24.dp).horizontalScroll(rememberScrollState()),
            ) {
                Button(onClick = { /* Tombol 1 diklik */ }) {
                    Text(text = "Semua")
                }
                Spacer(modifier = Modifier.width(10.dp))
                OutlinedButton(onClick = { /* Tombol 2 diklik */ }) {
                    Text(text = "Pertumbuhan")
                }
                Spacer(modifier = Modifier.width(10.dp))
                OutlinedButton(onClick = { /* Tombol 3 diklik */ }) {
                    Text(text = "Olahraga")
                }
                Spacer(modifier = Modifier.width(10.dp))
                OutlinedButton(onClick = { /* Tombol 3 diklik */ }) {
                    Text(text = "Info Sehat")
                }
            }
            Spacer(modifier = Modifier.height(10.dp))

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp)
            ) {
                items(articles) {
                    ArtikelItemVertical(artikel = it){ id ->
                        navController.navigate(Screen.DetailArtikel.route + "/$id")
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ArtikelItemVertical(modifier: Modifier = Modifier, artikel: artikel, onItemClicked: (Int) -> Unit) {
    Card(
        onClick = { onItemClicked(artikel.id) },
        modifier = modifier
            .fillMaxWidth()
            .width(312.dp)
            .height(120.dp),
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(horizontalAlignment = Alignment.Start, modifier = Modifier.padding(end = 10.dp)) {
                Text(
                    text = artikel.judul,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    maxLines = 2,
                    modifier = Modifier.width(170.dp)
                )
                Spacer(modifier = Modifier.height(4.dp))
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .background(
                            color = Color(android.graphics.Color.parseColor("#756AB6")),
                            shape = RoundedCornerShape(6.dp)
                        )
                ) {
                    Text(
                        text = artikel.ket,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White,
                        modifier = Modifier.padding(4.dp)
                    )
                }

            }
            Image(
                painter = painterResource(id = artikel.photo),
                contentDescription = "Image Artikel",
                modifier = Modifier
                    .height(100.dp)
                    .width(140.dp),
                contentScale = ContentScale.Crop
            )
        }
    }
}

//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun ArticleCard(artikel: artikel, onItemClicked: (Int) -> Unit) {
//    Card(
//        modifier = Modifier
//            .fillMaxWidth()
//            .height(160.dp),
//        onClick = {
//            onItemClicked(artikel.id)
//        }
//    ) {
//        Row(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(8.dp),
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Column(
//                modifier = Modifier
//                    .padding(end = 8.dp)
//            ) {
//                Text(
//                    text = artikel.judul,
//                    style = MaterialTheme.typography.headlineSmall,
//                    fontSize = 14.sp,
//                    minLines = 2
//                )
//                Spacer(modifier = Modifier.height(8.dp))
//                Card(
//                    modifier = Modifier
//                        .width(150.dp)
//                        .height(30.dp)
//                ) {
//                    Text(
//                        text = artikel.ket,
//                        color = Color.White,
//                        fontSize = 12.sp,
//                        textAlign = TextAlign.Center,
//                        modifier = Modifier.padding(start = 10.dp, top = 4.dp, end = 10.dp, bottom = 4.dp)
//                            .background(Color(0xFF756AB6), shape = RoundedCornerShape(12.dp))
//                    )
//                }
//            }
//            Image(
//                painter = painterResource(id = artikel.photo), // Replace with your image resource
//                contentDescription = null,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .width(180.dp)
//                    .height(140.dp)
//                    .clip(MaterialTheme.shapes.medium)
//            )
//        }
//    }
//}
