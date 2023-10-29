package com.art.nasaapp.ui.adapterPlanets

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.art.nasaapp.databinding.ItemPlanetBinding

class PlanetsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemPlanetBinding.bind(view)

    fun render(planets: Planets) {

        binding.tvPlanet.text = planets.name.toString()
        binding.ivPlanet.setImageResource(planets.img)
        binding.tvDuration.text = planets.duration.toString()
        binding.tvTemperature.text = planets.temperature.toString()
    }
}