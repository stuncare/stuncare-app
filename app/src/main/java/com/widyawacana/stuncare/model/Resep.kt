package com.widyawacana.stuncare.model

import androidx.annotation.DrawableRes

data class Resep(
    val id: Int,
    @DrawableRes val photo: Int,
    val title: String,
    val ingredient: String,
    val step: String,
    val nutrient: String,
    val category: String,
    val calory: Int,
    val duration: Int,
    val portion: Int,
    val age: String,
)
