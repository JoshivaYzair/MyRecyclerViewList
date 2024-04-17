package ruiz.joshiva.myrecyclerviewlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class PokemonAdapter (var Pokemon_List: List<Pokemon>):RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>() {

    class PokemonViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        var image_Pokemon: ImageView = itemView.findViewById(R.id.imageView)
        var nombre: TextView = itemView.findViewById(R.id.tvNombre)
        var tipo: TextView = itemView.findViewById(R.id.tvTipo)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return PokemonViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return Pokemon_List.size
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        val pokemon: Pokemon = Pokemon_List[position]
        holder.image_Pokemon.setImageResource(pokemon.imagen)
        holder.nombre.setText(pokemon.nombre)
        holder.tipo.setText(pokemon.tipo)
    }
}