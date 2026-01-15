package com.example.circularmenu

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views using Kotlin syntax
        val btnLogout = findViewById<Button>(R.id.button)
        val btnSearch = findViewById<Button>(R.id.button2)
        val btnWishlist = findViewById<Button>(R.id.button3)
        val btnDashboard = findViewById<Button>(R.id.button4)

        // Set Click Listeners
        btnLogout.setOnClickListener {
            showToast("Logging out...")
        }

        btnSearch.setOnClickListener {
            showToast("Opening Search...")
        }

        btnWishlist.setOnClickListener {
            showToast("Added to Wishlist!")
        }

        btnDashboard.setOnClickListener {
            showToast("Loading Dashboard...")
        }
    }

    // Helper function for shorter code
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
