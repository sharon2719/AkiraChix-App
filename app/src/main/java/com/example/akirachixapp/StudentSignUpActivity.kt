package com.example.akirachixapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class StudentSignUpActivity : AppCompatActivity() {
    lateinit var etStudentName:EditText
    lateinit var  etStudentEmail1:EditText
    lateinit var etStudentPassword1:EditText
    lateinit var etStudConfirm:EditText
    lateinit var btnStudentSign:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_sign_up)
        castView4()
        onClick4()
    }
    fun castView4(){
        etStudentName=findViewById(R.id.etStudentName)
        etStudentEmail1=findViewById(R.id.etStudentEmail1)
        etStudentPassword1=findViewById(R.id.etStudentPassword1)
        etStudConfirm=findViewById(R.id.etStudConfirm)
        btnStudentSign=findViewById(R.id.btnStudentSign)
    }
    fun onClick4(){
        btnStudentSign.setOnClickListener {
            var studentSign=Intent(baseContext,WelcomeStudentActivity::class.java)
            startActivity(studentSign)
        }
    }

}