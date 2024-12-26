package com.example.mobileapplications22.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(f: FragmentActivity, val List : List<Fragment>) : FragmentStateAdapter(f) {

    override fun getItemCount() = List.size

    override fun createFragment(position: Int): Fragment {
        return List[position]
    }
}