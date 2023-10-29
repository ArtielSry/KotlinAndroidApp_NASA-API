package com.art.nasaapp.ui.adapterPlanets

import com.art.nasaapp.R

class PlanetsProvider {
    companion object {

        val planetList = listOf(
            Planets(
                R.string.sun,
                R.drawable.sol_planet,
                R.string.sunDayDuration,
                R.string.sunTemperature
            ),
            Planets(
                R.string.mercury,
                R.drawable.mercurio_planet,
                R.string.mercuryDayDuration,
                R.string.mercuryTemperature
            ),

            Planets(
                R.string.venus,
                R.drawable.venus_planet,
                R.string.venusDayDuration,
                R.string.venusTemperature
            ),
            Planets(
                R.string.earth,
                R.drawable.tierra_planet,
                R.string.earthDayDuration,
                R.string.earthTemperature
            ),
            Planets(
                R.string.moon,
                R.drawable.luna_planet,
                R.string.moonDayDuration,
                R.string.moonTemperature
            ),
            Planets(
                R.string.mars,
                R.drawable.marte_planet,
                R.string.marsDayDuration,
                R.string.marsTemperature
            ),
            Planets(
                R.string.jupiter,
                R.drawable.jupiter_planet,
                R.string.jupiterDayDuration,
                R.string.jupiterTemperature
            ),

            Planets(
                R.string.saturn,
                R.drawable.saturno_planet,
                R.string.saturnDayDuration,
                R.string.saturnTemperature
            ),

            Planets(
                R.string.uranus,
                R.drawable.urano_planet,
                R.string.uranusDayDuration,
                R.string.uranusTemperature
            ),
            Planets(
                R.string.neptune,
                R.drawable.neptuno_planet,
                R.string.neptuneDayDuration,
                R.string.neptuneTemperature
            )
        )
    }
}