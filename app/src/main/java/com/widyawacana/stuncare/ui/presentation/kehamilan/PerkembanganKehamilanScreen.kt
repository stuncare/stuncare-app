package com.widyawacana.stuncare.ui.presentation.kehamilan

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
fun PerkembanganKehamilanScreen(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color(0xFF756AB6)
            ),
                title = { Text(text = "Perkembangan Kehamilan", color = Color.White) },
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
            modifier = Modifier
                .padding(all = 20.dp)
                .padding(contentPadding)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start

        ) {

            // Nama Calon Anak
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Nama Calon Anak", fontSize = 14.sp, fontWeight = FontWeight.Medium)
            Spacer(modifier = Modifier.height(6.dp))
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)

            )

            //  Hari Pertama Haid Terakhir (HPHT)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Hari Pertama Haid Terakhir (HPHT)", fontSize = 14.sp, fontWeight = FontWeight.Medium)
            Spacer(modifier = Modifier.height(6.dp))
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)

            )


            // Hari Perkiraan Lahir (HPL)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Hari Perkiraan Lahir (HPL)", fontSize = 14.sp, fontWeight = FontWeight.Medium)
            Spacer(modifier = Modifier.height(6.dp))
            OutlinedTextField(
                enabled = false,
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp).background(color = Color(0xFFD0D5DD)),
                colors = OutlinedTextFieldDefaults.colors(
                    disabledTextColor = MaterialTheme.colorScheme.onSurface,
                    disabledContainerColor = Color.Transparent,
                    disabledBorderColor = MaterialTheme.colorScheme.outline,
                    disabledLeadingIconColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    disabledTrailingIconColor = MaterialTheme.colorScheme.onSurface,
                    disabledLabelColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    disabledPlaceholderColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    disabledSupportingTextColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    disabledPrefixColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    disabledSuffixColor = MaterialTheme.colorScheme.onSurfaceVariant
                )
            )


            // Usia Kehamilan (Minggu)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Usia Kehamilan (Minggu)", fontSize = 14.sp, fontWeight = FontWeight.Medium)
            Spacer(modifier = Modifier.height(6.dp))
            OutlinedTextField(
                value = "",
                enabled = false,
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth() // Memanjangkan TextField
                    .height(56.dp).background(color = Color(0xFFD0D5DD)),
                colors = OutlinedTextFieldDefaults.colors(
                    disabledTextColor = MaterialTheme.colorScheme.onSurface,
                    disabledContainerColor = Color.Transparent,
                    disabledBorderColor = MaterialTheme.colorScheme.outline,
                    disabledLeadingIconColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    disabledTrailingIconColor = MaterialTheme.colorScheme.onSurface,
                    disabledLabelColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    disabledPlaceholderColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    disabledSupportingTextColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    disabledPrefixColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    disabledSuffixColor = MaterialTheme.colorScheme.onSurfaceVariant
                )
            )


            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = { navController.navigate(Screen.StatusPerkembanganKehamilan.route) },
                modifier = Modifier
                    .height(45.dp)
                    .fillMaxWidth()
                // Menggunakan Shapes.small untuk membuat sudut tombol melengkung
            ) {
                Text(text = "Simpan", fontSize = 16.sp, fontWeight = FontWeight.Medium)
            }

        }


    }
}

