package com.example.smartcontrol

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.example.smartcontrol.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var binding: ActivityMainBinding
    private val database: DatabaseReference = FirebaseDatabase.getInstance().getReference("relay")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        drawerLayout = findViewById(R.id.drawerLayout)
        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open_drawer, R.string.close_drawer)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val navView: NavigationView = findViewById(R.id.navView)
        navView.setNavigationItemSelectedListener { menuItem ->
            // Implementasi logika menu navigasi jika diperlukan
            true
        }

        // Listener untuk tombol "Light ON"
        binding.btnLightOn.setOnClickListener {
            writeToDatabase("relay1", 1)
        }

        // Listener untuk tombol "Light OFF"
        binding.btnLightOff.setOnClickListener {
            writeToDatabase("relay1", 0)
        }

        // Listener untuk tombol "Open Door"
        binding.btnDoorOpen.setOnClickListener {
            writeToDatabase("relay2", 1)
        }

        // Listener untuk tombol "Close Door"
        binding.btnDoorClose.setOnClickListener {
            writeToDatabase("relay2", 0)
        }
    }

    private fun writeToDatabase(relay: String, status: Int) {
        database.child(relay).setValue(status)
            .addOnSuccessListener {
                Toast.makeText(this, "Relay $relay berhasil diperbarui ke $status", Toast.LENGTH_SHORT).show()
            }
            .addOnFailureListener {
                Toast.makeText(this, "Gagal memperbarui Relay $relay", Toast.LENGTH_SHORT).show()
            }
    }
}
