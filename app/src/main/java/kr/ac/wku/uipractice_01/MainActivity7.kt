package kr.ac.wku.uipractice_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import kr.ac.wku.uipractice_01.Adapters.StudentAdapter
import kr.ac.wku.uipractice_01.Data.StudentData
import kr.ac.wku.uipractice_01.databinding.ActivityMain7Binding

class MainActivity7 : AppCompatActivity() {
    private lateinit var binding: ActivityMain7Binding

    val mStudentList = ArrayList<StudentData>()
    lateinit var mStdAdapter: StudentAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main7)
        mStudentList.add(StudentData("홍도완", 1999, "01055426765"))
        mStudentList.add(StudentData("홍도완", 1999, "01055426765"))
        mStudentList.add(StudentData("홍도완", 1999, "01055426765"))
        mStudentList.add(StudentData("홍도완", 1999, "01055426765"))
        mStudentList.add(StudentData("홍도완", 1999, "01055426765"))
        mStudentList.add(StudentData("홍도완", 1999, "01055426765"))
        mStudentList.add(StudentData("홍도완", 1999, "01055426765"))
        mStudentList.add(StudentData("홍도완", 1999, "01055426765"))
        mStudentList.add(StudentData("홍도완", 1999, "01055426765"))
        mStudentList.add(StudentData("홍도완", 1999, "01055426765"))
        mStudentList.add(StudentData("홍도완", 1999, "01055426765"))
        mStudentList.add(StudentData("홍도완", 1999, "01055426765"))
        mStudentList.add(StudentData("홍도완", 1999, "01055426765"))
        mStudentList.add(StudentData("홍도완", 1999, "01055426765"))
        mStudentList.add(StudentData("홍도완", 1999, "01055426765"))
        mStudentList.add(StudentData("홍도완", 1999, "01055426765"))
        mStudentList.add(StudentData("홍도완", 1999, "01055426765"))
        mStudentList.add(StudentData("홍도완", 1999, "01055426765"))
        mStudentList.add(StudentData("홍도완", 1999, "01055426765"))
        mStudentList.add(StudentData("홍도완", 1999, "01055426765"))
        mStudentList.add(StudentData("홍도완", 1999, "01055426765"))


        mStdAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList);

        binding.listStudent.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "${mStudentList[position].name}을 클릭함", Toast.LENGTH_SHORT).show()

        }
        binding.listStudent.setOnItemLongClickListener { parent, view, position, id ->
            mStudentList.removeAt(position)
            mStdAdapter.notifyDataSetChanged()
            return@setOnItemLongClickListener true
        }

        binding.listStudent.adapter = mStdAdapter
    }
}