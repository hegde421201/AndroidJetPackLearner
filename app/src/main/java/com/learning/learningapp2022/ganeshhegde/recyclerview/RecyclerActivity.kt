package com.learning.learningapp2022.ganeshhegde.recyclerview

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.learning.learningapp2022.ganeshhegde.R
import com.learning.learningapp2022.ganeshhegde.databinding.RecyclerDemoBinding

class RecyclerActivity : AppCompatActivity() {

    private lateinit var rBinding:RecyclerDemoBinding

    private val planetsList = listOf(Planets("Earth",6378),
        Planets("Jupiter",71500),
        Planets("Mars",3396),
        Planets("Saturn",60268),
        Planets("Mercury",2400),
        Planets("Venus",6052),
        Planets("Uranus",25559),
        Planets("Neptune",27564),
        Planets("Pluto",1188))


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        rBinding = DataBindingUtil.setContentView(this,R.layout.recycler_demo)

        rBinding.testRecyclerView.apply {
            setBackgroundColor(Color.MAGENTA)
            layoutManager = LinearLayoutManager(this@RecyclerActivity)
            adapter = RecyclerAdapter(planetsList) { planetItem: Planets ->
                listItemClicked(planetItem)
            }
        }
    }

    private fun listItemClicked(planets: Planets){

            Toast.makeText(this,"Planet ${planets.name} has radius ${planets.radius_km} kilometres",
                Toast.LENGTH_SHORT).show()

    }
}