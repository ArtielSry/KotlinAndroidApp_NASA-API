package com.art.nasaapp.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.art.nasaapp.R
import com.art.nasaapp.data.network.api.RetrofitHelper
import com.art.nasaapp.databinding.FragmentApiNasaBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class ApiNasaFragment : Fragment() {

    private val retrofit = RetrofitHelper.getInstance()

    private var _binding: FragmentApiNasaBinding? = null
    private val binding get() = _binding!!

    private val KEY = "XOJdwTyWpwDO73VFUjZXIKSva0O0AtYcQQtvsFdb"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentApiNasaBinding.inflate(inflater,container,false)

        initRetrofit()
        return inflater.inflate(R.layout.fragment_api_nasa, container, false)
    }


    private fun initRetrofit() {
        lifecycleScope.launch(Dispatchers.IO) {
            val myResponse = retrofit.getNasaData(KEY)

            if (myResponse.isSuccessful) {

                val response = myResponse.body()
                Log.i("prueba en fragment", myResponse.body().toString())
                if (response != null) {

                    withContext(Dispatchers.Main) {
                        Toast.makeText(requireContext(), "${response.date}", Toast.LENGTH_SHORT)
                            .show()
                        Toast.makeText(requireContext(), "${response.expedition}", Toast.LENGTH_SHORT)
                            .show()
                        Toast.makeText(requireContext(), "${response.title}", Toast.LENGTH_SHORT)
                            .show()

                    }

                }


            }
        }

    }


}