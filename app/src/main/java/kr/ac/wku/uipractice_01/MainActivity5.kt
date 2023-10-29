package kr.ac.wku.uipractice_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import kr.ac.wku.uipractice_01.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {
    private lateinit var binding: ActivityMain5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main5)
        binding.btnMoveToSecond.setOnClickListener {
            val intent = Intent(this, MainActivity5_1::class.java)
            val message = binding.editValue.text.toString()
            intent.putExtra("value", message)
            startActivity(intent)
            intent.putExtra("value", "두번째 변수")
            startActivity(intent)
        }
    }
}