package com.example.akirachixapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class TrainerLoginActivity : AppCompatActivity() {
    lateinit var etTrainerEmail:EditText
    lateinit var etTrainerPassword:EditText
    lateinit var spClass:Spinner
    lateinit var btnTrainerLogin:Button
    lateinit var btnTrainerSignup:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trainer_login)
        castView5()
        onClick5()
    }
    fun castView5(){
        etTrainerEmail=findViewById(R.id.etTrainerEmail)
        etTrainerPassword=findViewById(R.id.etTrainerPassword)
        spClass=findViewById(R.id.spClass)
        btnTrainerLogin=findViewById(R.id.btnTrainerLogin)
        btnTrainerSignup=findViewById(R.id.btnTrainerSignUp)
        var classes= arrayOf("Select class","AnitaB","LisaLab","LoveLace")
        var classAdapter= ArrayAdapter(baseContext,android.R.layout.simple_spinner_item,classes)
        classAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spClass.adapter=classAdapter
    }
    fun onClick5(){
        btnTrainerLogin.setOnClickListener {
            var email = etTrainerEmail.text.toString()
            if (email.isEmpty()){
                etTrainerEmail.setError("Email is required")
            }

            var password = etTrainerPassword.text.toString()
            if (email.isEmpty()){
                etTrainerPassword.setError("Password is required")
            }
            var classes = ""
            if (spClass.selectedItemPosition!=0){
                classes=spClass.selectedItem.toString()
            }
            else{
            var  error=true
                Toast.makeText(baseContext,"Select class", Toast.LENGTH_LONG)
            }

            var trainerLogin= Intent(baseContext,WelcomeTrainerActivity::class.java)
            startActivity(trainerLogin)

        }
        btnTrainerSignup.setOnClickListener {
            var trainerSignUp=Intent(baseContext,TrainerSignUpActivity::class.java)
            startActivity(trainerSignUp)
        }
    }
}