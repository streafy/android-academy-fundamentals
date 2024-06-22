package com.streafy.androidacademyfundamentals

import android.app.Activity
import android.util.Log

fun Activity.log(text: String) = Log.d(this.javaClass.simpleName, text)
