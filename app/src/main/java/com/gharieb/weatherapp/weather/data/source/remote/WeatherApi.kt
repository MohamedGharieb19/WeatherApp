package com.gharieb.weatherapp.weather.data.source.remote

import com.gharieb.weatherapp.common.core.ApiConstants.API_KEY
import com.gharieb.weatherapp.common.core.ApiConstants.CURRENT_WEATHER
import com.gharieb.weatherapp.weather.data.model.WeatherDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET(CURRENT_WEATHER)
    suspend fun getCurrentWeatherData(
        @Query("key") apiKey: String = API_KEY,
        @Query("q") value: String // query parameter cityName or latitude,longitude
    ): WeatherDTO

}