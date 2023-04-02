package com.example.moth_6_dz_3

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val counter = MutableLiveData<Int>()
    private var mCount = 0

    fun onIncrementClick() {
        mCount++
        counter.value = mCount
    }

    fun onDecrementClick() {
        mCount--
        counter.value = mCount
    }
}