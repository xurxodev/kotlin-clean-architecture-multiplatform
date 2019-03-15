package com.xurxodev.multiplatformexample.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.content_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setSupportActionBar(toolbar)
        toolbar.title = title

        showProductListFragment()
    }

    private fun showProductListFragment() {
        val productListFragment =
            ProductListFragment.newInstance(home_right_container != null)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.home_left_container, productListFragment)
            .commit()
    }
}
