package com.gharieb.weatherapp.weather.di

import com.gharieb.weatherapp.weather.domain.repository.IWeatherRepository
import com.gharieb.weatherapp.weather.domain.use_case.GetWeatherUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    @Singleton
    fun provideGetWeatherUseCase(iWeatherRepository: IWeatherRepository): GetWeatherUseCase =
        GetWeatherUseCase(iWeatherRepository)
}