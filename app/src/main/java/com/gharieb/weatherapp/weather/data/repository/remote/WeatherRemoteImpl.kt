package com.gharieb.weatherapp.weather.data.repository.remote

import com.gharieb.weatherapp.common.core.utils.Resource
import com.gharieb.weatherapp.weather.domain.entity.Weather
import com.gharieb.weatherapp.weather.domain.mapper.toModel
import com.gharieb.weatherapp.weather.data.source.remote.WeatherApi
import com.gharieb.weatherapp.weather.domain.repository.remote.IWeatherRemote
import javax.inject.Inject

class WeatherRemoteImpl@Inject constructor(
    private val api: WeatherApi,
): IWeatherRemote {
    override suspend fun getCurrentWeatherData(lat: Double?, long: Double?, city: String?): Resource<Weather> {
        return try {
            val value = city ?: "$lat,$long"
            Resource.Success(
                data = api.getCurrentWeatherData(
                    value = value
                ).toModel()
            )
        } catch(e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }

}