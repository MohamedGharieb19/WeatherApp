package com.gharieb.weatherapp.forecast.presentation

sealed class ForecastIntent {
    data class LoadCurrentWeather(val days: String) : ForecastIntent()
}