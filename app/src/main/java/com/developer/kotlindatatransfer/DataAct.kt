package com.developer.kotlindatatransfer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_data.*

class DataAct : AppCompatActivity(), View.OnClickListener {
    override fun onClick(p0: View?) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Student Data Activity"
        setContentView(R.layout.activity_data)

        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val studentid = intent.getStringExtra("studentid")
        val department = intent.getStringExtra("department")


        tvName.setText(name)
        tvPhone.setText(phone)
        tvStudentId.text = studentid
        tvDepartment.text = department

        goBack.setOnClickListener(this)

    }
}
