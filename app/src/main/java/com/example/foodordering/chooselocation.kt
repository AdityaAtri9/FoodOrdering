package com.example.foodordering

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import com.example.foodordering.databinding.ActivityChooselocationBinding

class chooselocation : AppCompatActivity() {
    private val binding :  ActivityChooselocationBinding by lazy{
        ActivityChooselocationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val locationList: Array<String> = arrayOf("Jaiput","Odhisa","Delhi","Maharashtra")
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,locationList)
        val autoCompleteTextView : AutoCompleteTextView = binding.listoflocation
        autoCompleteTextView.setAdapter(adapter)
    }
}