package com.widyawacana.stuncare.ui.component

import androidx.compose.foundation.Image
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
import androidx.compose.material.icons.filled.Stars
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.widyawacana.stuncare.model.Resep
import com.widyawacana.stuncare.ui.navigation.Screen

@Composable
fun ResepItemVertical(modifier: Modifier = Modifier, resep: Resep, onItemClicked: (Int) -> Unit) {
    Card(
        onClick = { onItemClicked(resep.id) },
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
            Column(horizontalAlignment = Alignment.Start) {
                Text(
                    text = resep.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    maxLines = 1,
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
                            Icon(
                                imageVector = Icons.Default.AccessTime,
                                contentDescription = "Icon Rating",
                                modifier = Modifier.size(14.dp),
                                tint = Color.White
                            )
                            Spacer(modifier = Modifier.width(2.dp))
                            Text(
                                text = resep.duration.toString() + " Menit",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color.White,
                                modifier = Modifier.padding(4.dp)
                            )
                        }

                    }
                }

            }
            Image(
                painter = painterResource(id = resep.photo),
                contentDescription = "Image Resep",
                modifier = Modifier
                    .height(100.dp)
                    .width(140.dp)
                    .clip(RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Composable
fun ResepItemHorizontal(
    modifier: Modifier = Modifier,
    resep: Resep,
    onItemClicked: (Int) -> Unit
) {
    Card(
        onClick = {
            onItemClicked(resep.id)
        },
        modifier = modifier
            .width(144.dp)
            .height(170.dp),
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = resep.photo),
                contentDescription = "Image Resep",
                modifier = modifier
                    .height(110.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = resep.title,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                maxLines = 1,
                modifier = modifier.padding(start = 10.dp, top = 10.dp, end = 10.dp, bottom = 0.dp)
            )
            Row(
                modifier = modifier.padding(start = 10.dp, top = 0.dp, end = 10.dp, bottom = 0.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.AccessTime,
                    contentDescription = "Icon Rating",
                    modifier = Modifier.size(12.dp)
                )
                Spacer(modifier = Modifier.width(2.dp))
                Text(
                    text = resep.duration.toString() + " Menit",
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp
                )
            }
        }
    }
}

@Composable
fun ResepItemHeader(
    modifier: Modifier = Modifier,
    resep: Resep,
    onItemClicked: (Int) -> Unit
) {
    Card(
        onClick = {
            onItemClicked(resep.id)
        },
        modifier = modifier
            .width(270.dp)
            .height(180.dp),
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Box(contentAlignment = Alignment.BottomStart) {
            Image(
                painter = painterResource(id = resep.photo),
                contentDescription = "Image Resep",
                modifier = modifier
                    .height(180.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Column(horizontalAlignment = Alignment.Start, modifier = Modifier.padding(12.dp)) {
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
                        Icon(
                            imageVector = Icons.Default.AccessTime,
                            contentDescription = "Icon Rating",
                            modifier = Modifier.size(14.dp),
                            tint = Color.White
                        )
                        Spacer(modifier = Modifier.width(2.dp))
                        Text(
                            text = resep.duration.toString() + " Menit",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White,
                            modifier = Modifier.padding(4.dp)
                        )
                    }

                }
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = resep.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.White,
                    maxLines = 1,
                )
            }

            //
//            Column(modifier = Modifier.fillMaxSize()) {
//
//
//                Text(
//                    text = resep.title,
//                    fontWeight = FontWeight.Bold,
//                    fontSize = 14.sp,
//                    modifier = modifier.padding(start = 10.dp, top = 10.dp, end = 10.dp, bottom = 0.dp)
//                )
//                Row(
//                    modifier = modifier.padding(start = 10.dp, top = 0.dp, end = 10.dp, bottom = 0.dp),
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Icon(
//                        imageVector = Icons.Default.AccessTime,
//                        contentDescription = "Icon Rating",
//                        modifier = Modifier.size(12.dp)
//                    )
//                    Spacer(modifier = Modifier.width(2.dp))
//                    Text(
//                        text = resep.duration.toString() + " Menit",
//                        fontWeight = FontWeight.Medium,
//                        fontSize = 12.sp
//                    )
//                }
//            }
        }
    }
}