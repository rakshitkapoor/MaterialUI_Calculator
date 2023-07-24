package com.example.kotlintest_new

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.core.view.WindowInsetsCompat
import com.example.kotlintest_new.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAC.setOnClickListener{
            binding.tvInputExp.text=""
            binding.tvResult.text=""
        }

        binding.buttonnum1.setOnClickListener {
            binding.tvInputExp.append("1")
        }
        binding.buttonnum2.setOnClickListener {
            binding.tvInputExp.append("2")
        }
        binding.buttonnum3.setOnClickListener {
            binding.tvInputExp.append("3")
        }
        binding.buttonnum4.setOnClickListener {
            binding.tvInputExp.append("4")
        }
        binding.buttonnum5.setOnClickListener {
            binding.tvInputExp.append("5")
        }
        binding.buttonnum6.setOnClickListener {
            binding.tvInputExp.append("6")
        }
        binding.buttonnum7.setOnClickListener {
            binding.tvInputExp.append("7")
        }
        binding.buttonnum8.setOnClickListener {
            binding.tvInputExp.append("8")
        }
        binding.buttonnum9.setOnClickListener {
            binding.tvInputExp.append("9")
        }
        binding.buttonnum0.setOnClickListener {
            binding.tvInputExp.append("0")
        }
        binding.buttonnum00.setOnClickListener {
            binding.tvInputExp.append("00")
        }
        binding.buttonDel.setOnClickListener {
            val text=binding.tvInputExp.text.toString()
            if(text.isNotEmpty()){
                binding.tvInputExp.text=text.substring(0,text.length-1)
            }
        }
        binding.buttonAdd.setOnClickListener {
            binding.tvInputExp.append("+")
        }
        binding.buttonMinus.setOnClickListener {
            binding.tvInputExp.append("-")
        }
        binding.buttonPerc.setOnClickListener {
            binding.tvInputExp.append("%")
        }
        binding.buttonDiv.setOnClickListener {
            binding.tvInputExp.append("/")
        }
        binding.buttonMul.setOnClickListener {
            binding.tvInputExp.append("*")
        }
        binding.buttonnumPoint.setOnClickListener {
            binding.tvInputExp.append(".")
        }
        binding.buttonEqual.setOnClickListener {

            val expression=ExpressionBuilder(binding.tvInputExp.text.toString()).build()
            val result=expression.evaluate()
            val float=result.toLong()
            if (result==float.toDouble()){
                binding.tvResult.text=float.toString()
            }
            binding.tvResult.text=result.toString()

        }



    }
}