package com.newgate.databindingkotlin

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.newgate.databindingkotlin.databinding.LayoutItemStudentBinding

/**
 * Created by khiemnd on 8/5/17.
 */
class StudentAdapter(var context: Context, var arrayStudent: ArrayList<Student>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return arrayStudent.size
    }


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        var layoutInterface = LayoutInflater.from(parent!!.context)
        var itemBinding = DataBindingUtil.inflate<LayoutItemStudentBinding>(layoutInterface, R.layout.layout_item_student, parent, false)
        return StudentViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        if(holder is StudentViewHolder) {
            holder.bind(arrayStudent[position])
        }
    }

    class StudentViewHolder(var itemBinding: LayoutItemStudentBinding): RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(student: Student) {
            itemBinding.setVariable(BR.student, student)
            itemBinding.executePendingBindings()
            itemBinding.startListButton.visibility = View.GONE
        }
    }
}