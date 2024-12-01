package com.gharieb.weatherapp.forecast.domain.repository.remote

import com.gharieb.weatherapp.common.core.utils.Resource
import com.gharieb.weatherapp.forecast.domain.entity.Forecast

interface IForecastRepository {
    suspend fun getForecastWeatherData(lat: Double?=null, long: Double?=null,city: String?=null,days: String): Resource<Forecast>
}