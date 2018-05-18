package com.example.root.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnShow.setOnClickListener {
            val snackbar = Snackbar.make(constraintLayout,"Deneme", Snackbar.LENGTH_LONG)
            snackbar.setAction("Close") {
                snackbar.dismiss()
            }
            snackbar.setActionTextColor(ContextCompat.getColor(this,R.color.colorPrimary))
            val view = snackbar.view
            val text = view.findViewById<TextView>(android.support.design.R.id.snackbar_text)
            text.setTextColor(ContextCompat.getColor(this,R.color.colorAccent))
            snackbar.show()
        }
    }
}
