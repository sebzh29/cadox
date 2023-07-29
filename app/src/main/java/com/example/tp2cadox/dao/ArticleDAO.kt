package com.example.tp2cadox.dao

import com.example.tp2cadox.bo.Article

interface ArticleDAO {
    fun selectById(id:Long): Article?
    fun update(article: Article): Unit

}