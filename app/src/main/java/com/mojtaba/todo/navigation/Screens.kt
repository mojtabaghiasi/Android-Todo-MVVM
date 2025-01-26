package com.mojtaba.todo.navigation

import androidx.navigation.NavHostController
import com.mojtaba.todo.utils.Action
import com.mojtaba.todo.utils.Constants.LIST_SCREEN

class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }
    val task: (Int) -> Unit = { taskId ->
        navController.navigate("task/${taskId}")
    }
}