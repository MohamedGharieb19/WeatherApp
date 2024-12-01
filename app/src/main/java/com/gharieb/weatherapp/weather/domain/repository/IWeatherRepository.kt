package com.gharieb.weatherapp.weather.domain.repository

import com.gharieb.weatherapp.weather.domain.entity.Weather
import com.gharieb.weatherapp.common.core.utils.Resource

interface IWeatherRepository {
    suspend fun getWeather(lat: Double?=null, long: Double?=null,city: String?=null): Resource<Weather>
}