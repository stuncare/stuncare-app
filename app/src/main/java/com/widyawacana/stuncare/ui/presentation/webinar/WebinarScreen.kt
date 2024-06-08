package com.widyawacana.stuncare.ui.presentation.webinar

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.CalendarMonth
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.widyawacana.stuncare.data.local.dummy.DummyData
import com.widyawacana.stuncare.model.Webinar
import com.widyawacana.stuncare.ui.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WebinarScreen(
    webinars: List<Webinar> = DummyData.listWebinar,
    modifier: Modifier = Modifier, navController: NavController
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color(0xFF756AB6)
            ),
                title = { Text(text = "Webinar", color = Color.White) },
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
    ) { contentPadding ->
        Column(
            modifier = Modifier.padding(contentPadding)
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier
                    .padding(horizontal = 24.dp)
                    .horizontalScroll(rememberScrollState()),
            ) {
                Button(onClick = { /* Tombol 1 diklik */ }) {
                    Text(text = "Semua")
                }
                Spacer(modifier = Modifier.width(10.dp))
                OutlinedButton(onClick = { /* Tombol 2 diklik */ }) {
                    Text(text = "Kemenkes")
                }
                Spacer(modifier = Modifier.width(10.dp))
                OutlinedButton(onClick = { /* Tombol 3 diklik */ }) {
                    Text(text = "Webinar")
                }
                Spacer(modifier = Modifier.width(10.dp))
                OutlinedButton(onClick = { /* Tombol 3 diklik */ }) {
                    Text(text = "Live")
                }
            }
            LazyColumn(
                modifier = Modifier
                    .padding(top = 20.dp)
            ) {
                items(webinars) {
                    WebinarItemCard(
                        webinar = it,
                        modifier = modifier.padding(horizontal = 24.dp, vertical = 5.dp)
                    ) { id ->
                        navController.navigate(Screen.DetailWebinar.route + "/$id")
                    }
                }
            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WebinarItemCard(modifier: Modifier = Modifier, webinar: Webinar, onItemClicked: (Int) -> Unit) {
    Card(
        onClick = { onItemClicked(webinar.id) },
        modifier = modifier
            .fillMaxWidth()
            .width(312.dp)
            .height(160.dp),
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
            Image(
                painter = painterResource(id = webinar.photo),
                contentDescription = "Image Game",
                modifier = Modifier
                    .height(140.dp)
                    .width(120.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column(horizontalAlignment = Alignment.Start) {
                Text(
                    text = webinar.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp
                )
                Spacer(modifier = Modifier.height(6.dp))
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.CalendarMonth,
                            contentDescription = "Icon Calendar",
                            modifier = Modifier.size(14.dp),
                            tint = Color.DarkGray
                        )
                        Spacer(modifier = Modifier.width(2.dp))
                        Text(text = webinar.date, fontSize = 12.sp)
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.AccessTime,
                            contentDescription = "Icon Waktu",
                            modifier = Modifier.size(14.dp),
                            tint = Color.DarkGray
                        )
                        Spacer(modifier = Modifier.width(2.dp))
                        Text(text = webinar.time, fontSize = 12.sp)
                    }

                }
                Spacer(modifier = Modifier.height(10.dp))
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .background(
                            color = Color(android.graphics.Color.parseColor("#756AB6")),
                            shape = RoundedCornerShape(6.dp)
                        )
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(start = 6.dp, end = 6.dp)
                    ) {
                        Text(
                            text = webinar.location,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White,
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp)
                        )
                    }

                }


            }

        }
    }
}