package com.widyawacana.stuncare.ui.presentation.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.ReportGmailerrorred
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.widyawacana.stuncare.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContactUsScreen(modifier: Modifier = Modifier, navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color(0xFF756AB6)
            ),
                title = { Text(text = "Hubungi Kami", color = Color.White) },
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

        var email by remember { mutableStateOf("") }
        var messages by remember { mutableStateOf("") }

        Column(
            modifier = Modifier
                .padding(contentPadding)
                .verticalScroll(rememberScrollState())
        ) {

            Column(modifier = Modifier.padding(horizontal = 24.dp, vertical = 24.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.img_contact_us),
                    contentDescription = null,
                    modifier = modifier
                        .size(200.dp)
                        .align(
                            Alignment.CenterHorizontally
                        )
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Laporkan masalah atau beri saran,",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Text(
                    text = "Kami siap membantu Anda!",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )

                Spacer(modifier = Modifier.height(20.dp))


                Spacer(modifier = Modifier.height(30.dp))

                Text("Email", fontSize = 14.sp)
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    modifier = Modifier.fillMaxWidth(),
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Email, contentDescription = null)
                    }
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text("Messages", fontSize = 14.sp)
                OutlinedTextField(
                    value = messages,
                    onValueChange = { messages = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.ReportGmailerrorred,
                            contentDescription = null
                        )
                    }
                )

                Spacer(modifier = Modifier.height(10.dp))

                Button(onClick = { /*TODO*/ }, modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)) {
                    Text(text = "Kirim")
                }

                
            }
        }
    }
}