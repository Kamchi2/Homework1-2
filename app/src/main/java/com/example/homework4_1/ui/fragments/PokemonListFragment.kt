package com.example.homework4_1.ui.fragments

import android.util.Log
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.homework4_1.R
import com.example.homework4_1.base.BaseFragment
import com.example.homework4_1.databinding.FragmentListBinding
import com.example.homework4_1.ui.adapters.PokemonListAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PokemonListFragment :
    BaseFragment<FragmentListBinding, PokemonListViewModel>(R.layout.fragment_list) {

    override val binding by viewBinding(FragmentListBinding::bind)
    override val viewModel: PokemonListViewModel by viewModels()
    private val adapter = PokemonListAdapter()

    override fun initialize() {
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.pokemonlistRv.adapter = adapter
    }

    override fun setupSubscribes() {
        viewModel.fetchPokemonName().subscribe(
            onSuccess = {
                adapter.submitList(it.result)
            },
            onError = {
                Log.e("log", it)
            }
        )
    }
}