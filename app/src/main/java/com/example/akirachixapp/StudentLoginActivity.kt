package com.example.akirachixapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText

class StudentLoginActivity : AppCompatActivity() {
    lateinit var etStudentEmail: EditText
    lateinit var etStudentPassword:EditText
    lateinit var btnStudLogin:Button
    lateinit var btnStudSignUp:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_login)
        castView3()
        onClick3()
    }
    fun castView3(){
        etStudentEmail=findViewById(R.id.etStudentEmail)
        etStudentEmail=findViewById(R.id.etStudentPassword)
        btnStudLogin=findViewById(R.id.btnStudLogIn)
        btnStudSignUp=findViewById(R.id.btnStudSignUp)
    }
    fun onClick3(){
        btnStudLogin.setOnClickListener {
            var error=false
            var email=etStudentEmail.text.toString()
            if(email.isEmpty()){
                etStudentEmail.setError("Email is required")
            }

            var password=etStudentPassword.text.toString()
            if (password.isEmpty()){
                etStudentPassword.setError("Password is required")
            }

            var studentLogin=Intent(baseContext,WelcomeStudentActivity::class.java)
            startActivity(studentLogin)
        }
        btnStudSignUp.setOnClickListener {
            var studentSignUp=Intent(baseContext,StudentSignUpActivity::class.java)
            startActivity(studentSignUp)
        }

    }

}