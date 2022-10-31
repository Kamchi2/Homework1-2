package com.example.homework4_1.data.remote.apiservices

import com.example.homework4_1.models.PokemonModel
import com.example.homework4_1.models.PokemonResponse
import retrofit2.http.GET

interface PokemonApiService {

    @GET("pokemon")
    suspend fun fetchPokemonName(): PokemonResponse<PokemonModel>
}