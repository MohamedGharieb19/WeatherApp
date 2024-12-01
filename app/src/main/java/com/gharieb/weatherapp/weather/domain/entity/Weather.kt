package com.gharieb.weatherapp.weather.domain.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.gharieb.weatherapp.common.domain.entity.Current
import com.gharieb.weatherapp.common.domain.entity.Location

@Entity(tableName = "weathers")
data class Weather(
    @PrimaryKey val id: Long = 0,
    val current: Current?,
    val location: Location?,
)














