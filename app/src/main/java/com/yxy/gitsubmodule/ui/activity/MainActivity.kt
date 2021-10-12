package com.yxy.gitsubmodule.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView
import com.yxy.common.ToastUtils
import com.yxy.gitsubmodule.R

class MainActivity : AppCompatActivity(), OnClickListener {
    private var textview: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_submodule).setOnClickListener(this)
        findViewById<Button>(R.id.button_exo).setOnClickListener(this)
        findViewById<Button>(R.id.button_view).setOnClickListener(this)

        textview = findViewById(R.id.textview)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button_submodule -> {
                textview?.text = "调用了sub module方法"
                ToastUtils.show3(this, "引入了子模块的方法")
            }
            R.id.button_exo -> startActivity(Intent(this, ExoActivity::class.java))
            R.id.button_view -> startActivity(Intent(this, ViewActivity::class.java))
        }
    }
}