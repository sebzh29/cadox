package com.example.tp2cadox.bo

import java.time.LocalDate

data class Article (
    var id:Long,
    var intitule:String,
    var description:String,
    var prix:Double,
    var niveau:Byte,
    var url:String?,
    var achete:Boolean?,
    var dateAchat:LocalDate?
    )
{
}