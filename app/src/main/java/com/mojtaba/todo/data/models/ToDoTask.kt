package com.mojtaba.todo.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.mojtaba.todo.utils.Constants

@Entity(tableName = Constants.TO_DO_TASK_TABLE)
data class ToDoTask(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)
