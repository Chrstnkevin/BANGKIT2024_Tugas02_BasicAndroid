package com.example.tugas02basicandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView


class PlaceDetailActivity : AppCompatActivity() {
    companion object{
        const val extraTitle = "extraTitle"
        const val extraDescription = "extraDescription"
        const val extraPhoto = "extraPhoto"
        const val extraBenefit = "extraBenefit"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_place_detail)
        supportActionBar?.title = "Detail Tempat"

        val name : TextView = findViewById(R.id.judul)
        val dataDeskripsi : TextView = findViewById(R.id.deskripsi)
        val photo : ImageView = findViewById(R.id.img_item_photo)
        val benefit : TextView = findViewById(R.id.benefit)

        val tvName= intent.getStringExtra(extraTitle)
        val tvDeskription = intent.getStringExtra(extraDescription)
        val tvPhoto = intent.getIntExtra(extraPhoto, 0)
        val tvBenefit = intent.getStringExtra(extraBenefit)
        name.text = tvName
        dataDeskripsi.text = tvDeskription
        photo.setImageResource(tvPhoto)
        benefit.text = tvBenefit

    }

}