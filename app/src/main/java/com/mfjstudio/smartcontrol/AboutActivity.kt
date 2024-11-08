package com.mfjstudio.smartcontrol

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mfjstudio.smartcontrol.databinding.AboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: AboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}