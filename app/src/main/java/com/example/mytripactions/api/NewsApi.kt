package com.example.mytripactions.api

import retrofit2.http.GET
import retrofit2.http.Headers

interface NewsApi {

    companion object {
        const val BASE_URL = "https://newsapi.org/v2/"
        const val API_KEY = ""
    }

    @Headers("X-Api-Key: $API_KEY")
    @GET("top-headlines?country=us&pageSize=100")
    suspend fun getNews(): NewsResponse
}