package com.example.mytripactions.data

data class NewsArticle(
    val title: String?,
    val url: String,
    val thumbnailUrl: String?,
    val publishedAt: String? = null,
    val isBookmarked: Boolean = false,
    val updatedAt: Long = System.currentTimeMillis()
)