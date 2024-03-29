package com.example.android.translatormvp.ui.main

import com.example.android.translatormvp.model.data.AppState
import com.example.android.translatormvp.model.data.DataModel
import com.example.android.translatormvp.model.repository.Repository
import com.example.android.translatormvp.presenter.Interactor
import io.reactivex.Observable

class MainInteractor(
    private val remoteRepository: Repository<List<DataModel>>,
    private val localRepository: Repository<List<DataModel>>
) : Interactor<AppState> {

    override fun getData(word: String, fromRemoteSource: Boolean): Observable<AppState> {
        return if (fromRemoteSource) {
            remoteRepository.getData(word).map { AppState.Success(it) }
        } else {
            localRepository.getData(word).map { AppState.Success(it) }
        }
    }
}