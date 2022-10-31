package com.example.homework4_1.data.repositorys

import com.example.homework4_1.base.BaseRepository
import com.example.homework4_1.data.remote.apiservices.PokemonApiService
import javax.inject.Inject

class PokemonRepository @Inject constructor(private val pokemonApiService: PokemonApiService): BaseRepository() {

    fun fetchPokemonName() = doRequest {
        pokemonApiService.fetchPokemonName()
    }
}