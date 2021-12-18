package com.example.lionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import com.example.lionapp.databinding.ActivityHomeBinding
import kotlin.math.roundToInt

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private val buttons = mutableMapOf<String, Class<*>>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        buttons["Lion"] = MainActivity::class.java
        buttons["Count"] = CountActivity::class.java

        buttons["액티비티 생명주기"] = StatechangeActivity::class.java
        buttons["제스처"] = GestureActivity::class.java
        buttons["로그인"] = LoginActivity::class.java

        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )

        val dm = resources.displayMetrics
//        val size = Math.round(10 * dm.density)
        val size = (10 * dm.density).roundToInt()
        params.topMargin = size

        for(key in buttons.keys) {
            val btn = Button(this)

            btn.text = key
            btn.layoutParams = params
            btn.setOnClickListener { startActivity( Intent(this, buttons[key])) }
            binding.layoutMenu.addView(btn)
        }


//        binding.button10.setOnClickListener {
//            startActivity( Intent(this, MainActivity::class.java) )
//        }

    }
}