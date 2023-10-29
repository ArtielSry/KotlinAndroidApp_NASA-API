package com.art.nasaapp.ui.adapterPlanets

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.art.nasaapp.R


class PlanetsAdapter(private val planetList: List<Planets>) :
    RecyclerView.Adapter<PlanetsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetsViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PlanetsViewHolder(layoutInflater.inflate(R.layout.item_planet, parent, false))
    }

    override fun onBindViewHolder(holder: PlanetsViewHolder, position: Int) {
        val item = planetList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = planetList.size
}