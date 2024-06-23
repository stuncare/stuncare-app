package com.widyawacana.stuncare.ui.presentation.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
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
fun AboutScreen(modifier: Modifier = Modifier, navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color(0xFF756AB6)
            ),
                title = { Text(text = "Tentang Stuncare", color = Color.White) },
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
        Column(modifier = Modifier
            .padding(contentPadding)
            .verticalScroll(rememberScrollState())) {

            Column(modifier = Modifier.padding(horizontal = 24.dp, vertical = 24.dp)) {
                Image(painter = painterResource(id = R.drawable.logo_stuncare_purple), contentDescription = null, modifier = modifier.size(132.dp).align(Alignment.CenterHorizontally))
                
                Spacer(modifier = Modifier.height(20.dp))
                
                Text(text = "Stuncare", fontSize = 16.sp, fontWeight = FontWeight.Bold)

                Spacer(modifier = Modifier.height(10.dp))

                Text(text = "Stuncare adalah sebuah aplikasi dan website yang dirancang untuk membantu memantau dan mendukung perkembangan anak usia balita di Indonesia. Aplikasi ini bertujuan untuk menekan angka stunting dan memastikan bahwa ibu-ibu serta anak-anak mendapatkan perawatan dan perhatian yang diperlukan untuk pertumbuhan optimal. Melalui inovasi teknologi, Stuncare berkomitmen untuk mewujudkan generasi emas Indonesia 2045." +
                        "\n\n" +
                        "Dengan mengedukasi masyarakat dan menyediakan alat pemantauan yang mudah digunakan, Stuncare berupaya meningkatkan kesadaran akan pentingnya gizi dan kesehatan sejak dini, serta membantu mencegah stunting. Diharapkan, aplikasi ini dapat mendukung visi mewujudkan generasi emas Indonesia yang sehat dan bebas dari stunting. " +
                        "\n\n" +
                        "Dukungan dari para ahli gizi dan dokter anak memastikan bahwa informasi dan layanan yang diberikan terpercaya dan akurat, sehingga orang tua bisa lebih percaya diri dalam merawat dan mendukung pertumbuhan anak mereka.", fontSize = 16.sp, fontWeight = FontWeight.Normal)
            }
        }
    }
}