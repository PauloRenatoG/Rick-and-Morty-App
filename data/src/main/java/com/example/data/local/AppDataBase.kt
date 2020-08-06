package com.example.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.data.entities.Character
import com.example.data.local.dao.CharacterDao

@Database(entities = [Character::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun characterDao(): CharacterDao

    companion object {
        private const val DATABASE_NAME = "rick-and-morty-db"

        fun build(context: Context): AppDataBase {
            return Room.databaseBuilder(
                context,
                AppDataBase::class.java, DATABASE_NAME
            ).build()
        }
    }
}