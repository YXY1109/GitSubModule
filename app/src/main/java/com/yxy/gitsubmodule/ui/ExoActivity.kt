package com.yxy.gitsubmodule.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.ui.PlayerView
import com.yxy.common.ToastUtils
import com.yxy.gitsubmodule.R

/**
 * https://github.com/google/ExoPlayer
 * https://www.jianshu.com/p/cea336200990
 */
class ExoActivity : AppCompatActivity() {
    private val videoPath = "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exo)

        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            playVideo()
        }

    }

    private fun playVideo() {
        val player = SimpleExoPlayer.Builder(this).build()
        player.playWhenReady = true

        val mediaItem = MediaItem.fromUri(videoPath)
        player.setMediaItem(mediaItem)
        //player.addMediaItem()
        player.prepare()
        player.play()

        findViewById<PlayerView>(R.id.playerview).player = player
    }
}