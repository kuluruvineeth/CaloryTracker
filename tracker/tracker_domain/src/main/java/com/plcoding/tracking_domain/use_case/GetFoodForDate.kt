package com.plcoding.tracking_domain.use_case

import com.plcoding.tracking_domain.model.MealType
import com.plcoding.tracking_domain.model.TrackableFood
import com.plcoding.tracking_domain.model.TrackedFood
import com.plcoding.tracking_domain.repository.TrackerRepository
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate
import kotlin.math.roundToInt

class GetFoodForDate(
    private val repository: TrackerRepository
) {
    operator fun invoke(
        date: LocalDate
    ) : Flow<List<TrackedFood>>{
        return repository.getFoodsForDate(date)
    }
}