package com.example.mytripactions.repository

import com.example.mytripactions.api.NewsApi
import com.example.mytripactions.api.NewsResponse
import io.reactivex.rxjava3.core.Observable
import retrofit2.Call

class NewsRepositoryImpl(private val newsApi: NewsApi) : NewsRepository {

    override suspend fun getNews(): NewsResponse {
        TODO("empty function for now")
    }
}