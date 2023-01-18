package com.example.mytripactions.compose.features

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.example.mytripactions.R
import com.example.mytripactions.compose.TATheme
import com.example.mytripactions.data.NewsArticle
import com.example.mytripactions.viewmodel.MainActivityViewModel

@Composable
fun NewsListUI(mainActivityViewModel: MainActivityViewModel = viewModel()) {

    when (val uiState = mainActivityViewModel.uiState) {
        is MainActivityViewModel.UIState.Loading -> TODO()
        is MainActivityViewModel.UIState.OnError -> TODO()
        is MainActivityViewModel.UIState.OnDataLoaded -> NewsListUI(newsArticles = uiState.data)
    }
}

@Composable
fun NewsListUI(newsArticles: List<NewsArticle>) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

    }
}

@Composable
private fun Thumbnail(url: String) {
    AsyncImage(
        model = url,
        contentDescription = null,
        placeholder = painterResource(R.drawable.image_placeholder)
    )
}

@Preview
@Composable
private fun SampleNewsListUI() {
    TATheme {
        NewsListUI(
            newsArticles = listOf(
                NewsArticle(
                    title = "Is Compose the new Kotlin?",
                    url = "https://android-developers.googleblog.com/2020/08/announcing-jetpack-compose-alpha.html",
                    thumbnailUrl = "https://3.bp.blogspot.com/-VVp3WvJvl84/X0Vu6EjYqDI/AAAAAAAAPjU/ZOMKiUlgfg8ok8DY8Hc-ocOvGdB0z86AgCLcBGAsYHQ/s1600/jetpack%2Bcompose%2Bicon_RGB.png"
                )
            )
        )
    }
}