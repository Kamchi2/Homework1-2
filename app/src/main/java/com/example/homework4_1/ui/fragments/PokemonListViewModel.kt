package com.example.homework4_1.ui.fragments

import com.example.homework4_1.base.BaseViewModel
import com.example.homework4_1.data.repositorys.PokemonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonListViewModel @Inject constructor(private val repository: PokemonRepository) :
    BaseViewModel() {

    fun fetchPokemonName() = repository.fetchPokemonName()

}