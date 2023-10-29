package kr.ac.wku.uipractice_01

import android.app.SearchManager
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import kr.ac.wku.uipractice_01.databinding.ActivityMain6Binding

class MainActivity6 : AppCompatActivity() {
    private lateinit var binding: ActivityMain6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main6)
        val myUri = Uri.parse("https://improver.tistory.com/238")
        val myIntent = Intent(Intent.ACTION_WEB_SEARCH)
        myIntent.putExtra(SearchManager.QUERY, "https://improver.tistory.com/238")
        startActivity(myIntent)
    }
}