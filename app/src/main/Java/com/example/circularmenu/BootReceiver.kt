package com.example.circularmenu

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class BootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Intent.ACTION_BOOT_COMPLETED) {
            Log.d("CircularMenu", "System Boot Completed. App is aware.")
            
            // Example: Notify user the app is ready in background
            Toast.makeText(context, "Circular Menu System Ready", Toast.LENGTH_LONG).show()
        }
    }
}
