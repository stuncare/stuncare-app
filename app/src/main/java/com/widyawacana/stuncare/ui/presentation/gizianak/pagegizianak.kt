
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import com.widyawacana.stuncare.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")

@Composable
fun pagegizianak2() {
    Scaffold(
        topBar = {
            TopAppBar(
                modifier = Modifier.fillMaxWidth(),
                title = {
                    Text(
                        text = "Pertumbuhan Anak",
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
        var selectedOption by remember { mutableStateOf("Option 1") } // Deklarasikan selectedOption di sini
        Content(selectedOption)
    }
}

@Composable
fun Content(selectedOption: String) { // Masukkan selectedOption ke dalam parameter fungsi Content
    Column(
        modifier = Modifier.padding(all = 15.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start

    ) {


        Spacer(modifier = Modifier.height(65.dp))
        // Text Field "Nama Anak"
        Text(text = "Nama Anak", fontSize = 14.sp, fontWeight = FontWeight.Medium)
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth() // Memanjangkan TextField
                .height(56.dp),
            // Icon Di dalam Outline
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.iconheadbayi),
                    contentDescription = "",
                    tint = Color.Unspecified
                )
            }
        )
        // Spacer
        Spacer(modifier = Modifier.height(10.dp))

        // Text Field  "Tanggal Lahir"
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
        Spacer(modifier = Modifier.height(10.dp))

        // Text Field for "Tanggal Pengisian"
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
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Jenis Kelamin", fontSize = 14.sp, fontWeight = FontWeight.Medium)
        Row {
            // Radio Buttons for options
            Spacer(modifier = Modifier.height(6.dp))
            RadioButton(
                selected = selectedOption == "Laki -Laki",
                onClick = {  }
            )
            Text(text = "Laki-Laki", fontSize = 16.sp, fontWeight =  FontWeight.Medium)

            RadioButton(
                selected = selectedOption == "Perempuan",
                onClick = { }
            )

            Text(text = "Perempuan", fontSize = 16.sp, fontWeight =  FontWeight.Medium)
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Berat Badan (Kg)", fontSize = 14.sp, fontWeight =  FontWeight.Medium)
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
                    contentDescription = "Timbangan Bayi",
                    tint = Color.Unspecified
                )
            }
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Tinggi Badan (Cm)", fontSize = 14.sp, fontWeight =  FontWeight.Medium)
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
                    contentDescription = "Timbangan Bayi",
                    tint = Color.Unspecified
                )
            }
        )

        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Lingkar Kepala(Cm)", fontSize = 14.sp, fontWeight =  FontWeight.Medium)
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth() // Memanjangkan TextField
                .height(56.dp),
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.iconheadbayi),
                    contentDescription = "Timbangan Bayi",
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
