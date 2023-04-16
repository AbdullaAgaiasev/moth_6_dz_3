package com.example.moth_6_dz_3

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {

    private var mCount = 0
    private var plus = ""

    val countC : MutableLiveData<String> = MutableLiveData()
    val operation : MutableLiveData<String> = MutableLiveData()

    fun onIncrementClick() {
        mCount++
        countC.value = mCount.toString()
        operation.value = "\n +$plus"
    }

    fun onDecrementClick() {
        mCount--
        countC.value = mCount.toString()
        operation.value  = "\n -$plus"
    }
}