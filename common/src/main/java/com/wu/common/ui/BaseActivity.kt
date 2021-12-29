package com.wu.common.ui

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by wujingyue on 2021/12/29 14:55
 * Desc TODO
 */
abstract class BaseActivity<VB: Any>: AppCompatActivity() {
    lateinit var vb: VB
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = viewBinding(layoutInflater)
    }

    abstract fun viewBinding(layoutInflater: LayoutInflater): VB
}