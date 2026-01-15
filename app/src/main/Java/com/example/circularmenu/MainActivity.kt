package com.example.circularmenu

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            setContentView(R.layout.activity_main)
            setupButtons()
        } catch (e: Exception) {
            Log.e("CircularMenu", "Critical Layout Error: ${e.message}")
            Toast.makeText(this, "Error loading layout", Toast.LENGTH_LONG).show()
        }
    }

    private fun setupButtons() {
        val btnLogout = findViewById<Button>(R.id.button)
        val btnSearch = findViewById<Button>(R.id.button2)
        val btnWishlist = findViewById<Button>(R.id.button3)
        val btnDashboard = findViewById<Button>(R.id.button4)

        btnLogout?.setOnClickListener { showToast("Logout Clicked") }
        btnSearch?.setOnClickListener { showToast("Search Clicked") }
        btnWishlist?.setOnClickListener { showToast("Wishlist Clicked") }
        btnDashboard?.setOnClickListener { showToast("Dashboard Clicked") }
    }

    private fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}
