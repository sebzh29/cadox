package com.example.tp2cadox.dao.memory

import com.example.tp2cadox.bo.Article
import com.example.tp2cadox.dao.ArticleDAO

class ArticleDAOMemoryImpl: ArticleDAO {
    override fun selectById(id: Long): Article? {
        return Article(0L,
            "Ordinateur Dell",
            "Ordinateur qui calcule",
            850.0,
            4,null,null,null
        )
    }
}