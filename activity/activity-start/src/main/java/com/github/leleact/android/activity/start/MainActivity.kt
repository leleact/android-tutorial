package com.github.leleact.android.activity.start

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.hello_text).setOnClickListener {
            startActivity(Intent(this, OtherActivity::class.java))
            // 存在finish的时候，点击导航返回按钮无法回到上一个activity
            finish()
        }
    }
}
