package com.example.mytripactions.repository

import com.example.mytripactions.api.NewsResponse
import io.reactivex.rxjava3.core.Observable

interface NewsRepository {

    suspend fun getNews(): NewsResponse

    fun getNewsObservable(): Observable<NewsResponse>

    fun getNewsCall(): Observable<NewsResponse>
}