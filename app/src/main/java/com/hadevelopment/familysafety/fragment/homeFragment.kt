package com.hadevelopment.familysafety.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hadevelopment.familysafety.MemberAdapter
import com.hadevelopment.familysafety.MemberModel
import com.hadevelopment.familysafety.R


class homeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View=inflater.inflate(R.layout.fragment_home, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listMembers= listOf<MemberModel>(
            MemberModel("hiii"),
            MemberModel("Hello"),
            MemberModel("byy")
        )
        val adapter=MemberAdapter(listMembers)
        val recycler=requireView().findViewById<RecyclerView>(R.id.rv)
        recycler.layoutManager=LinearLayoutManager(requireContext())
        recycler.adapter=adapter
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            homeFragment()
    }
}