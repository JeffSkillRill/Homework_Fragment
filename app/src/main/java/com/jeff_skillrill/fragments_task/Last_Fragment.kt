package com.jeff_skillrill.fragments_task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jeff_skillrill.fragments_task.databinding.FragmentLastBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Last_Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Last_Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: Data? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getSerializable(ARG_PARAM1) as Data?
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentLastBinding.inflate(inflater, container, false)
        binding.result.text =param1?.information
        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance(data: Data) =
            Last_Fragment().apply {
                arguments = Bundle().apply {
                    putSerializable(ARG_PARAM1, param1)
                }
            }
    }
}