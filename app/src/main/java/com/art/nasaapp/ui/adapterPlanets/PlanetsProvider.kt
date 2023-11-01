package com.art.nasaapp.ui.adapterPlanets

import com.art.nasaapp.R

class PlanetsProvider {
    companion object {

        val planetList = listOf(
            Planets(
                R.string.mercury,
                R.drawable.mercurio_planet,
                R.string.mercuryDayDuration,
                R.string.mercuryTemperature,
                R.string.mercuryData
            ),

            Planets(
                R.string.venus,
                R.drawable.venus_planet,
                R.string.venusDayDuration,
                R.string.venusTemperature,
                R.string.venusData
            ),
            Planets(
                R.string.earth,
                R.drawable.tierra_planet,
                R.string.earthDayDuration,
                R.string.earthTemperature,
                R.string.earthData
            ),
            Planets(
                R.string.moon,
                R.drawable.luna_planet,
                R.string.moonDayDuration,
                R.string.moonTemperature,
                R.string.moonData
            ),
            Planets(
                R.string.mars,
                R.drawable.marte_planet,
                R.string.marsDayDuration,
                R.string.marsTemperature,
                R.string.marsData
            ),
            Planets(
                R.string.jupiter,
                R.drawable.jupiter_planet,
                R.string.jupiterDayDuration,
                R.string.jupiterTemperature,
                R.string.jupiterData
            ),

            Planets(
                R.string.saturn,
                R.drawable.saturno_planet,
                R.string.saturnDayDuration,
                R.string.saturnTemperature,
                R.string.saturnData
            ),

            Planets(
                R.string.uranus,
                R.drawable.urano_planet,
                R.string.uranusDayDuration,
                R.string.uranusTemperature,
                R.string.uranusData
            ),
            Planets(
                R.string.neptune,
                R.drawable.neptuno_planet,
                R.string.neptuneDayDuration,
                R.string.neptuneTemperature,
                R.string.neptuneData
            )
        )
    }
}