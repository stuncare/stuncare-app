package com.widyawacana.stuncare.ui.presentation.gizianak

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.widyawacana.stuncare.R
import com.widyawacana.stuncare.ui.presentation.StuncareApp
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun giziawalpage() {
    Scaffold(
        topBar = {
            TopAppBar(
                modifier = Modifier.fillMaxWidth(),
                title = {
                    Text(
                        text = "Pertumbuhan Anak",
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF756AB6)
                )
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.dataanak),
                contentDescription = null,
                modifier = Modifier
                    .size(250.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { /* TODO: Implement button action */ },
                modifier = Modifier
                    .height(45.dp)
                    .width(312.dp)
                    .padding(horizontal = 16.dp), // Padding horizontal tambahan untuk menambahkan ruang di sisi tombol
                // Menggunakan Shapes.small untuk membuat sudut tombol melengkung
            ) {
                Text(text = "Tambah Data Anak")
            }
        }
    }
}

