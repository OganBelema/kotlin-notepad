package com.udacity.notepad.util

import android.content.Context
import android.view.LayoutInflater

/**
 * Created by Belema Ogan on 2019-08-15.
 */
val Context.layoutInflater get() = LayoutInflater.from(this)