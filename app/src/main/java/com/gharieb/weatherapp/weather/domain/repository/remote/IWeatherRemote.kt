package com.gharieb.weatherapp.weather.domain.repository.remote

import com.gharieb.weatherapp.weather.domain.entity.Weather
import com.gharieb.weatherapp.common.core.utils.Resource

interface IWeatherRemote {
    suspend fun getCurrentWeatherData(lat: Double?=null, long: Double?=null,city: String?=null): Resource<Weather>
}