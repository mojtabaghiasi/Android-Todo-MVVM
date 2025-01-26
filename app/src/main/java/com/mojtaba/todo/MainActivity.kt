package com.mojtaba.todo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mojtaba.todo.navigation.SetUpNavigation
import com.mojtaba.todo.ui.theme.ToDoTheme

class MainActivity : ComponentActivity() {
    private lateinit var navHostController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ToDoTheme {
                navHostController = rememberNavController()
                SetUpNavigation(navHostController)
            }
        }
    }
}