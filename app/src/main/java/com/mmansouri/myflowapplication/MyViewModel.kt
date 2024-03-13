package com.mmansouri.myflowapplication

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn

class MyViewModel: ViewModel() {
    val secondsPassed = flow {
        for (i in 1.. 10) {
            delay(3000)
            emit(i)
        }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000L),0)
}