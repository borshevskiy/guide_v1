package com.template

import android.content.Context
import android.graphics.drawable.Drawable


const val FIRST = "first_section"
const val SECOND = "second_section"
const val THIRD = "third_section"
const val FOURTH = "fourth_section"
const val FIFTH = "fifth_section"

fun getAssetsImage(context: Context, path: String, index: Int = 0) = Drawable.createFromStream(context.assets.open(path + "/" + context.assets.list(path)!![index]), null)!!