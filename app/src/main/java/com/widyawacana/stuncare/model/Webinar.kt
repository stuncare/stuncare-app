package com.widyawacana.stuncare.model

import androidx.annotation.DrawableRes

data class Webinar(
    val id: Int,
    @DrawableRes val photo: Int,
    val title: String,
    val date: String,
    val time: String,
    val host: String,
    val location: String,
    val category: String
)