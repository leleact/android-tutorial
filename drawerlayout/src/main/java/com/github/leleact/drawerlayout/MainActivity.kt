package com.github.leleact.drawerlayout

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout


class MainActivity : AppCompatActivity() {

    val tag = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawer_layout)

        val drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)
        val content = findViewById<LinearLayout>(R.id.content)


        val actionBarDrawerToggle =
            object : ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close) {
                private val scaleFactor = 6f

                override fun onDrawerSlide(drawerView: View, slideOffset: Float) {
                    Log.i(tag, "float: $slideOffset")
                    super.onDrawerSlide(drawerView, slideOffset)
                    val slideX = drawerView.width * slideOffset
                    content.translationX = slideX
                    content.scaleX = 1 - slideOffset / scaleFactor
                    //  content.scaleY = 1 - slideOffset / scaleFactor
                }
            }
        drawerLayout.setScrimColor(Color.TRANSPARENT)
        drawerLayout.drawerElevation = 0f
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
    }
}
