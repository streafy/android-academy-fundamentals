package com.streafy.androidacademyfundamentals

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        log("onCreate, saved state = $savedInstanceState")
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val receivedString = intent.getStringExtra(MainActivity.STRING_KEY)
        val receivedInt = intent.getIntExtra(MainActivity.INT_KEY, -1)
        val receivedBool = intent.getBooleanExtra(MainActivity.BOOL_KEY, false)

        val textView: TextView = findViewById(R.id.hello_world_text)
        textView.text = "Data received from another activity -> String: $receivedString Int: $receivedInt Bool: $receivedBool"
    }
}