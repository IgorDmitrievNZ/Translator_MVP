package com.example.android.translatormvp.ui.base

import com.example.android.translatormvp.model.data.AppState

interface View {

    fun renderData(appState: AppState)

}