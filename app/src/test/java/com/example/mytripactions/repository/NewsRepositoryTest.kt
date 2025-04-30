package com.example.mytripactions.repository

import com.example.mytripactions.api.NewsApi
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test

class NewsRepositoryTest {

    @MockK
    lateinit var newsApi: NewsApi

    private lateinit var repository: NewsRepository

    @Before
    fun setup() {
        MockKAnnotations.init(this)
        repository = NewsRepositoryImpl(newsApi)
    }

    @Test
    fun `write your tests here`() = runTest {}
}