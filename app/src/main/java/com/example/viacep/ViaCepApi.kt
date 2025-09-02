package com.example.viacep

import com.example.viacep.model.Endereco
import retrofit2.Response
import retrofit2.http.GET

interface ViaCepApi {
    @GET("ws/32600280/json")
    suspend fun getEndereco() : Response <Endereco>
}