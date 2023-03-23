package com.hadevelopment.familysafety

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.hadevelopment.familysafety.fragment.dashboardFragment
import com.hadevelopment.familysafety.fragment.guardfragment
import com.hadevelopment.familysafety.fragment.homeFragment
import com.hadevelopment.familysafety.fragment.profileFragment

class MainActivity : AppCompatActivity() {
    var bottombar:BottomNavigationView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottombar=findViewById(R.id.bottomNavigationView)

        val transaction=supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,homeFragment())
        transaction.commit()

        bottombar!!.setOnItemSelectedListener {
            if(it.itemId==R.id.guard){
                inflateFragment(guardfragment.newInstance())
            }else if(it.itemId==R.id.home){
                inflateFragment(homeFragment.newInstance())
            }else if(it.itemId==R.id.dashboard){
                inflateFragment(dashboardFragment.newInstance())
            }
            else if(it.itemId==R.id.profile){
                inflateFragment(profileFragment.newInstance())
            }
            true
        }

    }
    private fun inflateFragment(newInstance: Fragment) {
        val transaction=supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,newInstance)
        transaction.commit()
    }
}