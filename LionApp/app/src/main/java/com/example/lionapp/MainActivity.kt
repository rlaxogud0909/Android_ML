package com.example.lionapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lionapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val sendButton = findViewById<Button>(R.id.btnSend) // findViewById 옛날 방식

//        btnSend.setOnClickListener(object : View.OnClickListener{
//            override fun onClick(p0: View?) {
//                val msg = etMsg.text.toString()
//                tvHello.text = msg
//                etMsg.setText("")
//            }
//        })

        binding.btnSend.setOnClickListener {
            binding.tvHello.text = binding.etMsg.text.toString()
            binding.etMsg.setText("")
        }

        binding.btnCall.setOnClickListener {
            val intent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1111-2222"))
            startActivity(intent)
        }

        binding.btnHome.setOnClickListener {
            val intent: Intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.kakaocorp.com"))
            startActivity(intent)
        }

    }
}