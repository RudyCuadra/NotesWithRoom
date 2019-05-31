package com.example.misnotas2.database
import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = arrayOf(TaskEntity::class),version = 1)
abstract class TaskDatabase : RoomDatabase() {
    abstract fun taskDao():TaskDao
}