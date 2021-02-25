package com.cardapio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.cardapio.databinding.ActivitySaladasBinding

class SaladasActivity : AppCompatActivity() {

    private lateinit var  binding: ActivitySaladasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySaladasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgCaesar.setOnClickListener {
            val intent = Intent(this, DetailSalada::class.java)
            startActivity(intent)
        }

        supportActionBar!!.hide()

        val toolbar = binding.toolbarSaladas
        toolbar.title = "Saladas"
        toolbar.setTitleTextColor(getColor(R.color.black))
        toolbar.setTitleMargin(300,0,300,0)
        toolbar.setBackgroundColor(getColor(R.color.orangeClean))
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_arrow_back))
        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}