package com.streafy.androidacademyfundamentals

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        log("onCreate, saved state = $savedInstanceState")
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val title: TextView = findViewById(R.id.hello_world_text)
        title.setOnClickListener {
            startSecondActivity()
        }
    }

    private fun startSecondActivity() {

        val stringToTransmit = "this is for second activity!"
        val intToTransmit = 32
        val boolToTransmit = true

        val intent = Intent(this, SecondActivity::class.java).apply {
            putExtra(STRING_KEY, stringToTransmit)
            putExtra(INT_KEY, intToTransmit)
            putExtra(BOOL_KEY, boolToTransmit)
        }

        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        log("onStart")
    }

    override fun onResume() {
        super.onResume()
        log("onResume")
    }

    override fun onPause() {
        super.onPause()
        log("onPause")
    }

    override fun onStop() {
        super.onStop()
        log("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        log("onDestroy")
    }

    companion object {
        const val STRING_KEY = "STRING"
        const val INT_KEY = "INT"
        const val BOOL_KEY = "BOOL"
    }
}