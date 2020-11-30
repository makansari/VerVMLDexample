package com.example.vervmldexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myViewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)

        myViewModel.starTimer()
        myViewModel.myMutalbleLd.observe(this, Observer {
           myTextView.setText(it.toString())
        })
        //myTextView.setText(""+ myViewModel.num)

        //var counter = 0
        buttonClick.setOnClickListener {
          /*  counter++
            myTextView.setText("" + counter)*/

           /* myViewModel.countNumber()
            myTextView.setText(""+ myViewModel.num)*/
        }
    }
}