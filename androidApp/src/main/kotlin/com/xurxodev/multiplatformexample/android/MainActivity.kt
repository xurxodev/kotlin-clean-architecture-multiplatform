package com.xurxodev.multiplatformexample.android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.xurxodev.multiplatformexample.core.common.DateTime
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val now = DateTime()

        helloTextView.text = "The time is: ${now.timestamp}"
    }
}
