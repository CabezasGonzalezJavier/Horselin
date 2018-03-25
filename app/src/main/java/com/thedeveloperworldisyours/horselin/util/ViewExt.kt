package com.thedeveloperworldisyours.horselin.util

/**
 * Created by javiergonzalezcabezas on 25/3/18.
 */
import android.support.design.widget.Snackbar
import android.view.View

fun View.showSnackBar(message: String, duration: Int) {
    Snackbar.make(this, message, duration).show()
}