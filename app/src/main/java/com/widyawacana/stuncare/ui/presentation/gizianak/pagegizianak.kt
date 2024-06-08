import android.annotation.SuppressLint

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.widyawacana.stuncare.R
import com.widyawacana.stuncare.ui.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")

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
        var selectedOption by remember { mutableStateOf("Option 1") } // Deklarasikan selectedOption di sini

        Content(selectedOption, navController = navController)
    }
}

@Composable
fun Content(selectedOption: String, navController: NavController) {
    var namaBayi by remember { mutableStateOf("") }
    var tglLahir by remember { mutableStateOf("") }
    var tglPengisian by remember { mutableStateOf("") }
    var jenkel by remember { mutableStateOf("") }
    var beratBadan by remember { mutableStateOf("") }
    var tinggBadan by remember { mutableStateOf("") }
    var lingkarKepala by remember { mutableStateOf("") }
    var selectedOption by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .padding(horizontal = 24.dp).padding(top = 30.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start

    ) {

        Spacer(modifier = Modifier.height(75.dp))
        Text(text = "Nama Anak", fontSize = 14.sp, fontWeight = FontWeight.Medium)
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value = namaBayi,
            onValueChange = { it -> namaBayi = it },
            modifier = Modifier
                .fillMaxWidth() // Memanjangkan TextField
                .height(56.dp),
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.iconheadbayi),
                    contentDescription = "",
                    tint = Color.Gray,
                    modifier = Modifier.size(14.dp)
                )
            }
        )

        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Tanggal Lahir", fontSize = 14.sp, fontWeight = FontWeight.Medium)

        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value = tglLahir,
            onValueChange = { it -> tglLahir = it },
            modifier = Modifier
                .fillMaxWidth() // Memanjangkan TextField
                .height(56.dp),
            // Icon Di dalam Outline
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.icontanggal),
                    contentDescription = "",
                    tint = Color.Gray,
                    modifier = Modifier.size(14.dp)
                )
            }
        )

        // Spacer
        Spacer(modifier = Modifier.height(10.dp))

        // Text Field for "Tanggal Pengisian"
//        Text(text = "Tanggal Pengisian", fontSize = 14.sp, fontWeight = FontWeight.Medium)
//        Spacer(modifier = Modifier.height(6.dp))
//        OutlinedTextField(
//            value = tglPengisian,
//            onValueChange = { it -> tglPengisian = it },
//            modifier = Modifier
//                .fillMaxWidth() // Memanjangkan TextField
//                .height(56.dp),
//            trailingIcon = {
//                Icon(
//                    painter = painterResource(id = R.drawable.icontanggal),
//                    contentDescription = "",
//                    tint = Color.Gray,
//                    modifier = Modifier.size(14.dp)
//                )
//            }
//        )

        // Spacer
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Jenis Kelamin", fontSize = 14.sp, fontWeight = FontWeight.Medium)
        Row(horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
            // Radio Buttons for options
            Spacer(modifier = Modifier.height(6.dp))
            RadioButton(
                selected = selectedOption,
                onClick = { check(true) },
                enabled = true

            )
            Text(text = "Laki-Laki", fontSize = 16.sp, fontWeight =  FontWeight.Medium)
            Spacer(modifier = Modifier.height(6.dp))

            RadioButton(
                selected = selectedOption == false,
                onClick = { selectedOption == false},
            )

            Text(text = "Perempuan", fontSize = 16.sp, fontWeight =  FontWeight.Medium)
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Berat Badan (Kg)", fontSize = 14.sp, fontWeight =  FontWeight.Medium)
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value = beratBadan,
            onValueChange = { it -> beratBadan = it },
            modifier = Modifier
                .fillMaxWidth() // Memanjangkan TextField
                .height(56.dp),
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.icontimbangan),
                    contentDescription = "",
                    tint = Color.Gray,
                    modifier = Modifier.size(14.dp)
                )
            }
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Tinggi Badan (Cm)", fontSize = 14.sp, fontWeight =  FontWeight.Medium)
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value = tinggBadan,
            onValueChange = { it -> tinggBadan = it },
            modifier = Modifier
                .fillMaxWidth() // Memanjangkan TextField
                .height(56.dp),
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.iconpenggaris),
                    contentDescription = "",
                    tint = Color.Gray,
                    modifier = Modifier.size(14.dp)
                )
            }
        )

        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Lingkar Kepala (Cm)", fontSize = 14.sp, fontWeight =  FontWeight.Medium)
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value = lingkarKepala,
            onValueChange = { it -> lingkarKepala = it },
            modifier = Modifier
                .fillMaxWidth() // Memanjangkan TextField
                .height(56.dp),
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.iconheadbayi),
                    contentDescription = "",
                    tint = Color.Gray,
                    modifier = Modifier.size(14.dp)
                )
            }
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = { navController.navigate(Screen.StatusGiziAnak.route) },
            modifier = Modifier
                .height(56.dp)
                .fillMaxWidth()
            // Menggunakan Shapes.small untuk membuat sudut tombol melengkung
        ) {
            Text(text = "Simpan", fontSize = 16.sp, fontWeight =  FontWeight.Medium)
        }
        Spacer(modifier = Modifier.height(20.dp))


    }
}
