package com.example.foodordering

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.foodordering.databinding.ActivityStartBinding

class startActivity : AppCompatActivity() {
    private val  binding:ActivityStartBinding by lazy{
        ActivityStartBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

binding.nextbutton.setOnClickListener {
    val intent = Intent(this,LoginActivity::class.java);
    startActivity(intent);
    finish();
}

    }
}