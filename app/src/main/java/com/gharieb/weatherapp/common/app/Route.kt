package com.gharieb.weatherapp.common.app

import kotlinx.serialization.Serializable

sealed interface Route {

    @Serializable
    data object CurrentWeather : Route

    @Serializable
    data class Forecast(val city: String? = null) : Route

}