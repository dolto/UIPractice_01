package kr.ac.wku.uipractice_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import kr.ac.wku.uipractice_01.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    lateinit var binding: ActivityMain3Binding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main3)
        binding.btnLog.setOnClickListener {
            Log.d("mainView", "이건 테스트 로그입니다.");
        }
        binding.btnToast.setOnClickListener {
            Toast.makeText(this, "토스트 클릭됨", Toast.LENGTH_SHORT).show()
        }
    }
}