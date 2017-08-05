package com.newgate.databindingkotlin

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list_student.*

/**
 * Created by khiemnd on 8/5/17.
 */
class ListStudentActivity: AppCompatActivity() {

    companion object {
        fun start(context: Context) {
            var itent = Intent(context, ListStudentActivity::class.java)
            context.startActivity(itent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_student)
        listStudentView.layoutManager = LinearLayoutManager(this)
        var arrayStudent = ArrayList<Student>()
        arrayStudent.add(Student(1, "Nguyen Duy Khiem", "Dai hoc Bach Khoa HN", 23, "https://upload.wikimedia.org/wikipedia/commons/6/6f/John_D._Rockefeller_1885.jpg"))
        arrayStudent.add(Student(2, "Nguyen Thi Que", "Dai hoc Cong Nghiep HN", 24, "http://img1.blogtamsu.vn/2015/11/luu-diec-phi-blogtamsuvn14.jpg"))
        arrayStudent.add(Student(3, "Nguyen Van Long", "Dai hoc Bach Khoa HN", 22, "https://www.chip.com.tr/images/content/manset/2014121617354395618/steve-jobs-gelecek-tahminleri-sasirtiyor.jpg"))
        arrayStudent.add(Student(4, "Nguyen Nhat Thien", "Dai hoc Bach Khoa HN", 20, "http://afamilycdn.com/k:FeC7mIEfmQHVffExQxvrGdkRdYCZvO/Image/2016/06/AfamilyPAluudiecphiphambangbangdiendo3-3a38e/luu-diec-phi.jpg"))
        var adapter = StudentAdapter(this, arrayStudent)
        listStudentView.adapter = adapter
    }
}