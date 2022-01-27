package com.example.passing_object_using_parcelable_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.passing_object_using_parcelable_kotlin.model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        var btn_send = findViewById<Button>(R.id.btn_send)

        btn_send.setOnClickListener {
            openDetailsActivity()
        }
    }

    private fun openDetailsActivity() {
        var intent = Intent(this,DetailsActivity::class.java)
        intent.putExtra("user", User())
        startActivity(intent)
    }
}
