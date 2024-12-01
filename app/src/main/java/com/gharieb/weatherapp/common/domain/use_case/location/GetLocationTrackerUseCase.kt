package com.gharieb.weatherapp.common.domain.use_case.location

import com.gharieb.weatherapp.common.domain.repository.location.ILocationTracker

class GetLocationTrackerUseCase(private val iLocationTracker: ILocationTracker) {
    suspend operator fun invoke() = iLocationTracker.getCurrentLocation()
}