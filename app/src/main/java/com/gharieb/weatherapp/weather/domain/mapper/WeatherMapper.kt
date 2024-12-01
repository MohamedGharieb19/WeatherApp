package com.gharieb.weatherapp.weather.domain.mapper

import com.gharieb.weatherapp.common.domain.mapper.toModel
import com.gharieb.weatherapp.weather.data.model.WeatherDTO
import com.gharieb.weatherapp.weather.domain.entity.Weather

fun WeatherDTO.toModel(): Weather {
    return Weather(
        current = current?.toModel(),
        location = location?.toModel(),
    )
}




