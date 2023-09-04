package com.example.tp_final_nicolas_melia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.tp_final_nicolas_melia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel.comparador.observe(this){
            println("observer funcionando")
            binding.textView.text = it.resultado
        }

        binding.btn.setOnClickListener {
            val a: String = binding.edt1.text.toString()
            val b: String = binding.edt2.text.toString()
            mainViewModel.compararPalabras(a, b)
        }
    }
}