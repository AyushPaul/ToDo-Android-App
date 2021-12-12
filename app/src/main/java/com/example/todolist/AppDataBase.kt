package com.example.todolist

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [TodoModel::class] , version = 1)
abstract class AppDataBase:RoomDatabase() {
    abstract fun todoDao():ToDoDao
}