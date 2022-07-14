package com.example.android.translatormvp.presenter

import com.example.android.translatormvp.model.data.AppState
import com.example.android.translatormvp.ui.base.View

interface Presenter<T : AppState, V : View> {

    fun attachView(view: V)

    fun detachView(view: V)

    fun getData(word: String, isOnline: Boolean)
}