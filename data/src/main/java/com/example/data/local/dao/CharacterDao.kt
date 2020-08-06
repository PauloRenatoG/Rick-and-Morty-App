package com.example.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Query
import com.example.data.entities.Character

@Dao
interface CharacterDao {
    @Query("SELECT * FROM character")
    fun getAll(): PagingSource<Int, Character>
}