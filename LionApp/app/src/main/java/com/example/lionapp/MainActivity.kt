package com.example.lionapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val sendButton = findViewById<Button>(R.id.btnSend) // findViewById 옛날 방식

//        btnSend.setOnClickListener(object : View.OnClickListener{
//            override fun onClick(p0: View?) {
//                val msg = etMsg.text.toString()
//                tvHello.text = msg
//                etMsg.setText("")
//            }
//        })

        btnSend.setOnClickListener {
            tvHello.text = etMsg.text.toString()
            etMsg.setText("")
        }

        btnCall.setOnClickListener {
            val intent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1111-2222"))
            startActivity(intent)
        }

        btnHome.setOnClickListener {
            val intent: Intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.kakaocorp.com"))
            startActivity(intent)
        }

    }
}