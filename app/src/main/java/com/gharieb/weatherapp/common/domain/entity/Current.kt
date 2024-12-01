package com.gharieb.weatherapp.common.domain.entity

data class Current(
    val lastUpdated: String,
    val isDay: Boolean?,
    val temperature: String,
    val condition: Condition?
)
