package com.example.notesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.notesapp.adapter.FragmentAdapter
import com.example.notesapp.fragment.JournalFragment
import com.example.notesapp.fragment.NotesFragment
import com.example.notesapp.fragment.ScheduleFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewPager = findViewById(R.id.viewPager) as ViewPager
        var tablayout = findViewById(R.id.tablayout) as TabLayout

        val fragmentAdapter = FragmentAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(NotesFragment(),"Notes")
        fragmentAdapter.addFragment(ScheduleFragment(),"Schedule")
        fragmentAdapter.addFragment(JournalFragment(),"Journal")

        viewPager.adapter = fragmentAdapter
        tablayout.setupWithViewPager(viewPager)

    }
}