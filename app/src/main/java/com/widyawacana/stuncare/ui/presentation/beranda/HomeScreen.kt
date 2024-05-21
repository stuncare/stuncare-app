package com.widyawacana.stuncare.ui.presentation.beranda

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.widyawacana.stuncare.R
import com.widyawacana.stuncare.data.DummyData
import com.widyawacana.stuncare.model.Resep
import com.widyawacana.stuncare.model.artikel
import com.widyawacana.stuncare.ui.component.ResepItemVertical
import com.widyawacana.stuncare.ui.navigation.Screen
import com.widyawacana.stuncare.ui.presentation.artikel.ArtikelItemVertical

@Composable
fun HomeScreen(modifier: Modifier = Modifier, artikels: List<artikel> = DummyData.gambarartikel, navController: NavController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxHeight()
    ) {
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .background(
                        color = Color(android.graphics.Color.parseColor("#756AB6")),
                        shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp)
                    ),
                contentAlignment = Alignment.Center,
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 24.dp, end = 24.dp)
                ) {
                    val borderWidth = 3.dp
                    Image(
                        painter = painterResource(id = R.drawable.img_profile),
                        contentDescription = "Profile Image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(48.dp)
                            .border(
                                BorderStroke(borderWidth, Color.White), CircleShape
                            )
                            .padding(borderWidth)
                            .clip(
                                CircleShape
                            )
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Column(
                        modifier = Modifier,
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            text = "Halo, selamat datang!",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.White
                        )
                        Text(
                            text = "Julia Situmorang",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
            }
        }
        
        item { 
            Row(modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .padding(start = 24.dp, top = 20.dp)) {
                SliderHeader()
                Spacer(modifier = Modifier.width(12.dp))
                SliderHeader()
            }
        }

        item {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 24.dp, top = 20.dp, end = 24.dp)

            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(
                        contentAlignment = Alignment.Center, modifier = Modifier
                            .size(72.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#AC87C5")),
                                shape = RoundedCornerShape(60.dp)
                            )
                            .clip(
                                CircleShape
                            )
                            .clickable {
                                navController.navigate(Screen.PerkembanganKehamilan.route)
                            }
                    ) {
                        Image(painter = painterResource(id = R.drawable.ic_kembang), contentDescription = "Icon Kembang", modifier = Modifier.size(36.dp))
                    }
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(text = stringResource(id = R.string.menu_kembang), fontSize = 12.sp)
                }


                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(
                        contentAlignment = Alignment.Center, modifier = Modifier
                            .size(72.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#AC87C5")),
                                shape = RoundedCornerShape(60.dp)
                            )
                            .clip(
                                CircleShape
                            )
                            .clickable {
                                navController.navigate(Screen.GiziAnakAwal.route)
                            }
                    ) {
                        Image(painter = painterResource(id = R.drawable.ic_tumbuh), contentDescription = "Icon Tumbuh", modifier = Modifier.size(36.dp))
                    }
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(text = stringResource(id = R.string.menu_tumbuh), fontSize = 12.sp)
                }

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(
                        contentAlignment = Alignment.Center, modifier = Modifier
                            .size(72.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#AC87C5")),
                                shape = RoundedCornerShape(60.dp)
                            )
                            .clip(
                                CircleShape
                            )
                            .clickable {
                                navController.navigate(Screen.Resep.route)
                            }
                    ) {
                        Image(painter = painterResource(id = R.drawable.ic_resep), contentDescription = "Icon Resep", modifier = Modifier.size(36.dp))
                    }
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(text = stringResource(id = R.string.menu_resep), fontSize = 12.sp)
                }

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(
                        contentAlignment = Alignment.Center, modifier = Modifier
                            .size(72.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#AC87C5")),
                                shape = RoundedCornerShape(60.dp)
                            )
                            .clip(
                                CircleShape
                            )
                            .clickable { }
                    ) {
                        Image(painter = painterResource(id = R.drawable.ic_kalender), contentDescription = "Icon Kalender", modifier = Modifier.size(36.dp))
                    }
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(text = stringResource(id = R.string.menu_kalender), fontSize = 12.sp)
                }

            }
        }

        item {
            Row(modifier = Modifier
                .padding(start = 24.dp, top = 20.dp, end = 24.dp, bottom = 12.dp)
                .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                Text("Rekomendasi Artikel", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
                Text("See all", fontSize = 12.sp, fontWeight = FontWeight.Normal, color = Color(0xFF756AB6))
            }
        }

        items(artikels) {
            ArtikelItemVertical(artikel = it, modifier = modifier.padding(horizontal = 24.dp, vertical = 5.dp),
//                contentPadding = PaddingValues(bottom = 10.dp),
//                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
            }
        }



//        item {
//            LazyRow(
//                modifier = modifier.padding(start = 24.dp, end = 24.dp),
//                contentPadding = PaddingValues(bottom = 10.dp),
//                horizontalArrangement = Arrangement.spacedBy(16.dp),
//            ) {
//
//            }
//        }


    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SliderHeader(modifier: Modifier = Modifier) {
    Card(
        onClick = { },
        modifier = modifier
            .fillMaxWidth()
            .width(300.dp)
            .height(120.dp),
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.slider_1),
            contentDescription = "Image Resep",
            modifier = modifier
                .height(120.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        
    }
}