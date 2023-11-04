package com.example.jobplanetuiclone

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jobplanetuiclone.screen.DetailScreen
import com.example.jobplanetuiclone.screen.HomeScreen
import com.example.jobplanetuiclone.screen.MyPageScreen
import com.example.jobplanetuiclone.screen.NewsScreen

@Composable
fun JobPlanetNavigator(navHostController: NavHostController = rememberNavController()) {
    NavHost(navController = navHostController, startDestination = Route.HOME) {
        composable(Route.HOME) {
            HomeScreen()
        }
        composable(Route.COMPANY_DETAIL) {
            DetailScreen()
        }
        composable(Route.NEWS) {
            NewsScreen()
        }
        composable(Route.MY_PAGE) {
            MyPageScreen()
        }
    }
}