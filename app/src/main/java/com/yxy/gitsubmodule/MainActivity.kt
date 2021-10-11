package com.yxy.gitsubmodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.yxy.common.ToastUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button)
        var textview = findViewById<TextView>(R.id.textview)

        button.setOnClickListener {
            textview.text = "调用了sub module方法"
            ToastUtils.show3(this, "引入了子模块的方法")
        }
    }
}