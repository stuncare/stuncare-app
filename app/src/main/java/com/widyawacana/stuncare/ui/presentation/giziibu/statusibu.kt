package com.widyawacana.stuncare.ui.presentation.giziibu

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
/**

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun statusibu () {
    Scaffold(
        topBar = {
            TopAppBar(
                modifier = Modifier.fillMaxWidth(),
                title = {
                    Text(
                        text = "Pengukuran Gizi Ibu Hamil",
                        color = Color.White,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold // Beratkan huruf judul
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF756AB6)
                )
            )
        }
    )
    }
 **/