package com.newgate.databindingkotlin

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.newgate.databindingkotlin.databinding.LayoutItemStudentBinding
import kotlinx.android.synthetic.main.layout_item_student.*

class MainActivity : AppCompatActivity() {

    lateinit var student: Student

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = DataBindingUtil.setContentView<LayoutItemStudentBinding>(this, R.layout.layout_item_student)

        // binding to student
        student = Student(1, "Nguyen Duy Khiem", "Dai hoc Bach Khoa HN", 17, "")
        binding.setVariable(BR.student, student)
        binding.executePendingBindings()
        avatarImageView.loadUrl(this, "https://upload.wikimedia.org/wikipedia/commons/6/6f/John_D._Rockefeller_1885.jpg")

        // binding to self
        binding.setVariable(BR.main, this)
    }


    fun update() {
        student.age = 19
        student.name = "Nguyen Thi Que"
        student.nameSchool = "Dai hoc cong nghiep HN"
    }

    fun startListStudentScreen() {
        ListStudentActivity.start(this)
    }
}
