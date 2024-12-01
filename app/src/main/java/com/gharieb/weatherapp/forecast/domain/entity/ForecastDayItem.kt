package com.gharieb.weatherapp.forecast.domain.entity

data class ForecastDayItem(
    val date: String?,
    val day: Day?,
    val isToday: Boolean?
)
