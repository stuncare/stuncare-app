package com.widyawacana.stuncare.ui.navigation

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object Webinar: Screen("webinar")
    data object DetailWebinar: Screen("detail_webinar")
    data object Artikel: Screen("artikel")
    data object DetailArtikel: Screen("detail_artikel")
    data object Profil: Screen("profil")
    data object PerkembanganKehamilan: Screen("perkembangan_kehamilan")
    data object StatusPerkembanganKehamilan: Screen("status_perkembangan_kehamilan")
    data object Resep: Screen("resep")
    data object MenuSarapan: Screen("menu_sarapan")
    data object MenuSiang: Screen("menu_siang")
    data object MenuMalam: Screen("menu_malam")
    data object MenuSnack: Screen("menu_snack")
    data object DetailResep: Screen("detail_resep")
    data object GiziAnakAwal: Screen("gizi_anak_awal")
    data object PageGiziAnak: Screen("page_gizi_anak")
    data object StatusGiziAnak: Screen("status_gizi_anak")
}