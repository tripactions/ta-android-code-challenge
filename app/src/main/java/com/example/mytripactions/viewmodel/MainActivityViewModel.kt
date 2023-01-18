package com.example.mytripactions.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.mytripactions.data.NewsArticle
import com.example.mytripactions.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    private val repository: NewsRepository
) : ViewModel() {

    var uiState: UIState by mutableStateOf(UIState.Loading)
        private set

    init {
        val newsArticles = listOf<NewsArticle>(
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

        uiState = UIState.OnDataLoaded(newsArticles)
    }

    sealed class UIState {
        object Loading : UIState()
        class OnDataLoaded(val data: List<NewsArticle>) : UIState()
        class OnError(val throwable: Throwable) : UIState()
    }
}