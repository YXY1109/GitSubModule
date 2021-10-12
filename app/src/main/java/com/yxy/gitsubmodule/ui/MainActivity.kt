package com.yxy.gitsubmodule.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.ui.PlayerView
import com.yxy.common.ToastUtils
import com.yxy.gitsubmodule.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button)
        var textview = findViewById<TextView>(R.id.textview)

        button.setOnClickListener {
            textview.text = "调用了sub module方法"
            ToastUtils.show3(this, "引入了子模块的方法")
            startActivity(Intent(this, ExoActivity::class.java))
        }

    }
}