package com.gharieb.weatherapp.weather.presentation

import com.gharieb.weatherapp.weather.domain.entity.Weather

data class WeatherState(
    val cityNameBySearch: String? = null,
    val weatherInfo: Weather? = null,
    val isLoading: Boolean = false,
    val errorMessage: String? = null
)
