package com.example.tugas02basicandroid

object DataPlace {
    private val dataTitle = arrayOf(
        "Kos Keputih Surabaya",
        "Kos Perak Surabaya",
        "Kos Ala Jogja",
        "Madura Kos Apik",
        "Kos Raihan",
        "Mami Mami Kos Surabaya",
        "Kos Premium Surabaya Barat",
        "Kos Jogjakarta Jaya",
        "Kos ITS",
        "Kosan Makam Pahlawan" )

    private val dataDescription = arrayOf(
        "Kos yang terletak di daerah Keputih Surabaya, menawarkan kenyamanan dan harga yang terjangkau, cocok untuk mahasiswa atau pekerja yang mencari tempat tinggal yang strategis dan ramah di kantong",
        "Kos yang berlokasi di kawasan Perak Surabaya, menyediakan fasilitas sederhana namun lengkap dengan harga yang terjangkau, cocok untuk mereka yang mencari tempat tinggal yang nyaman di lingkungan yang ramai",
        "Kos dengan desain dan suasana yang terinspirasi oleh keindahan kota Yogyakarta, menawarkan fasilitas yang cukup untuk kebutuhan sehari-hari dengan harga yang terjangkau.",
        "Kos dengan fasilitas yang memadai dan lokasi yang strategis di daerah Madura, Surabaya. Cocok untuk mereka yang mencari tempat tinggal yang tenang namun tetap dekat dengan pusat kota",
        "Kos yang menawarkan suasana yang nyaman dan ramah, cocok untuk para pekerja atau mahasiswa yang mengutamakan ketenangan dan kenyamanan.",
        "Kos dengan layanan yang ramah dan fasilitas yang memadai, cocok untuk mereka yang mencari tempat tinggal yang seperti rumah di Surabaya.",
        "Kos dengan fasilitas premium dan desain yang modern, terletak di Surabaya Barat yang merupakan lokasi yang strategis dan memiliki akses mudah ke berbagai fasilitas umum",
        "Kos dengan suasana yang santai dan nyaman, memberikan penghuni pengalaman tinggal yang mirip dengan tinggal di Jogjakarta, namun tetap berada di Surabaya",
        "Kos yang terletak dekat dengan Institut Teknologi Sepuluh Nopember (ITS), cocok untuk para mahasiswa atau akademisi yang mencari tempat tinggal yang dekat dengan kampus",
        "Kos yang terletak di sekitar area Makam Pahlawan Surabaya, menawarkan suasana yang tenang dan nyaman, cocok untuk mereka yang mencari tempat tinggal dengan nilai sejarah dan keamanan yang tinggi.")

    private val dataImg = intArrayOf(
        R.drawable.kos_keputih_surabaya,
        R.drawable.kos_perak_surabaya,
        R.drawable.kos_ala_jogja,
        R.drawable.madura_kos_apik,
        R.drawable.kos_raihan,
        R.drawable.mami_mami_kos_surabaya,
        R.drawable.kos_premium_surabaya_barat,
        R.drawable.kos_jogjakarta_jaya,
        R.drawable.kos_its,
        R.drawable.kosan_makam_pahlawan, )

    private val dataBenefit = arrayOf(
        "Lokasi strategis, harga terjangkau",
        "Fasilitas lengkap dengan harga terjangkau",
        "Suasana dan desain yang terinspirasi dari Yogyakarta",
        "Fasilitas memadai dengan lokasi strategis",
        "Suasana nyaman dan ramah",
        "Layanan ramah dan fasilitas memadai",
        "Fasilitas premium dan desain modern",
        "Suasana santai dengan pengalaman mirip Jogjakarta",
        "Dekat dengan Institut Teknologi Sepuluh Nopember (ITS)",
        "Suasana tenang dengan nilai sejarah tinggi" )

    val dataTempat: ArrayList<Place>
        get(){
            val listTempat= arrayListOf<Place>()
            for (position in dataTitle.indices) {
                val place = Place()
                place.name = dataTitle[position]
                place.description = dataDescription[position]
                place.photo = dataImg[position]
                place.benefit = dataBenefit[position]

                listTempat.add(place)

            }

            return listTempat


        }


}