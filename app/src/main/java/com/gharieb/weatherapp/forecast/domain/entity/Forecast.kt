package com.gharieb.weatherapp.forecast.domain.entity

import com.gharieb.weatherapp.common.domain.entity.Current
import com.gharieb.weatherapp.common.domain.entity.Location

data class Forecast(
    val current: Current?,
    val location: Location?,
    val forecast: ForecastList?
)














