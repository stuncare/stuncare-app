package com.widyawacana.stuncare.ui.presentation.kalender

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TimePicker
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.material3.rememberTimePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.widyawacana.stuncare.model.Alarm
import com.widyawacana.stuncare.ui.navigation.Screen
import com.widyawacana.stuncare.ui.presentation.kalender.component.TimePickerDialog
import com.widyawacana.stuncare.utils.cancelNotification
import com.widyawacana.stuncare.utils.scheduleNotification
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KalenderScreen(
    navController: NavController,
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color(0xFF756AB6)
            ),
                title = { Text(text = "Kalender Imunisasi", color = Color.White) },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(Screen.Home.route) }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBackIosNew,
                            contentDescription = "Back Icon",
                            tint = Color.White
                        )
                    }
                })
        }, modifier = Modifier
    ) { innerPadding ->

        val context = LocalContext.current
        var alarmList by remember { mutableStateOf(emptyList<Alarm>()) }

        // Callback untuk menambah alarm ke daftar
        val addAlarm: (Alarm) -> Unit = { alarm ->
            alarmList = alarmList + alarm
        }

        val date = remember { Calendar.getInstance().timeInMillis }
        val formatter = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())

        var scheduleText by remember { mutableStateOf("") }
        var scheduleDate by remember { mutableStateOf("") }
        var scheduleTime by rememberSaveable { mutableStateOf("") }

        val datePickerState = rememberDatePickerState(initialSelectedDateMillis = date)
        var showDatePicker by remember { mutableStateOf(false) }

        val timePickerState = rememberTimePickerState()
        var showTimePicker by remember { mutableStateOf(false) }

        var HargaTiket by rememberSaveable { mutableStateOf("") }

        if (showDatePicker) {
            DatePickerDialog(
                onDismissRequest = { showDatePicker = false },
                confirmButton = {
                    TextButton(
                        onClick = {
                            val selectedDate = Calendar.getInstance().apply {
                                timeInMillis = datePickerState.selectedDateMillis!!
                            }
                            scheduleDate = formatter.format(selectedDate.time)
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

        if (showTimePicker) {
            TimePickerDialog(
                onDismissRequest = { showTimePicker = false },
                confirmButton = {
                    TextButton(
                        onClick = {
                            scheduleTime = "${timePickerState.hour}:${timePickerState.minute}"
                            showTimePicker = false
                        }
                    ) {
                        Text("OK")
                    }
                },
                dismissButton = {
                    TextButton(
                        onClick = { showTimePicker = false }
                    ) {
                        Text("Cancel")
                    }
                }
            ) {
                TimePicker(state = timePickerState)
            }
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(24.dp)
        ) {
            Text(
                text = "Nama Agenda",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            OutlinedTextField(
                value = scheduleText,
                onValueChange = { if (it.length <= 25) scheduleText = it },
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text(text = "Masukkan nama Agenda") }
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "Tanggal Agenda",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            OutlinedTextField(
                value = scheduleDate,
                onValueChange = { scheduleDate = it },
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text(text = "Masukkan tanggal Agenda") },
                trailingIcon = {
                    IconButton(onClick = { showDatePicker = true }) {
                        Icon(imageVector = Icons.Default.DateRange, contentDescription = "Select Date")
                    }
                }
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "Jam Agenda",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            OutlinedTextField(
                value = scheduleTime,
                onValueChange = { scheduleTime = it },
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text(text = "Masukkan jam Agenda") },
                trailingIcon = {
                    IconButton(onClick = { showTimePicker = true }) {
                        Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Select Time")
                    }
                }
            )
            Spacer(modifier = Modifier.height(24.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = {
                        if (scheduleText.isBlank() || scheduleDate.isBlank() || scheduleTime.isBlank()) {
                            Toast.makeText(
                                context,
                                "Semua field wajib diisi!",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else {
                            scheduleNotification(
                                context,
                                timePickerState,
                                datePickerState,
                                scheduleText
                            )
                            scheduleText = ""
                            scheduleDate = ""
                            scheduleTime = ""
                            HargaTiket = ""

                            navController.navigate(Screen.ListKalender.route)
                        }

                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF756AB6)
                    ),
                    shape = MaterialTheme.shapes.small,
                    modifier = Modifier.height(56.dp).fillMaxWidth()
                ) {
                    Text(
                        text = "Simpan",
                        style = MaterialTheme.typography.bodyLarge,
                        color = Color.White
                    )
                }
            }
        }
    }
}