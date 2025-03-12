package com.pool.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pool.app.mainScreens.CreatePoolScreenFlow
import com.pool.app.mainScreens.DashboardScreen
import com.pool.app.mainScreens.PoolListingScreenFlow
import com.pool.app.navigationControler.Screen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    val navController = rememberNavController()
    var startPoint = Screen.DashboardScreen.route

    NavHost(navController = navController, startDestination = startPoint) {
        composable(route = Screen.DashboardScreen.route) { backStackEntry ->
            DashboardScreen() {
                navController.navigate(it)
            }
        }

        composable(route = Screen.CreatePoolScreenFlow.route) { backStackEntry ->
            CreatePoolScreenFlow() {
                navController.navigate(it)
            }
        }

        composable(route = Screen.PoolListingScreenFlow.route) { backStackEntry ->
            PoolListingScreenFlow() {
                navController.navigate(it)
            }
        }

    }
}