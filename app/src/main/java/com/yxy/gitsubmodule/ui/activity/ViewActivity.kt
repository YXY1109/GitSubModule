package com.yxy.gitsubmodule.ui.activity

import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.yxy.common.ToastUtils
import com.yxy.gitsubmodule.R
import com.yxy.gitsubmodule.ui.view.MyTopView
import com.yxy.gitsubmodule.ui.view.TouchView

/**
 * https://www.cnblogs.com/andy-songwei/p/10955062.html
 *
 * https://www.jianshu.com/p/705a6cb6bfee
 */
class ViewActivity : AppCompatActivity(), View.OnTouchListener {
    private var touchView: TouchView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        findViewById<MyTopView>(R.id.myview).setLeftListener {
            ToastUtils.show(this, "666")
        }

        touchView = findViewById(R.id.touchview)

        touchView?.setOnClickListener {
            Log.d("test", "44onClick------$it")
        }
        touchView?.setOnTouchListener(this)
    }

    //https://www.jianshu.com/p/bc4c9e5f4b1c
    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        Log.d("test", "22-----onTouch------" + event?.action + "------" + v);
        return false;
    }
}