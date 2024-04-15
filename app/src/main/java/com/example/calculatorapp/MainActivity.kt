package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculatorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
 lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.btnAC.setOnClickListener {
            binding.tvSolution.text=""
            binding.tvResult.text=""
        }

        binding.btn0.setOnClickListener {
            binding.tvSolution.append("0")
        }

        binding.btn1.setOnClickListener {
            binding.tvSolution.append("1")
        }

        binding.btn2.setOnClickListener {
            binding.tvSolution.append("2")
        }

        binding.btn3.setOnClickListener {
            binding.tvSolution.append("3")
        }
        binding.btn4.setOnClickListener {
            binding.tvSolution.append("4")
        }

        binding.btn5.setOnClickListener {
            binding.tvSolution.append("5")
        }

        binding.btn6.setOnClickListener {
            binding.tvSolution.append("6")
        }

        binding.btn7.setOnClickListener {
            binding.tvSolution.append("7")
        }

        binding.btn8.setOnClickListener {
            binding.tvSolution.append("8")
        }

        binding.btn9.setOnClickListener {
            binding.tvSolution.append("9")
        }

        binding.btnDot.setOnClickListener {
            binding.tvSolution.append(".")
        }

        binding.btnAdd.setOnClickListener {
            binding.tvSolution.append("+")
        }
        binding.btnDivide.setOnClickListener {
            binding.tvSolution.append("/")
        }
        binding.btnMinus.setOnClickListener {
            binding.tvSolution.append("-")
        }
        binding.btnMultiply.setOnClickListener {
            binding.tvSolution.append("*")
        }
        binding.btnOpenBracket.setOnClickListener {
            binding.tvSolution.append("(")
        }
        binding.btnCloseBracket.setOnClickListener {
            binding.tvSolution.append(")")
        }


    }
}