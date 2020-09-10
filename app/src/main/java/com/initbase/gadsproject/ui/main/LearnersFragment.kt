package com.initbase.gadsproject.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.initbase.gadsproject.R
import kotlinx.android.synthetic.main.fragment_learners.*

/**
 * A placeholder fragment containing a simple view.
 */
class LearnersFragment : Fragment() {

    private lateinit var pageViewModel: LearnersViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pageViewModel = ViewModelProviders.of(this).get(LearnersViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_learners, container, false)
        list_learners.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        list_learners.adapter =
        return root
    }

}