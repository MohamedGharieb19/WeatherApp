package com.gharieb.weatherapp.forecast.di

import com.gharieb.weatherapp.forecast.domain.repository.remote.IForecastRepository
import com.gharieb.weatherapp.forecast.domain.use_case.GetForecastWeatherDataUseCase
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
    fun provideGetForecastWeatherDataUseCase(iForecastRepository: IForecastRepository): GetForecastWeatherDataUseCase =
        GetForecastWeatherDataUseCase(iForecastRepository)
}