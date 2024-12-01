package com.gharieb.weatherapp.common.presentation.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.gharieb.weatherapp.common.app.Route
import com.gharieb.weatherapp.weather.presentation.CurrentWeatherScreen
import com.gharieb.weatherapp.forecast.presentation.ForecastScreen

@Composable
fun NavGraph(navController: NavHostController, contentPadding: PaddingValues) {
    NavHost(navController = navController, startDestination = Route.CurrentWeather) {
        composable<Route.CurrentWeather> {
            CurrentWeatherScreen(navHostController = navController, contentPadding = contentPadding)
        }

        composable<Route.Forecast> {
            ForecastScreen(navHostController = navController)
        }
    }
}