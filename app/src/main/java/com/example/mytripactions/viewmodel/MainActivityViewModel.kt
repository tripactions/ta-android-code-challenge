package com.example.mytripactions.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mytripactions.data.NewsArticle
import com.example.mytripactions.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    private val repository: NewsRepository
) : ViewModel() {

    private val _data: MutableLiveData<List<NewsArticle>> = MutableLiveData()
    val data: LiveData<List<NewsArticle>> get() = _data

    init {
        _data.value = listOf<NewsArticle>(
            NewsArticle(
                "My first article",
                "no-url-link",
                null
            ),
            NewsArticle(
                "My second article",
                "no-url-link",
                null
            ),
            NewsArticle(
                "My third article",
                "no-url-link",
                null
            )
        )
    }
}