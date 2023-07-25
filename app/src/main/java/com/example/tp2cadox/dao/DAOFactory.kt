package com.example.tp2cadox.dao

import com.example.tp2cadox.dao.memory.ArticleDAOMemoryImpl

object DaoFactory {
    fun createDaoByType(type: DAOType): ArticleDAO {
        return when(type){
            DAOType.MEMORY -> ArticleDAOMemoryImpl()
        }
    }
}