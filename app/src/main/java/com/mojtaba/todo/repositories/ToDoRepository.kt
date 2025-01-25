package com.mojtaba.todo.repositories

import com.mojtaba.todo.data.ToDoDao
import com.mojtaba.todo.data.models.ToDoTask
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ToDoRepository @Inject constructor(private val toDoDao: ToDoDao) {
    fun getAllTasks(): Flow<List<ToDoTask>> = toDoDao.getAllTasks()
    fun sortLowPriorityTasks(): Flow<List<ToDoTask>> = toDoDao.sortByLowPriority()
    fun sortHighQualityTasks(): Flow<List<ToDoTask>> = toDoDao.sortByHIGHPriority()
    fun getSelectedTask(taskId: Int): Flow<ToDoTask> = toDoDao.getSelectedTask(taskId)
    suspend fun addToDoTask(toDoTask: ToDoTask) = toDoDao.insert(toDoTask)
    suspend fun updateToDoTask(toDoTask: ToDoTask) = toDoDao.updateTask(toDoTask)
    suspend fun deleteToDoTask(toDoTask: ToDoTask) = toDoDao.deleteTask(toDoTask)
    suspend fun deleteAllTasks() = toDoDao.deleteAllTasks()
    fun searchTasks(searchQuery: String): Flow<List<ToDoTask>> = toDoDao.searchTasks(searchQuery)
}