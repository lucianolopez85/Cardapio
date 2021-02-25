package com.cardapio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cardapio.databinding.ActivityDetailSaladaBinding

class DetailSalada : AppCompatActivity() {

    private lateinit var binding: ActivityDetailSaladaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailSaladaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val toolbar = binding.toolbarDetalhesSalada
        toolbar.title = "Detalhes"
        toolbar.setTitleTextColor(getColor(R.color.black))
        toolbar.setTitleMargin(300,0,300,0)
        toolbar.setBackgroundColor(getColor(R.color.orangeClean))
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_arrow_back))
        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, SaladasActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}