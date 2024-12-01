package com.gharieb.weatherapp.weather.di

import com.gharieb.weatherapp.common.data.source.local.room.WeatherDatabase
import com.gharieb.weatherapp.weather.data.source.local.WeatherDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    fun provideWeatherDao(database: WeatherDatabase): WeatherDao {
        return database.weatherDao()
    }
}