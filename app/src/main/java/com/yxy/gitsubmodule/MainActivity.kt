package com.yxy.gitsubmodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button)
        var textview = findViewById<TextView>(R.id.textview)

        button.setOnClickListener {
            textview.text = "调用了sub module方法"
        }
    }
}