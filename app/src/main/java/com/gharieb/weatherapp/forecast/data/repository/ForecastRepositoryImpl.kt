package com.gharieb.weatherapp.forecast.data.repository

import android.content.Context
import com.gharieb.weatherapp.common.core.utils.Resource
import com.gharieb.weatherapp.common.data.source.local.shared_preference.SharedPreferencesHelper
import com.gharieb.weatherapp.forecast.data.source.ForecastApi
import com.gharieb.weatherapp.forecast.domain.entity.Forecast
import com.gharieb.weatherapp.forecast.domain.mapper.toModel
import com.gharieb.weatherapp.forecast.domain.repository.remote.IForecastRepository
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class ForecastRepositoryImpl @Inject constructor(
    private val api: ForecastApi,
    private val sharedPreferencesHelper: SharedPreferencesHelper,
    @ApplicationContext private val context: Context
): IForecastRepository {

    override suspend fun getForecastWeatherData(lat: Double?, long: Double?, city: String?, days: String): Resource<Forecast> {
        return try {
            val value = if (sharedPreferencesHelper.getHasUserSearchedCity(context = context)){
                sharedPreferencesHelper.getSearchedCityName(context = context)!!
            } else city ?: "$lat,$long"

            Resource.Success(
                data = api.getForecastWeatherData(
                    value = value,
                    forecastDays = days
                ).toModel()
            )
        } catch(e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}