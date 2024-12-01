package com.gharieb.weatherapp.common.domain.mapper

import com.gharieb.weatherapp.common.core.utils.DateFormatter.formatDateToToday
import com.gharieb.weatherapp.common.data.model.ConditionDTO
import com.gharieb.weatherapp.common.data.model.CurrentDTO
import com.gharieb.weatherapp.common.data.model.LocationDTO
import com.gharieb.weatherapp.common.domain.entity.Condition
import com.gharieb.weatherapp.common.domain.entity.Current
import com.gharieb.weatherapp.common.domain.entity.Location

fun CurrentDTO.toModel(): Current {
    return Current(
        lastUpdated = lastUpdated?.let { formatDateToToday(it) }?:"",
        isDay = isDay == 1,
        temperature = temperature?.let { "$it°C" }?:"",
        condition = condition?.toModel()
    )
}

fun LocationDTO.toModel(): Location {
    return Location(
        localtime = localtime,
        name = name.plus(" $country"),
        longitude = longitude,
        latitude = latitude
    )
}



fun ConditionDTO.toModel(): Condition {
    return Condition(
        code = code,
        icon = "https:".plus(icon),
        text = text
    )
}