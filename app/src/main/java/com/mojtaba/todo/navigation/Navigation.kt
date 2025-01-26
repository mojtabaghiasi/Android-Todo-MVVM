package com.mojtaba.todo.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.mojtaba.todo.navigation.destinations.listComposable
import com.mojtaba.todo.navigation.destinations.taskComposable
import com.mojtaba.todo.utils.Constants.LIST_SCREEN


@Composable
fun SetUpNavigation(
    navController: NavHostController
){
    val screens = remember(navController){
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN
    ){
        listComposable(navigateToTaskScreen = screens.task)
        taskComposable(navigateToListScreen = screens.list)
    }

}