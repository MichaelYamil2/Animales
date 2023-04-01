package com.example.animales

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.animales.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var animal: ArrayList<extincion> = ArrayList()
    lateinit var arrayAdapter: ArrayAdapter<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        animal.add(
            extincion( "Mono aullador negro",
                "Alouatta pigra",
                "https://image.freepik.com/foto-gratis/mono-aullador-negro_1398-4041.jpg",
                "")
        )
        animal.add(
            extincion( "Manatí del Caribe",
                "Trichechus manatus",
                "https://news4sanantonio.com/resources/media2/original/full/1024/center/80/3a43c913-af2a-4950-84df-b4a4846eab5f-49455668792_41a38668df_b.jpg",
                "")
        )
        animal.add(
            extincion( "Guacamaya roja",
                "Ara macao",
                "https://i.pinimg.com/originals/b7/73/28/b77328999ae004863099bfda822a8367.jpg",
                "")
        )
        animal.add(
            extincion( "Tortuga verde",
                "Chelonia mydas",
                "https://th.bing.com/th/id/OIP.OH4N5mKTAIFHiqw2H3mZBwHaE8?pid=ImgDet&rs=1",
                "")
        )
        animal.add(
            extincion( "Oso hormiguero",
                "Tamandua mexicana",
                "",
                "https://i.pinimg.com/originals/6c/d0/a9/6cd0a9563c8ff86532dae0e4b1d4c52f.jpg")
        )
        animal.add(
            extincion( "Jaguar",
                "Panthera onca",
                "https://i.pinimg.com/736x/8b/28/fa/8b28faf1af95d469a017b903f0292a37.jpg",
                "")
        )
        animal.add(
            extincion( "Águila arpía",
                "Harpia harpyja",
                "https://i.pinimg.com/736x/60/a1/f6/60a1f685495b3f90e2df60c4fac60d91--harpy-eagle-bald-eagle.jpg",
                "")
        )
        animal.add(
            extincion( "Delfín nariz de botella",
                "Tursiops truncatus",
                "https://i.pinimg.com/236x/29/8d/da/298ddaa363780cd122a93f6b707da88b--dire-bangladesh.jpg",
                "")
        )
        animal.add(
            extincion( "Puma",
                "Puma concolor",
                "https://i.pinimg.com/originals/70/39/55/703955f051d821e5102e7087e0a0c488.jpg",
                "")
        )
        animal.add(
            extincion( "Cocodrilo americano",
                "Crocodylus acutus",
                "https://th.bing.com/th/id/R.a995d88038a3d5c931d86f597aab3b42?rik=Vz3yi7KxTxoQUQ&pid=ImgRaw&r=0",
                "")
        )


        var adapter = MyAdapter(this, animal)
        binding.listaExtincion.adapter = adapter

        binding.listaExtincion.setOnItemClickListener { parent, view, position, id ->

            val intent = Intent(MainActivity@this, AnimalDetailActivity::class.java).apply {
                putExtra("nombre", animal[id.toInt()].nombre)
                putExtra("descripcion", animal[id.toInt()].Descripcion)
                putExtra("imagen", animal[id.toInt()].URL)
                putExtra("cientifico", animal[id.toInt()].cientifico)
            }
        }


    }
}