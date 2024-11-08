package com.mfjstudio.smartcontrol

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mfjstudio.smartcontrol.databinding.SmartlightBinding

class SmartLightActivity : AppCompatActivity() {

    private lateinit var binding: SmartlightBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SmartlightBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}