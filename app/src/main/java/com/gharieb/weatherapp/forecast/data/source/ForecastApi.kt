package com.gharieb.weatherapp.forecast.data.source

import com.gharieb.weatherapp.common.core.ApiConstants.API_KEY
import com.gharieb.weatherapp.common.core.ApiConstants.FORECAST_WEATHER
import com.gharieb.weatherapp.forecast.data.model.ForecastDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface ForecastApi {

    @GET(FORECAST_WEATHER)
    suspend fun getForecastWeatherData(
        @Query("key") apiKey: String = API_KEY,
        @Query("days") forecastDays: String,
        @Query("q") value: String // query parameter cityName or latitude,longitude
    ): ForecastDTO
}