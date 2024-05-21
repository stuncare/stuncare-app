package com.widyawacana.stuncare.ui.presentation.register

import com.widyawacana.stuncare.R

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun PageRegister() {
    Column(
        modifier = Modifier
            .width(360.dp)
            .height(800.dp)
            .background(color = Color(0xFFFFFFFF))
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(35.dp))
        Image(
            painter = painterResource(id = R.drawable.logoregist),
            contentDescription = "Logo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(186.dp)
                .height(207.dp)
        )
        var fullName by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var birthDate by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confirmPassword by remember { mutableStateOf("") }
        var passwordVisible by remember { mutableStateOf(false) }
        var confirmPasswordVisible by remember { mutableStateOf(false) }

        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Nama Lengkap",
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp)
        )
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value = fullName,
            onValueChange = { fullName = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        )

        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "Alamat Email",
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp)
        )
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        )

        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "Tanggal Lahir",
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp)
        )
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value = birthDate,
            onValueChange = { birthDate = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.icontanggal),
                    contentDescription = "Timbangan Bayi",
                    tint = Color.Unspecified
                )
            }
        )

        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "Password",
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp)
        )
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            trailingIcon = {
                val image = if (passwordVisible)
                    painterResource(id = R.drawable.iconpasson)
                else
                    painterResource(id = R.drawable.iconpasshide)

                IconButton(onClick = {
                    passwordVisible = !passwordVisible
                }) {
                    Icon(painter = image, contentDescription = null)
                }
            }
        )

        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "Ulangi Password",
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp)
        )
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            visualTransformation = if (confirmPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            trailingIcon = {
                val image = if (confirmPasswordVisible)
                    painterResource(id = R.drawable.iconpasson)
                else
                    painterResource(id = R.drawable.iconpasshide)

                IconButton(onClick = {
                    confirmPasswordVisible = !confirmPasswordVisible
                }) {
                    Icon(painter = image, contentDescription = null)
                }
            }
        )
        Spacer(modifier = Modifier.height(24.dp))
        Button(
            onClick = { /* TODO: Add your action here */ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF756AB6)
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            Text(text = "Daftar",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                color = Color.White)
        }
    }
}
