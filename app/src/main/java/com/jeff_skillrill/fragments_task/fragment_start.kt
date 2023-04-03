package com.jeff_skillrill.fragments_task

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.jeff_skillrill.fragments_task.databinding.FragmentStartBinding


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class fragment_start : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentStartBinding.inflate(inflater, container, false)
        val information = binding.editTextText.text
        val data = Data(information.toString())
        binding.button.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.start, Last_Fragment.newInstance(data))
                .commit()

        }
        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            fragment_start().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}