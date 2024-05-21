package com.widyawacana.stuncare.data

import com.widyawacana.stuncare.R
import com.widyawacana.stuncare.model.Resep
import com.widyawacana.stuncare.model.Webinar
import com.widyawacana.stuncare.model.artikel

object DummyData {
    val listResep = listOf(
        Resep(
            id = 1,
            photo = R.drawable.resep_1,
            title = "Bubur Udang Tahu",
            ingredient = "Lorem ipsum",
            step = "Lorem ipsum",
            nutrient = "Lorem ipsum",
            category = "Info Sehat",
            calory = 260,
            duration = 15,
            portion = 4,
            age = "6-9 Bulan"
        ),
        Resep(
            id = 2,
            photo = R.drawable.resep_3,
            title = "Bubur Brokoli",
            ingredient = "Lorem ipsum",
            step = "Lorem ipsum",
            nutrient = "Lorem ipsum",
            category = "Info Sehat",
            calory = 260,
            duration = 30,
            portion = 4,
            age = "6-9 Bulan"
        ),
        Resep(
            id = 3,
            photo = R.drawable.resep_2,
            title = "Sup Labu",
            ingredient = "Lorem ipsum",
            step = "Lorem ipsum",
            nutrient = "Lorem ipsum",
            category = "Info Sehat",
            calory = 260,
            duration = 30,
            portion = 4,
            age = "6-9 Bulan"
        ),
        Resep(
            id = 4,
            photo = R.drawable.resep_4,
            title = "Bubur Telur Puyuh",
            ingredient = "Lorem ipsum",
            step = "Lorem ipsum",
            nutrient = "Lorem ipsum",
            category = "Info Sehat",
            calory = 260,
            duration = 30,
            portion = 4,
            age = "6-9 Bulan"
        ),
        Resep(
            id = 5,
            photo = R.drawable.resep_5,
            title = "Bubur Kacang Hijau",
            ingredient = "Lorem ipsum",
            step = "Lorem ipsum",
            nutrient = "Lorem ipsum",
            category = "Info Sehat",
            calory = 260,
            duration = 15,
            portion = 4,
            age = "6-9 Bulan"
        ),
        Resep(
            id = 6,
            photo = R.drawable.resep_6,
            title = "Sup Kentang Wortel",
            ingredient = "Lorem ipsum",
            step = "Lorem ipsum",
            nutrient = "Lorem ipsum",
            category = "Info Sehat",
            calory = 260,
            duration = 30,
            portion = 4,
            age = "6-9 Bulan"
        ),
        Resep(
            id = 7,
            photo = R.drawable.resep_1,
            title = "Bubur Udang Tahu",
            ingredient = "Lorem ipsum",
            step = "Lorem ipsum",
            nutrient = "Lorem ipsum",
            category = "Info Sehat",
            calory = 260,
            duration = 15,
            portion = 4,
            age = "6-9 Bulan"
        ),
        Resep(
            id = 8,
            photo = R.drawable.resep_2,
            title = "Sup Labu",
            ingredient = "Lorem ipsum",
            step = "Lorem ipsum",
            nutrient = "Lorem ipsum",
            category = "Info Sehat",
            calory = 260,
            duration = 30,
            portion = 4,
            age = "6-9 Bulan"
        ),
        Resep(
            id = 9,
            photo = R.drawable.resep_3,
            title = "Bubur Brokoli",
            ingredient = "Lorem ipsum",
            step = "Lorem ipsum",
            nutrient = "Lorem ipsum",
            category = "Info Sehat",
            calory = 260,
            duration = 30,
            portion = 4,
            age = "6-9 Bulan"
        ),
        Resep(
            id = 10,
            photo = R.drawable.resep_4,
            title = "Bubur Telur Puyuh",
            ingredient = "Lorem ipsum",
            step = "Lorem ipsum",
            nutrient = "Lorem ipsum",
            category = "Info Sehat",
            calory = 260,
            duration = 30,
            portion = 4,
            age = "6-9 Bulan"
        ),
        Resep(
            id = 11,
            photo = R.drawable.resep_5,
            title = "Bubur Kacang Hijau",
            ingredient = "Lorem ipsum",
            step = "Lorem ipsum",
            nutrient = "Lorem ipsum",
            category = "Info Sehat",
            calory = 260,
            duration = 15,
            portion = 4,
            age = "6-9 Bulan"
        ),
        Resep(
            id = 12,
            photo = R.drawable.resep_6,
            title = "Sup Kentang Wortel",
            ingredient = "Lorem ipsum",
            step = "Lorem ipsum",
            nutrient = "Lorem ipsum",
            category = "Info Sehat",
            calory = 260,
            duration = 30,
            portion = 4,
            age = "6-9 Bulan"
        ),
    )

    val listWebinar = listOf(
        Webinar(
            id = 1,
            photo = R.drawable.webinar_1,
            title = "WEBINAR, Menuju Generasi Emas Bebas Stunting",
            date = "10 Juli 2024",
            time = "13:00 - 15:00",
            host = "Dr. Tan Shot Yen, M. Hum.\n" +
                    "Dr. Nani Nurhaeni, S. Kep., MN.\n" +
                    "Kresensia Tania, S. Kep.\n" +
                    "Ns. Elisabeth Isti Daryanti, S. Kep., MSN",
            location = "Zoom",
        ),
        Webinar(
            id = 2,
            photo = R.drawable.webinar_2,
            title = "WEBINAR, Mengatasi Stunting Pada Anak Usia Dini",
            date = "21 Juli 2024",
            time = "13:00 - 15:00",
            host = "Dr. Tan Shot Yen, M. Hum.\n" +
                    "Dr. Nani Nurhaeni, S. Kep., MN.\n" +
                    "Kresensia Tania, S. Kep.\n" +
                    "Ns. Elisabeth Isti Daryanti, S. Kep., MSN",
            location = "Zoom",
        ),
        Webinar(
            id = 3,
            photo = R.drawable.webinar_3,
            title = "WEBINAR, Cegah Stunting, Sehat Negeriku, Tumbuh Indonesiaku",
            date = "10 Juli 2024",
            time = "13:00 - 15:00",
            host = "Dr. Tan Shot Yen, M. Hum.\n" +
                    "Dr. Nani Nurhaeni, S. Kep., MN.\n" +
                    "Kresensia Tania, S. Kep.\n" +
                    "Ns. Elisabeth Isti Daryanti, S. Kep., MSN",
            location = "Zoom",
        ),
        Webinar(
            id = 4,
            photo = R.drawable.webinar_1,
            title = "WEBINAR, Menuju Generasi Emas Bebas Stunting",
            date = "10 Juli 2024",
            time = "13:00 - 15:00",
            host = "Dr. Tan Shot Yen, M. Hum.\n" +
                    "Dr. Nani Nurhaeni, S. Kep., MN.\n" +
                    "Kresensia Tania, S. Kep.\n" +
                    "Ns. Elisabeth Isti Daryanti, S. Kep., MSN",
            location = "Zoom",
        ),
        Webinar(
            id = 5,
            photo = R.drawable.webinar_2,
            title = "WEBINAR, Mengatasi Stunting Pada Anak Usia Dini",
            date = "21 Juli 2024",
            time = "13:00 - 15:00",
            host = "Dr. Tan Shot Yen, M. Hum.\n" +
                    "Dr. Nani Nurhaeni, S. Kep., MN.\n" +
                    "Kresensia Tania, S. Kep.\n" +
                    "Ns. Elisabeth Isti Daryanti, S. Kep., MSN",
            location = "Zoom",
        ),
        Webinar(
            id = 6,
            photo = R.drawable.webinar_3,
            title = "WEBINAR, Cegah Stunting, Sehat Negeriku, Tumbuh Indonesiaku",
            date = "10 Juli 2024",
            time = "13:00 - 15:00",
            host = "Dr. Tan Shot Yen, M. Hum.\n" +
                    "Dr. Nani Nurhaeni, S. Kep., MN.\n" +
                    "Kresensia Tania, S. Kep.\n" +
                    "Ns. Elisabeth Isti Daryanti, S. Kep., MSN",
            location = "Zoom",
        )
    )

    val gambarartikel = listOf(
        artikel(
            id = 1,
            judul = "Ternyata Cegah Stunting Bisa Dimulai dari ... Kehamilan Bukan Kelahiran! Intip Penjelasannya",

            photo = R.drawable.detailartikel1,
            ket = "Pertumbuhan",
            detailartikel = "Masalah stunting masih menjadi episode panjang masalah kesehatan balita di Indonesia. Stunting adalah kondisi gagal tumbuh pada anak balita akibat kekurangan gizi kronis terutama pada 1.000 Hari Pertama Kehidupan (HPK). Maka dari itu, pencegahan terutama pada 1000 HPK sangat diperlukan, yakni mulai dari bayi dalam kandungan hingga usia 23 bulan.\n" +
                    "\n" +
                    "Pemeriksaan kehamilan rutin atau antenatal care (ANC) merupakan salah satu usaha pencegahan stunting selama masa kehamilan. Selama hamil ibu disarankan untuk periksa minimal 6 kali. 1 kali pada trimester pertama, 2 kali pada trimester kedua, dan 3 kali pada trimester ketiga. Paling sedikit 2 kali pemeriksaan oleh dokter atau dokter spesialis kebidanan dan kandungan pada trimester pertama dan ketiga dengan memakai USG.\n" +
                    "\n" +
                    "Selain melakukan pemeriksaan rutin, selama kehamilan ibu perlu rutin minum tablet tambah darah (TTD) minimal 90 tablet seperti makanan pokok, protein hewani, kacang-kacangan, buah dan sayur, minum air 8-12 gelas/hari (2-3 liter)/hari, serta menambahkan 1 porsi makanan utama atau makanan selingan dari sebelumnya."
        ),
        artikel(
            id = 2,
            judul = "Anak Lambat dalam\n" +
                    "Mengunyah, Beresiko ...",

            photo = R.drawable.detailartikel2,
            ket = "Info Sehat",
            detailartikel = "Masalah stunting masih menjadi episode panjang masalah kesehatan balita di Indonesia. Stunting adalah kondisi gagal tumbuh pada anak balita akibat kekurangan gizi kronis terutama pada 1.000 Hari Pertama Kehidupan (HPK). Maka dari itu, pencegahan terutama pada 1000 HPK sangat diperlukan, yakni mulai dari bayi dalam kandungan hingga usia 23 bulan.\n" +
                    "\n" +
                    "Pemeriksaan kehamilan rutin atau antenatal care (ANC) merupakan salah satu usaha pencegahan stunting selama masa kehamilan. Selama hamil ibu disarankan untuk periksa minimal 6 kali. 1 kali pada trimester pertama, 2 kali pada trimester kedua, dan 3 kali pada trimester ketiga. Paling sedikit 2 kali pemeriksaan oleh dokter atau dokter spesialis kebidanan dan kandungan pada trimester pertama dan ketiga dengan memakai USG.\n" +
                    "\n" +
                    "Selain melakukan pemeriksaan rutin, selama kehamilan ibu perlu rutin minum tablet tambah darah (TTD) minimal 90 tablet seperti makanan pokok, protein hewani, kacang-kacangan, buah dan sayur, minum air 8-12 gelas/hari (2-3 liter)/hari, serta menambahkan 1 porsi makanan utama atau makanan selingan dari sebelumnya."
        ),
        artikel(
            id = 3,
            judul = "5 Gerakan Yoga yang\n" +
                    "Tepat untuk Ibu Hamil",

            photo = R.drawable.detailartikel3,
            ket = "Olahraga",
            detailartikel = "Masalah stunting masih menjadi episode panjang masalah kesehatan balita di Indonesia. Stunting adalah kondisi gagal tumbuh pada anak balita akibat kekurangan gizi kronis terutama pada 1.000 Hari Pertama Kehidupan (HPK). Maka dari itu, pencegahan terutama pada 1000 HPK sangat diperlukan, yakni mulai dari bayi dalam kandungan hingga usia 23 bulan.\n" +
                    "\n" +
                    "Pemeriksaan kehamilan rutin atau antenatal care (ANC) merupakan salah satu usaha pencegahan stunting selama masa kehamilan. Selama hamil ibu disarankan untuk periksa minimal 6 kali. 1 kali pada trimester pertama, 2 kali pada trimester kedua, dan 3 kali pada trimester ketiga. Paling sedikit 2 kali pemeriksaan oleh dokter atau dokter spesialis kebidanan dan kandungan pada trimester pertama dan ketiga dengan memakai USG.\n" +
                    "\n" +
                    "Selain melakukan pemeriksaan rutin, selama kehamilan ibu perlu rutin minum tablet tambah darah (TTD) minimal 90 tablet seperti makanan pokok, protein hewani, kacang-kacangan, buah dan sayur, minum air 8-12 gelas/hari (2-3 liter)/hari, serta menambahkan 1 porsi makanan utama atau makanan selingan dari sebelumnya."
        ),
        artikel(
            id = 4,
            judul = "Nutrisi dan Gizi yang Harus\n" +
                    "Dipenuhi Mencegah Stun...,",

            photo = R.drawable.detailartikel4,
            ket = "Info Sehat",
            detailartikel = "Masalah stunting masih menjadi episode panjang masalah kesehatan balita di Indonesia. Stunting adalah kondisi gagal tumbuh pada anak balita akibat kekurangan gizi kronis terutama pada 1.000 Hari Pertama Kehidupan (HPK). Maka dari itu, pencegahan terutama pada 1000 HPK sangat diperlukan, yakni mulai dari bayi dalam kandungan hingga usia 23 bulan.\n" +
                    "\n" +
                    "Pemeriksaan kehamilan rutin atau antenatal care (ANC) merupakan salah satu usaha pencegahan stunting selama masa kehamilan. Selama hamil ibu disarankan untuk periksa minimal 6 kali. 1 kali pada trimester pertama, 2 kali pada trimester kedua, dan 3 kali pada trimester ketiga. Paling sedikit 2 kali pemeriksaan oleh dokter atau dokter spesialis kebidanan dan kandungan pada trimester pertama dan ketiga dengan memakai USG.\n" +
                    "\n" +
                    "Selain melakukan pemeriksaan rutin, selama kehamilan ibu perlu rutin minum tablet tambah darah (TTD) minimal 90 tablet seperti makanan pokok, protein hewani, kacang-kacangan, buah dan sayur, minum air 8-12 gelas/hari (2-3 liter)/hari, serta menambahkan 1 porsi makanan utama atau makanan selingan dari sebelumnya."
        ),

        artikel(
            id = 5,
            judul = "Ternyata Cegah Stunting Bisa Dimulai dari ... Kehamilan Bukan Kelahiran! Intip Penjelasannya",

            photo = R.drawable.detailartikel1,
            ket = "Pertumbuhan",
            detailartikel = "Masalah stunting masih menjadi episode panjang masalah kesehatan balita di Indonesia. Stunting adalah kondisi gagal tumbuh pada anak balita akibat kekurangan gizi kronis terutama pada 1.000 Hari Pertama Kehidupan (HPK). Maka dari itu, pencegahan terutama pada 1000 HPK sangat diperlukan, yakni mulai dari bayi dalam kandungan hingga usia 23 bulan.\n" +
                    "\n" +
                    "Pemeriksaan kehamilan rutin atau antenatal care (ANC) merupakan salah satu usaha pencegahan stunting selama masa kehamilan. Selama hamil ibu disarankan untuk periksa minimal 6 kali. 1 kali pada trimester pertama, 2 kali pada trimester kedua, dan 3 kali pada trimester ketiga. Paling sedikit 2 kali pemeriksaan oleh dokter atau dokter spesialis kebidanan dan kandungan pada trimester pertama dan ketiga dengan memakai USG.\n" +
                    "\n" +
                    "Selain melakukan pemeriksaan rutin, selama kehamilan ibu perlu rutin minum tablet tambah darah (TTD) minimal 90 tablet seperti makanan pokok, protein hewani, kacang-kacangan, buah dan sayur, minum air 8-12 gelas/hari (2-3 liter)/hari, serta menambahkan 1 porsi makanan utama atau makanan selingan dari sebelumnya."
        ),
        artikel(
            id = 6,
            judul = "Anak Lambat dalam\n" +
                    "Mengunyah, Beresiko ...",

            photo = R.drawable.detailartikel2,
            ket = "Info Sehat",
            detailartikel = "Masalah stunting masih menjadi episode panjang masalah kesehatan balita di Indonesia. Stunting adalah kondisi gagal tumbuh pada anak balita akibat kekurangan gizi kronis terutama pada 1.000 Hari Pertama Kehidupan (HPK). Maka dari itu, pencegahan terutama pada 1000 HPK sangat diperlukan, yakni mulai dari bayi dalam kandungan hingga usia 23 bulan.\n" +
                    "\n" +
                    "Pemeriksaan kehamilan rutin atau antenatal care (ANC) merupakan salah satu usaha pencegahan stunting selama masa kehamilan. Selama hamil ibu disarankan untuk periksa minimal 6 kali. 1 kali pada trimester pertama, 2 kali pada trimester kedua, dan 3 kali pada trimester ketiga. Paling sedikit 2 kali pemeriksaan oleh dokter atau dokter spesialis kebidanan dan kandungan pada trimester pertama dan ketiga dengan memakai USG.\n" +
                    "\n" +
                    "Selain melakukan pemeriksaan rutin, selama kehamilan ibu perlu rutin minum tablet tambah darah (TTD) minimal 90 tablet seperti makanan pokok, protein hewani, kacang-kacangan, buah dan sayur, minum air 8-12 gelas/hari (2-3 liter)/hari, serta menambahkan 1 porsi makanan utama atau makanan selingan dari sebelumnya."
        ),
        artikel(
            id = 7,
            judul = "5 Gerakan Yoga yang\n" +
                    "Tepat untuk Ibu Hamil",

            photo = R.drawable.detailartikel3,
            ket = "Olahraga",
            detailartikel = "Masalah stunting masih menjadi episode panjang masalah kesehatan balita di Indonesia. Stunting adalah kondisi gagal tumbuh pada anak balita akibat kekurangan gizi kronis terutama pada 1.000 Hari Pertama Kehidupan (HPK). Maka dari itu, pencegahan terutama pada 1000 HPK sangat diperlukan, yakni mulai dari bayi dalam kandungan hingga usia 23 bulan.\n" +
                    "\n" +
                    "Pemeriksaan kehamilan rutin atau antenatal care (ANC) merupakan salah satu usaha pencegahan stunting selama masa kehamilan. Selama hamil ibu disarankan untuk periksa minimal 6 kali. 1 kali pada trimester pertama, 2 kali pada trimester kedua, dan 3 kali pada trimester ketiga. Paling sedikit 2 kali pemeriksaan oleh dokter atau dokter spesialis kebidanan dan kandungan pada trimester pertama dan ketiga dengan memakai USG.\n" +
                    "\n" +
                    "Selain melakukan pemeriksaan rutin, selama kehamilan ibu perlu rutin minum tablet tambah darah (TTD) minimal 90 tablet seperti makanan pokok, protein hewani, kacang-kacangan, buah dan sayur, minum air 8-12 gelas/hari (2-3 liter)/hari, serta menambahkan 1 porsi makanan utama atau makanan selingan dari sebelumnya."
        ),
        artikel(
            id = 8,
            judul = "Nutrisi dan Gizi yang Harus\n" +
                    "Dipenuhi Mencegah Stun...,",

            photo = R.drawable.detailartikel4,
            ket = "Info Sehat",
            detailartikel = "Masalah stunting masih menjadi episode panjang masalah kesehatan balita di Indonesia. Stunting adalah kondisi gagal tumbuh pada anak balita akibat kekurangan gizi kronis terutama pada 1.000 Hari Pertama Kehidupan (HPK). Maka dari itu, pencegahan terutama pada 1000 HPK sangat diperlukan, yakni mulai dari bayi dalam kandungan hingga usia 23 bulan.\n" +
                    "\n" +
                    "Pemeriksaan kehamilan rutin atau antenatal care (ANC) merupakan salah satu usaha pencegahan stunting selama masa kehamilan. Selama hamil ibu disarankan untuk periksa minimal 6 kali. 1 kali pada trimester pertama, 2 kali pada trimester kedua, dan 3 kali pada trimester ketiga. Paling sedikit 2 kali pemeriksaan oleh dokter atau dokter spesialis kebidanan dan kandungan pada trimester pertama dan ketiga dengan memakai USG.\n" +
                    "\n" +
                    "Selain melakukan pemeriksaan rutin, selama kehamilan ibu perlu rutin minum tablet tambah darah (TTD) minimal 90 tablet seperti makanan pokok, protein hewani, kacang-kacangan, buah dan sayur, minum air 8-12 gelas/hari (2-3 liter)/hari, serta menambahkan 1 porsi makanan utama atau makanan selingan dari sebelumnya."
        ),
    )
}