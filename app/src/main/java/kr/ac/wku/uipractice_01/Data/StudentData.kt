package kr.ac.wku.uipractice_01.Data

import android.util.Log

class StudentData(
    val name: String,
    val birthYear: Int,
    val phoneNum: String
) {
    constructor(name:String, birthYear: Int) : this(name,birthYear, "Unknown")

    fun getKoreanAge(year: Int): Int {
        return year - this.birthYear + 1
    }

    fun printSimplePhoneNum(){
        Log.d("학생 데이터",this.phoneNum);
    }
}