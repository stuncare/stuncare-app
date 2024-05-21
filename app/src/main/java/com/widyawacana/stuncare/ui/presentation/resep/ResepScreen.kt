package com.widyawacana.stuncare.ui.presentation.resep

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.widyawacana.stuncare.R
import com.widyawacana.stuncare.data.DummyData
import com.widyawacana.stuncare.model.Resep
import com.widyawacana.stuncare.ui.component.ResepItemHeader
import com.widyawacana.stuncare.ui.component.ResepItemHorizontal
import com.widyawacana.stuncare.ui.component.ResepItemVertical
import com.widyawacana.stuncare.ui.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ResepScreen(
    reseps: List<Resep> = DummyData.listResep,
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Scaffold(topBar = {
        CenterAlignedTopAppBar(colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(0xFF756AB6)
        ), title = { Text(text = "Resep MPASI", color = Color.White) }, navigationIcon = {
            IconButton(onClick = { navController.popBackStack() }) {
                Icon(
                    imageVector = Icons.Default.ArrowBackIosNew,
                    contentDescription = "Back Icon",
                    tint = Color.White
                )
            }
        })
    }, modifier = Modifier) { contentPadding ->
        LazyColumn(modifier = modifier.padding(contentPadding)) {
            item {
                LazyRow(

                    contentPadding = PaddingValues(24.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                ) {
                    items(reseps) {
                        ResepItemHeader(resep = it) { id ->
                            navController.navigate(Screen.DetailResep.route + "/$id")
                        }
                    }
                }
            }
            
            item { 
                MenuResep(navController = navController)
            }

            items(reseps) {
                ResepItemVertical(
                    resep = it, modifier = modifier.padding(horizontal = 24.dp, vertical = 5.dp),
                ) { id ->
                    navController.navigate(Screen.DetailResep.route + "/$id")
                }
            }
        }
    }
}

// Menu Resep Fitur
@Composable
fun MenuResep(modifier: Modifier = Modifier, navController: NavController) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 24.dp, end = 24.dp, bottom = 20.dp)

    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier
                    .size(72.dp)
                    .background(
                        color = Color(android.graphics.Color.parseColor("#E0AED0")),
                        shape = RoundedCornerShape(60.dp)
                    )
                    .clip(
                        CircleShape
                    )
                    .clickable {
                        navController.navigate(Screen.MenuSarapan.route)
                    }
            ) {
                Image(painter = painterResource(id = R.drawable.ic_menu_sarapan), contentDescription = "Icon Sarapan", modifier = Modifier.size(36.dp))
            }
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = stringResource(id = R.string.menu_sarapan), fontSize = 12.sp)
        }


        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier
                    .size(72.dp)
                    .background(
                        color = Color(android.graphics.Color.parseColor("#E0AED0")),
                        shape = RoundedCornerShape(60.dp)
                    )
                    .clip(
                        CircleShape
                    )
                    .clickable {
                        navController.navigate(Screen.MenuSarapan.route)
                    }
            ) {
                Image(painter = painterResource(id = R.drawable.ic_menu_siang), contentDescription = "Icon Menu Siang", modifier = Modifier.size(36.dp))
            }
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = stringResource(id = R.string.menu_siang), fontSize = 12.sp)
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier
                    .size(72.dp)
                    .background(
                        color = Color(android.graphics.Color.parseColor("#E0AED0")),
                        shape = RoundedCornerShape(60.dp)
                    )
                    .clip(
                        CircleShape
                    )
                    .clickable {
                        navController.navigate(Screen.Resep.route)
                    }
            ) {
                Image(painter = painterResource(id = R.drawable.ic_menu_malam), contentDescription = "Icon Menu Malam", modifier = Modifier.size(36.dp))
            }
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = stringResource(id = R.string.menu_malam), fontSize = 12.sp)
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier
                    .size(72.dp)
                    .background(
                        color = Color(android.graphics.Color.parseColor("#E0AED0")),
                        shape = RoundedCornerShape(60.dp)
                    )
                    .clip(
                        CircleShape
                    )
                    .clickable {
                        navController.navigate(Screen.MenuSarapan.route)
                    }
            ) {
                Image(painter = painterResource(id = R.drawable.ic_menu_snack), contentDescription = "Icon Menu Snack", modifier = Modifier.size(36.dp))
            }
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = stringResource(id = R.string.menu_snack), fontSize = 12.sp)
        }

    }
}

// https://stackoverflow.com/questions/67919707/jetpack-compose-how-to-put-a-lazyverticalgrid-inside-a-scrollable-column

//LazyRow(
//modifier = modifier.padding(contentPadding),
//contentPadding = PaddingValues(24.dp),
//horizontalArrangement = Arrangement.spacedBy(16.dp),
//) {
//    items(reseps) {
//        ResepItemHeader(resep = it) { id ->
////                navController.navigate(Screen.Detail.route + "/$id")
//        }
//    }
//}


//LazyVerticalGrid(
//modifier = modifier.padding(contentPadding),
//contentPadding = PaddingValues(24.dp),
//verticalArrangement = Arrangement.spacedBy(16.dp),
//horizontalArrangement = Arrangement.spacedBy(16.dp),
//columns = GridCells.Adaptive(140.dp)
//) {
//    items(reseps) {
//        ResepItemHeader(resep = it) { id ->
////                navController.navigate(Screen.Detail.route + "/$id")
//        }
//    }
//}