package com.example.stuncare.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
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
import androidx.navigation.NavController
import com.widyawacana.stuncare.R
import com.widyawacana.stuncare.ui.navigation.Screen

@Composable
fun LoginScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFFFFFFF))
            .padding(horizontal = 24.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(55.dp))
        Image(
            painter = painterResource(id = R.drawable.img_login_akun),
            contentDescription = "Logo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(204.dp)
                .height(187.dp)
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
        ) {
            TextButton(
                onClick = { } // Arahkan Mau Kemana textbutton Lupa Password ini
            ) {
                Text(
                    text = "Lupa Password?",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF756AB6)
                )
            }
        }
        Spacer(modifier = Modifier.height(6.dp))
        Button(
            onClick = {
                navController.navigate(Screen.Home.route)
            },// arahkan ke mana
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF756AB6)
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            Text(
                text = "Login",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.White
            )
        }
        Spacer(modifier = Modifier.height(6.dp))
//        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
//            Row {
//                Divider(color = Color.LightGray, thickness = 1.dp)
//            }
//            Row {
//                Text(text = "atau")
//            }
//            Row {
//                Divider(color = Color.LightGray, thickness = 1.dp)
//            }
//        }

        Spacer(modifier = Modifier.height(6.dp))
        OutlinedButton(
            onClick = { /* TODO: Add your action here */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.googleicon), // Replace with your icon resource
                contentDescription = "Centered Icon",
                modifier = Modifier
                    .width(100.dp)
                    .height(32.dp)
            )
        }
        Spacer(modifier = Modifier.height(6.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Text(text = "Belum punya Akun?", fontSize = 16.sp,
                fontWeight = FontWeight.Normal)
            TextButton(
                onClick = {
                    navController.navigate(Screen.Register.route)
                } // Arahkan Mau Kemana textbutton Lupa Password ini
            ) {
                Text(
                    text = "Daftar",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF756AB6)
                )
            }
        }
    }
}