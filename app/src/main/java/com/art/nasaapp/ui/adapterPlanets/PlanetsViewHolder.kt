package com.art.nasaapp.ui.adapterPlanets

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.art.nasaapp.databinding.ItemPlanetBinding

class PlanetsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemPlanetBinding.bind(view)

    fun render(planets: Planets) {

        val context = binding.tvPlanet.context

        binding.tvPlanet.text = context.getString(planets.name)
        binding.ivPlanet.setImageResource(planets.img)
        binding.tvDuration.text = context.getString(planets.duration)
        binding.tvTemperature.text = context.getString(planets.temperature)
    }
}