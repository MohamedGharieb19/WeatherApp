package com.gharieb.weatherapp.weather.domain.repository.local

import com.gharieb.weatherapp.weather.domain.entity.Weather
import com.gharieb.weatherapp.common.core.utils.Resource

interface IWeatherLocal {
    suspend fun saveWeather(weather: Weather)
    suspend fun getSavedWeather(): Resource<Weather>
}