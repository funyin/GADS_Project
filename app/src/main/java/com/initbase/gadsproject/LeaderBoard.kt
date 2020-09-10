package com.initbase.gadsproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.initbase.gadsproject.ui.main.FragmentAdapter
import kotlinx.android.synthetic.main.activity_leader_board.*

class LeaderBoard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leader_board)
        val sectionsPagerAdapter = FragmentAdapter(this, supportFragmentManager)
        view_pager.adapter = sectionsPagerAdapter
        tabs.setupWithViewPager(view_pager)
    }
}