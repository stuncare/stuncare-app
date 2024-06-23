package com.widyawacana.stuncare.ui.presentation.resep

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.widyawacana.stuncare.data.local.dummy.DummyData
import com.widyawacana.stuncare.model.Resep
import com.widyawacana.stuncare.ui.component.ResepItemHorizontal
import com.widyawacana.stuncare.ui.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuSarapanScreen(
    reseps: List<Resep> = DummyData.listResep,
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Scaffold(topBar = {
        CenterAlignedTopAppBar(colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(0xFF756AB6)
        ), title = { Text(text = "Menu Sarapan", color = Color.White) }, navigationIcon = {
            IconButton(onClick = { navController.popBackStack() }) {
                Icon(
                    imageVector = Icons.Default.ArrowBackIosNew,
                    contentDescription = "Back Icon",
                    tint = Color.White
                )
            }
        })
    }) { contentPadding ->
        Column(modifier = Modifier.padding(contentPadding)) {
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier
                    .horizontalScroll(rememberScrollState()),
            ) {
                Spacer(modifier = Modifier.width(24.dp))
                Button(onClick = { /* Tombol 1 diklik */ }, colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF756AB6)
                )) {
                    Text(text = "Semua")
                }
                Spacer(modifier = Modifier.width(10.dp))
                OutlinedButton(onClick = { /* Tombol 2 diklik */ }) {
                    Text(text = "6-8 Bulan")
                }
                Spacer(modifier = Modifier.width(10.dp))
                OutlinedButton(onClick = { /* Tombol 3 diklik */ }) {
                    Text(text = "9-11 Bulan")
                }
                Spacer(modifier = Modifier.width(10.dp))
                OutlinedButton(onClick = { /* Tombol 3 diklik */ }) {
                    Text(text = "12 Bulan+")
                }
                Spacer(modifier = Modifier.width(24.dp))
            }
            LazyVerticalGrid(
                modifier = modifier,
                contentPadding = PaddingValues(24.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                columns = GridCells.Adaptive(140.dp)
            ) {
                items(reseps) {
                    ResepItemHorizontal(resep = it) { id ->
                        navController.navigate(Screen.DetailResep.route + "/$id")
                    }
                }
            }
        }


    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FilterChipAge() {
    var selected by remember { mutableStateOf(false) }

    FilterChip(
        onClick = { selected = !selected },
        label = {
            Text("Semua")
        },
        selected = selected,
        leadingIcon = if (selected) {
            {
                Icon(
                    imageVector = Icons.Filled.Done,
                    contentDescription = "Done icon",
                    modifier = Modifier.size(FilterChipDefaults.IconSize)
                )
            }
        } else {
            null
        },
    )
}