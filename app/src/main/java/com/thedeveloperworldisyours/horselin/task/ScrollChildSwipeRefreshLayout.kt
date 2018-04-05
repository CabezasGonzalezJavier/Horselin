package com.thedeveloperworldisyours.horselin.task


import android.content.Context
import android.support.v4.view.ViewCompat
import android.support.v4.widget.SwipeRefreshLayout
import android.util.AttributeSet
import android.view.View
/**
 * Created by javiergonzalezcabezas on 5/4/18.
 */
class ScrollChildSwipeRefreshLayout @JvmOverloads constructor(context: Context,
                                                              attrs: AttributeSet? = null)
    : SwipeRefreshLayout(context, attrs) {

    var scrollUpChild: View? = null

    override fun canChildScrollUp() =
            scrollUpChild?.canScrollVertically(-1) ?: super.canChildScrollUp()
}