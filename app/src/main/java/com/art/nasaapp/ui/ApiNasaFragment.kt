package com.art.nasaapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import com.art.nasaapp.R
import android.view.ViewGroup
// import dagger.hilt.android.AndroidEntryPoint

// @AndroidEntryPoint
class ApiNasaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_api_nasa, container, false)
    }
}