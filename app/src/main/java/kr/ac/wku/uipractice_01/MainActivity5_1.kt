package kr.ac.wku.uipractice_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import kr.ac.wku.uipractice_01.databinding.ActivityMain51Binding

class MainActivity5_1 : AppCompatActivity() {
    private lateinit var binding: ActivityMain51Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main5_1)
        val message = intent.getStringExtra("value")
        binding.textValue.text = message
        binding.btnReturn.setOnClickListener {
            finish()
        }
    }
}