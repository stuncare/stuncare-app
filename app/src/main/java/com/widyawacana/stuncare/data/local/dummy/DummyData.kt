package com.widyawacana.stuncare.data.local.dummy

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
            ingredient = "60 gram nasi\n" +
                    "45 gram udang giling\n" +
                    "30 ml santan cair\n" +
                    "20 gram tahu, potong kecil-kecil\n" +
                    "10 gram tomat, potong kecil-kecil\n" +
                    "Kemangi secukupnya\n" +
                    "Daun salam secukupnya\n" +
                    "Jeruk nipis secukupnya\n" +
                    "Garam secukupnya",
            step = "1. Lumuri udang dengan air jeruk nipis dan garam, lalu diamkan selama sekitar 15 menit.\n" +
                    "2. Campurkan udang, tahu, tomat, kemangi, santan cair, dan bumbu halus hingga merata.\n" +
                    "3. Bungkus campuran tersebut dengan daun pisang, tambahkan juga daun salam. Kukus hingga matang. Setelah matang, saat akan dicampur dengan nasi, ambil kemangi dan daun salamnya, lalu saring hingga teksturnya sesuai yang diinginkan.\n" +
                    "4. Sajikan dalam mangkuk saji.",
            nutrient = "Energi: 67 kalori\n" +
                    "Karbohidrat: 6,1 gram\n" +
                    "Lemak: 3,2 gram\n" +
                    "Protein: 4,3 gram",
            category = "Info Sehat",
            calory = 67,
            duration = 15,
            portion = 4,
            age = "6-9 Bulan"
        ),
        Resep(
            id = 2,
            photo = R.drawable.resep_3,
            title = "Pure Brokoli Edamame",
            ingredient = "50 gr daging ayam kampung\n" +
                    "5 kuntum brokoli\n" +
                    "30 ml kaldu ayam\n" +
                    "1 lembar daun jeruk\n" +
                    "1/2 batang daun bawang iris",
            step = "1. Kukus ayam dan tambahkan bumbu aromatik di atasnya.\n" +
                    "2. Kukus juga brokoli hingga matang.\n" +
                    "3. Masukkan semua bahan ke dalam blender dan haluskan.\n" +
                    "4. Sajikan dalam mangkok saji.",
            nutrient = "Energi: 150,6 kkal \n" +
                    "Protein: 14,4 gr \n" +
                    "Lemak: 9,6 gr \n" +
                    "Karbohidrat: 0,7 gr",
            category = "Info Sehat",
            calory = 150,
            duration = 60,
            portion = 4,
            age = "6-9 Bulan"
        ),
        Resep(
            id = 3,
            photo = R.drawable.resep_2,
            title = "Pure Labu Kuning",
            ingredient = "200 gram labu kuning, kupas kulitnya\n" +
                    "100 ml air jeruk",
            step = "1. Potong-potong labu kuning dan kukus sampai labu kuning matang dan empuk. Setelah matang, angkat dari kukusan.\n" +
                    "2. Satukan labu kuning dengan air jeruk dalam blender.\n" +
                    "3. Proses dengan blender sampai labu kuning menjadi lumat dan tercampur rata dengan air jeruk baby.\n" +
                    "4. Saring pure labu kuning untuk mendapatkan tekstur yang lebih halus.\n" +
                    "5. Pure Labu Kuning siap dihidangkan.",
            nutrient = "Energi: 67 kalori\n" +
                    "Protein: 1,4 gram\n" +
                    "Lemak: 0,4 gram\n" +
                    "Karbohidrat: 16,2 gram",
            category = "Info Sehat",
            calory = 67,
            duration = 15,
            portion = 2,
            age = "6-9 Bulan"
        ),
        Resep(
            id = 4,
            photo = R.drawable.resep_4,
            title = "Bubur Telur Puyuh",
            ingredient = "1 Sdm Tahu organik potong kecil\n" +
                    "2 Sdm Nasi Putih\n" +
                    "1 Blok Belcube\n" +
                    "1 Butir Telur Puyuh\n" +
                    "Butter unsalted secukupnya\n" +
                    "Wortel parut secukupnya\n" +
                    "Daun bawang secukupnya\n" +
                    "Air secukupnya",
            step = "1. Lelehkan butter, orak arik telur sampai setengah matang\n" +
                    "2. Masukan Tahu, parutan wortel dan daun bawang. Kemudian aduk sebentar dan tambahkan air kurang lebih 1 gelas. Aduk kembali.\n" +
                    "3. Diamkan di api sedang sampai air asat.\n" +
                    "4. Masukan keju belcube sambil di aduk agar keju leleh. Jika sudah leleh dan tercampur.\n" +
                    "5. Ulek/blender sesuaikan tekstur dengan usia anak anak ya ibu ibu. Selamat mencoba!",
            nutrient = "Energi: 160 kkal \n" +
                    "Protein: 10 gram \n" +
                    "Lemak: 6,6 gram \n" +
                    "Karbohidrat: 15 gram",
            category = "Info Sehat",
            calory = 160,
            duration = 30,
            portion = 2,
            age = "6-9 Bulan"
        ),
        Resep(
            id = 5,
            photo = R.drawable.resep_5,
            title = "Pure Kacang Hijau",
            ingredient = "50 gr kacang hijau matang\n" +
                    "20 ml ASI atau susu formula",
            step = "1. Rendam kacang hijau semalam dan masak hingga matang.\n" +
                    "2. Masukkan kacang hijau ke dalam saringan dan gerus hingga halus.\n" +
                    "3. Tambahkan susu atau ASI dan aduk hingga merata.\n" +
                    "4. Sajikan dalam mangkuk saji.",
            nutrient = "Energi: 71,2 kkal\n" +
                    "Protein: 4,5 gr\n" +
                    "Lemak: 1 gr\n" +
                    "Karbohidrat: 11,4 gr",
            category = "Info Sehat",
            calory = 71,
            duration = 15,
            portion = 4,
            age = "6-9 Bulan"
        ),
        Resep(
            id = 6,
            photo = R.drawable.resep_6,
            title = "Sup Kentang Wortel",
            ingredient = "1 wortel ukuran sedang\n" +
                    "50 ml air matang atau kaldu sayuran",
            step = "1. Kupas kulit wortel dan cuci bersih.\n" +
                    "2. Potong wortel menjadi potongan kecil agar mudah dimasak.\n" +
                    "3. Rebus wortel dalam air matang atau kaldu sayuran hingga lunak, sekitar 15-20 menit.\n" +
                    "4. Angkat wortel dan biarkan sedikit dingin.\n" +
                    "5. Masukkan wortel yang sudah direbus ke dalam blender.\n" +
                    "6. Haluskan wortel hingga menjadi pure yang lembut dan kental.\n" +
                    "7. Jika terlalu kental, tambahkan sedikit air matang atau kaldu sayuran untuk mendapatkan konsistensi yang diinginkan.\n" +
                    "8. Tuang pure wortel ke dalam mangkuk saji dan siap disajikan.",
            nutrient = "Energi: sekitar 20-30 kkal\n" +
                    "Protein: sekitar 0,5-1 gr\n" +
                    "Lemak: sekitar 0,1-0,2 gr\n" +
                    "Karbohidrat: sekitar 4-6 gr",
            category = "Info Sehat",
            calory = 30,
            duration = 30,
            portion = 3,
            age = "6-9 Bulan"
        ),
        Resep(
            id = 7,
            photo = R.drawable.resep_7_pure_kentang,
            title = "Pure Kentang",
            ingredient = "150 gram kentang (kurang lebih 1 butir)\n" +
                    "200 ml air jeruk baby",
            step = "1. Kupas kentang dan cuci sampai bersih.\n" +
                    "2. Kukus kentang sampai matang dan empuk. Setelah matang, angkat dari kukusan.\n" +
                    "3. Satukan kentang kukus dengan air jeruk baby dalam blender.\n" +
                    "4. Proses dengan blender sampai kentang menjadi lumat dan tercampur sempurna dengan air jeruk baby.\n" +
                    "5. Pure Kentang siap dihidangkan.",
            nutrient = "Energi: 116,5 kalori\n" +
                    "Protein: 2,4 gram\n" +
                    "Lemak: 0,1 gram\n" +
                    "Karbohidrat: 28 gram",
            category = "Info Sehat",
            calory = 116,
            duration = 15,
            portion = 1,
            age = "6-9 Bulan"
        ),
        Resep(
            id = 8,
            photo = R.drawable.resep_8_pure_kentang_salmon,
            title = "Kentang Salmon",
            ingredient = "100 gram kentang, kupas dan potong menjadi potongan kecil\n" +
                    "50 gram fillet salmon, potong menjadi potongan kecil\n" +
                    "1 sdm minyak zaitun atau minyak sayur\n" +
                    "150 ml kaldu ikan atau air\n" +
                    "Sedikit garam",
            step = "1. Panaskan minyak zaitun atau minyak sayur di dalam panci.\n" +
                    "2. Tumis potongan fillet salmon hingga matang dan berubah warna.\n" +
                    "3. Masukkan potongan kentang ke dalam panci dan aduk rata dengan salmon.\n" +
                    "4. Tuangkan kaldu ikan atau air ke dalam panci, tambahkan sedikit garam (jika diperlukan) dan bumbu pilihan (jika digunakan).\n" +
                    "5. Tutup panci dan biarkan kentang dan salmon matang dengan api kecil hingga kentang empuk dan mudah dihancurkan.\n" +
                    "6. Setelah kentang dan salmon matang, angkat panci dari kompor dan biarkan sedikit mendingin.\n" +
                    "7. Haluskan kentang dan salmon dengan menggunakan blender atau garpu hingga mencapai tekstur puree yang lembut dan kental.",
            nutrient = "Energi: 180 kkal\n" +
                    "Protein: Sekitar 7-9 gram \n" +
                    "Lemak: Sekitar 5-7 gram \n" +
                    "Karbohidrat: Sekitar 15-20 gram",
            category = "Info Sehat",
            calory = 180,
            duration = 30,
            portion = 2,
            age = "6-9 Bulan"
        ),
        Resep(
            id = 9,
            photo = R.drawable.resep_9_pure_kentang_ayam,
            title = "Bubur Kentang Ayam",
            ingredient = "100 gram kentang, kupas dan potong menjadi potongan kecil\n" +
                    "50 gram daging ayam, potong menjadi potongan kecil\n" +
                    "1 sdm minyak zaitun atau minyak sayur\n" +
                    "150 ml kaldu ayam atau air\n" +
                    "Sedikit garam",
            step = "1. Panaskan minyak zaitun atau minyak sayur di dalam panci.\n" +
                    "2. Tumis potongan daging ayam hingga matang dan berubah warna.\n" +
                    "3. Masukkan potongan kentang ke dalam panci dan aduk rata dengan ayam.\n" +
                    "4. Tuangkan kaldu ayam atau air ke dalam panci, tambahkan sedikit garam (jika diperlukan) dan bumbu pilihan (jika digunakan).\n" +
                    "5. Tutup panci dan biarkan kentang dan ayam matang dengan api kecil hingga kentang empuk dan mudah dihancurkan.\n" +
                    "6. Setelah kentang dan ayam matang, angkat panci dari kompor dan biarkan sedikit mendingin.\n" +
                    "7. Haluskan kentang dan ayam dengan menggunakan blender atau garpu hingga mencapai tekstur puree yang lembut dan kental.",
            nutrient = "Energi: Sekitar 150 kkal \n" +
                    "Protein: Sekitar 6-8 gram \n" +
                    "Lemak: Sekitar 2-4 gram \n" +
                    "Karbohidrat: Sekitar 15-20 gram ",
            category = "Info Sehat",
            calory = 150,
            duration = 45,
            portion = 3,
            age = "6-9 Bulan"
        ),
        Resep(
            id = 10,
            photo = R.drawable.resep_10_pure_buah_naga,
            title = "Pure Buah Naga",
            ingredient = "50 gr buah naga\n" +
                    "20 ml perasan air jeruk baby",
            step = "1. Blender semua bahan hingga halus.\n" +
                    "2. Tuang ke dalam mangkuk saji.",
            nutrient = "Energi: 59,4 kkal\n" +
                    "Protein: 0,8 gr\n" +
                    "Lemak: 0,38 gr\n" +
                    "Karbohidrat: 14,6 gr ",
            category = "Info Sehat",
            calory = 59,
            duration = 30,
            portion = 2,
            age = "6-9 Bulan"
        ),
        Resep(
            id = 11,
            photo = R.drawable.resep_11_pure_telur_rebus,
            title = "Pure Telur Rebus",
            ingredient = "1 butir telur ayam\n" +
                    "50 ml air matang",
            step = "1. Rebus telur ayam hingga matang.\n" +
                    "2. Kupas kulit telur, lalu potong menjadi potongan kecil.\n" +
                    "3. Masukkan potongan telur ke dalam blender.\n" +
                    "4. Tambahkan air matang ke dalam blender.\n" +
                    "5. Haluskan telur hingga teksturnya lembut dan kental.\n" +
                    "6. Tuang pure telur ke dalam mangkuk saji.",
            nutrient = "Energi: Sekitar 100 kkal \n" +
                    "Protein: Sekitar 6-8 gram \n" +
                    "Lemak: Sekitar 5-7 gram \n" +
                    "Karbohidrat: Sekitar 0,5-1 gram ",
            category = "Info Sehat",
            calory = 100,
            duration = 15,
            portion = 1,
            age = "6-9 Bulan"
        ),
        Resep(
            id = 12,
            photo = R.drawable.resep_12_pure_telur_rebus_keju,
            title = "Pure Telur Rebus Keju",
            ingredient = "1 butir telur ayam\n" +
                    "1 sdm keju parut\n" +
                    "2 sdm air matang",
            step = "1. Rebus telur ayam hingga matang.\n" +
                    "2. Kupas kulit telur, lalu potong menjadi potongan kecil.\n" +
                    "3. Masukkan potongan telur ke dalam blender.\n" +
                    "4. Tambahkan keju parut dan air matang ke dalam blender.\n" +
                    "5. Haluskan hingga teksturnya lembut dan kental.\n" +
                    "6. Tuang puree telur rebus dan keju ke dalam mangkuk saji.",
            nutrient = "Energi: Sekitar 100-120 kkal\n" +
                    "Protein: Sekitar 6-8 gram\n" +
                    "Lemak: Sekitar 7-9 gram\n" +
                    "Karbohidrat: Sekitar 1-2 gram",
            category = "Info Sehat",
            calory = 120,
            duration = 30,
            portion = 2,
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
            location = "https://us06web.zoom.us/j/89554588370pwd=fQTIuqCON8Y3AIjo9gGxyRpkMeFOt0.1",
            category = "Zoom"
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
            location = "https://meet.google.com/imm-ctrc-xrg",
            category = "Gmeet"
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
            location = "https://us06web.zoom.us/j/89554588370pwd=fQTIuqCON8Y3AIjo9gGxyRpkMeFOt0.1",
            category = "Zoom"
        ),
        Webinar(
            id = 4,
            photo = R.drawable.webinar_4,
            title = "Membangun Generasi Islami Sehat Bebas Stunting",
            date = "28 Juli 2024",
            time = "13:00 - 15:00",
            host = "DR. dr. Sagiran, Sp.BKL. M.Kes.\n" +
                    "Dr. Nani Nurhaeni, S. Kep., MN.\n" +
                    "Kresensia Tania, S. Kep.\n" +
                    "Ns. Elisabeth Isti Daryanti, S. Kep., MSN",
            location = "https://us06web.zoom.us/j/89554588370pwd=fQTIuqCON8Y3AIjo9gGxyRpkMeFOt0.1",
            category = "Zoom"
        )
    )

    val listArtikel = listOf(
        artikel(
            id = 1,
            judul = "Ternyata Cegah Stunting Bisa Dimulai dari Kehamilan Bukan Kelahiran! Intip Penjelasannya",

            photo = R.drawable.artikel_1,
            ket = "Pertumbuhan",
            detailartikel = "Masalah stunting masih menjadi episode panjang masalah kesehatan balita di Indonesia. Stunting adalah kondisi gagal tumbuh pada anak balita akibat kekurangan gizi kronis terutama pada 1.000 Hari Pertama Kehidupan (HPK). Maka dari itu, pencegahan terutama pada 1000 HPK sangat diperlukan, yakni mulai dari bayi dalam kandungan hingga usia 23 bulan.\n" +
                    "\n" +
                    "Pemeriksaan kehamilan rutin atau antenatal care (ANC) merupakan salah satu usaha pencegahan stunting selama masa kehamilan. Selama hamil ibu disarankan untuk periksa minimal 6 kali. 1 kali pada trimester pertama, 2 kali pada trimester kedua, dan 3 kali pada trimester ketiga. Paling sedikit 2 kali pemeriksaan oleh dokter atau dokter spesialis kebidanan dan kandungan pada trimester pertama dan ketiga dengan memakai USG.\n" +
                    "\n" +
                    "Selain melakukan pemeriksaan rutin, selama kehamilan ibu perlu rutin minum tablet tambah darah (TTD) minimal 90 tablet seperti makanan pokok, protein hewani, kacang-kacangan, buah dan sayur, minum air 8-12 gelas/hari (2-3 liter)/hari, serta menambahkan 1 porsi makanan utama atau makanan selingan dari sebelumnya."
        ),
        artikel(
            id = 2,
            judul = "Anak Lambat dalam Mengunyah, Beresiko Alami Speech Delay",

            photo = R.drawable.artikel_2,
            ket = "Info Sehat",
            detailartikel = "Masalah stunting masih menjadi episode panjang masalah kesehatan balita di Indonesia. Stunting adalah kondisi gagal tumbuh pada anak balita akibat kekurangan gizi kronis terutama pada 1.000 Hari Pertama Kehidupan (HPK). Maka dari itu, pencegahan terutama pada 1000 HPK sangat diperlukan, yakni mulai dari bayi dalam kandungan hingga usia 23 bulan.\n" +
                    "\n" +
                    "Pemeriksaan kehamilan rutin atau antenatal care (ANC) merupakan salah satu usaha pencegahan stunting selama masa kehamilan. Selama hamil ibu disarankan untuk periksa minimal 6 kali. 1 kali pada trimester pertama, 2 kali pada trimester kedua, dan 3 kali pada trimester ketiga. Paling sedikit 2 kali pemeriksaan oleh dokter atau dokter spesialis kebidanan dan kandungan pada trimester pertama dan ketiga dengan memakai USG.\n" +
                    "\n" +
                    "Selain melakukan pemeriksaan rutin, selama kehamilan ibu perlu rutin minum tablet tambah darah (TTD) minimal 90 tablet seperti makanan pokok, protein hewani, kacang-kacangan, buah dan sayur, minum air 8-12 gelas/hari (2-3 liter)/hari, serta menambahkan 1 porsi makanan utama atau makanan selingan dari sebelumnya."
        ),
        artikel(
            id = 3,
            judul = "5 Gerakan Yoga yang Tepat untuk Ibu Hamil",

            photo = R.drawable.artikel_3,
            ket = "Olahraga",
            detailartikel = "Masalah stunting masih menjadi episode panjang masalah kesehatan balita di Indonesia. Stunting adalah kondisi gagal tumbuh pada anak balita akibat kekurangan gizi kronis terutama pada 1.000 Hari Pertama Kehidupan (HPK). Maka dari itu, pencegahan terutama pada 1000 HPK sangat diperlukan, yakni mulai dari bayi dalam kandungan hingga usia 23 bulan.\n" +
                    "\n" +
                    "Pemeriksaan kehamilan rutin atau antenatal care (ANC) merupakan salah satu usaha pencegahan stunting selama masa kehamilan. Selama hamil ibu disarankan untuk periksa minimal 6 kali. 1 kali pada trimester pertama, 2 kali pada trimester kedua, dan 3 kali pada trimester ketiga. Paling sedikit 2 kali pemeriksaan oleh dokter atau dokter spesialis kebidanan dan kandungan pada trimester pertama dan ketiga dengan memakai USG.\n" +
                    "\n" +
                    "Selain melakukan pemeriksaan rutin, selama kehamilan ibu perlu rutin minum tablet tambah darah (TTD) minimal 90 tablet seperti makanan pokok, protein hewani, kacang-kacangan, buah dan sayur, minum air 8-12 gelas/hari (2-3 liter)/hari, serta menambahkan 1 porsi makanan utama atau makanan selingan dari sebelumnya."
        ),
        artikel(
            id = 4,
            judul = "Nutrisi dan Gizi yang Harus Dipenuhi Mencegah Stunting",

            photo = R.drawable.artikel_4,
            ket = "Info Sehat",
            detailartikel = "Masalah stunting masih menjadi episode panjang masalah kesehatan balita di Indonesia. Stunting adalah kondisi gagal tumbuh pada anak balita akibat kekurangan gizi kronis terutama pada 1.000 Hari Pertama Kehidupan (HPK). Maka dari itu, pencegahan terutama pada 1000 HPK sangat diperlukan, yakni mulai dari bayi dalam kandungan hingga usia 23 bulan.\n" +
                    "\n" +
                    "Pemeriksaan kehamilan rutin atau antenatal care (ANC) merupakan salah satu usaha pencegahan stunting selama masa kehamilan. Selama hamil ibu disarankan untuk periksa minimal 6 kali. 1 kali pada trimester pertama, 2 kali pada trimester kedua, dan 3 kali pada trimester ketiga. Paling sedikit 2 kali pemeriksaan oleh dokter atau dokter spesialis kebidanan dan kandungan pada trimester pertama dan ketiga dengan memakai USG.\n" +
                    "\n" +
                    "Selain melakukan pemeriksaan rutin, selama kehamilan ibu perlu rutin minum tablet tambah darah (TTD) minimal 90 tablet seperti makanan pokok, protein hewani, kacang-kacangan, buah dan sayur, minum air 8-12 gelas/hari (2-3 liter)/hari, serta menambahkan 1 porsi makanan utama atau makanan selingan dari sebelumnya."
        ),

        artikel(
            id = 5,
            judul = "Pentingnya 1000 Hari Pertama dalam Kehidupan Anak",

            photo = R.drawable.artikel_5,
            ket = "Pertumbuhan",
            detailartikel = "Seribu Hari Pertama Kehidupan adalah masa krusial karena pada periode ini terjadi pertumbuhan dan perkembangan seluruh organ dan sistem tubuh anak. Hampir semua organ bayi telah terbentuk saat ia dilahirkan dan akan terus berkembang hingga ia berusia 2 tahun.\n" +
                    "\n" +
                    "Pada masa ini, sangat penting bagi ibu untuk memenuhi asupan nutrisi harian agar perkembangan organ dan otak bayi dapat berlangsung dengan sempurna. Jika perkembangan organ dan otak bayi tidak optimal, maka tidak dapat diperbaiki di kemudian hari karena kondisi ini bersifat permanen. Artinya, jika perbaikan gizi dilakukan setelah melewati masa 1000 Hari Pertama Kehidupan, maka usaha perbaikan tersebut tidak akan membawa perubahan yang signifikan. Sebaliknya, jika perbaikan gizi dilakukan saat bayi masih berada dalam kandungan dan selama 2 tahun pertama setelah kelahiran, maka usaha tersebut akan sangat berarti bagi tumbuh kembang bayi.\n" +
                    "\n" +
                    "Beberapa nutrisi yang sangat penting selama 1000 Hari Pertama Kehidupan antara lain asam folat, kalsium, fosfor, magnesium, vitamin D, protein, zat besi, Omega 3&6, DHA, dan kolin. Memperhatikan asupan nutrisi ini sejak dini sangat penting, mirip dengan konsep menabung untuk investasi. Kesehatan optimal buah hati yang diidamkan dapat terbentuk maksimal jika Ibu dan Ayah senantiasa 'menabung' dan memperhatikan asupan nutrisi sejak dini."
        ),
        artikel(
            id = 6,
            judul = "Cemilan Sehat untuk Ibu Menyusui, Lancarkan Produksi ASI",

            photo = R.drawable.artikel_6,
            ket = "Info Sehat",
            detailartikel = "Cemilan sehat memegang peran penting dalam menyediakan nutrisi tambahan bagi ibu menyusui. Hal ini karena ibu menyusui memerlukan asupan kalori yang cukup untuk memproduksi ASI. Lebih dari itu, kualitas ASI yang optimal juga banyak dipengaruhi oleh jenis makanan yang ibu konsumsi, termasuk cemilan.\n" +
                    "\n" +
                    "Sebagai seorang ibu yang menyusui, menjaga kesehatan dan kualitas nutrisi ASI sangatlah penting untuk memberikan dukungan optimal pada pertumbuhan dan perkembangan bayi. Dalam hal ini, ibu bisa memilih berbagai cemilan tinggi gizi dan rendah gula, seperti:\n" +
                    "- Granola\n" +
                    "- Greek Yogurt\n" +
                    "- Kacang Almond Panggang\n" +
                    "- Edamame Rebus\n" +
                    "- Chia Pudding\n" +
                    "- Cookies Oatmeal\n" +
                    "- Pepaya Potong"
        ),
        artikel(
            id = 7,
            judul = "Cara Menjaga Kesehatan Mental Ibu Hamil untuk Cegah Depresi",

            photo = R.drawable.artikel_7,
            ket = "Mental Health",
            detailartikel = "Menjaga kesehatan mental ibu hamil sama pentingnya dengan menjaga kesehatan fisik. Selama kehamilan, tubuh Ibu mengalami perubahan hormon yang signifikan. Perubahan hormon ini dapat membuat ibu hamil menjadi lebih rentan terhadap stres. Stres yang dialami oleh ibu hamil dapat memiliki dampak negatif pada kesehatan mental ibu dan perkembangan bayi dalam kandungan. Oleh karena itu, kesehatan mental pada ibu hamil perlu dijaga.\n" +
                    "\n" +
                    "Berdasarkan pada data Organisasi Kesehatan Dunia (WHO), sekitar 10 persen ibu hamil dan 13 persen ibu baru melahirkan mengalami gangguan kesehatan mental, terutama depresi. Selain itu, riwayat masalah kesehatan mental sebelum hamil juga dapat meningkatkan risiko ibu hamil mengalami masalah serupa selama kehamilan atau setelah melahirkan. \n" +
                    "\n" +
                    "Oleh karena itu, penting bagi ibu hamil untuk mengetahui cara menjaga kesehatan mental selama masa kehamilan. Berikut ini adalah beberapa tips yang bisa dilakukan:\n" +
                    "- Dapatkan Dukungan dari Suami, Keluarga, dan Teman-Teman\n" +
                    "- Jaga Asupan Makanan yang Sehat dan Bergiz\n" +
                    "- Istirahat yang Cukup\n" +
                    "- Rutin Berolahraga\n" +
                    "- Belajar Tentang Kehamilan\n" +
                    "- Mencari Bantuan Profesional\n" +
                    "\n" +
                    "Source: https://www.prenagen.com/id/kesehatan-mental"
        )
    )
}