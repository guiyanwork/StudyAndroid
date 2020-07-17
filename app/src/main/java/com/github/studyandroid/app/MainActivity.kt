package com.github.studyandroid.app

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.github.studyandroid.app.ui.activity.ItemActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_toolbar_home.*

/**
 * Copyright (c) 2020 GitHub, Inc.
 * Description: Main Activity
 * Author(s): Gui Yan (guiyanwork@163.com)
 */
class MainActivity : Activity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
        doInitWork()
    }

    private fun setListener() {
        tv_item.setOnClickListener(this)
        fl_toolbar_exit.setOnClickListener(this)
    }

    private fun doInitWork() {
    }

    override fun onClick(view: View) {
        when (view.id) {
            tv_item.id -> {
                val intentItem = Intent(this, ItemActivity::class.java)
                intentItem.putExtra(ItemActivity.INTENT_KEY_TITLE, tv_item.text)
                startActivity(intentItem)
            }
            fl_toolbar_exit.id -> finish()
        }
    }
}