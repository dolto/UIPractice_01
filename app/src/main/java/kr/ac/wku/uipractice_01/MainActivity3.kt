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
            Log.e("mainView", "로그 e모드");
            Log.wtf("mainView", "로그 왓더뻑 모드")
        }
        binding.btnToast.setOnClickListener {
            Toast.makeText(this, "토스트 클릭됨", Toast.LENGTH_SHORT).show()
        }
        binding.btnVariable.setOnClickListener {
            var myName: String
            myName = "변경전"
            myName = "변경후"
            Toast.makeText(this, myName, Toast.LENGTH_SHORT).show()
        }
        binding.btnCondition.setOnClickListener {
            val userAge = 25;
            when (userAge) {
                in 20..24 -> {
                    Toast.makeText(this, "이십대 초반입니다", Toast.LENGTH_SHORT).show()
                }
                in 25..27 -> {
                    Toast.makeText(this, "이십대 중반입니다.", Toast.LENGTH_SHORT).show()
                }
                in 28..30 -> {
                    Toast.makeText(this, "이십대 후반입니다.", Toast.LENGTH_SHORT).show()
                }

                else -> {Toast.makeText(this, "뭐야.", Toast.LENGTH_SHORT).show()}
            }
        }
    }
}