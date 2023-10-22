package com.example.foodordering

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.foodordering.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private val binding:ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.loginbutton.setOnClickListener{
            val intent = Intent(this,SignActivity::class.java)
            startActivity(intent)
        }
        binding.donthavebutton.setOnClickListener{
            val intent = Intent(this,SignActivity::class.java)
            startActivity(intent)
        }
    }
}