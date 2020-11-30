package com.example.vervmldexample

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    var num = 0

    fun countNumber(){
        num++
    }

    lateinit var timer  : CountDownTimer

    val myMutalbleLd = MutableLiveData<Int>()

    fun starTimer(){

        timer = object : CountDownTimer(15000,1000){
            override fun onTick(millisUntilFinished: Long) {

                val time = millisUntilFinished/1000
                myMutalbleLd.value = time.toInt()
            }

            override fun onFinish() {
            }

        }.start()
    }

}