package com.art.nasaapp.ui.adapterPlanets

import com.art.nasaapp.R

class PlanetsProvider {
    companion object {

        val planetList = listOf(
            Planets(
                R.string.sun,
                R.drawable.sun
            ),
            Planets(
                R.string.mercury,
                R.drawable.mercurio_planet
            ),

            Planets(
                R.string.venus,
                R.drawable.venus_planet
            ),
            Planets(
                R.string.earth,
                R.drawable.tierra_planet,
            ),
            Planets(
                R.string.moon,
                R.drawable.luna_planet,
            ),
            Planets(
                R.string.mars,
                R.drawable.marte_planet,
            ),
            Planets(
                R.string.jupiter,
                R.drawable.jupiter_planet,
            ),

            Planets(
                R.string.saturn,
                R.drawable.saturno_planet,
            ),

            Planets(
                R.string.uranus,
                R.drawable.urano_planet,
            ),
            Planets(
                R.string.neptune,
                R.drawable.neptuno_planet,
            )
        )
    }
}