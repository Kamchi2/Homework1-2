package com.example.homework4_1.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.homework4_1.base.BaseDiffUtilItemCallback
import com.example.homework4_1.databinding.ItemPokemonBinding
import com.example.homework4_1.models.PokemonModel
import com.example.homework4_1.models.PokemonResponse

class PokemonListAdapter :
    ListAdapter<PokemonModel, PokemonListAdapter.PokemonViewHolder>(BaseDiffUtilItemCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder =
        PokemonViewHolder(
            ItemPokemonBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    class PokemonViewHolder(private val binding: ItemPokemonBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: PokemonModel) {
            binding.pokemonNameTv.text = model.name
        }

    }

}