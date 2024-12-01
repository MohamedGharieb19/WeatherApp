package com.gharieb.weatherapp.forecast.data.model

import com.gharieb.weatherapp.common.data.model.CurrentDTO
import com.gharieb.weatherapp.common.data.model.LocationDTO

data class ForecastDTO(
    val current: CurrentDTO? = null,
    val location: LocationDTO? = null,
    val forecast: ForecastListDTO? = null,
)









