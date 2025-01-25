package com.mojtaba.todo.di

import android.content.Context
import androidx.room.Room
import com.mojtaba.todo.data.ToDoDatabase
import com.mojtaba.todo.utils.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun databaseProvider(
        @ApplicationContext context: Context,
    ) = Room.databaseBuilder(
        context,
        ToDoDatabase::class.java,
        DATABASE_NAME
    ).build()


    @Provides
    @Singleton
    fun toDoDaoProvider(todoDatabase: ToDoDatabase) = todoDatabase.toDoTaskDao()
}