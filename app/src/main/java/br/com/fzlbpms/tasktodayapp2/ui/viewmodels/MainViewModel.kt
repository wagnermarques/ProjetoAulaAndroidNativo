package br.com.fzlbpms.tasktodayapp2.ui.viewmodels

import androidx.lifecycle.ViewModel

class MainViewModelForClickCounter : ViewModel() {

        var _clickCount: Int = 0

        fun incrementClickCount(){
            _clickCount++
        }

}