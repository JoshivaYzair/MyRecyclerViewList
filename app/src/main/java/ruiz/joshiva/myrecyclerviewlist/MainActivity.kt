package ruiz.joshiva.myrecyclerviewlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pokemon = listOf(
            Pokemon(R.drawable.bulbasaur, nombre = "Bulbasaur", tipo = "Planta"),
            Pokemon(R.drawable.ivysaur, nombre = "Ivysaur", tipo = "Planta / Veneno"),
            Pokemon(R.drawable.venusaur, nombre = "Venusaur", tipo = "Planta / Veneno"),
            Pokemon(R.drawable.charmander, nombre = "Charmander", tipo = "Fuego"),
            Pokemon(R.drawable.charmeleon, nombre = "Charmeleon", tipo = "Fuego"),
            Pokemon(R.drawable.charizard, nombre = "Charizard", tipo = "Fuego / Volador"),
            Pokemon(R.drawable.squiertle, nombre = "Squiertle", tipo = "Agua"),
            Pokemon(R.drawable.wartortle, nombre = "Wartortle", tipo = "Agua"),
            Pokemon(R.drawable.blastoise, nombre = "Blastoise", tipo = "Agua")

        )

        val recycleView: RecyclerView = findViewById<RecyclerView>(R.id.PokemonList)
        recycleView.layoutManager = LinearLayoutManager(this)
        recycleView.adapter = PokemonAdapter(pokemon)
    }
}