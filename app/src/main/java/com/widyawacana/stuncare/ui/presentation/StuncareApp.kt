package com.widyawacana.stuncare.ui.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Article
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.widyawacana.stuncare.R
import com.widyawacana.stuncare.ui.navigation.NavigationItem
import com.widyawacana.stuncare.ui.navigation.Screen
import com.widyawacana.stuncare.ui.presentation.beranda.HomeScreen
import com.widyawacana.stuncare.ui.presentation.resep.MenuSarapanScreen
import com.widyawacana.stuncare.ui.presentation.resep.ResepScreen

@Composable
fun StuncareApp(modifier: Modifier = Modifier,  navController: NavHostController = rememberNavController()) {
    Scaffold(
        bottomBar = {
            BottomBar(navController = navController)
        }
    ) {contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(contentPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(navController = navController)
            }

//            composable(Screen.Webinar.route) {
//                WebinarScreen()
//            }
//
//            composable(Screen.Artikel.route) {
//                ArtikelScreen()
//            }
//
//            composable(Screen.Profil.route) {
//                ProfilScreen()
//            }

            composable(
                Screen.Resep.route
            ) { navBackStackEntry ->
                ResepScreen(navController = navController)
            }

            composable(
                Screen.MenuSarapan.route
            ) { navBackStackEntry ->
                MenuSarapanScreen(navController = navController)
            }

        }

    }

}

@Composable
private fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val navigationItems = listOf(
            NavigationItem(
                title = stringResource(id = R.string.menu_home),
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_webinar),
                icon = Icons.Default.CalendarMonth,
                screen = Screen.Webinar
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_artikel),
                icon = Icons.Default.Article,
                screen = Screen.Artikel
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_profil),
                icon = Icons.Default.AccountCircle,
                screen = Screen.Profil
        )
        )
        navigationItems.map { item ->
            NavigationBarItem(
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                label = { Text(text = item.title) }
            )
        }
    }
}