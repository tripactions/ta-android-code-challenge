package com.example.mytripactions.api

data class NewsArticleDto(
    val title: String?,
    val url: String,
    val urlToImage: String?,
    val publishedAt: String
)