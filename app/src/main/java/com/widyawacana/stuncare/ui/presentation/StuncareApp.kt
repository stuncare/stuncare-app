package com.widyawacana.stuncare.ui.presentation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Article
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.stuncare.presentation.LoginScreen
import com.widyawacana.stuncare.MainActivity
import com.widyawacana.stuncare.R
import com.widyawacana.stuncare.model.Alarm
import com.widyawacana.stuncare.ui.navigation.NavigationItem
import com.widyawacana.stuncare.ui.navigation.Screen
import com.widyawacana.stuncare.ui.presentation.artikel.PageArtikelAwal
import com.widyawacana.stuncare.ui.presentation.artikel.detailartikel
import com.widyawacana.stuncare.ui.presentation.beranda.HomeScreen
import com.widyawacana.stuncare.ui.presentation.chatbot.ChatbotScreen
import com.widyawacana.stuncare.ui.presentation.gizianak.StatusGiziAnakScreen
import com.widyawacana.stuncare.ui.presentation.gizianak.giziawalpage
import com.widyawacana.stuncare.ui.presentation.kalender.KalenderScreen
import com.widyawacana.stuncare.ui.presentation.kalender.ListKalenderScreen
import com.widyawacana.stuncare.ui.presentation.kehamilan.PerkembanganKehamilanScreen
import com.widyawacana.stuncare.ui.presentation.kehamilan.StatusKehamilanScreen
import com.widyawacana.stuncare.ui.presentation.onboarding.OnboardingScreen
import com.widyawacana.stuncare.ui.presentation.profile.AboutScreen
import com.widyawacana.stuncare.ui.presentation.profile.ContactUsScreen
import com.widyawacana.stuncare.ui.presentation.profile.EditProfileScreen
import com.widyawacana.stuncare.ui.presentation.profile.ProfileScreen
import com.widyawacana.stuncare.ui.presentation.profile.TermConditionScreen
import com.widyawacana.stuncare.ui.presentation.register.PageRegister
import com.widyawacana.stuncare.ui.presentation.resep.DetailResepScreen
import com.widyawacana.stuncare.ui.presentation.resep.MenuSarapanScreen
import com.widyawacana.stuncare.ui.presentation.resep.ResepScreen
import com.widyawacana.stuncare.ui.presentation.splash.SplashScreen
import com.widyawacana.stuncare.ui.presentation.webinar.DetailWebinarScreen
import com.widyawacana.stuncare.ui.presentation.webinar.WebinarScreen
import com.widyawacana.stuncare.utils.shouldShowBottomBar
import pagegzianak

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun StuncareApp(modifier: Modifier = Modifier,  navController: NavHostController = rememberNavController()) {
    val navBackStack by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStack?.destination?.route
    
    Scaffold(
        bottomBar = {
            AnimatedVisibility(visible = currentRoute.shouldShowBottomBar()) {
                BottomBar(navController = navController)
            }
        }
    ) {contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Splash.route,
            modifier = modifier.padding(contentPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(navController = navController)
            }

            composable(Screen.Webinar.route) {
                WebinarScreen(navController = navController)
            }

            composable(Screen.Artikel.route) {
                PageArtikelAwal(navController = navController)
            }

            composable(Screen.Profil.route) {
                ProfileScreen(navController = navController)
            }

            composable(
                Screen.EditProfil.route
            ) { navBackStackEntry ->
                EditProfileScreen(navController = navController)
            }

            composable(
                Screen.ContactUs.route
            ) { navBackStackEntry ->
                ContactUsScreen(navController = navController)
            }

            composable(
                Screen.TermCondition.route
            ) { navBackStackEntry ->
                TermConditionScreen(navController = navController)
            }

            composable(
                Screen.About.route
            ) { navBackStackEntry ->
                AboutScreen(navController = navController)
            }

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

            composable(
                Screen.DetailResep.route + "/{id}",
                arguments = listOf(navArgument("id") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailResepScreen(
                    navController = navController,
                    id = navBackStackEntry.arguments?.getInt("id")
                )
            }

            composable(
                Screen.DetailWebinar.route + "/{id}",
                arguments = listOf(navArgument("id") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailWebinarScreen(
                    navController = navController,
                    id = navBackStackEntry.arguments?.getInt("id")
                )
            }

            composable(
                Screen.PerkembanganKehamilan.route
            ) { navBackStackEntry ->
                PerkembanganKehamilanScreen(navController = navController)
            }

            composable(
                "${Screen.StatusPerkembanganKehamilan.route}/{pregnancyAge}",
                arguments = listOf(navArgument("pregnancyAge") { type = NavType.IntType })
            ) { navBackStackEntry ->
                val pregnancyAge = navBackStackEntry.arguments?.getInt("pregnancyAge")
                StatusKehamilanScreen(navController = navController, pregnancyAge = pregnancyAge)
            }

            composable(
                Screen.GiziAnakAwal.route
            ) { navBackStackEntry ->
                giziawalpage(navController = navController)
            }

            composable(
                Screen.PageGiziAnak.route
            ) { navBackStackEntry ->
                pagegzianak(navController = navController)
            }

            composable(
                Screen.StatusGiziAnak.route
            ) { navBackStackEntry ->
                StatusGiziAnakScreen(navController = navController)
            }

            composable(
                Screen.DetailArtikel.route + "/{id}",
                arguments = listOf(navArgument("id") { type = NavType.IntType })
            ) { navBackStackEntry ->
                detailartikel(
                    navController = navController,
                    id = navBackStackEntry.arguments?.getInt("id")
                )
            }

            composable(
                Screen.Login.route
            ) { navBackStackEntry ->
                LoginScreen(navController = navController)
            }

            composable(
                Screen.Register.route
            ) { navBackStackEntry ->
                PageRegister(navController = navController)
            }

            composable(
                Screen.Chatbot.route
            ) { navBackStackEntry ->
                ChatbotScreen(navController = navController)
            }

            composable(
                Screen.Kalender.route
            ) { navBackStackEntry ->
                KalenderScreen(navController = navController)
            }

            val alarmsList = listOf(
                Alarm(id = 1, title = "Imunisasi Campak", date = "25-06-2024", time = "09:00 AM"),
                // Add more AlarmModel objects as needed
            )

            composable(
                Screen.ListKalender.route
            ) { navBackStackEntry ->
                ListKalenderScreen(navController = navController, alarms = alarmsList)
            }

            composable(Screen.Splash.route) {
                SplashScreen(navController = navController)
            }

            composable(
                Screen.Onboarding.route
            ) { navBackStackEntry ->
                OnboardingScreen(navController = navController)
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
        modifier = modifier,
        containerColor = Color.White
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
                label = { Text(text = item.title) },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color(0xFF756AB6),
                    unselectedIconColor = Color.Gray,
                    selectedTextColor = Color(0xFF756AB6),
                    unselectedTextColor = Color.Gray,
                    indicatorColor = Color.Transparent
                )
            )
        }
    }
}