package com.mojtaba.todo.data

import androidx.room.Database
import com.mojtaba.todo.data.models.ToDoTask


@Database(entities = [ToDoTask::class] , version = 1 , exportSchema = false)
abstract class ToDoDatabase {
    abstract fun toDoTaskDao(): ToDoDao
}