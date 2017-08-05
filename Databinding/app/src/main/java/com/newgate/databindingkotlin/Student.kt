package com.newgate.databindingkotlin

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.widget.ImageView
import kotlinx.android.synthetic.main.layout_item_student.*

/**
 * Created by khiemnd on 8/5/17.
 */
data class Student(
        private val _id: Long,
        private var _name: String,
        private var _schoolName: String,
        private var _age: Int,
        private var _urlAvatar: String
    ):BaseObservable() {

    val id: Long
        get() = _id

    var name: String
        @Bindable get() = _name
        set(value) {
            _name = value
            notifyPropertyChanged(BR.name)
        }

    var nameSchool: String
        @Bindable get() = _schoolName
        set(value) {
            _schoolName = value
            notifyPropertyChanged(BR.nameSchool)
        }

    var age: Int
        @Bindable get() = _age
        set(value) {
            _age = value
            notifyPropertyChanged(BR.age)
        }

    var urlAvatar: String
        @Bindable get() = _urlAvatar
        set(value) {
            _urlAvatar = value
            notifyPropertyChanged(BR.urlAvatar)
        }


}