package com.newgate.databindingkotlin

import com.squareup.picasso.Picasso
import android.databinding.BindingAdapter
import android.widget.ImageView


/**
 * Created by khiemnd on 8/5/17.
 */
class CustomBindingAdapter {
    @BindingAdapter("bind:imageUrl")
    fun loadImage(imageView: ImageView, url: String) {
        Picasso.with(imageView.getContext()).load(url).into(imageView)
    }
}