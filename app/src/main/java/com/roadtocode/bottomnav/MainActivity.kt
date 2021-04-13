package com.roadtocode.bottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav.setOnNavigationItemSelectedListener {
            when(it.itemId)
            {
                R.id.miMessage -> setFragment(MessageFragment())
                R.id.miHome -> setFragment(HomeFragment())
                R.id.miSettings -> setFragment(SettingsFragment())
            }
            true
        }
    }

    private fun setFragment(fragment: Fragment)
    {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
            commit()
        }
    }
}