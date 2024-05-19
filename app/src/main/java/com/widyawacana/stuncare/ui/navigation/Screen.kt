package com.widyawacana.stuncare.ui.navigation

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object Webinar: Screen("webinar")
    data object Artikel: Screen("artikel")
    data object Profil: Screen("profil")
    data object Resep: Screen("resep")
    data object MenuSarapan: Screen("menu_sarapan")
    data object MenuSiang: Screen("menu_siang")
    data object MenuMalam: Screen("menu_malam")
    data object MenuSnack: Screen("menu_snack")
    data object DetailResep: Screen("detail_resep")
}