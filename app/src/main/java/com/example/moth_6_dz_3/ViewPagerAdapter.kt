package com.example.moth_6_dz_3

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.moth_6_dz_3.actions.ButtonFragment
import com.example.moth_6_dz_3.actions.CheckFragment
import com.example.moth_6_dz_3.actions.HistoryFragment

class ViewPagerAdapter(fm: FragmentActivity) : FragmentStateAdapter(fm) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ButtonFragment()
            1 -> CheckFragment()
            2 -> HistoryFragment()
            else -> ButtonFragment()
        }
    }
}