package com.nusrahfarri.mynewsblock.adapters

import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import com.nusrahfarri.mynewsblock.fragments.SignInFragment
import com.nusrahfarri.mynewsblock.fragments.SignUpFragment

class ViewPagerAdapter (fragmentManager: FragmentManager, lifecycle: Lifecycle):
    FragmentStateAdapter (fragmentManager, lifecycle){

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
       return when (position) {
          0->{
                SignUpFragment()
            }
            else->{
                SignInFragment()
            }
        }

}}