package com.example.tp2cadox.dao.memory

import com.example.tp2cadox.bo.Article
import com.example.tp2cadox.dao.ArticleDAO

class ArticleDAOMemoryImpl: ArticleDAO {
    companion object{
        val listArticles = mutableListOf(
            Article(0L,
                "Ordinateur Dell",
                "Ordinateur qui calcule",
                850.0,
                4,
                "https://www.google.fr",
                null,
                null
            )
        )
    }
    override fun selectById(id: Long): Article? {
        return listArticles.find { it.id == id }
    }

    override fun update(article: Article) {
        listArticles.removeIf { it.id == article.id }
        listArticles.add(article)
    }
}