package com.example.animales

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.animales.databinding.ActivityAnimalDetailBinding
import com.example.animales.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class AnimalDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAnimalDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAnimalDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nombre = intent.getStringExtra("NOMBRE")
        val Descripcion = intent.getStringExtra("descripcion")
        val URL = intent.getStringExtra("imagen")
        val cientifico = intent.getStringExtra("cientifico")


        binding.tituloanimal.text = nombre
        binding.animaldescrpcion.text = Descripcion
        binding.animalcientifico.text = cientifico


        Picasso.get().load(URL).into(binding.fotoanimal)
    }


    fun closeDialog(view: View){
        finish()
    }

}