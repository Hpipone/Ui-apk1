package com.mfjstudio.smartcontrol

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mfjstudio.smartcontrol.databinding.SmartlcokactivityBinding

class SmartLcokActivity : AppCompatActivity() {

    private lateinit var binding: SmartlcokactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SmartlcokactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}