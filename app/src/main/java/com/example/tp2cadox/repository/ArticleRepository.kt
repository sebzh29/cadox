package com.example.tp2cadox.repository

import com.example.tp2cadox.bo.Article
import com.example.tp2cadox.dao.DaoFactory
import com.example.tp2cadox.dao.DAOType

object ArticleRepository {
    private val daoMemory = DaoFactory.createDaoByType(DAOType.MEMORY)
    fun getArticle(id: Long): Article?{
        return daoMemory.selectById(id)
    }
}