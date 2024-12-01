package com.gharieb.weatherapp.forecast.domain.mapper

import com.gharieb.weatherapp.common.core.utils.DateFormatter.formatDateToDayOrToday
import com.gharieb.weatherapp.common.core.utils.DateUtils.isToday
import com.gharieb.weatherapp.common.domain.mapper.toModel
import com.gharieb.weatherapp.forecast.data.model.DayDTO
import com.gharieb.weatherapp.forecast.data.model.ForecastDTO
import com.gharieb.weatherapp.forecast.data.model.ForecastDayItemDTO
import com.gharieb.weatherapp.forecast.data.model.ForecastListDTO
import com.gharieb.weatherapp.forecast.domain.entity.Day
import com.gharieb.weatherapp.forecast.domain.entity.Forecast
import com.gharieb.weatherapp.forecast.domain.entity.ForecastDayItem
import com.gharieb.weatherapp.forecast.domain.entity.ForecastList
import java.text.SimpleDateFormat
import java.util.Locale
import java.util.TimeZone

fun ForecastDTO.toModel(): Forecast {
    return Forecast(
        current = current?.toModel(),
        location = location?.toModel(),
        forecast = forecast?.toModel()
    )
}

fun ForecastListDTO.toModel(): ForecastList {
    return ForecastList(
        forecastDayList = forecastDayList!!.map { it.toModel() }
    )
}

fun ForecastDayItemDTO.toModel(): ForecastDayItem {
    val inputFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    inputFormat.timeZone = TimeZone.getDefault()

    return ForecastDayItem(
        date = date?.let { formatDateToDayOrToday(it) },
        isToday = date?.let { isToday(it, inputFormat) } ?: false,
        day = day?.toModel()
    )
}

fun DayDTO.toModel(): Day {
    return Day(
        averageTemperature = averageTemperature?.let { "$it°C" } ?:"",
        condition = condition?.toModel()
    )
}