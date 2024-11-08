package com.mfjstudio.smartcontrol

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.Toast
import android.widget.ImageButton
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.mfjstudio.smartcontrol.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import android.graphics.Typeface
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageButton
import androidx.constraintlayout.widget.Constraints


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val duration = 500
        binding.AboutButton.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "About us", duration ).show()
        }
        binding.SmartLightButton.setOnClickListener {
            val intent = Intent(this, SmartLightActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Smart Light Menu", duration).show()
        }
        binding.SmartLcokButton.setOnClickListener {
            val intent = Intent(this, SmartLcokActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Smart Lock Menu", duration).show()
        }
    }
}