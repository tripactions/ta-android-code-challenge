package com.example.mytripactions.repository

import com.example.mytripactions.api.NewsResponse
import io.reactivex.rxjava3.core.Observable
import retrofit2.Call

interface NewsRepository {

    suspend fun getNews(): NewsResponse

    fun getNewsObservable(): Observable<NewsResponse>

    fun getNewsCall(): Call<NewsResponse>
}