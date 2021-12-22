package com.example.jetpackapp.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val used_to_eu_rate = 0.74f
    private var dollarText: MutableLiveData<String> = MutableLiveData()
    private var result: MutableLiveData<Float> = MutableLiveData()
}