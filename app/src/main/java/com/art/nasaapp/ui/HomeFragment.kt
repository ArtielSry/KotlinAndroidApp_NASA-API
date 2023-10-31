package com.art.nasaapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.art.nasaapp.databinding.FragmentHomeBinding
import com.art.nasaapp.ui.adapterPlanets.Planets
import com.art.nasaapp.ui.adapterPlanets.PlanetsAdapter
import com.art.nasaapp.ui.adapterPlanets.PlanetsProvider


class HomeFragment : Fragment() {


    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        initRecyclerView()
    }

    private fun initRecyclerView() {

        binding.rvPlanets.layoutManager = LinearLayoutManager(requireContext())
        binding.rvPlanets.adapter =
            PlanetsAdapter(PlanetsProvider.planetList) { planets ->
                onItemSelected(planets)
            }
    }

    private fun onItemSelected(planets: Planets) {

        val dataToSend = context?.getString(planets.name).toString()
        val temperatureToSend = context?.getString(planets.temperature).toString()
        val durationToSend = context?.getString(planets.duration).toString()

        val imgToSend = planets.img

        val bottomSheetFragment = BottomSheetFragment.newInstance(
            dataToSend,
            temperatureToSend,
            durationToSend,
            imgToSend
        )
        bottomSheetFragment.show(parentFragmentManager, bottomSheetFragment.tag)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}