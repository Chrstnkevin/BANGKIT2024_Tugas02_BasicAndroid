package com.example.tugas02basicandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvPlace: RecyclerView
    private val list = ArrayList<Place>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        rvPlace = findViewById(R.id.rv_place)
        rvPlace.setHasFixedSize(true)

        list.addAll(DataPlace.dataTempat)
        showRecyclerList()
    }




    private fun showRecyclerList() {
        rvPlace.layoutManager = LinearLayoutManager(this)
        val listPlaceAdapter = ListPlaceAdapter(list)
        rvPlace.adapter = listPlaceAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_list -> {
                rvPlace.layoutManager = LinearLayoutManager(this)
                true
            }
            R.id.action_grid -> {
                rvPlace.layoutManager = GridLayoutManager(this, 2)
                true
            }
            R.id.action_about -> {
                var intentAbout = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intentAbout)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


}