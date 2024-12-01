package com.gharieb.weatherapp.weather.domain.use_case

import com.gharieb.weatherapp.weather.domain.repository.IWeatherRepository

class GetWeatherUseCase(private val iWeatherRepository: IWeatherRepository) {
    suspend operator fun invoke(lat: Double? = null, long: Double? = null, city: String? = null) =
        iWeatherRepository.getWeather(lat, long, city)

}