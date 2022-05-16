package com.agh.alertdialog

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnalert = findViewById<Button>(R.id.btnalert)

        btnalert.setOnClickListener {

            val builder = AlertDialog.Builder(this).create()
            val view =layoutInflater.inflate(R.layout.activity_alert, null)
            builder.setView(view)
            builder.show()

        }

    }
}