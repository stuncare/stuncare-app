package com.widyawacana.stuncare.ui.presentation.kehamilan

import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
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
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.material3.rememberTimePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.widyawacana.stuncare.ui.navigation.Screen
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.Calendar
import java.util.Locale

@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PerkembanganKehamilanScreen(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color(0xFF756AB6)
            ),
                title = { Text(text = "Perkembangan Kehamilan", color = Color.White) },
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

        val context = LocalContext.current

        var nameBaby by remember { mutableStateOf("") }
        var lastMenstruationDate by remember { mutableStateOf("") }
        var pregnancyAge by remember { mutableStateOf("") }
        var estimatedDeliveryDate by remember { mutableStateOf("") }

        val date = remember { Calendar.getInstance().timeInMillis }
        val formatter = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())


        val datePickerState = rememberDatePickerState(initialSelectedDateMillis = date)
        var showDatePicker by remember { mutableStateOf(false) }

        if (showDatePicker) {
            DatePickerDialog(
                onDismissRequest = { showDatePicker = false },
                confirmButton = {
                    TextButton(
                        onClick = {
                            val selectedDate = Calendar.getInstance().apply {
                                timeInMillis = datePickerState.selectedDateMillis!!
                            }
                            lastMenstruationDate = formatter.format(selectedDate.time)
                            // Update pregnancy age and estimated delivery date
                            val lastMenstruationLocalDate =
                                LocalDate.ofEpochDay(selectedDate.timeInMillis / (24 * 60 * 60 * 1000))
                            val currentDate = LocalDate.now()
                            val weeksPregnant =
                                ChronoUnit.WEEKS.between(lastMenstruationLocalDate, currentDate)
                                    .toString()
                            pregnancyAge = weeksPregnant

                            val estimatedDeliveryLocalDate = lastMenstruationLocalDate.plusWeeks(40)
                            estimatedDeliveryDate =
                                estimatedDeliveryLocalDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))

                            showDatePicker = false
                        }
                    ) {
                        Text("OK")
                    }
                },
                dismissButton = {
                    TextButton(onClick = { showDatePicker = false }) {
                        Text("Cancel")
                    }
                }
            ) {
                DatePicker(state = datePickerState)
            }
        }

        Column(
            modifier = Modifier
                .padding(all = 20.dp)
                .padding(contentPadding)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start

        ) {

            // Nama Calon Anak
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Nama Calon Anak", fontSize = 14.sp, fontWeight = FontWeight.Medium)
            Spacer(modifier = Modifier.height(6.dp))
            OutlinedTextField(
                value = nameBaby,
                onValueChange = { changeNameBaby -> nameBaby = changeNameBaby },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                placeholder = {
                    Text("Cont: Widya")
                }
            )

            //  Hari Pertama Haid Terakhir (HPHT)
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = "Hari Pertama Haid Terakhir (HPHT)",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium
            )
            Spacer(modifier = Modifier.height(6.dp))
            OutlinedTextField(
                value = lastMenstruationDate,
                onValueChange = {
                    lastMenstruationDate = it
                    val dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
                    try {
                        val lastMenstruationLocalDate = LocalDate.parse(it, dateFormatter)
                        val currentDate = LocalDate.now()
                        val weeksPregnant =
                            ChronoUnit.WEEKS.between(lastMenstruationLocalDate, currentDate)
                                .toString()
                        pregnancyAge = weeksPregnant

                        val estimatedDeliveryLocalDate = lastMenstruationLocalDate.plusWeeks(40)
                        estimatedDeliveryDate = estimatedDeliveryLocalDate.format(dateFormatter)
                    } catch (e: Exception) {
                        pregnancyAge = ""
                        estimatedDeliveryDate = ""
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                placeholder = {
                    Text("Cont: 10-04-2024")
                },
                trailingIcon = {
                    IconButton(onClick = { showDatePicker = true }) {
                        Icon(
                            imageVector = Icons.Default.DateRange,
                            contentDescription = "Select Date"
                        )
                    }
                }

            )

            // Hari Perkiraan Lahir (HPL)
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = "Hari Perkiraan Lahir (HPL)",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium
            )
            Spacer(modifier = Modifier.height(6.dp))
            OutlinedTextField(
                enabled = false,
                value = estimatedDeliveryDate,
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .background(color = Color(0xFFEFEDFD)),
                colors = OutlinedTextFieldDefaults.colors(
                    disabledTextColor = MaterialTheme.colorScheme.onSurface,
                    disabledContainerColor = Color.Transparent,
                    disabledBorderColor = MaterialTheme.colorScheme.outline,
                    disabledLeadingIconColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    disabledTrailingIconColor = MaterialTheme.colorScheme.onSurface,
                    disabledLabelColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    disabledPlaceholderColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    disabledSupportingTextColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    disabledPrefixColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    disabledSuffixColor = MaterialTheme.colorScheme.onSurfaceVariant
                )
            )

            // Usia Kehamilan (Minggu)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Usia Kehamilan (Minggu)", fontSize = 14.sp, fontWeight = FontWeight.Medium)
            Spacer(modifier = Modifier.height(6.dp))
            OutlinedTextField(
                value = pregnancyAge,
                enabled = false,
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth() // Memanjangkan TextField
                    .height(56.dp)
                    .background(color = Color(0xFFEFEDFD)),
                colors = OutlinedTextFieldDefaults.colors(
                    disabledTextColor = MaterialTheme.colorScheme.onSurface,
                    disabledContainerColor = Color.Transparent,
                    disabledBorderColor = MaterialTheme.colorScheme.outline,
                    disabledLeadingIconColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    disabledTrailingIconColor = MaterialTheme.colorScheme.onSurface,
                    disabledLabelColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    disabledPlaceholderColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    disabledSupportingTextColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    disabledPrefixColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    disabledSuffixColor = MaterialTheme.colorScheme.onSurfaceVariant
                )
            )


            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    if (nameBaby.isBlank() || lastMenstruationDate.isBlank()) {
                        Toast.makeText(
                            context,
                            "Semua field wajib diisi!",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        navController.navigate("${Screen.StatusPerkembanganKehamilan.route}/$pregnancyAge")
                    }
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF756AB6)
                ),
                shape = MaterialTheme.shapes.small,
                modifier = Modifier
                    .height(56.dp)
                    .fillMaxWidth()
                // Menggunakan Shapes.small untuk membuat sudut tombol melengkung
            ) {
                Text(text = "Simpan", fontSize = 16.sp, fontWeight = FontWeight.Medium)
            }

        }


    }
}

