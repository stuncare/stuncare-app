package com.widyawacana.stuncare.ui.presentation.giziibu

import android.annotation.SuppressLint
import android.text.Layout
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.widyawacana.stuncare.R
import androidx.compose.ui.Modifier

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun ukurgiziibu() {
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
    ) {

        Content()
    }
}

@Composable
fun Content() {
    Column(
        modifier = Modifier.padding(all = 20.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start

    ) {

        Spacer(modifier = Modifier.height(75.dp))
        Text(text = "Tanggal Kehamilan", fontSize = 14.sp, fontWeight = FontWeight.Medium)
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth() // Memanjangkan TextField
                .height(56.dp)

        )

        // Spacer
        Spacer(modifier = Modifier.height(15.dp))

        // Text Field for "Tanggal Lahir"
        Text(text = "Tanggal Pengisian", fontSize = 14.sp, fontWeight = FontWeight.Medium)
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth() // Memanjangkan TextField
                .height(56.dp)
        )

        // Spacer
        Spacer(modifier = Modifier.height(15.dp))

        // Text Field for "Tanggal Pengisian"
        Text(text = "Berat Badan (Kg)", fontSize = 14.sp, fontWeight = FontWeight.Medium)
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth() // Memanjangkan TextField
                .height(56.dp),
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.icontimbangan),
                    contentDescription = "",
                    tint = Color.Unspecified
                )
            }
        )

        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Berat Badan (Cm)", fontSize = 14.sp, fontWeight =  FontWeight.Medium)
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth() // Memanjangkan TextField
                .height(56.dp),
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.iconpenggaris),
                    contentDescription = "",
                    tint = Color.Unspecified
                )
            }


        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Lingkar Lengan (Cm)", fontSize = 14.sp, fontWeight =  FontWeight.Medium)
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth() // Memanjangkan TextField
                .height(56.dp),
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.iconpenggaris),
                    contentDescription = "",
                    tint = Color.Unspecified
                )
            }
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = { /* TODO: Implement button action */ },
            modifier = Modifier
                .height(45.dp)
                .fillMaxWidth()
            // Menggunakan Shapes.small untuk membuat sudut tombol melengkung
        ) {
            Text(text = "Simpan", fontSize = 16.sp, fontWeight =  FontWeight.Medium)
        }
    }
}
