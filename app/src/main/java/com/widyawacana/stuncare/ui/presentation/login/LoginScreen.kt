package com.example.stuncare.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.widyawacana.stuncare.R

@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .width(360.dp)
            .height(800.dp)
            .background(color = Color(0xFFFFFFFF))
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(55.dp))
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(245.dp)
                .height(230.dp)
        )
        var emaillogin by remember { mutableStateOf("") }
        var passwordlogin by remember { mutableStateOf("") }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Email",
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp)
        )
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value = emaillogin,
            onValueChange = { emaillogin = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
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
            value = passwordlogin,
            onValueChange = { passwordlogin = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            /**visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            trailingIcon = {
            val image = if (passwordVisible)
            painterResource(id = R.drawable.iconpasson) // Your visible icon
            else
            painterResource(id = R.drawable.iconpasshide) // Your hidden icon

            IconButton(onClick = {
            passwordVisible = !passwordVisible
            }) {
            Icon(painter = image, contentDescription = null)
            }
            }
             **/
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ){TextButton(
            onClick = {  } // Arahkan Mau Kemana textbutton Lupa Password ini
        ) {
            Text(
                text = "Lupa Password?",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
        }
        Spacer(modifier = Modifier.height(6.dp))
        Button(
            onClick = { /* TODO: Add your action here */ },// arahkan ke mana
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF756AB6)
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            Text(text = "Login",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                color = Color.White)
        }
        Spacer(modifier = Modifier.height(6.dp))
        Text(text = "atau")
        Button(
            onClick = { /* TODO: Add your action here */ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF756AB6)
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.googleicon), // Replace with your icon resource
                contentDescription = "Centered Icon",
                tint = Color.White // Change icon color if needed
            )
        }
        Spacer(modifier = Modifier.height(6.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        )
        {TextButton(
            onClick = {  } // Arahkan Mau Kemana textbutton Lupa Password ini
        ) {
            Text(
                text = "Belom punya Akun?DAFTAR",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
        }



    }
}