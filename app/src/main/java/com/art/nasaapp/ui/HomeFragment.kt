package com.art.nasaapp.ui

import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.art.nasaapp.databinding.FragmentHomeBinding
import com.art.nasaapp.ui.adapterPlanets.Planets
import com.art.nasaapp.ui.adapterPlanets.PlanetsAdapter
import com.art.nasaapp.ui.adapterPlanets.PlanetsProvider
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class HomeFragment : Fragment() {


    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private lateinit var bottomSheetFragment: BottomSheetDialogFragment

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

        val dataToSend = context?.getString(planets.name)
        val imgToSend = context?.getString(planets.img)

        Log.i("nombre del planeta", dataToSend.toString())

        val bottomSheetFragment = BottomSheetFragment.newInstance(dataToSend.toString())
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