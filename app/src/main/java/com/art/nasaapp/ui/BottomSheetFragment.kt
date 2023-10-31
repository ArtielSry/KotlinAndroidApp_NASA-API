package com.art.nasaapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.art.nasaapp.databinding.FragmentDetailBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetFragment : BottomSheetDialogFragment() {

    companion object {
        fun newInstance(
            data: String,
            temperature: String,
            duration: String,
            img: Int
        ): BottomSheetFragment {
            val fragment = BottomSheetFragment()
            val args = Bundle()
            args.putString("key", data)
            args.putString("keyT", temperature)
            args.putString("keyD", duration)

            args.putInt("keyImg", img)

            fragment.arguments = args


            return fragment
        }
    }

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {

        val data = arguments?.getString("key")
        val temperature = arguments?.getString("keyT")
        val duration = arguments?.getString("keyD")


        val img = arguments?.getInt("keyImg", 0)

        binding.bottomName.text = data
        binding.bottomTemperature.text = temperature
        binding.bottomDay.text = duration

        if (img != 0) {

            if (img != null) {
                binding.bottomImg.setImageResource(img)
            }
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentDetailBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}