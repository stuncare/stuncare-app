package com.widyawacana.stuncare.ui.presentation.profile

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.InsertDriveFile
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.auth.FirebaseAuth
import com.widyawacana.stuncare.R
import com.widyawacana.stuncare.data.local.datastore.DataStore
import com.widyawacana.stuncare.ui.navigation.Screen
import com.widyawacana.stuncare.utils.Constant.CLIENT
import kotlinx.coroutines.launch

@Composable
fun ProfileScreen(navController: NavController, context: Context = LocalContext.current) {
    var isSignedOut by remember { mutableStateOf(false) }
    val context = LocalContext.current
    val corountineScope = rememberCoroutineScope()

    val dataStore = DataStore(context)

    if (isSignedOut) {
        LaunchedEffect(Unit) {
            navController.navigate(Screen.Login.route) {
                popUpTo(Screen.Home.route) {
                    inclusive = true
                }
            }
        }
    } else {
        ProfileContent(navController = navController, onLogoutClick = {
            val googleLogin =
                GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                    .requestEmail()
                    .requestIdToken(CLIENT)
                    .build()

            @Suppress("DEPRECATION")
            val googleClient = GoogleSignIn.getClient(context, googleLogin)
            googleClient.signOut().addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    FirebaseAuth.getInstance().signOut()
                    isSignedOut = true
                    corountineScope.launch {
                        dataStore.clearStatus()
                    }
                } else {
                    Toast.makeText(
                        context,
                        "Logout Gagal",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        })
    }
}


@Composable
fun ProfileContent(navController: NavController, onLogoutClick: () -> Unit) {
    val currentUser = FirebaseAuth.getInstance().currentUser?.email?.substringBefore("@") ?: "N/A"

    LazyColumn(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxHeight()
    ) {
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .padding(bottom = 30.dp)
                    .background(
                        color = Color(android.graphics.Color.parseColor("#756AB6")),
                        shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp)
                    ),
                contentAlignment = Alignment.Center,
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    val borderWidth = 4.dp

                    Image(
                        painter = painterResource(id = R.drawable.img_profile),
                        contentDescription = "Profile Image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(132.dp)
                            .border(
                                BorderStroke(borderWidth, Color.White),
                                CircleShape
                            )
                            .clip(
                                CircleShape
                            )
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = currentUser,
                        fontSize = 24.sp,
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold
                    )
                }

            }
        }
        item {
            ProfileItemCard(navController = navController, onLogoutClick = onLogoutClick)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileItemCard(
    modifier: Modifier = Modifier.padding(horizontal = 24.dp),
    navController: NavController,
    onLogoutClick: () -> Unit
) {
    Card(
        modifier = modifier
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column() {
            Spacer(modifier = modifier.height(10.dp))
//            // Edit Profile
//            Row(
//                modifier = modifier
//                    .fillMaxWidth()
//                    .clickable {
//                        onLogoutClick
//                    }
//                    .padding(6.dp),
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.SpaceBetween
//            ) {
//                Row(verticalAlignment = Alignment.CenterVertically) {
//                    Icon(
//                        imageVector = Icons.Default.ManageAccounts,
//                        contentDescription = "Icon Calendar",
//                        modifier = Modifier.size(18.dp),
//                        tint = Color.DarkGray
//                    )
//
//                    Spacer(modifier = modifier.height(4.dp))
//
//                    Text(
//                        text = "Edit Profile",
//                        color = Color.DarkGray,
//                        fontWeight = FontWeight.Medium,
//                        fontSize = 16.sp
//                    )
//                }
//                Row(verticalAlignment = Alignment.CenterVertically) {
//                    Icon(
//                        imageVector = Icons.Default.ArrowForwardIos,
//                        contentDescription = "Icon Arrow",
//                        modifier = Modifier.size(18.dp),
//                        tint = Color.DarkGray
//                    )
//                }
//            }
//            Spacer(modifier = modifier.height(10.dp))
//            Divider(color = Color.LightGray, thickness = 1.dp)
//            Spacer(modifier = modifier.height(10.dp))

            // Tentang Kita
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate(Screen.About.route)
                    }
                    .padding(6.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Info,
                        contentDescription = "Icon Info",
                        modifier = Modifier.size(18.dp),
                        tint = Color.DarkGray
                    )

                    Spacer(modifier = modifier.height(4.dp))

                    Text(
                        text = "Tentang Kita",
                        color = Color.DarkGray,
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp
                    )
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    IconButton(onClick = { navController.navigate(Screen.About.route) }) {
                        Icon(
                            imageVector = Icons.Default.ArrowForwardIos,
                            contentDescription = "Icon Arrow",
                            modifier = Modifier.size(18.dp),
                            tint = Color.DarkGray
                        )
                    }
                }
            }
            Spacer(modifier = modifier.height(10.dp))
            Divider(color = Color.LightGray, thickness = 1.dp)
            Spacer(modifier = modifier.height(10.dp))

            // Hubungi Kami
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate(Screen.ContactUs.route)
                    }
                    .padding(6.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Call,
                        contentDescription = "Icon Calendar",
                        modifier = Modifier.size(18.dp),
                        tint = Color.DarkGray
                    )

                    Spacer(modifier = modifier.height(4.dp))

                    Text(
                        text = "Hubungi Kami",
                        color = Color.DarkGray,
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp
                    )
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    IconButton(onClick = { navController.navigate(Screen.ContactUs.route) }) {
                        Icon(
                            imageVector = Icons.Default.ArrowForwardIos,
                            contentDescription = "Icon Arrow",
                            modifier = Modifier.size(18.dp),
                            tint = Color.DarkGray
                        )
                    }
                }
            }
            Spacer(modifier = modifier.height(10.dp))
            Divider(color = Color.LightGray, thickness = 1.dp)
            Spacer(modifier = modifier.height(10.dp))

            // Kebijakan & Privasi
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate(Screen.TermCondition.route)
                    }
                    .padding(6.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.InsertDriveFile,
                        contentDescription = "Icon Calendar",
                        modifier = Modifier.size(18.dp),
                        tint = Color.DarkGray
                    )

                    Spacer(modifier = modifier.height(4.dp))

                    Text(
                        text = "Kebijakan & Privasi",
                        color = Color.DarkGray,
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp
                    )
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    IconButton(onClick = { navController.navigate(Screen.TermCondition.route) }) {
                        Icon(
                            imageVector = Icons.Default.ArrowForwardIos,
                            contentDescription = "Icon Arrow",
                            modifier = Modifier.size(18.dp),
                            tint = Color.DarkGray
                        )
                    }
                }
            }
            Spacer(modifier = modifier.height(10.dp))
            Divider(color = Color.LightGray, thickness = 1.dp)
            Spacer(modifier = modifier.height(0.dp))

            // Logout
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .clickable {
                        onLogoutClick()
                    }
                    .padding(6.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Logout,
                        contentDescription = "Icon Calendar",
                        modifier = Modifier.size(18.dp),
                        tint = Color.DarkGray
                    )

                    Spacer(modifier = modifier.height(4.dp))

                    Text(
                        text = "Logout",
                        color = Color.DarkGray,
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp
                    )
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    IconButton(onClick = onLogoutClick) {
                        Icon(
                            imageVector = Icons.Default.ArrowForwardIos,
                            contentDescription = "Icon Arrow",
                            modifier = Modifier.size(18.dp),
                            tint = Color.DarkGray
                        )
                    }
                }
            }
            Spacer(modifier = modifier.height(10.dp))
        }
    }
}