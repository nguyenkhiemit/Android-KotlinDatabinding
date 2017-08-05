package com.newgate.databindingkotlin

import android.content.Context
import android.databinding.BindingAdapter
import android.widget.ImageView
import com.squareup.picasso.Picasso

/**
 * Created by khiemnd on 8/5/17.
 */

fun ImageView.loadUrl(context: Context, url: String) {
    Picasso.with(context).load(url).fit().centerCrop().into(this)
}