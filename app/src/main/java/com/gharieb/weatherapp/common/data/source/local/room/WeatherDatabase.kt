package com.gharieb.weatherapp.common.data.source.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.gharieb.weatherapp.weather.domain.entity.Weather
import com.gharieb.weatherapp.weather.data.source.local.WeatherDao

@Database(entities = [Weather::class], version = 3, exportSchema = false)
@TypeConverters(TypeConverter::class)
abstract class WeatherDatabase : RoomDatabase() {
    abstract fun weatherDao(): WeatherDao
}