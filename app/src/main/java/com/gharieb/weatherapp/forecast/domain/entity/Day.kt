package com.gharieb.weatherapp.forecast.domain.entity

import com.gharieb.weatherapp.common.domain.entity.Condition

data class Day(
    val averageTemperature: String,
    val condition: Condition?,
)