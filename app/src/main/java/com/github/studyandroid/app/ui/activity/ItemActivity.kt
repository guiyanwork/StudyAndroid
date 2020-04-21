package com.github.studyandroid.app.ui.activity

import android.app.Activity
import android.os.Bundle
import android.view.View
import com.github.studyandroid.app.R
import kotlinx.android.synthetic.main.layout_toolbar_activity.*

/**
 * Copyright (c) 2020 GitHub, Inc.
 * Description: Item Activity
 * Author(s): Gui Yan (guiyanwork@163.com)
 */
class ItemActivity : Activity(), View.OnClickListener {
    companion object {
        const val INTENT_KEY_TITLE: String = "title"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)
        setListener()
        doInitWork()
    }

    private fun setListener() {
        iv_toolbar_back.setOnClickListener(this)
    }

    private fun doInitWork() {
        tv_toolbar_title.text = intent.getStringExtra(INTENT_KEY_TITLE)
    }

    override fun onClick(view: View) {
        when (view.id) {
            iv_toolbar_back.id -> finish()
        }
    }
}