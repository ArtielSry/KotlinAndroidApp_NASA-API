package com.art.nasaapp.ui.adapterPlanets

import android.animation.ObjectAnimator
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.art.nasaapp.R


class PlanetsAdapter(
    private val planetList: List<Planets>,
    private val onItemSelected: (Planets) -> Unit
) :
    RecyclerView.Adapter<PlanetsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetsViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PlanetsViewHolder(layoutInflater.inflate(R.layout.item_planet, parent, false))
    }

    override fun onBindViewHolder(holder: PlanetsViewHolder, position: Int) {
        holder.render(planetList[position], onItemSelected)
    }

    override fun getItemCount(): Int = planetList.size

}