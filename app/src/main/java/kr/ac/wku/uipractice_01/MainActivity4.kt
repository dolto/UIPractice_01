package kr.ac.wku.uipractice_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import kr.ac.wku.uipractice_01.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    private lateinit var binding: ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main4)
        binding.login.setOnClickListener {
            val id = binding.editId.text.toString();
            val pw = binding.editPw.text.toString();
            var is_admin = true;
            if (id != "admin@test.com"){
                is_admin = false;
            }
            else if (pw != "qwer"){
                is_admin = false;
            }
            when (is_admin) {
                true -> Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()
                false -> Toast.makeText(this, "로그인에 실패했습니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}