package com.example.android.translatormvp.model.repository

import io.reactivex.Observable

interface Repository<T> {

    fun getData(word: String): Observable<T>
}