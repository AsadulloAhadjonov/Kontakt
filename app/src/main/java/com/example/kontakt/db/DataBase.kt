package com.example.kontakt.db

import com.example.kontakt.Data.User


interface DataBase {
    fun addFood(user: User)
    fun getAllFood():List<User>
}