package com.widyawacana.stuncare.utils

import com.widyawacana.stuncare.ui.navigation.Screen

fun String?.shouldShowBottomBar(): Boolean {
    return this in setOf(
        Screen.Home.route,
        Screen.Webinar.route,
        Screen.Artikel.route,
        Screen.Profil.route
    )
}