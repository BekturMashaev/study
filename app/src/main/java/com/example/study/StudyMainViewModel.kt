package com.example.study

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class StudyMainViewModel(
//    private val isUserAuthorizedUseCase: IsUserAuthorizedUseCase,
) : ViewModel() {
    private val _isReady = MutableStateFlow(false)
    val isReady = _isReady.asStateFlow()

//    private val _isAuthorized = MutableStateFlow(false)
//    val isAuthorized = _isAuthorized.asStateFlow()

    init {
        viewModelScope.launch {
            delay(1000L)
            _isReady.value = true
        }
    }
}