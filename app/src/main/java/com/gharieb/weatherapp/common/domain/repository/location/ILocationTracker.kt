package com.gharieb.weatherapp.common.domain.repository.location

import android.location.Location

interface ILocationTracker {
    suspend fun getCurrentLocation(): Location?
}