package com.widyawacana.stuncare.ui.presentation.kehamilan

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.widyawacana.stuncare.ui.navigation.Screen
import com.widyawacana.stuncare.ui.presentation.kehamilan.component.Minggu10Screen
import com.widyawacana.stuncare.ui.presentation.kehamilan.component.Minggu11Screen
import com.widyawacana.stuncare.ui.presentation.kehamilan.component.Minggu12Screen
import com.widyawacana.stuncare.ui.presentation.kehamilan.component.Minggu1Screen
import com.widyawacana.stuncare.ui.presentation.kehamilan.component.Minggu2Screen
import com.widyawacana.stuncare.ui.presentation.kehamilan.component.Minggu3Screen
import com.widyawacana.stuncare.ui.presentation.kehamilan.component.Minggu4Screen
import com.widyawacana.stuncare.ui.presentation.kehamilan.component.Minggu5Screen
import com.widyawacana.stuncare.ui.presentation.kehamilan.component.Minggu6Screen
import com.widyawacana.stuncare.ui.presentation.kehamilan.component.Minggu7Screen
import com.widyawacana.stuncare.ui.presentation.kehamilan.component.Minggu8Screen
import com.widyawacana.stuncare.ui.presentation.kehamilan.component.Minggu9Screen
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StatusKehamilanScreen(
    navController: NavController,
    pregnancyAge: Int?
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color(0xFF756AB6)
            ),
                title = { Text(text = "Status Kehamilan", color = Color.White) },
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
    ) { contentPadding ->
        val tabData = getTabList()
        val pagerState = rememberPagerState(pageCount = { tabData.size })

        LaunchedEffect(pregnancyAge) {
            val page = pregnancyAge?.minus(1)?.coerceIn(0, tabData.size - 1) ?: 0
            pagerState.scrollToPage(page)
        }

        Column(modifier = Modifier.padding(contentPadding)) {
            TabLayout(tabData, pagerState)
            TabContent(tabData, pagerState)
        }
    }
}

@Composable
fun TabLayout(tabData: List<Pair<String, ImageVector>>, pagerState: PagerState) {
    val scope = rememberCoroutineScope()

    ScrollableTabRow(
        selectedTabIndex = pagerState.currentPage,
        divider = {
            Spacer(modifier = Modifier.height(5.dp))
        },
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                modifier = Modifier.tabIndicatorOffset(tabPositions[pagerState.currentPage]),
                height = 5.dp,
                color = Color(0xFF756AB6)
            )
        },
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        tabData.forEachIndexed { index, s ->
            Tab(
                selected = pagerState.currentPage == index,
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                },
                text = {
                    Text(text = s.first)
                }
            )
        }
    }
}

@Composable
fun TabContent(tabData: List<Pair<String, ImageVector>>, pagerState: PagerState) {
    HorizontalPager(state = pagerState) { index ->
        when (index) {
            0 -> {
                Minggu1Screen(navController = rememberNavController())
            }

            1 -> {
                Minggu2Screen(navController = rememberNavController())
            }

            2 -> {
                Minggu3Screen(navController = rememberNavController())
            }

            3 -> {
                Minggu4Screen(navController = rememberNavController())
            }

            4 -> {
                Minggu5Screen(navController = rememberNavController())
            }

            5 -> {
                Minggu6Screen(navController = rememberNavController())
            }

            6 -> {
                Minggu7Screen(navController = rememberNavController())
            }

            7 -> {
                Minggu8Screen(navController = rememberNavController())
            }

            8 -> {
                Minggu9Screen(navController = rememberNavController())
            }

            9 -> {
                Minggu10Screen(navController = rememberNavController())
            }

            10 -> {
                Minggu11Screen(navController = rememberNavController())
            }

            11 -> {
                Minggu12Screen(navController = rememberNavController())
            }
        }
    }
}

private fun getTabList(): List<Pair<String, ImageVector>> {
    return listOf(
        "Minggu 1" to Icons.Default.Person,
        "Minggu 2" to Icons.Default.Person,
        "Minggu 3" to Icons.Default.Person,
        "Minggu 4" to Icons.Default.Person,
        "Minggu 5" to Icons.Default.Person,
        "Minggu 6" to Icons.Default.Person,
        "Minggu 7" to Icons.Default.Person,
        "Minggu 8" to Icons.Default.Person,
        "Minggu 9" to Icons.Default.Person,
        "Minggu 10" to Icons.Default.Person,
        "Minggu 11" to Icons.Default.Person,
        "Minggu 12" to Icons.Default.Person,
        "Minggu 13" to Icons.Default.Person,
        "Minggu 14" to Icons.Default.Person,
        "Minggu 15" to Icons.Default.Person,
        "Minggu 16" to Icons.Default.Person,
        "Minggu 17" to Icons.Default.Person,
        "Minggu 18" to Icons.Default.Person,
        "Minggu 19" to Icons.Default.Person,
        "Minggu 20" to Icons.Default.Person,
        "Minggu 21" to Icons.Default.Person,
        "Minggu 22" to Icons.Default.Person,
        "Minggu 23" to Icons.Default.Person,
        "Minggu 24" to Icons.Default.Person,
        "Minggu 25" to Icons.Default.Person,
        "Minggu 26" to Icons.Default.Person,
        "Minggu 27" to Icons.Default.Person,
        "Minggu 28" to Icons.Default.Person,
        "Minggu 29" to Icons.Default.Person,
        "Minggu 30" to Icons.Default.Person,
        "Minggu 31" to Icons.Default.Person,
        "Minggu 32" to Icons.Default.Person,
        "Minggu 33" to Icons.Default.Person,
        "Minggu 34" to Icons.Default.Person,
        "Minggu 35" to Icons.Default.Person,
        "Minggu 36" to Icons.Default.Person,
        "Minggu 37" to Icons.Default.Person,
        "Minggu 38" to Icons.Default.Person,
    )
}