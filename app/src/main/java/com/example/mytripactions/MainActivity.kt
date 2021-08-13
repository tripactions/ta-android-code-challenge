package com.example.mytripactions

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mytripactions.databinding.ActivityMainBinding
import com.example.mytripactions.fragments.NewsListFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var fragment: NewsListFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fragment = NewsListFragment()

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_container, fragment, "news_list")
        transaction.commit()
    }
}