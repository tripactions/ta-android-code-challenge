package com.example.mytripactions.adapter

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mytripactions.R
import com.example.mytripactions.data.NewsArticle
import com.example.mytripactions.databinding.ItemNewsBinding

class NewsViewHolder(
    private val binding: ItemNewsBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(news: NewsArticle) {
        binding.apply {
            Glide.with(itemView)
                .load(news.thumbnailUrl)
                .error(R.drawable.image_placeholder)
                .into(imageView)

            textViewTitle.text = news.title ?: ""
        }
    }
}