package com.developer.kotlindatatransfer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(vieww: View?) {
         val sendDataIntent = Intent(this,DataAct::class.java)
         sendDataIntent.putExtra("name", edtName!!.text.toString())
         sendDataIntent.putExtra("phone",edtPhone!!.text.toString())
         sendDataIntent.putExtra("studentid",edtStudentId!!.text.toString())
         sendDataIntent.putExtra("department",edtDepartment!!.text.toString())
         startActivity(sendDataIntent)
         finish()
    }

    private var edtName : EditText? = null
    private var edtPhone : EditText? = null
    private var edtStudentId : EditText? = null
    private var edtDepartment : EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtName = findViewById(R.id.nameEdt)
        edtPhone = findViewById(R.id.phoneEdt)
        edtStudentId = findViewById(R.id.studentIdEdt)
        edtDepartment = findViewById(R.id.departmentEdt)

        okBtn.setOnClickListener(this)

    }
}
