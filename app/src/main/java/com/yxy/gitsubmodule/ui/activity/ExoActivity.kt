package com.yxy.gitsubmodule.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.ui.PlayerView
import com.yxy.common.ToastUtils
import com.yxy.gitsubmodule.R

/**
 * https://github.com/google/ExoPlayer
 * https://www.jianshu.com/p/cea336200990
 * https://blog.csdn.net/achina2011jy/article/details/112674293
 */
class ExoActivity : AppCompatActivity() {
    private val videoPath = "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4"

    private var playerView: PlayerView? = null
    private var button1: Button? = null
    private var button2: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exo)

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        playerView = findViewById(R.id.playerview)

        button1?.setOnClickListener {
            playVideo()
        }
        button2?.setOnClickListener {
            initPlayer(videoPath)
        }

    }

    private fun playVideo() {
        val player = SimpleExoPlayer.Builder(this).build()

        player.playWhenReady = true


        val mediaItem = MediaItem.fromUri(videoPath)
        player.setMediaItem(mediaItem)
        //player.addMediaItem()

        playerView?.player = player

        player.prepare()
        player.play()
    }

    private fun initPlayer(playUri: String) {
        if (playUri == null) {
            return
        }
        val player = SimpleExoPlayer.Builder(this).build()

        player.playWhenReady = true
        player.repeatMode = Player.REPEAT_MODE_ALL

        val mediaItem = MediaItem.fromUri(playUri)
        player.addMediaItem(mediaItem)
//        player.setMediaItem(mediaItem)

        playerView?.player = player

        player.prepare()
//        player.play()
    }
}