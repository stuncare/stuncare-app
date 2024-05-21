package com.widyawacana.stuncare.ui.presentation.gizianak

import android.annotation.SuppressLint
import android.text.Layout
import androidx.compose.foundation.gestures.scrollable
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
import androidx.navigation.NavController
import com.widyawacana.stuncare.ui.navigation.Screen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun pagegzianak(navController: NavController) {
    Scaffold(topBar = {
        CenterAlignedTopAppBar(colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(0xFF756AB6)
        ), title = { Text(text = "Pertumbuhan Anak", color = Color.White) }, navigationIcon = {
            IconButton(onClick = { navController.popBackStack() }) {
                Icon(
                    imageVector = Icons.Default.ArrowBackIosNew,
                    contentDescription = "Back Icon",
                    tint = Color.White
                )
            }
        })
    }, modifier = Modifier
    ) {
        Content(navController = navController)

    }
}

@Composable
fun Content(navController: NavController) {
    Column(
        modifier = Modifier
            .padding(all = 20.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start

    ) {

        Spacer(modifier = Modifier.height(75.dp))
        Text(text = "Nama Anak", fontSize = 14.sp, fontWeight = FontWeight.Medium)
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth() // Memanjangkan TextField
                .height(56.dp)

        )

        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Tanggal Lahir", fontSize = 14.sp, fontWeight = FontWeight.Medium)
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

        // Text Field for "Tanggal Berat Badan"
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
            onClick = { navController.navigate(Screen.StatusGiziAnak.route) },
            modifier = Modifier
                .height(45.dp)
                .fillMaxWidth()
            // Menggunakan Shapes.small untuk membuat sudut tombol melengkung
        ) {
            Text(text = "Simpan", fontSize = 16.sp, fontWeight =  FontWeight.Medium)
        }



    }
}
