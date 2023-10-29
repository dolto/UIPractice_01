package kr.ac.wku.uipractice_01.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kr.ac.wku.uipractice_01.Data.StudentData
import kr.ac.wku.uipractice_01.R

class StudentAdapter(
    mContext: Context,
    resId: Int,
    private val mList: ArrayList<StudentData>
): ArrayAdapter<StudentData>(mContext, resId, mList){
    private val inf: LayoutInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.student_list_item, null)
        }
        val row = tempRow!!
        val stdData = mList[position]
        val nameView = row.findViewById<TextView>(R.id.text_item_name)
        val ageView = row.findViewById<TextView>(R.id.text_item_age)
        val callView = row.findViewById<TextView>(R.id.text_item_callnumber)

        nameView.text = stdData.name
        ageView.text = "(${2023 - stdData.birthYear + 1})"
        callView.text = stdData.phoneNum

        return row
    }
}
