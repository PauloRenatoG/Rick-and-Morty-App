package com.example.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "character")
data class Character(
    @PrimaryKey
    val id: Int? = null,
    val created: String? = null,
    val gender: String? = null,
    val image: String? = null,
    val name: String? = null,
    val species: String? = null,
    val status: String? = null,
    val type: String? = null,
    val url: String? = null
)