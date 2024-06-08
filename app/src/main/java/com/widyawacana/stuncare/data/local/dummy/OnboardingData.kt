package com.widyawacana.stuncare.data.local.dummy

import com.widyawacana.stuncare.R
import com.widyawacana.stuncare.model.OnBoardingItem

object OnBoardingData {

    val onBoardingItems = listOf(
        OnBoardingItem(
            resId = R.drawable.img_onboarding1,
            title = "Cek Pertumbuhan Anak",
            description = "Pantau perkembangan anak \ndengan mudah"
        ),
        OnBoardingItem(
            resId = R.drawable.img_onboarding2,
            title = "Konsultasi dengan Chatbot",
            description = "Konsultasi dengan Chatbot \nyang berpengalaman"
        ),
        OnBoardingItem(
            resId = R.drawable.img_onboarding3,
            title = "Anjuran Menu Mpasi",
            description = "Ayo temukan berbagai menu makanan \nsehari-hari untuk si buah hati"
        ),
    )
}