package com.rafael.proffy.ui.register

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.rafael.proffy.R
import com.rafael.proffy.databinding.ActivityRegisterStepTwoBinding

class RegisterStepTwoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterStepTwoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterStepTwoBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val firstName = intent.getStringExtra("firstName")
        val lastName = intent.getStringExtra("lastName")

        print("Primeiro Nome: $firstName Sobrenome: $lastName")
    }
}





